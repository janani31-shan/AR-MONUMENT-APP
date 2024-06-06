package com.techcruz.arappformonuments;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.FrameTime;
import com.google.ar.sceneform.Scene;
import com.google.ar.sceneform.assets.RenderableSource;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;

public class MainActivity2 extends AppCompatActivity implements Scene.OnUpdateListener {
Button btn;
ArFragment arFragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        FirebaseApp.initializeApp(this);


        FirebaseStorage storage = FirebaseStorage.getInstance();
        StorageReference modelRef = storage.getReference().child("out.glb");



        btn = findViewById(R.id.button3);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "welcome", Toast.LENGTH_SHORT).show();




            }
        });
        File file;
        try {
            file = File.createTempFile("out", "glb");
            modelRef.getFile(file).addOnSuccessListener(taskSnapshot -> buildModel(file));
        } catch (IOException e) {
            e.printStackTrace();
        }

        arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.arFragment);
        arFragment.getArSceneView().getScene().addOnUpdateListener(this);
        arFragment.setOnTapArPlaneListener((hitResult, plane, motionEvent) -> {

            AnchorNode anchorNode = new AnchorNode(hitResult.createAnchor());
            anchorNode.setRenderable(renderable);
            arFragment.getArSceneView().getScene().addChild(anchorNode);

        });
    }
    ModelRenderable renderable;

    private void buildModel(File file){

        RenderableSource renderableSource = RenderableSource
                .builder()
                .setSource(this, Uri.parse(file.getPath()), RenderableSource.SourceType.GLB)
                .setRecenterMode(RenderableSource.RecenterMode.ROOT)
                .build();


        ModelRenderable
                .builder()
                .setSource(this, renderableSource)
                .setRegistryId(file.getPath())
                .build()
                .thenAccept(modelRenderable -> {
                    Toast.makeText(this, "Model built", Toast.LENGTH_SHORT).show();
                    renderable = modelRenderable;
                });

    }

    @Override
    public void onUpdate(FrameTime frameTime) {

    }
}

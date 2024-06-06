package com.techcruz.arappformonuments;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.google.ar.sceneform.AnchorNode;
import com.google.ar.sceneform.assets.RenderableSource;
import com.google.ar.sceneform.rendering.ModelRenderable;
import com.google.ar.sceneform.ux.ArFragment;
import com.google.firebase.FirebaseApp;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;

public class arashokpillar extends AppCompatActivity {
    AppCompatButton btn;
    Button btn_click;
    ArFragment arFragment;
    @SuppressLint("WrongViewCast")
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseApp.initializeApp(this);


        FirebaseStorage storage = FirebaseStorage.getInstance();
      StorageReference modelRef = storage.getReference().child("out.glb");
      //   StorageReference modelRef=storage.getReferenceFromUrl("https://firebasestorage.googleapis.com/v0/b/ar-app-for-monuments.appspot.com/o/out.glb?alt=media&token=0926315a-bc92-4105-80de-edcc2f932203");

        //arFragment = (ArFragment) getSupportFragmentManager().findFragmentById(R.id.arFragment);
       btn_click = findViewById(R.id.button2);
       btn_click.setOnClickListener(new OnClickListener() {
           @Override
           public void onClick(View v) {
               //                   File file = File.createTempFile("out", "glb");

               //                 modelRef.getFile(file).addOnSuccessListener(taskSnapshot -> buildModel(file));

               Toast.makeText(getApplicationContext(),
                       "WELCOME",
                       Toast.LENGTH_LONG).show();;

           }
       });
       /* btn = findViewById(R.id.downloadbtn);
                btn.setOnClickListener(new OnClickListener() {
            public void onClick(View v) {


            }
        });*/

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
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}

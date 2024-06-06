package com.techcruz.arappformonuments;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.biometric.BiometricPrompt;
import androidx.core.content.ContextCompat;

import com.facebook.AccessToken;
import com.facebook.AccessTokenTracker;
import com.facebook.CallbackManager;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.login.LoginResult;
import com.facebook.login.widget.LoginButton;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FacebookAuthProvider;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

import java.util.Objects;
import java.util.concurrent.Executor;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "FacebookAuthentication";
    GoogleSignInOptions gso;
    GoogleSignInClient gsc;
    ImageView googleBtn;
    ImageView authbtn;
    Executor executor;
    private BiometricPrompt biometricPrompt;
    private BiometricPrompt.PromptInfo promptInfo;
    private FirebaseAuth mAuth;
    EditText username,password;
    Button login;
    TextView forgetpass;
    CallbackManager mcallbackManager;
    FirebaseAuth.AuthStateListener authStateListener;
    FirebaseAuth mFirebaseAuth;
    LoginButton facebook_btn;
    TextView textViewUser;
    AccessTokenTracker accessTokenTracker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FacebookSdk.sdkInitialize(this.getApplicationContext());
        setContentView(R.layout.activity_main);
            googleBtn = findViewById(R.id.google_btn);
            authbtn=findViewById(R.id.authbtn);
            executor = ContextCompat.getMainExecutor(this);
            textViewUser =findViewById(R.id.forgotpass);
            mFirebaseAuth=FirebaseAuth.getInstance();
            facebook_btn=findViewById(R.id.facebook_btn);
            mcallbackManager=CallbackManager.Factory.create();

            facebook_btn.registerCallback(mcallbackManager, new FacebookCallback<LoginResult>(){


                @Override
                public void onSuccess(LoginResult loginResult){
                    Log.d(TAG,"onSuccess"+loginResult);
                    handleFacebookToken(loginResult.getAccessToken());
                    Intent intent = new Intent(MainActivity.this,second.class);
                    startActivity(intent);

                }
                @Override
                public void onCancel() {
                    Log.d(TAG,"onCancel");


                }
                @Override
                public void onError(@NonNull FacebookException error) {
                    Log.d(TAG,"onError"+error);
                }

            });
            authStateListener=new FirebaseAuth.AuthStateListener() {
                @Override
                public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                    FirebaseUser user=firebaseAuth.getCurrentUser();
                    updateUI(user);
                }
            };
            accessTokenTracker=new AccessTokenTracker() {
                @Override
                protected void onCurrentAccessTokenChanged(AccessToken oldAccessToken, AccessToken currentAccessToken) {
                    if(currentAccessToken ==null)
                    {
                        mFirebaseAuth.signOut();
                    }
                }
            };



        username=findViewById(R.id.username);
        password=findViewById(R.id.password);
        login=findViewById(R.id.loginbtn);
        login.setOnClickListener(view -> {
            if(Objects.equals(username.getText().toString(), "admin")&&Objects.equals(password.getText().toString(),"admin"))
            {
                Toast.makeText(MainActivity.this,"You have Authenticated Successfully",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,second.class);
                startActivity(intent);

            }
            else if (Objects.equals(username.getText().toString(), " ")&&Objects.equals(password.getText().toString()," "))
            {
                Toast.makeText(MainActivity.this,"You have Authenticated Successfully",Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this,second.class);
                startActivity(intent);

            }
            else
            {
                Toast.makeText(MainActivity.this,"Authentication Failed",Toast.LENGTH_LONG).show();
            }
        });

            forgetpass=findViewById(R.id.forgotpass);
            forgetpass.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this,"Contact the administrator!!!",Toast.LENGTH_LONG).show();
            }
            });



            biometricPrompt= new BiometricPrompt(MainActivity.this, executor, new BiometricPrompt.AuthenticationCallback() {
            @Override
            public void onAuthenticationError(int errorCode, @NonNull CharSequence errString) {
                super.onAuthenticationError(errorCode, errString);
                Toast.makeText(MainActivity.this,"Authentication error: " +errString, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onAuthenticationSucceeded(@NonNull BiometricPrompt.AuthenticationResult result) {
                super.onAuthenticationSucceeded(result);
                Toast.makeText(MainActivity.this,"Authentication success!!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MainActivity.this,second.class);
                startActivity(intent);
            }

            @Override
            public void onAuthenticationFailed() {
                super.onAuthenticationFailed();
                Toast.makeText(MainActivity.this,"Authentication failed!!", Toast.LENGTH_SHORT).show();

            }
        });
        promptInfo=new BiometricPrompt.PromptInfo.Builder()
                .setTitle("Biometric Authentication")
                .setSubtitle("Login using fingerprint/face authentication")
                .setNegativeButtonText("User App Password")
                .build();
            authbtn.setOnClickListener(view -> biometricPrompt.authenticate(promptInfo));
        gso = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().build();
        gsc = GoogleSignIn.getClient(this,gso);

        GoogleSignInAccount acct = GoogleSignIn.getLastSignedInAccount(this);
        if(acct!=null){
            navigateToSecondActivity();
        }
        googleBtn.setOnClickListener(v -> signIn());
    }

    private void handleFacebookToken(AccessToken token) {

        Log.d(TAG, "handleFacebookToken" + token);
        AuthCredential credential = FacebookAuthProvider.getCredential(token.getToken());
        mFirebaseAuth.signInWithCredential(credential).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (task.isSuccessful()) {
                    Log.d(TAG, "SIGN IN WITH CREDENTIAL : SUCCESSFUL");
                    FirebaseUser user = mFirebaseAuth.getCurrentUser();
                    updateUI(user);
                } else {
                    Log.d(TAG, "SIGN IN WITH CREDENTIAL : failure", task.getException());
                    Toast.makeText(MainActivity.this, "Authentication Failed", Toast.LENGTH_SHORT).show();
                    updateUI(null);

                }
            }
        });
    }

    private void updateUI(FirebaseUser user) {

        if (user != null) {
            textViewUser.setText(user.getDisplayName());
            if(user.getPhotoUrl()!=null){
                String photoUrl=user.getPhotoUrl().toString();
            }

        }
        else{
            textViewUser.setText("");

        }
    }
    @Override
    protected void onStart(){
        super.onStart();
        mFirebaseAuth.addAuthStateListener(authStateListener);
    }
    @Override
    protected void onStop(){
        super.onStop();
        if(authStateListener!=null){
            mFirebaseAuth.removeAuthStateListener(authStateListener);
        }
    }


    void signIn(){
        Intent signInIntent = gsc.getSignInIntent();
        startActivityForResult(signInIntent,1000);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode,Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        mcallbackManager.onActivityResult(requestCode,resultCode,data);
        super.onActivityResult(requestCode,resultCode,data);


        if(requestCode == 1000){
            Task<GoogleSignInAccount> task = GoogleSignIn.getSignedInAccountFromIntent(data);

            try {
                task.getResult(ApiException.class);
                navigateToSecondActivity();
            } catch (ApiException e) {
                Toast.makeText(getApplicationContext(), "Something went wrong", Toast.LENGTH_SHORT).show();
            }
        }

    }
    void navigateToSecondActivity(){
        finish();

        Intent intent = new Intent(MainActivity.this,second.class);
        startActivity(intent);
    }
}

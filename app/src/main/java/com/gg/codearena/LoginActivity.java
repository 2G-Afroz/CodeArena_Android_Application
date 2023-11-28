package com.gg.codearena;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.gg.codearena.databinding.ActivityLoginBinding;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthInvalidCredentialsException;

public class LoginActivity extends AppCompatActivity {


    ActivityLoginBinding binding;
    SharedPreferences sharedPreferences;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLoginBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Initializing views
        auth = FirebaseAuth.getInstance();
        sharedPreferences = this.getSharedPreferences(Utils.PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor prefEditor = sharedPreferences.edit();

        // Click Event
        binding.tvRegisterNow.setOnClickListener(v -> {
            Intent intent = new Intent(this, RegisterActivity.class);
            startActivity(intent);
            finish();
        });
        binding.btnLogin.setOnClickListener(v -> {
            String email = binding.tietEmail.getText().toString();
            String pass = binding.tietPass.getText().toString();
            if (email.isEmpty()) {
                // There is no email
                Toast.makeText(this, "Please enter your email.", Toast.LENGTH_SHORT).show();
            } else if (pass.isEmpty()) {
                // There is no pass
                Toast.makeText(this, "Please enter your password.", Toast.LENGTH_SHORT).show();
            } else {
                auth.signInWithEmailAndPassword(email, pass)
                        .addOnSuccessListener(authResult -> {
                                // Save the user login data
                                prefEditor.putString(Utils.USER_EMAIL, email);
                                prefEditor.putString(Utils.USER_PASS, pass);
                                prefEditor.apply();
                                // Go to main activity
                                startMainActivity();
                        })
                        .addOnFailureListener(e -> {
                            Toast.makeText(this, "Failed to login: "+e, Toast.LENGTH_SHORT).show();
                        });
            }
        });
        binding.tvForgotPass.setOnClickListener(v -> {
            // Do the reset password work
            String email = binding.tietEmail.getText().toString();
            if(!email.isEmpty()){
                auth.sendPasswordResetEmail(email)
                        .addOnSuccessListener(unused -> {
                            Toast.makeText(this, "Password reset link sent to \n"+email, Toast.LENGTH_SHORT).show();
                        })
                        .addOnFailureListener(e -> {
                            if(e instanceof FirebaseAuthInvalidCredentialsException){
                                Toast.makeText(this, "Wrong email.", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Toast.makeText(this, "Failed: \n"+e, Toast.LENGTH_SHORT).show();
                            }
                        });
            } else {
                Toast.makeText(this, "Please enter your email.", Toast.LENGTH_SHORT).show();
            }
        });

        // On coming from register activity
        binding.tietEmail.setText(getIntent().getStringExtra(Utils.USER_EMAIL));
    }

    private void startMainActivity(){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
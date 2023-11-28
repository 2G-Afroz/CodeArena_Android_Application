package com.gg.codearena;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import com.gg.codearena.databinding.ActivityRegisterBinding;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthUserCollisionException;
import com.google.firebase.firestore.FirebaseFirestore;

public class RegisterActivity extends AppCompatActivity {

    private ActivityRegisterBinding binding;
    private FirebaseAuth auth;
    private SharedPreferences sharedPreferences;

    public RegisterActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityRegisterBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Initializing variables
        auth = FirebaseAuth.getInstance();
        sharedPreferences = getSharedPreferences(Utils.PREF_NAME, Context.MODE_PRIVATE);
        SharedPreferences.Editor prefEditor = sharedPreferences.edit();

        // Click Events
        binding.tvLoginNow.setOnClickListener(v -> {
            Intent intent = new Intent(this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

        binding.btnSignUp.setOnClickListener(v -> {
            String name = binding.tietName.getText().toString();
            String email = binding.tietEmail.getText().toString();
            String pass = binding.tietPass.getText().toString();
            String confPass = binding.tietConfPass.getText().toString();

            if (name.isEmpty()) {
                // There is no name.
                Toast.makeText(this, "Please enter your name.", Toast.LENGTH_SHORT).show();
            } else if (email.isEmpty()) {
                // There is no email
                Toast.makeText(this, "Please enter you email.", Toast.LENGTH_SHORT).show();
            } else if (pass.isEmpty()) {
                // There is no pass
                Toast.makeText(this, "Please enter a password.", Toast.LENGTH_SHORT).show();
            } else if (confPass.isEmpty()) {
                // There is no confirm pass.
                Toast.makeText(this, "Please confirm you password.", Toast.LENGTH_SHORT).show();
            } else if (pass.equals(confPass)) {
                if (pass.length() < 6) {
                    // Password is too short
                    Toast.makeText(this, "Password must be at least 6 characters", Toast.LENGTH_SHORT).show();
                } else if (pass.length() > 14) {
                    // Password is too long
                    Toast.makeText(this, "Password must be at most 14 characters", Toast.LENGTH_SHORT).show();
                } else {
                    auth.createUserWithEmailAndPassword(email, pass)
                            .addOnSuccessListener(authResult -> {
                                // Account created
                                // Save user email and pass to sharedPref
                                prefEditor.putString(Utils.USER_EMAIL, email);
                                prefEditor.putString(Utils.USER_PASS, pass);
                                prefEditor.apply();
                                // save user name to database
                                FirebaseFirestore db = FirebaseFirestore.getInstance();
                                db.collection("users")
                                        .add(new User(name, auth.getCurrentUser().getUid()));
                                // Enter into the application.
                                startActivity(new Intent(this, MainActivity.class));
                                finish();
                            })
                            .addOnFailureListener(e -> {
                                if(e instanceof FirebaseAuthUserCollisionException){
                                    Toast.makeText(this, "Email address is already in use. \nPlease LOGIN.", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(this, LoginActivity.class);
                                    intent.putExtra(Utils.USER_EMAIL, email);
                                    startActivity(intent);
                                    finish();
                                }
                                else{
                                    Toast.makeText(this, "Registration failed: "+ e.getMessage(), Toast.LENGTH_SHORT).show();
                                }
                            });
                }
            }
            else {
                Toast.makeText(this, "Passwords do not match. Please try again.", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
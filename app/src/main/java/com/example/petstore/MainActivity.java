package com.example.petstore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLogin = findViewById(R.id.btnlogin);
        EditText txtEmail = findViewById(R.id.txtEmail);
        EditText txtPassword = findViewById(R.id.txtPassword);
        TextView txtError = findViewById(R.id.txtError);

        btnLogin.setOnClickListener(view -> {
            String email = txtEmail.getText().toString();
            String password = txtPassword.getText().toString();
            if(getString(R.string.user_name).equals(email) && getString(R.string.user_password).equals(password)){
                Intent switchActivity = new Intent(this, LayoutDrawableActivity.class);
                startActivity(switchActivity);
                txtError.setText("");
            }
            else{
                txtError.setText(getString(R.string.login_error));
            }
        });
    }
}
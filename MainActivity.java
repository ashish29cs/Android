package com.example.loginactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText edUsername;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edUsername=findViewById(R.id.uname);
        btnLogin=findViewById(R.id.btn);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String strUsername=edUsername.getText().toString();
                Intent intent=new Intent(MainActivity.this,WelcomeActivity.class);
                intent.putExtra("Username",strUsername);
                startActivity(intent);

            }
        });

    }
}
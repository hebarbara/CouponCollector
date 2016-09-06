package com.example.archanayadawa.couponbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {
    private Button btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btnRegister = (Button) findViewById(R.id.register_button);
        btnRegister.setOnClickListener(RegisterActivity.this);

    }

    public void onClick(View view) {
        if (view == btnRegister) {
            Intent intent = new Intent(RegisterActivity.this, EnterActivity.class);
            startActivity(intent);
        }
    }
}

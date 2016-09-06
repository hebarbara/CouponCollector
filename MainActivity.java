package com.example.archanayadawa.couponbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button btnClick;
    private Button btnClick2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnClick = (Button) findViewById(R.id.button);
        btnClick.setOnClickListener(MainActivity.this);
        btnClick2 = (Button) findViewById(R.id.button7);
        btnClick2.setOnClickListener(MainActivity.this);

    }
    public void onClick(View view)
    {
        if(view == btnClick)
        {
            Intent intent = new Intent(MainActivity.this, EnterActivity.class);
            startActivity(intent);
        }
        if(view == btnClick2)
        {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
        }

    }

}

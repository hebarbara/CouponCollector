package com.example.archanayadawa.couponbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Kohls extends AppCompatActivity implements View.OnClickListener
{
    private Button btnk1;
    private Button btnk2;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kohls);
        btnk1 = (Button) findViewById(R.id.button3);
        btnk1.setOnClickListener(Kohls.this);
        btnk2 = (Button) findViewById(R.id.button4);
        btnk2.setOnClickListener(Kohls.this);
    }


    public void onClick(View view)
    {
        if(view == btnk1)
        {
            Intent intent = new Intent(Kohls.this, Kohl10.class);
            startActivity(intent);
        }

        if(view == btnk2)
        {
            Intent intent = new Intent(Kohls.this, Kohls15.class);
            startActivity(intent);
        }
    }
}

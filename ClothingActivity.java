package com.example.archanayadawa.couponbook;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ClothingActivity extends AppCompatActivity implements View.OnClickListener
{
private ImageButton btnJCP;
    private  ImageButton btnKL;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clothing);
        btnJCP = (ImageButton) findViewById(R.id.JCPenney);
        btnJCP.setOnClickListener(ClothingActivity.this);
        btnKL = (ImageButton) findViewById(R.id.KOHL);
        btnKL.setOnClickListener(ClothingActivity.this);

    }

    public void onClick(View view)
    {
        if(view == btnJCP)
        {
            Intent intent = new Intent(ClothingActivity.this, JCPenney.class);
            startActivity(intent);
        }
        if(view == btnKL)
        {
            Intent intent = new Intent(ClothingActivity.this, Kohls.class);
            startActivity(intent);
        }
    }
}

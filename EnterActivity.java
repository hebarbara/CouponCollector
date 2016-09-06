package com.example.archanayadawa.couponbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class EnterActivity extends AppCompatActivity implements View.OnClickListener
{
    private ImageButton btnFood;
    private ImageButton btnClothing;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_enter);
        btnFood = (ImageButton) findViewById(R.id.foodButton);
        btnFood.setOnClickListener(EnterActivity.this);
        btnClothing = (ImageButton) findViewById(R.id.clothingButton);
        btnClothing.setOnClickListener(EnterActivity.this);
    }

    public void onClick(View view)
    {
        if(view == btnFood)
        {
            Intent intent = new Intent(EnterActivity.this, FoodActivity.class);
            startActivity(intent);
        }

        if(view == btnClothing)
        {
            Intent intent = new Intent(EnterActivity.this, ClothingActivity.class);
            startActivity(intent);
        }

    }


}

package com.example.archanayadawa.couponbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FoodActivity extends AppCompatActivity implements View.OnClickListener

{
   private Button btnSweetT;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        btnSweetT = (Button) findViewById(R.id.buttonSweetTomatoes);
        btnSweetT.setOnClickListener(FoodActivity.this);

    }

    public void onClick(View view)
    {
        if(view == btnSweetT)
        {
            Intent intent = new Intent(FoodActivity.this, SweetTomatoes.class);
            startActivity(intent);
        }
    }
}


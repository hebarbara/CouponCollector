package com.example.archanayadawa.couponbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SweetTomatoes extends AppCompatActivity implements View.OnClickListener
{
private Button btnOpt1;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sweet_tomatoes);
        btnOpt1 = (Button) findViewById(R.id.buttonST1);
        btnOpt1.setOnClickListener(SweetTomatoes.this);

    }
    public void onClick(View view)
    {
        if(view == btnOpt1)
        {
            Intent intent = new Intent(SweetTomatoes.this, SweetTomatoesOpt1.class);
            startActivity(intent);
        }
    }
}

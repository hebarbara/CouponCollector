package com.example.archanayadawa.couponbook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class JCPenney extends AppCompatActivity implements View.OnClickListener
{
    private Button btnjc15;
    private Button btnjc30;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jcpenney);
        btnjc15 = (Button) findViewById(R.id.button6);
        btnjc15.setOnClickListener(JCPenney.this);
        btnjc30 = (Button) findViewById(R.id.button11);
        btnjc30.setOnClickListener(JCPenney.this);
    }


    public void onClick(View view)
    {
        if(view == btnjc15)
        {
            Intent intent = new Intent(JCPenney.this, JCPenney15.class);
            startActivity(intent);
        }

        if(view == btnjc30)
        {
            Intent intent = new Intent(JCPenney.this, JCPenney30.class);
            startActivity(intent);
        }
    }
}

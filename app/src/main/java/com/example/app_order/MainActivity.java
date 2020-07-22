package com.example.app_order;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button waiter, chef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Anhxa();
        waiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ORDER_SIDE.class);
                startActivity(i);
            }
        });



    }

    private void Anhxa(){
        waiter= findViewById(R.id.buttonwaiter);
        chef=findViewById(R.id.buttonchef);
    }
}

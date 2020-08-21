package com.example.coffe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonOrder = findViewById(R.id.buttonOrder);
    }

    public void onClickOrderCoffee(View view) {
        Intent intent = new Intent(this, OrderedCoffee.class);
        startActivity(intent);
    }
}
package com.example.currencyconvertor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {

        EditText editTextNumber = findViewById(R.id.editTextNumber);

        String amountInRupees = editTextNumber.toString();

        double amount = Double.parseDouble(amountInRupees);

        double amountInDollar = amount * 0.014;

        String amountIntString = Double.toString(amountInDollar);

        Toast.makeText(this, "Dollar -> "+amountInDollar, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
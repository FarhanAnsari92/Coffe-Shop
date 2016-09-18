package com.example.adil.coffeeshop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    TextView countVal,data;
    CheckBox whitecoff,blackcoff;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countVal = (TextView) findViewById(R.id.val);
        whitecoff = (CheckBox)findViewById(R.id.White_Coffe);
        blackcoff = (CheckBox)findViewById(R.id.Black_Coffe);

        data = (TextView) findViewById(R.id.data);
        countVal.setText(String.valueOf(count));

    }

    public void Add(View v) {
        countVal.setText(String.valueOf(++count));
    }

    public void Sub(View v) {
        countVal.setText(String.valueOf(--count));
    }
    public void Calculate(View v) {
        String info = "";
        if (whitecoff.isChecked()) {
            info += "White Coffe: " + count * 50 + "\n";
        }
        if (blackcoff.isChecked()) {
            info += "Black Coffe: " + count * 70 + "\n";
        }
        data.setText(info);
    }
}

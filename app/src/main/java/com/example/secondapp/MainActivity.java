package com.example.secondapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText ofPercent;
    EditText ofNumber;
    Button ofAnswer;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ofPercent = (EditText) findViewById(R.id.percent);
        ofNumber = (EditText) findViewById(R.id.number);
        ofAnswer = (Button) findViewById(R.id.click);
        result = (TextView) findViewById(R.id.answer);


        ofAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float percentage = Float.parseFloat(ofPercent.getText().toString());
                float div = percentage/100;
                float total = div* Float.parseFloat(ofNumber.getText().toString());
                result.setText(String.valueOf(total));
            }
        });



    }
}

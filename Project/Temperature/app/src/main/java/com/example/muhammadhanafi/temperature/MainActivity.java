package com.example.muhammadhanafi.temperature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //TODO: 7.
    EditText inputTxt;
    TextView outputTxt, labelTxt;
    RadioButton celcius, fahrenheit, kelvin;
    Button convertBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // TODO: 8.
        inputTxt = findViewById(R.id.inputTxt);
        outputTxt = findViewById(R.id.output_txt);
        labelTxt = findViewById(R.id.label_txt);
        celcius = findViewById(R.id.celcius);
        fahrenheit = findViewById(R.id.farenheit);
        kelvin = findViewById(R.id.kelvin);
        convertBtn = findViewById(R.id.convertBtn);


        //TODO: 9.
        convertBtn.setOnClickListener(new View.OnClickListener() {

            //TODO: 10.

            @Override
            public void onClick(View v) {

                //TODO: 11.

                try {
                    double input = Double.parseDouble(inputTxt.getText().toString());
                    double output = 0;

                    if (celcius.isChecked()) {
                        labelTxt.setText("Fahrenheit aja");
                        output = input * 9 / 5 + 32;
                    } else if (fahrenheit.isChecked()) {
                        labelTxt.setText("Celcius nih");
                        output = (input - 32) * 5 / 9;
                    } else if (kelvin.isChecked()) {
                        labelTxt.setText("Celcius oke kok");
                        output = input + 273;
                    }
                    outputTxt.setText(output + "");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    Toast.makeText(MainActivity.this, "Isi Value Nya", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });

        //TODO: 9.
        celcius.setOnClickListener(new View.OnClickListener() {

            //TODO: 10.

            @Override
            public void onClick(View v) {

                //TODO: 11.

                try {
                    double input = Double.parseDouble(inputTxt.getText().toString());
                    double output = 0;
                    if (celcius.isChecked()) {
                        labelTxt.setText("Fahrenheit aja");
                        output = input * 9 / 5 + 32;
                    } else if (fahrenheit.isChecked()) {
                        labelTxt.setText("Celcius nih");
                        output = (input - 32) * 5 / 9;
                    } else if (kelvin.isChecked()) {
                        labelTxt.setText("Celcius oke kok");
                        output = input + 273;
                    }
                    outputTxt.setText(output + "");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    Toast.makeText(MainActivity.this, "Isi Value Nya", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });

        //TODO: 9.
        fahrenheit.setOnClickListener(new View.OnClickListener() {

            //TODO: 10.

            @Override
            public void onClick(View v) {

                //TODO: 11.

                try {
                    double input = Double.parseDouble(inputTxt.getText().toString());
                    double output = 0;
                    if (celcius.isChecked()) {
                        labelTxt.setText("Fahrenheit aja");
                        output = input * 9 / 5 + 32;
                    } else if (fahrenheit.isChecked()) {
                        labelTxt.setText("Celcius nih");
                        output = (input - 32) * 5 / 9;
                    } else if (kelvin.isChecked()) {
                        labelTxt.setText("Celcius oke kok");
                        output = input + 273;
                    }
                    outputTxt.setText(output + "");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    Toast.makeText(MainActivity.this, "Isi Value Nya", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });

        //TODO: 9.
        kelvin.setOnClickListener(new View.OnClickListener() {

            //TODO: 10.

            @Override
            public void onClick(View v) {

                //TODO: 11.

                try {
                    double input = Double.parseDouble(inputTxt.getText().toString());
                    double output = 0;
                    if (celcius.isChecked()) {
                        labelTxt.setText("Fahrenheit aja");
                        output = input * 9 / 5 + 32;
                    } else if (fahrenheit.isChecked()) {
                        labelTxt.setText("Celcius nih");
                        output = (input - 32) * 5 / 9;
                    } else if (kelvin.isChecked()) {
                        labelTxt.setText("Celcius oke kok");
                        output = input + 273;
                    }
                    outputTxt.setText(output + "");
                } catch (Exception ex) {
                    ex.printStackTrace();
                    Toast.makeText(MainActivity.this, "Isi Value Nya", Toast.LENGTH_LONG)
                            .show();
                }
            }
        });
    }
}
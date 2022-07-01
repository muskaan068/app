package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
Button bt;
AutoCompleteTextView autoCompleteTextView;
String[] names={"Raj","Muuski","Pria","goyal","Manoj","Ria"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bt=(Button)findViewById(R.id.button);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"You clicked me!",Toast.LENGTH_LONG).show();

            }
        });
        ArrayAdapter<String> adapter = new ArrayAdapter<>
                (this,android.R.layout.select_dialog_item, names);//suggestion box or layout with only text view then use inbuilt layout i.e select_dialog_item)
        autoCompleteTextView = (AutoCompleteTextView)findViewById(R.id.autoCompleteTextView);
        autoCompleteTextView.setThreshold(2);
        autoCompleteTextView.setAdapter(adapter);


    }
}
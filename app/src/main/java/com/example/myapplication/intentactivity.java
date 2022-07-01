package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class intentactivity extends AppCompatActivity {

    TextView title;
    Button click,send,webpage;
    EditText editText=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentactivity);

        title =(TextView) findViewById(R.id.textView6);
        click=(Button) findViewById(R.id.button4);
        send=(Button) findViewById(R.id.button5);
        editText=(EditText) findViewById(R.id.editTextTextPersonName2);
        webpage=(Button)findViewById((R.id.button6));
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);
            }
        });
        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ed_txt=editText.getText().toString().trim();
                if(ed_txt.isEmpty()||ed_txt.length()==0 || ed_txt.equals("")||ed_txt==null)
                {
                    Toast.makeText(getApplicationContext(),"First enter text to send in another actvity",Toast.LENGTH_LONG).show();
                }

                else
                {
                    //user has given some input
                    Intent in= new Intent(getApplicationContext(),MainActivity.class);
                    in.putExtra("mes_key",ed_txt);
                    startActivity(in);
                }
            }
        });

        webpage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.accountingtools.com/articles/present-value-of-1-table#:~:text=What%20is%20a%20Present%20Value,arrive%20at%20its%20present%20value";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);

            }
        });
        title.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT,title.getText().toString());
                startActivity(Intent.createChooser(intent,"Share to"));



            }
        });

    }
}
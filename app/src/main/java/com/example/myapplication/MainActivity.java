package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView recintentmsg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recintentmsg = (TextView) findViewById(R.id.textView11);
        Intent in= getIntent();
        String str = getIntent().getStringExtra("mes_key");

        recintentmsg.setText(str);

       /* Log.d("Lifecycle","Oncreate call back method called ");
    }
    @Override
    protected void onStart()

    {
super.onStart();
        Log.d("Lifecycle","Onstart call back method called ");
    }
    @Override
    protected void onResume()
    {
        super.onResume();
        Log.d("Lifecycle","Onresume call back method called ");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Log.d("Lifecycle","OnPause call back method called ");
    }
@Override
    protected void onStop()
{
    super.onStop();
    Log.d("Lifecycle","OnStop call back method called ");
}
    @Override
    protected void onRestart()
    {
        super.onRestart();
        Log.d("Lifecycle","OnRestart call back method called ");

    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Log.d("Lifecycle","OnDestroy call back method called ");

    }

*/
        //receiving data from intentactvity


    }
}
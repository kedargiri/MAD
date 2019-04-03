package com.example.HelloToastChallenge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private  int mcount;
    private TextView textcount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textcount=(TextView) findViewById(R.id.textView_count);
    }

    public void Count(View view) {
        //Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG).show();
        mcount++;
        textcount.setText(""+ mcount);
    }


    public void ShowToast(View view) {
        Toast.makeText(this, "Hello Toast", Toast.LENGTH_LONG).show();
    }
}

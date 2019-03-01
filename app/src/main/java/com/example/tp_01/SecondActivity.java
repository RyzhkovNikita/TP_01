package com.example.tp_01;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class SecondActivity extends Activity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        int count = intent.getIntExtra(MainActivity.EXTRA_INT, 0);
        textView = findViewById(R.id.textView);
        textView.setText(Integer.toString(count));
    }
}

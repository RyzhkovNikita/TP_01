package com.example.tp_01;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_INT = "int";
    Button button, openButton;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textview = findViewById(R.id.tv);
        textview.setText("0");
        textview.setTextSize(50);
        textview.setPadding(5,5,5,5);
        button = findViewById(R.id.button);
        openButton = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence text = textview.getText();
                int i = Integer.parseInt(text.toString());
                i++;
                textview.setText(Integer.toString(i));
            }
        });
        openButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra(EXTRA_INT, Integer.parseInt(textview.getText().toString()));
                startActivity(intent);
            }
        });
    }
}

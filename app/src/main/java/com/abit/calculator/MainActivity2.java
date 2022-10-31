package com.abit.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        button=findViewById(R.id.bottomButton);
        setContentView(R.layout.activity_main2);
        String text=getIntent().getStringExtra("key1");
        textView=findViewById(R.id.bottomText);
        textView.setText(text);

    }

    public void onExitClick(View view) {
        super.finishAffinity();
    }
}
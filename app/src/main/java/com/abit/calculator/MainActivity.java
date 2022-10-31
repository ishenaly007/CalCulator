package com.abit.calculator;

import static android.view.View.VISIBLE;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Integer first;
    private Integer second;
    private Boolean isOperationClick;
    private String sign;
    private Button invsblBTN;
    private Float first2;
    private Float second2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.text_view);
        invsblBTN=findViewById(R.id.invisibleButton);

        findViewById(R.id.invisibleButton).setOnClickListener(view -> {
            String text= textView.getText().toString();

            Intent intent= new Intent(MainActivity.this,MainActivity2.class);
            intent.putExtra("key1", text);

            startActivity(intent);
        });



    }

    public void onNumberClick(View view) {
        switch (view.getId()){
            case R.id.btn_0:
                if (textView.getText().toString().equals("0")){
                    textView.setText("0");
                }else if (isOperationClick){
                    textView.setText("0");
                }else {
                    textView.append("0");
                }

                break;
            case R.id.btn_1:
                if (textView.getText().toString().equals("0")){
                    textView.setText("1");
                }else if (isOperationClick){
                    textView.setText("1");
                }else {
                    textView.append("1");
                }
                break;
            case R.id.btn_2:
                if (textView.getText().toString().equals("0")){
                    textView.setText("2");
                }else if (isOperationClick){
                    textView.setText("2");
                }else {
                    textView.append("2");
                }
                break;
            case R.id.btn_3:
                if (textView.getText().toString().equals("0")){
                    textView.setText("3");
                }else if (isOperationClick){
                    textView.setText("3");
                }else {
                    textView.append("3");
                }
                break;
            case R.id.btn_4:
                if (textView.getText().toString().equals("0")){
                    textView.setText("4");
                }else if (isOperationClick){
                    textView.setText("4");
                }else {
                    textView.append("4");
                }
                break;
            case R.id.btn_5:
                if (textView.getText().toString().equals("0")){
                    textView.setText("5");
                }else if (isOperationClick){
                    textView.setText("5");
                }else {
                    textView.append("5");
                }
                break;
            case R.id.btn_6:
                if (textView.getText().toString().equals("0")){
                    textView.setText("6");
                }else if (isOperationClick){
                    textView.setText("6");
                }else {
                    textView.append("6");
                }
                break;
            case R.id.btn_7:
                if (textView.getText().toString().equals("0")){
                    textView.setText("7");
                }else if (isOperationClick){
                    textView.setText("7");
                }else {
                    textView.append("7");
                }
                break;
            case R.id.btn_8:
                if (textView.getText().toString().equals("0")){
                    textView.setText("8");
                }else if (isOperationClick){
                    textView.setText("8");
                }else {
                    textView.append("8");
                }
                break;
            case R.id.btn_9:
                if (textView.getText().toString().equals("0")){
                    textView.setText("9");
                }else if (isOperationClick){
                    textView.setText("9");
                }else {
                    textView.append("9");
                }
                break;
            case R.id.btn_clean:
                textView.setText("0");
                invsblBTN.setVisibility(View.INVISIBLE);
                break;
        }
        isOperationClick=false;
    }

    public void onOperationClick(View view) {
        switch (view.getId()){
            case R.id.btn_plus:
                first= Integer.valueOf(textView.getText().toString());
                sign="+";
                break;
            case R.id.btn_minus:
                first= Integer.valueOf(textView.getText().toString());
                sign="-";
                break;
            case R.id.btn_multiplication:
                first= Integer.valueOf(textView.getText().toString());
                sign="*";
                break;
            case R.id.btn_division:
                first= Integer.valueOf(textView.getText().toString());
                sign="/";
                break;
            case R.id.btn_procent:
                first= Integer.valueOf(textView.getText().toString());
                sign="%";
                break;
            case R.id.btn_equal:
                second=Integer.valueOf(textView.getText().toString());

                if (sign.equals("+")){

                    Integer result = first + second;
                    textView.setText(result.toString());
                }else if (sign.equals("-")){

                    Integer result = first - second;
                    textView.setText(result.toString());
                } else if (sign.equals("*")){

                    Integer result = first * second;
                    textView.setText(result.toString());
                } else if (sign.equals("/")){

                    Integer result = first / second;
                    textView.setText(result.toString());
                } else if (sign.equals("%")){

                    Integer result = first % second;
                    textView.setText(result.toString());
                }
                invsblBTN.setVisibility(VISIBLE);
        }
        isOperationClick=true;
    }

    public void onButtonClick(View view){

    }
}
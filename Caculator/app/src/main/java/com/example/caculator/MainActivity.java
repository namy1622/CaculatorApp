package com.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button bt0;  Button bt1;  Button bt2; Button bt3; Button bt4;

    Button bt5; Button bt6;  Button bt7;  Button bt8; Button bt9;

    Button btPhay; Button btC; Button btCE;

    Button btCong; Button btTru; Button btNhan; Button btChia;  Button btResult;

    TextView mainScreen, secondScreen;
    String tinhToan;
    String phepToan;
    boolean checkDot = false, checkBang = false;
    double so1, so2, ketQua ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        anhxa();

        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText("");
                mainScreen.setText("");
                tinhToan = "";
                phepToan = "";
                checkBang = false;
                checkDot = false;

            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "0");
                }
            }
        });

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "1");
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "2");
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "3");
                }
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "4");
                }
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "5");
                }
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "6");
                }
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "7");
                }
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "8");
                }
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    tinhToan = mainScreen.getText().toString();
                    mainScreen.setText(tinhToan + "9");
                }
            }
        });

        btC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                secondScreen.setText("");
                mainScreen.setText("");
                tinhToan = "";
                phepToan = "";
                checkDot = false;
                checkBang = false;
            }
        });

        btCE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    String val = mainScreen.getText().toString();

                    if(!val.isEmpty()){
                        val = val.substring(0,val.length()-1);
                        mainScreen.setText(val);
                    }
                }
            }
        });

        btPhay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    if(!checkDot){
                        tinhToan = mainScreen.getText().toString();
                        mainScreen.setText(tinhToan + ".");
                        checkDot = true;
                    }
                }

            }
        });

        btCong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainScreen.getText() == ""){
                    so1 = 0;
                    secondScreen.setText("0 + ");
                }
                else{
                    so1 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText((mainScreen.getText().toString() + " + "));
                    mainScreen.setText("");
                    tinhToan = "";
                    phepToan = "";
                    checkDot = false;
                    checkBang = false;
                }
            }
        });

        btTru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainScreen.getText() == ""){
                    so1 = 0;
                    secondScreen.setText("0 - ");
                }
                else{
                    so1 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText(mainScreen.getText().toString() + " - ");
                }
                mainScreen.setText("");
                tinhToan = "";
                phepToan = "-";
                checkDot = false;
                checkBang = false;

            }
        });

        btNhan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainScreen.getText() == ""){
                    so1 = 0;
                    secondScreen.setText("0 * ");
                }
                else{
                    so1 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText((mainScreen.getText().toString() + " * "));
                    mainScreen.setText("");
                    tinhToan = "";
                    phepToan = "";
                    checkDot = false;
                    checkBang = false;
                }
            }
        });

        btChia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mainScreen.getText() == ""){
                    so1 = 0;
                    secondScreen.setText("0 / ");
                }
                else{
                    so1 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText((mainScreen.getText().toString() + " / "));
                    mainScreen.setText("");
                    tinhToan = "";
                    phepToan = "";
                    checkDot = false;
                    checkBang = false;
                }
            }
        });

        btResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!checkBang){
                    checkDot = false;
                    tinhToan = mainScreen.getText().toString();
                    so2 = Double.parseDouble(mainScreen.getText() + "");
                    secondScreen.setText(secondScreen.getText().toString() + mainScreen.getText().toString() + "");
                    mainScreen.setText("");

                    if(phepToan ==  "+"){
                        ketQua = so1 + so2;
                    }
                    else if(phepToan == "-"){
                        ketQua = so1 - so2;
                    }
                    else if(phepToan == "*"){
                        ketQua = so1 * so2;
                    }
                    else if(phepToan == "/"){
                        ketQua = so1 / so2;
                    }
                    checkBang = true;
                    mainScreen.setText(ketQua + "");

                }
                phepToan = "";
            }
        });

    }

    protected  void anhxa(){
        bt0 = findViewById(R.id.bt0);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);

        btCong = findViewById(R.id.btnCong);
        btTru = findViewById(R.id.btnTru);
        btNhan = findViewById(R.id.btnNhan);
        btChia = findViewById(R.id.btnChia);
        btResult = findViewById(R.id.btnResult);

        btPhay = findViewById(R.id.btnPhay);
        btC = findViewById(R.id.btC);
        btCE = findViewById(R.id.btCE);

        secondScreen = findViewById(R.id.secondScreen);
        mainScreen = findViewById(R.id.Screen);
    }
}
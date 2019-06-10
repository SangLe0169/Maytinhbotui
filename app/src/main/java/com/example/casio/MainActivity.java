package com.example.casio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView tvNhap;

    private int[] idButon ={
            R.id.btn0,
            R.id.btn1, R.id.btn2, R.id.btn3,
            R.id.btn4, R.id.btn5, R.id.btn6,
            R.id.btn7, R.id.btn8 ,R.id.btn9,
            R.id.btncong, R.id.btntru, R.id.btnnhan, R.id.btnchia,
            R.id.btnbang, R.id.btnoff
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        connectView();
    }
    private  void connectView(){
          tvNhap =(TextView) findViewById(R.id.editNhap);
          for(int i=0;i<idButon.length;i++){
              findViewById(idButon[i]).setOnClickListener(this);
          }
          init();
    }
    private  void init(){
        tvNhap.setText("0");
    }

    @Override
    public void onClick(View view) {
        int id =view.getId();
        for(int i=0;i<idButon.length-2;i++){
            if(id==idButon[i]){
                String text =((Button) findViewById(id)).getText().toString();
                if (tvNhap.getText().toString().trim().equals("|")) {
                    tvNhap.setText("");
                }

                tvNhap.append(text);
                return;
            }
        }
        if (id == R.id.btnoff) {
            init();
            return;
        }


        if (id == R.id.btnbang) {

        }
    }

}

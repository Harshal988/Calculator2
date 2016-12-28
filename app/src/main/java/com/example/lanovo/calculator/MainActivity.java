package com.example.lanovo.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
private Button btn6,btn5,btn4,btn9,btn8,btn7,btn3,btn2,btn1,
    btn0,btnadd,btnsub,btnmul,btndiv,btnc,btnx,btnper,btndot,btneql;
    private EditText et;
    private TextView tv;
    float m,n;
    boolean madd,amul,msub,mdiv,mper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = (Button) findViewById(R.id.button28);
        btn1 = (Button) findViewById(R.id.button26);
        btn2 = (Button) findViewById(R.id.button25);
        btn3 = (Button) findViewById(R.id.button24);
        btn4 = (Button) findViewById(R.id.button16);
        btn5 = (Button) findViewById(R.id.button15);
        btn6 = (Button) findViewById(R.id.button14);
        btn7 = (Button) findViewById(R.id.button19);
        btn8 = (Button) findViewById(R.id.button18);
        btn9 = (Button) findViewById(R.id.button17);
        btnadd = (Button) findViewById(R.id.button30);
        btnsub = (Button) findViewById(R.id.button13);
        btnmul = (Button) findViewById(R.id.button10);
        btndiv = (Button) findViewById(R.id.button20);
        btnc = (Button) findViewById(R.id.button23);
        btnx = (Button) findViewById(R.id.button22);
        btnper = (Button)findViewById(R.id.button21);
        btndot = (Button)findViewById(R.id.button29);
        btneql = (Button)findViewById(R.id.button27);
        et = (EditText) findViewById(R.id.editText5);
        tv = (TextView)findViewById(R.id.textView4);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+"9");
            }
        });
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (et == null) {
                    et.setText("");
                }else{
                    m = Float.parseFloat(et.getText()+"");
                    madd = true;
                    et.setText(null);
                }
            }
        });
        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m = Float.parseFloat(et.getText()+"");
                msub = true;
                et.setText(null);
            }
        });
        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m = Float.parseFloat(et.getText()+"");
                amul = true;
                et.setText(null);
            }
        });
        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m = Float.parseFloat(et.getText()+"");
                mdiv = true;
                et.setText(null);
            }
        });
        btnper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               m = Float.parseFloat(et.getText()+"");
                mper = true;
            }
        });
        btneql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n = Float.parseFloat(et.getText()+"");
                if(madd == true){
                    et.setText(m + n +"");
                    madd = false;
                }
                if(msub == true){
                    et.setText(m - n +"");
                    msub = false;
                }
                if(amul ==true){
                    et.setText(m * n +"");
                    amul = false;
                }
                if(mdiv ==true){
                    et.setText(m / n + "");
                    mdiv = false;
                }
                if(mper ==true){
                    et.setText((m / 100) * 10 + "");
                    mper = false;
                }
            }
        });
        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText("");
            }
        });
        btndot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et.setText(et.getText()+".");
            }
        });
        btnx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = et.getText().toString();
                if(!TextUtils.isEmpty(text)) {
                    String newText1 = text.substring(0, text.length() - 1);
                    et.setText(newText1);
                    et.setSelection(newText1.length());
                }
            }
        });

    }
}

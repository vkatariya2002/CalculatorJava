package com.example.mycalc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button buttonadd,buttonsub,buttonmul,buttondiv,buttonback,buttonequal;
    EditText n1,n2;
    TextView r;
    int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonadd = findViewById(R.id.button1);
        buttonsub = findViewById(R.id.button2);
        buttonmul = findViewById(R.id.button3);
        buttondiv = findViewById(R.id.button4);
        buttonback = findViewById(R.id.button5);
        buttonequal = findViewById(R.id.button6);
        n1 = findViewById(R.id.editTextTextPersonName);
        n2 = findViewById(R.id.editTextTextPersonName2);
        r = findViewById(R.id.textView);
        buttonadd.setOnClickListener(this);
        buttonsub.setOnClickListener(this);
        buttonmul.setOnClickListener(this);
        buttondiv.setOnClickListener(this);
        buttonback.setOnClickListener(this);
        buttonequal.setOnClickListener(this);

    }

    private int getIntFromEditText(EditText editText) {
        if (editText.getText().toString().equals(""))
        {
            Toast.makeText(this,"enter number",Toast.LENGTH_SHORT).show();
            return 0;
        }
        else
            return Integer.parseInt(editText.getText().toString());
    }


    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(n1);
        num2 = getIntFromEditText(n2);
        switch (view.getId())
        {
            case R.id.button1:
                r.setText("Answer = "+(num1+num2));
                break;
            case R.id.button2:
                r.setText("Answer = "+(num1-num2));
                break;
            case R.id.button3:
                r.setText("Answer = "+(num1*num2));
                break;
            case R.id.button4:
                r.setText("Answer = "+((float)num1/(float) num2));
                break;
        }
    }



}
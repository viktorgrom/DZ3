package com.example.dz2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    private EditText editText2;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText  = (EditText) findViewById(R.id.inputOne);
        editText2 = (EditText) findViewById(R.id.inputTwo);
        textView  = (TextView) findViewById(R.id.summaInputs);
    }
    public void numberOne(View view) {
        Intent i = new Intent(this, Number2.class);
        startActivity(i);

    }
    public void ClickButton(View view){
        //Объявим числовые переменные
        double a,b,c;

        //Считаем с editText и editText2 текстовые значения
        String S1 = editText.getText().toString();
        String S2 = editText2.getText().toString();

        //Преобразуем текстовые переменные в числовые значения
        a = Double.parseDouble(S1);
        b = Double.parseDouble(S2);

        //Проведем с числовыми переменными нужные действия
        c = a+b;

        //Преобразуем ответ в число
        String S = Double.toString(c);

        //Выведем текст в textView
        textView.setText(S);
    }

}

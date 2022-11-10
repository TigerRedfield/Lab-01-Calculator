package com.example.vasilev303lab01calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText ta;
    EditText tb;
    TextView lr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ta=findViewById(R.id.txtA);
        tb=findViewById(R.id.txtB);
        lr=findViewById(R.id.labC);
    }

    public void my_add_click(View V)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float a = Float.parseFloat(sa);
        float b = Float.parseFloat(sb);

        float c = a+b;

        String sc = String.valueOf(c);

        lr.setText(sc);
    }

    public void my_sub_click(View V)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float a = Float.parseFloat(sa);
        float b = Float.parseFloat(sb);

        float c = a-b;

        String sc = String.valueOf(c);

        lr.setText(sc);
    }

    public void my_mul_click(View V)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float a = Float.parseFloat(sa);
        float b = Float.parseFloat(sb);

        float c = a*b;

        String sc = String.valueOf(c);

        lr.setText(sc);
    }

    public void my_div_click(View V)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        float a = Float.parseFloat(sa);
        float b = Float.parseFloat(sb);

        if (a!=0 && b!= 0)
        {
            float c = a/b;
            String sc = String.valueOf(c);
            lr.setText(sc);
        }
        else
        {
            lr.setText("На 0 делить нельзя!");
            return;
        }
    }

    public void my_sin_click(View V)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        double a = Double.parseDouble(sa);
        double b = Double.parseDouble(sb);

        double sinA = Math.sin(a);
        double sinB = Math.sin(b);

        String sc = String.valueOf(sinA);
        String sd = String.valueOf(sinB);

        ta.setText(sc);
        tb.setText(sd);
    }

    public void my_cos_click(View V)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        double a = Double.parseDouble(sa);
        double b = Double.parseDouble(sb);

        double cosA = Math.cos(a);
        double cosB = Math.cos(b);

        String sc = String.valueOf(cosA);
        String sd = String.valueOf(cosB);

        ta.setText(sc);
        tb.setText(sd);
    }

    public void my_tan_click(View V)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        double a = Double.parseDouble(sa);
        double b = Double.parseDouble(sb);

        double tanA = Math.cos(a);
        double tanB = Math.cos(b);

        String sc = String.valueOf(tanA);
        String sd = String.valueOf(tanB);

        ta.setText(sc);
        tb.setText(sd);
    }

    public void my_sqrt_click(View V)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        double a = Double.parseDouble(sa);
        double b = Double.parseDouble(sb);

        double sqrtA = Math.sqrt(a);
        double sqrtB = Math.sqrt(b);

        String sc = String.valueOf(sqrtA);
        String sd = String.valueOf(sqrtB);

        ta.setText(sc);
        tb.setText(sd);
    }

    public void my_pow_click(View V)
    {
        String sa = ta.getText().toString();
        String sb = tb.getText().toString();

        double a = Double.parseDouble(sa);
        double b = Double.parseDouble(sb);

        double pow = Math.pow(a, b);

        String sc = String.valueOf(pow);

        lr.setText(sc);
    }

    public void my_pi_click(View V)
    {
    double Pi = Math.PI;

    String sc = String.valueOf(Pi);

    lr.setText(sc);
    }
}
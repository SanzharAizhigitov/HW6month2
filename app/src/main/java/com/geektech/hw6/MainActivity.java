package com.geektech.hw6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EditText poshta = findViewById(R.id.poshta);
        EditText parol = findViewById(R.id.parol);
        Button button = findViewById(R.id.vxod);
        EditText editText2 = findViewById(R.id.parol);
        EditText editText1 = findViewById(R.id.poshta);
        TextView textView1 = findViewById(R.id.vxod);
        TextView textView2 = findViewById(R.id.Dobro);
        TextView textView3 = findViewById(R.id.Vipolnite);
        TextView textView4 = findViewById(R.id.zabil1);
        TextView textView5 = findViewById(R.id.zabil2);

        setContentView(R.layout.activity_main);
        button.setBackgroundColor(ContextCompat.getColor(MainActivity.this,R.drawable.corners3));
        button.setOnClickListener(view -> {
            if (poshta.getText().toString().equals("admin")&& parol.getText().toString().equals("admin")){
                editText1.setVisibility(View.GONE);
                editText2.setVisibility(View.GONE);
                textView1.setVisibility(View.GONE);
                textView3.setVisibility(View.GONE);
                textView4.setVisibility(View.GONE);
                textView5.setVisibility(View.GONE);
                button.setVisibility(View.GONE);
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Вы успешно зарегистрировались", Toast.LENGTH_SHORT);
                toast.show();

            }else {
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Неправильный логин и пароль", Toast.LENGTH_SHORT);
                toast.show();
            }

               }
                );

    }
}
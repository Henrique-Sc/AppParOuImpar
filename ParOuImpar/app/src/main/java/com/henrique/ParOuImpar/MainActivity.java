package com.henrique.ParOuImpar;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    EditText edtNum;
    Button btnVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum = findViewById(R.id.edtNum);
        btnVerificar = findViewById(R.id.btnVerificar);

        String num = (edtNum.getText().toString());

        btnVerificar.setOnClickListener(View -> {
            if (num.length() == 0) {
                Toast.makeText(this, "Caixa de texto vazia!", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Preencha corretamente!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
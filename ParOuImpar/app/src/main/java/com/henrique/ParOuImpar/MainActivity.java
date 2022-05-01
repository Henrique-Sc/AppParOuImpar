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

        btnVerificar.setOnClickListener(View -> {

            if (edtNum.getText().length() == 0) {
                Toast.makeText(this, "Caixa de texto vazia!", Toast.LENGTH_SHORT).show();
                Toast.makeText(this, "Preencha corretamente!", Toast.LENGTH_SHORT).show();
            } else {
                int num = Integer.parseInt(edtNum.getText().toString());
                String msg;

                if (num % 2 == 0) {
                    msg = String.format("O número %s é PAR!", num);
                } else {
                    msg = String.format("O número %s é ÍMPAR!", num);
                }

                Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
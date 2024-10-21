package com.example.anamneseapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ResultActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView resultText = findViewById(R.id.result_text);
        Button buttonBack = findViewById(R.id.button_back);

        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String age = intent.getStringExtra("age");
        String email = intent.getStringExtra("email");
        String phone = intent.getStringExtra("phone");
        String address = intent.getStringExtra("address");
        String weight = intent.getStringExtra("weight");
        String height = intent.getStringExtra("height");
        String medicalHistory = intent.getStringExtra("medicalHistory");
        String medications = intent.getStringExtra("medications");
        String allergies = intent.getStringExtra("allergies");
        String familyHistory = intent.getStringExtra("familyHistory");

        String result = "Nome: " + name + "\n" +
                "Idade: " + age + "\n" +
                "Email: " + email + "\n" +
                "Telefone: " + phone + "\n" +
                "Endereço: " + address + "\n" +
                "Peso: " + weight + " kg\n" +
                "Altura: " + height + " cm\n" +
                "Histórico Médico: " + medicalHistory + "\n" +
                "Medicamentos: " + medications + "\n" +
                "Alergias: " + allergies + "\n" +
                "Histórico Familiar: " + familyHistory + "\n" +
                "Dados enviados! Entraremos em contato em breve.";

        resultText.setText(result);

        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // Volta para a atividade anterior
            }
        });
    }
}

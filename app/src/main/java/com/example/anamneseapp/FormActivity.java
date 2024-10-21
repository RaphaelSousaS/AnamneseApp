package com.example.anamneseapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class FormActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);

        EditText editName = findViewById(R.id.edit_name);
        EditText editAge = findViewById(R.id.edit_age);
        EditText editEmail = findViewById(R.id.edit_email);
        EditText editPhone = findViewById(R.id.edit_phone);
        EditText editAddress = findViewById(R.id.edit_address);
        EditText editWeight = findViewById(R.id.edit_weight);
        EditText editHeight = findViewById(R.id.edit_height);
        EditText editMedicalHistory = findViewById(R.id.edit_medical_history);
        EditText editMedications = findViewById(R.id.edit_medications);
        EditText editAllergies = findViewById(R.id.edit_allergies);
        EditText editFamilyHistory = findViewById(R.id.edit_family_history);
        Button buttonSubmit = findViewById(R.id.button_submit);

        buttonSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = editName.getText().toString();
                String age = editAge.getText().toString();
                String email = editEmail.getText().toString();
                String phone = editPhone.getText().toString();
                String address = editAddress.getText().toString();
                String weight = editWeight.getText().toString();
                String height = editHeight.getText().toString();
                String medicalHistory = editMedicalHistory.getText().toString();
                String medications = editMedications.getText().toString();
                String allergies = editAllergies.getText().toString();
                String familyHistory = editFamilyHistory.getText().toString();

                Intent intent = new Intent(FormActivity.this, ResultActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("age", age);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                intent.putExtra("address", address);
                intent.putExtra("weight", weight);
                intent.putExtra("height", height);
                intent.putExtra("medicalHistory", medicalHistory);
                intent.putExtra("medications", medications);
                intent.putExtra("allergies", allergies);
                intent.putExtra("familyHistory", familyHistory);
                startActivity(intent);
            }
        });
    }
}

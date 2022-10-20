package com.example.kalkulatorbidangdatar13294;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edtNum1, edtNum2;
    TextView txtPanjang, txtLebar, txtHasilLuas, txtHasilKeliling;
    Button btnPersegi, btnSegitiga, btnLingkaran;
    double num1, num2, sisi, hasilLuas, hasilKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        btnPersegi = findViewById(R.id.btnPersegi);
        btnSegitiga = findViewById(R.id.btnSegitiga);
        btnLingkaran = findViewById(R.id.btnLingkaran);
        txtPanjang = findViewById(R.id.txtPanjang);
        txtLebar = findViewById(R.id.txtLebar);
        txtHasilLuas = findViewById(R.id.txtHasilLuas);
        txtHasilKeliling = findViewById(R.id.txtHasilKeliling);
    }
    public void btnPersegi(View v) {
        num1 = Double.parseDouble(edtNum1.getText().toString());
        num2 = Double.parseDouble(edtNum2.getText().toString());
        hasilLuas = num1*num2;
        hasilKeliling = (num1*2)+(num2*2);

        txtPanjang.setText("Panjang = "+edtNum1.getText());
        txtLebar.setText("Lebar = "+edtNum2.getText());
        txtHasilLuas.setText("Luasnya adalah = "+hasilLuas);
        txtHasilKeliling.setText("Kelilingnya adalah = "+hasilKeliling);
    }
    public void btnSegitiga(View v) {
        num1 = Double.parseDouble(edtNum1.getText().toString());
        num2 = Double.parseDouble(edtNum2.getText().toString());
        hasilLuas = (num1*num2)/2;
        sisi = Math.sqrt(Math.pow(num1, 2) + Math.pow(num2, 2));
        hasilKeliling = num1+num2+sisi;

        txtPanjang.setText("Alas = "+edtNum1.getText());
        txtLebar.setText("Tinggi = "+edtNum2.getText());
        txtHasilLuas.setText("Luasnya adalah = "+hasilLuas);
    }
    public void btnLingkaran(View v) {
        num1 = Double.parseDouble(edtNum1.getText().toString());
        num2 = num1 / 2;
        hasilLuas = Math.PI * Math.pow(num2,2);;
        hasilKeliling = 2 * Math.PI * num2;

        txtPanjang.setText("Diameter = "+edtNum1.getText());
        txtHasilLuas.setText("Luasnya adalah = "+hasilLuas);
        txtHasilKeliling.setText("Kelilingnya adalah = "+hasilKeliling);
    }
}
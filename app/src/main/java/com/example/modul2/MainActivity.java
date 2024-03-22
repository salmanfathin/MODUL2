package com.example.modul2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int gajiStatus, gajiGolongan;
    RadioGroup golongan;
    CheckBox status;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void hitung(View v) {
        EditText nama = (EditText) findViewById(R.id.nama);
        TextView outputNama = (TextView) findViewById(R.id.outputNama);
        String name = nama.getText().toString();
        outputNama.setText("Total Gaji Anda " + name);
        status = (CheckBox) findViewById(R.id.menikah);
        if (status.isChecked()) {
            gajiStatus = 500000;
            //Menampilkan Status Menikah
            TextView outputStatus = (TextView) findViewById(R.id.outputStatus);
            outputStatus.setText("Status Anda Menikah ");
        } else {
            gajiStatus = 0;
            //Menampilkan Status Belum Menikah
            TextView outputStatus = (TextView) findViewById(R.id.outputStatus);
            outputStatus.setText("Status Anda Belum Menikah ");
        }
        golongan = (RadioGroup) findViewById(R.id.rgGolongan);
        int gol = golongan.getCheckedRadioButtonId();
        if (gol == R.id.rbGolongan1) {
            gajiGolongan = 1000000;
            //Menampilkan Golongan 1
            TextView outputStatus2 = (TextView) findViewById(R.id.outputStatus2);
            outputStatus2.setText("Golongan Anda 1 ");
        } else if (gol == R.id.rbGolongan2) {
            gajiGolongan = 2000000;
            //Menampilkan Golongan 1
            TextView outputStatus2 = (TextView) findViewById(R.id.outputStatus2);
            outputStatus2.setText("Golongan Anda 2 ");
        }
        ;
        int totalGaji = gajiStatus + gajiGolongan;
        TextView total = (TextView) findViewById(R.id.outputGaji);
        total.setText(String.valueOf(totalGaji));
    }
}
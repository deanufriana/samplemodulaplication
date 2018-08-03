package com.intala.intalalatihan.myactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.intala.intalalatihan.R;

public class KalkulatorActivity extends AppCompatActivity {
    TextView hsl;
    EditText angka1, angka2;
    Button tambah, kurang, kali, bagi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);

        angka1 = findViewById(R.id.angka1);
        angka2 = findViewById(R.id.angka2);
        hsl = findViewById(R.id.hasil);
        tambah = findViewById(R.id.tambah);
        kurang = findViewById(R.id.kurang);
        kali = findViewById(R.id.kali);
        bagi = findViewById(R.id.bagi);


        String username = getIntent().getStringExtra(MainActivity.KEY_USERNAME);
        String password = getIntent().getStringExtra(MainActivity.KEY_PASSWORD);

        Log.i("Intala", "username : " + username + ", Password : " + password);


        tambah();
        kali();
        kurang();
        bagi();
    }


    void tambah() {
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ang1 = angka1.getText().toString();
                String ang2 = angka2.getText().toString();
                double hasil = Double.valueOf(ang1) + Double.valueOf(ang2);
                hsl.setText(String.valueOf(hasil));
            }
        });
    }

    void kurang() {
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ang1 = angka1.getText().toString();
                String ang2 = angka2.getText().toString();
                double hasil = Double.valueOf(ang1) - Double.valueOf(ang2);
                hsl.setText(String.valueOf(hasil));
            }
        });
    }

    void kali() {

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ang1 = angka1.getText().toString();
                String ang2 = angka2.getText().toString();

                double hasil = Double.valueOf(ang1) * Double.valueOf(ang2);
                hsl.setText(String.valueOf(hasil));
            }
        });
    }

    void bagi() {
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String ang1 = angka1.getText().toString();
                String ang2 = angka2.getText().toString();

                double hasil = Double.valueOf(ang1) / Double.valueOf(ang2);
                hsl.setText(String.valueOf(hasil));
            }
        });
    }
}

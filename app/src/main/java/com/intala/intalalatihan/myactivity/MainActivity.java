package com.intala.intalalatihan.myactivity;

import android.content.Intent;
import android.support.v4.app.ShareCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.intala.intalalatihan.R;

public class MainActivity extends AppCompatActivity {

    //kita membuat variabel Button yang bernama login
    Button btnkalkulator, btndapat, bagikan;
    EditText text;

    // key id data usernmae dan password
    static final String KEY_USERNAME = "username";
    static final String KEY_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //set konten view akan mengambil layout atau tampilan dari res/layout
        setContentView(R.layout.activity_main);

        /* di bagian ini akan mengambil objek dari
        aktiviti disini kita ambil dari id login
        dimana ini merupakan button */
        text = findViewById(R.id.text);
        btnkalkulator = findViewById(R.id.kalkulator);
        btndapat = findViewById(R.id.dapat);
        bagikan = findViewById(R.id.share);

        kalkulator();
        getData();

    }

    void kalkulator() {

        btnkalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//          fungsi intent untuk mengarahkan halaman layout ke layout lain
                Intent kalkulator = new Intent(MainActivity.this, KalkulatorActivity.class);

                kalkulator.putExtra(KEY_USERNAME, "dean");
                kalkulator.putExtra(KEY_PASSWORD, "123");

                startActivity(kalkulator);

            }
        });
    }

    public void share(View view) {

        String teks = text.getText().toString();
        ShareCompat.IntentBuilder
                .from(this)
                .setType("text/plain")
                .setChooserTitle("Bagikan dengan")
                .setText(teks)
                .startChooser();
    }

    void getData() {
        btndapat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String txt = text.getText().toString();
                Intent data = new Intent(MainActivity.this, GetDataActivity.class);

                data.putExtra(KEY_USERNAME, txt);

                startActivity(data);
            }
        });

    }

    public void fragment(View view) {
        Intent fragment = new Intent(MainActivity.this, FragmentActivity.class);
        startActivity(fragment);
    }

    public void viewpager(View view) {
        Intent pager = new Intent(MainActivity.this, ViewpagerActivity.class);
        startActivity(pager);
    }

    public void btnlogin(View view) {
        Intent login = new Intent(MainActivity.this, KalkulatorActivity.class);
        startActivity(login);
    }

    public void location(View view) {
        Intent lokasi = new Intent(MainActivity.this, LocationActivity.class);
        startActivity(lokasi);
    }

    public void list(View view) {
        Intent daftar = new Intent(MainActivity.this, ListActivity.class);
        startActivity(daftar);
    }

    public void database(View view) {
        Intent database = new Intent(MainActivity.this, DatabaseActivity.class);
        startActivity(database);
    }
}
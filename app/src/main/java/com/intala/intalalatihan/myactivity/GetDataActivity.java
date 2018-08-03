package com.intala.intalalatihan.myactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.intala.intalalatihan.R;

public class GetDataActivity extends AppCompatActivity {

    TextView text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_data);

        String psd = getIntent().getStringExtra(MainActivity.KEY_PASSWORD);
        String usr = getIntent().getStringExtra(MainActivity.KEY_USERNAME);

        Log.i("Percobaan", "Coba" + psd + usr);

        text = findViewById(R.id.text);

        text.setText(String.valueOf(usr));
    }
}

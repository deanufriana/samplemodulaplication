package com.intala.intalalatihan.myactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.intala.intalalatihan.R;
import com.intala.intalalatihan.fragment.BiruFragment;
import com.intala.intalalatihan.fragment.KuningFragment;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frament);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment, new BiruFragment())
                .commit();
    }
    public void biru(View view) {
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, new BiruFragment()).commit();
    }
    public void kuning(View view) {
        getSupportFragmentManager().beginTransaction().add(R.id.fragment, new KuningFragment()).commit();
    }
}

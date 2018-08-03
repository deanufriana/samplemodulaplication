package com.intala.intalalatihan.myactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.intala.intalalatihan.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void btnlogin(View view) {
        Intent login = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(login);
    }
}

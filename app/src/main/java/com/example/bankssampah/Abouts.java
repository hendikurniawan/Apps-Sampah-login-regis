package com.example.bankssampah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Abouts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abouts);

        getSupportActionBar().hide();
        ButterKnife.bind(this);
    }
    @Override
    public void onBackPressed() {
        Intent a = new Intent(Abouts.this, MainActivity.class);
        startActivity(a);
        finish();
    }
}

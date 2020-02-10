package com.example.bankssampah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class SaldoTabungan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saldo_tabungan);
        getSupportActionBar().hide();
        ButterKnife.bind(this);
    }

    @Override
    public void onBackPressed() {
        Intent a = new Intent(SaldoTabungan.this, Banks.class);
        startActivity(a);
        finish();
    }
}
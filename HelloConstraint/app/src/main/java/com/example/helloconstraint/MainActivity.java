package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mToast, mCount, mZero;
    private TextView mIncrement;
    private int counter =0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mToast = findViewById(R.id.toast);
        mCount = findViewById(R.id.count);
        mZero = findViewById(R.id.zero);
        mIncrement = findViewById(R.id.increment);

        mToast.setOnClickListener(this);
        mCount.setOnClickListener(this);
        mZero.setOnClickListener(this);
        zeroEnable();
    }

    @Override
    public void onClick(View view) {

        switch (view.getId())
        {
            case R.id.count:
                counter++;
                zeroEnable();
                mIncrement.setText(""+counter);
                break;

            case R.id.zero:
                mIncrement.setText("0");
                counter =0;
                zeroEnable();
                break;

            case R.id.toast:
                Toast.makeText( MainActivity.this, R.string.hello, Toast.LENGTH_SHORT).show();
                break;
        }

    }

    private void zeroEnable() {
        if(counter==0)
        {
            mZero.setEnabled(false);

        }
        else
            mZero.setEnabled(true);
    }
}
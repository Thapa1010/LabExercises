package com.example.twoactivitiescodingchallange;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button mTextOne, mTextTwo, mTextThree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextOne = findViewById(R.id.textOne);
        mTextTwo = findViewById(R.id.textTwo);
        mTextThree = findViewById(R.id.textThree);

        mTextOne.setOnClickListener(this);
        mTextTwo.setOnClickListener(this);
        mTextThree.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);

        switch (view.getId())
        {
            case R.id.textOne:
                Intent intentOne = new Intent(MainActivity.this, SecondActivity.class);
                intentOne.putExtra("TextOne",getString(R.string.text_one));
                startActivity(intentOne);
                break;

            case R.id.textTwo:
                Intent intentTwo = new Intent(MainActivity.this, ThirdActivity.class);
                intentTwo.putExtra("TextTwo",getString(R.string.text_two));
                startActivity(intentTwo);
                break;

            case R.id.textThree:
                Intent intentThree = new Intent(MainActivity.this, FourthActivity.class);
                intentThree.putExtra("TextThree",getString(R.string.text_three));
                startActivity(intentThree);
                break;
        }


    }
}
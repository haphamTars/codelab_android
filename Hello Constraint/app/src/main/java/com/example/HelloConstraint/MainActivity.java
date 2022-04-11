package com.example.HelloConstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    private Button countButton;
    private Button zeroButton;
    private Button toastButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

    }

    public void init(){
        mShowCount = (TextView) findViewById(R.id.show_count);
        countButton = (Button) findViewById(R.id.button_count);
        zeroButton = (Button) findViewById(R.id.button_zero);
        toastButton = (Button) findViewById(R.id.button_toast);
        if (mCount == 0){
            zeroButton.setBackgroundColor(Color.GRAY);
        }
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }


    public void countUp(View view){
        mCount++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if(mCount%2 != 0)
            countButton.setBackgroundColor(Color.RED);
        else
            countButton.setBackgroundColor(Color.GREEN);

        zeroButton.setBackgroundColor(Color.BLUE);
    }

    public void zero(View view){
        mCount = 0;
        mShowCount.setText(Integer.toString(mCount));
        zeroButton.setBackgroundColor(Color.GRAY);

    }
}
package com.yuhang.planefight;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button startButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        initClick();
    }

    private void initClick() {
        startButton.setOnClickListener(this);
    }

    private void init() {
        startButton = (Button) findViewById(R.id.button_startGame);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_startGame:
                Intent intent = new Intent(this, GameActivity.class);
                startActivity(intent);
                break;

        }
    }
}

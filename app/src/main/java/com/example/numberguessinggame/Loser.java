package com.example.numberguessinggame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Loser extends AppCompatActivity {

    private ImageView AgainStartButton;
    private ImageView AgainExitButton;

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loser);

        AgainStartButton = (ImageView) findViewById(R.id.StartAgainButton);
        AgainExitButton = (ImageView) findViewById(R.id.AgainGameExitButton);

        textView = (TextView) findViewById(R.id.WrongAnswer);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int Value = bundle.getInt("GeneratedNumber");
        textView.setText("Number was - "+Value);

        AgainStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Loser.this,GameStarted.class);
                startActivity(intent);
                finish();
            }
        });

        AgainExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Loser.this,FinalExit.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

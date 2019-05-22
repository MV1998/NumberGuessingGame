package com.example.numberguessinggame;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class Winner extends AppCompatActivity {

    private ImageView StartAgainButton;
    private ImageView AgainExitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winner);

        StartAgainButton = (ImageView) findViewById(R.id.StartAgainButton);
        AgainExitButton = (ImageView) findViewById(R.id.AgainGameExitButton);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        int Value = bundle.getInt("GeneratedNumber");
        Log.d("GeneratedNumber is:",""+Value);

        StartAgainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Winner.this,GameStarted.class);
                startActivity(intent);
                finish();
            }
        });
        AgainExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Winner.this,FinalExit.class);
                startActivity(intent);
                finish();
            }
        });
    }
}

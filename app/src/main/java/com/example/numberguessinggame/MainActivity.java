package com.example.numberguessinggame;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Intent;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ImageView mGameStartButton;
    private ImageView mGameExitButton;
    private ConstraintLayout mConstraintLayout;

    private TextView mStartText;
    private TextView mExitText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGameStartButton = (ImageView) findViewById(R.id.GameStartButton);
        mGameExitButton = (ImageView) findViewById(R.id.GameExitButton);

        mStartText = (TextView) findViewById(R.id.StartText);
        mExitText = (TextView) findViewById(R.id.ExitText);


        mConstraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayout);


        mGameStartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,GameStarted.class);
                mGameStartButton.animate().alpha(0);
                mStartText.animate().alpha(0);
                startActivity(intent);
                mGameStartButton.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mGameStartButton.animate().alpha(1);
                        mStartText.animate().alpha(1);
                    }
                },200);
                finish();
            }
        });


        mGameExitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mGameExitButton.animate().alpha(0);
                mExitText.animate().alpha(0);
                mGameExitButton.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        mGameExitButton.animate().alpha(1);
                        mExitText.animate().alpha(1);
                    }
                },200);
                Intent intent = new Intent(MainActivity.this,FinalExit.class);
                startActivity(intent);
                finish();
            }
        });

        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.anim);
        mConstraintLayout.setAnimation(animation);
            }

}

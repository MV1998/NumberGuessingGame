package com.example.numberguessinggame;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Timer;

public class GameStarted extends AppCompatActivity {

    private LinearLayout linearLayout;
    private TextView mStartedTextView;

    private LinearLayout linearLayout1;
    private LinearLayout linearLayout2;
    private LinearLayout linearLayout3;


    private TextView mFirstText;
    private TextView mSecondText;
    private TextView mThirdText;
    private TextView mFourthText;
    private TextView mFifthText;
    private TextView mSixText;
    private TextView mSevenText;
    private TextView mEightText;
    private TextView mNineText;

    private int mMatchNumber;


    private int mScore;



    private ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_started);

        constraintLayout = (ConstraintLayout) findViewById(R.id.constraintLayoutStarted);

        //All commented code can be used to generate "number is generating" String as Textview.


//        linearLayout = (LinearLayout)findViewById(R.id.NumberInformation);
//        mStartedTextView = new TextView(getApplicationContext());
//        mStartedTextView.setText("Number is Generating..");
//        mStartedTextView.setTextColor(Color.RED);
//        mStartedTextView.setTextSize(25);
//        mStartedTextView.setPadding(50,0,0,0);
//        linearLayout.addView(mStartedTextView);

        linearLayout1 = (LinearLayout)  findViewById(R.id.FirstLinear);
        linearLayout2 = (LinearLayout) findViewById(R.id.SecondLinear);
        linearLayout3 = (LinearLayout) findViewById(R.id.ThirdLinear);

        mFirstText = (TextView) findViewById(R.id.One);
        mSecondText = (TextView) findViewById(R.id.Two);
        mThirdText = (TextView) findViewById(R.id.Three);
        mFourthText = (TextView) findViewById(R.id.Four);
        mFifthText = (TextView) findViewById(R.id.Five);
        mSixText = (TextView) findViewById(R.id.Six);
        mSevenText = (TextView) findViewById(R.id.Seven);
        mEightText = (TextView) findViewById(R.id.Eight);
        mNineText = (TextView) findViewById(R.id.Nine);



        linearLayout1.animate().alpha(0);
        linearLayout2.animate().alpha(0);
        linearLayout3.animate().alpha(0);

        mFirstText.animate().alpha(0);
        mSecondText.animate().alpha(0);
        mThirdText.animate().alpha(0);
        mFourthText.animate().alpha(0);
        mFifthText.animate().alpha(0);
        mSixText.animate().alpha(0);
        mSevenText.animate().alpha(0);
        mEightText.animate().alpha(0);
        mNineText.animate().alpha(0);


        constraintLayout.postDelayed(new Runnable() {
            @Override
            public void run() {
                linearLayout1.animate().alpha(1);
                linearLayout2.animate().alpha(1);
                linearLayout3.animate().alpha(1);
                mFirstText.animate().alpha(1);
                mSecondText.animate().alpha(1);
                mThirdText.animate().alpha(1);
                mFourthText.animate().alpha(1);
                mFifthText.animate().alpha(1);
                mSixText.animate().alpha(1);
                mSevenText.animate().alpha(1);
                mEightText.animate().alpha(1);
                mNineText.animate().alpha(1);
            }
        },3000);


        linearLayout = (LinearLayout) findViewById(R.id.NumberInformation);
        mStartedTextView = (TextView) findViewById(R.id.GameStartedTextView);
        mStartedTextView.setText("Number is Generating...");
        mStartedTextView.setTextColor(Color.RED);
        mStartedTextView.postDelayed(new Runnable() {
            @Override
            public void run() {
                mStartedTextView.setTextColor(Color.GREEN);
                mStartedTextView.setText("Number Generated!");
                mMatchNumber = generatedNumber();

//                mStartedTextView.setTextColor(Color.GREEN);
//                mStartedTextView.setPadding(90,0,0,0);
//                mStartedTextView.setText("Number Generated!");
            }
        },3000);

        mFirstText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mMatchNumber = 1;
                if(1 == mMatchNumber){
                    Toast.makeText(GameStarted.this, "Guess Right", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Winner.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(GameStarted.this, "Guess Wront", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Loser.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }

            }
        });

        mSecondText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mMatchNumber = 2;
                if(2 == mMatchNumber){
                    Toast.makeText(GameStarted.this, "Guess Right", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Winner.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(GameStarted.this, "Guess Wront", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Loser.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }

            }
        });

        mThirdText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mMatchNumber = 3;
                if(3 == mMatchNumber){
                    Toast.makeText(GameStarted.this, "Guess Right", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Winner.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(GameStarted.this, "Guess Wront", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Loser.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }

            }
        });

        mFourthText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mMatchNumber= 4;
                if(4 == mMatchNumber){
                    Toast.makeText(GameStarted.this, "Guess Right", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Winner.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(GameStarted.this, "Guess Wront", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Loser.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }
            }
        });

        mFifthText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mMatchNumber = 5;
                if(5 == mMatchNumber){
                    Toast.makeText(GameStarted.this, "Guess Right", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Winner.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(GameStarted.this, "Guess Wront", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Loser.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }

            }
        });

        mSixText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mMatchNumber = 6;
                if(6 == mMatchNumber){
                    Toast.makeText(GameStarted.this, "Guess Right", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Winner.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(GameStarted.this, "Guess Wront", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Loser.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }
            }
        });

        mSevenText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mMatchNumber = 7;
                if(7 == mMatchNumber){
                    Toast.makeText(GameStarted.this, "Guess Right", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Winner.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(GameStarted.this, "Guess Wront", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Loser.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }

            }
        });

        mEightText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mMatchNumber = 8;
                if(8 == mMatchNumber){
                    Toast.makeText(GameStarted.this, "Guess Right", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Winner.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(GameStarted.this, "Guess Wront", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Loser.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }

            }
        });

        mNineText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                mMatchNumber = 9;
                if(9  == mMatchNumber){
                    Toast.makeText(GameStarted.this, "Guess Right", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Winner.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }
                else{
                    Toast.makeText(GameStarted.this, "Guess Wront", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(),Loser.class);
                    intent.putExtra("GeneratedNumber",mMatchNumber);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }

    public int generatedNumber(){
        int endingNumber =9;
        double ramdomValue = Math.floor(Math.random()*endingNumber);
        int integerNumber =(int) ramdomValue;


        if(integerNumber == 0){
            integerNumber = 1 ;
        }

        return integerNumber;
    }
}

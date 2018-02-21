package com.example.android.scorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static int scoreTeam1 = 0;
    private static int scoreTeam2 = 0;
    final int _SIX_POINTS = 6;
    final int _THREE_POINTS = 3;
    final int _TWO_POINTS = 2;
    final int _ONE_POINT = 1;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        updateScoreTeam1(scoreTeam1);
        updateScoreTeam2(scoreTeam2);
        Button pointAfterTouchDown_team1 = findViewById(R.id.pointAfterTouchdown_team1);
        Button pointAfterTouchDown_team2 = findViewById(R.id.pointAfterTouchdown_team2);
        Button twoPointConversion_team1 = findViewById(R.id.twoPointConversion_team1);
        Button twoPointConversion_team2 = findViewById(R.id.twoPointConversion_team2);
        pointAfterTouchDown_team1.setEnabled(false);
        pointAfterTouchDown_team2.setEnabled(false);
        twoPointConversion_team1.setEnabled(false);
        twoPointConversion_team2.setEnabled(false);

        Button reset = findViewById(R.id.reset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resetScore(view);
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("scoreTeam1", scoreTeam1);
        outState.putInt("scoreTeam2", scoreTeam2);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeam1 = savedInstanceState.getInt("scoreTeam1");
        scoreTeam2 = savedInstanceState.getInt("scoreTeam2");
    }

    public void updateScoreTeam1(int score) {
        TextView currentScore = findViewById(R.id.ScoreTeam1);
        currentScore.setText(String.valueOf(score));
    }

    public void updateScoreTeam2(int score) {
        TextView currentScore = findViewById(R.id.ScoreTeam2);
        currentScore.setText(String.valueOf(score));
    }

    public void addTouchdown_team1(View view) {
        scoreTeam1 += _SIX_POINTS;
        updateScoreTeam1(scoreTeam1);
        Button pointAfterTouchDown_team1 = findViewById(R.id.pointAfterTouchdown_team1);
        Button twoPointConversion_team1 = findViewById(R.id.twoPointConversion_team1);
        pointAfterTouchDown_team1.setEnabled(true);
        twoPointConversion_team1.setEnabled(true);
    }

    public void addPointAfterTouchdown_team1(View view) {
        scoreTeam1 += _ONE_POINT;
        updateScoreTeam1(scoreTeam1);
        Button pointAfterTouchDown_team1 = findViewById(R.id.pointAfterTouchdown_team1);
        Button twoPointConversion_team1 = findViewById(R.id.twoPointConversion_team1);
        pointAfterTouchDown_team1.setEnabled(false);
        twoPointConversion_team1.setEnabled(false);
    }

    public void addTwoPointConversion_team1(View view) {
        scoreTeam1 += _TWO_POINTS;
        updateScoreTeam1(scoreTeam1);
        Button pointAfterTouchDown_team1 = findViewById(R.id.pointAfterTouchdown_team1);
        Button twoPointConversion_team1 = findViewById(R.id.twoPointConversion_team1);
        pointAfterTouchDown_team1.setEnabled(false);
        twoPointConversion_team1.setEnabled(false);
    }

    public void addFieldGoal_team1(View view) {
        scoreTeam1 += _THREE_POINTS;
        updateScoreTeam1(scoreTeam1);
    }

    public void addSafety_team1(View view) {
        scoreTeam1 += _TWO_POINTS;
        updateScoreTeam1(scoreTeam1);
    }


    public void addTouchdown_team2(View view) {
        scoreTeam2 += _SIX_POINTS;
        updateScoreTeam2(scoreTeam2);
        Button pointAfterTouchDown_team2 = findViewById(R.id.pointAfterTouchdown_team2);
        Button twoPointConversion_team2 = findViewById(R.id.twoPointConversion_team2);
        pointAfterTouchDown_team2.setEnabled(true);
        twoPointConversion_team2.setEnabled(true);
    }

    public void addPointAfterTouchdown_team2(View view) {
        scoreTeam2 += _ONE_POINT;
        updateScoreTeam2(scoreTeam2);
        Button pointAfterTouchDown_team2 = findViewById(R.id.pointAfterTouchdown_team2);
        Button twoPointConversion_team2 = findViewById(R.id.twoPointConversion_team2);
        pointAfterTouchDown_team2.setEnabled(false);
        twoPointConversion_team2.setEnabled(false);
    }

    public void addTwoPointConversion_team2(View view) {
        scoreTeam2 += _TWO_POINTS;
        updateScoreTeam2(scoreTeam2);
        Button pointAfterTouchDown_team2 = findViewById(R.id.pointAfterTouchdown_team2);
        Button twoPointConversion_team2 = findViewById(R.id.twoPointConversion_team2);
        pointAfterTouchDown_team2.setEnabled(false);
        twoPointConversion_team2.setEnabled(false);
    }

    public void addFieldGoal_team2(View view) {
        scoreTeam2 += _THREE_POINTS;
        updateScoreTeam2(scoreTeam2);
    }

    public void addSafety_team2(View view) {
        scoreTeam2 += _TWO_POINTS;
        updateScoreTeam2(scoreTeam2);
    }

    public void resetScore(View view) {
        scoreTeam1 = 0;
        scoreTeam2 = 0;
        updateScoreTeam1(scoreTeam1);
        updateScoreTeam2(scoreTeam2);
    }
}

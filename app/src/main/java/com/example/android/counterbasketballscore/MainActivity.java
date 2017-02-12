package com.example.android.counterbasketballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.duration;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /*
        TEAM B HANDLING
     */

    /** Called when 3 points button pressed.
     * Adds 3 points to the score for the team A.
     */
    public void add3PointsTeamA(View view){
        scoreTeamA = scoreTeamA + 3;
        displayScoreTeamA(scoreTeamA);
    }

    /** Called when 2 points button pressed.
     * Adds 2 points to the score for the team A.
     */
    public void add2PointsTeamA(View view){
        scoreTeamA = scoreTeamA + 2;
        displayScoreTeamA(scoreTeamA);
    }

    /** Called when 1 point button pressed.
     * Adds 1 point to the score for the team A.
     */
    public void add1PointTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA(scoreTeamA);
    }

    /**
     * Displays the score of Team A
     * @param score = score of Team A
     */
    private void displayScoreTeamA(int score){
        TextView text =  (TextView) findViewById(R.id.score_team_a_text_view);
        text.setText("" + score);
    }

    /*
        TEAM B HANDLING
     */

    /** Called when 3 points button pressed.
     * Adds 3 points to the score for the team B.
     */
    public void add3PointsTeamB(View view){
        scoreTeamB = scoreTeamB + 3;
        displayScoreTeamB(scoreTeamB);
    }

    /** Called when 2 points button pressed.
     * Adds 2 points to the score for the team B.
     */
    public void add2PointsTeamB(View view){
        scoreTeamB = scoreTeamB + 2;
        displayScoreTeamB(scoreTeamB);
    }

    /** Called when 1 point button pressed.
     * Adds 1 point to the score for the team B.
     */
    public void add1PointTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayScoreTeamB(scoreTeamB);
    }

    /**
     * Displays the score for Team B
     * @param score = the score of team B
     */
    private void displayScoreTeamB(int score){
        TextView text =  (TextView) findViewById(R.id.score_team_b_text_view);
        text.setText("" + score);
    }


    public void resetScore(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayScoreTeamA(scoreTeamA);
        displayScoreTeamB(scoreTeamB);
        displayToastOnRest("Score reseted for both teams");

    }
    private void displayToastOnRest(String msg){
        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }

    public void gameEnd(View view){
        String winner = "";
        String msg = "";
        boolean draw = false;

        if(scoreTeamA > scoreTeamB){
            winner = "Team A";
        }
        else if (scoreTeamA < scoreTeamB) {
            winner = "Team B";
        }
        else {
            msg = "DRAW!!! Go to extra time";
            draw = true;
        }

        if (!draw){
            msg = winner + " wins!!!!\nFinal score:\n" + scoreTeamA + " - " +  scoreTeamB ;
        }

        Toast toast = Toast.makeText(this, msg, Toast.LENGTH_LONG);
        toast.show();
    }
}

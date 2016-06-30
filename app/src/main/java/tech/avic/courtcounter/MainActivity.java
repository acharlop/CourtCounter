package tech.avic.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore = 0;
    int teamBScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA();
        displayForTeamB();
    }

    public void reset(View v) {
        teamAScore = 0;
        teamBScore = 0;
        displayForTeamA();
        displayForTeamB();
    }

    public void displayForTeamA() {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(teamAScore));
    }

    public void displayForTeamB() {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(teamBScore));
    }


    public void addToA3(View view) {
        teamAScore += 3;
        displayForTeamA();
    }

    public void addToB3(View view) {
        teamBScore += 3;
        displayForTeamB();
    }

    public void addToA2(View view) {
        teamAScore += 2;
        displayForTeamA();
    }

    public void addToB2(View view) {
        teamBScore += 2;
        displayForTeamB();
    }

    public void addToA1(View view) {
        teamAScore += 1;
        displayForTeamA();
    }

    public void addToB1(View view) {
        teamBScore += 1;
        displayForTeamB();
    }
}

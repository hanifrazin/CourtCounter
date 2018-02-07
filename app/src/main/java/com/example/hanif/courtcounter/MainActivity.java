package com.example.hanif.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Button_Score_A();
        Button_Score_B();
        Button btn_reset = findViewById(R.id.btn_reset);
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamB = 0;
                displayScoreTeamA(scoreTeamA);
                displayScoreTeamB(scoreTeamB);
            }
        });
    }

    private void Button_Score_B() {
        Button btn_points3_B = findViewById(R.id.btn_points3_B);
        btn_points3_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = scoreTeamB+3;
                displayScoreTeamB(scoreTeamB);
            }
        });

        Button btn_points2_B = findViewById(R.id.btn_points2_B);
        btn_points2_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = scoreTeamB+2;
                displayScoreTeamB(scoreTeamB);
            }
        });

        Button btn_free_throw_B = findViewById(R.id.btn_free_throw_B);
        btn_free_throw_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamB = scoreTeamB+1;
                displayScoreTeamB(scoreTeamB);
            }
        });
    }

    private void Button_Score_A() {
        Button btn_points3_A = findViewById(R.id.btn_points3_A);
        btn_points3_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA+3;
                displayScoreTeamA(scoreTeamA);
            }
        });

        Button btn_points2_A = findViewById(R.id.btn_points2_A);
        btn_points2_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA+2;
                displayScoreTeamA(scoreTeamA);
            }
        });

        Button btn_free_throw_A = findViewById(R.id.btn_free_throw_A);
        btn_free_throw_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA+1;
                displayScoreTeamA(scoreTeamA);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    public void displayScoreTeamA(int score){
        TextView scoreViewA = findViewById(R.id.tv_score_A);
        scoreViewA.setText(String.valueOf(score));
    }

    public void displayScoreTeamB(int score){
        TextView scoreViewB = findViewById(R.id.tv_score_B);
        scoreViewB.setText(String.valueOf(score));
    }
}

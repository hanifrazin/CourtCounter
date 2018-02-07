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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn_points3_A = findViewById(R.id.btn_points3_A);
        btn_points3_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA+3;
                displayFoTeamA(scoreTeamA);
            }
        });

        Button btn_points2_A = findViewById(R.id.btn_points2_A);
        btn_points2_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA+2;
                displayFoTeamA(scoreTeamA);
            }
        });

        Button btn_free_throw_A = findViewById(R.id.btn_free_throw_A);
        btn_free_throw_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreTeamA = scoreTeamA+1;
                displayFoTeamA(scoreTeamA);
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

    public void displayFoTeamA(int score){
        TextView scoreView = findViewById(R.id.tv_score_A);
        scoreView.setText(String.valueOf(score));
    }
}

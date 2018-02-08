package com.example.hanif.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestActivity extends AppCompatActivity {

    int scoreA = 0;

    @BindView(R.id.tv_score_A)
    TextView TvScore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_points3_A)
    void BtnPoint3(View view){
        scoreA = scoreA+3;
        DisplayScore(scoreA);
    }

    @OnClick(R.id.btn_points2_A)
    void BtnPoint2(View view){
        scoreA = scoreA+2;
        DisplayScore(scoreA);
    }

    @OnClick(R.id.btn_free_throw_A)
    void BtnFreeThrow(View view){
        scoreA = scoreA+1;
        DisplayScore(scoreA);
    }

    private void DisplayScore(int scoreA) {
        TvScore.setText(String.valueOf(scoreA));
    }
}

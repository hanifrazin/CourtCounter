package com.example.hanif.courtcounter;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.hanif.courtcounter.databinding.ActivityScoreBinding;


public class ScoreActivity extends AppCompatActivity {

    ActivityScoreBinding binding;
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Score Activity");
        binding = DataBindingUtil.setContentView(this,R.layout.activity_score);
        Increment_ScoreA();
        Increment_ScoreB();
        binding.btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = scoreB = 0;
                DisplayScore(scoreA,"A");
                DisplayScore(scoreB,"B");
            }
        });
    }

    private void Increment_ScoreB() {
        binding.btnPoints3B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB = scoreB+3;
                DisplayScore(scoreB,"B");
            }
        });

        binding.btnPoints2B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB = scoreB+2;
                DisplayScore(scoreB,"B");
            }
        });

        binding.btnFreeThrowB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreB = scoreB+1;
                DisplayScore(scoreB,"B");
            }
        });
    }

    private void Increment_ScoreA() {
        binding.btnPoints3A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = scoreA+3;
                DisplayScore(scoreA,"A");
            }
        });

        binding.btnPoints2A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = scoreA+2;
                DisplayScore(scoreA,"A");
            }
        });

        binding.btnFreeThrowA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                scoreA = scoreA+1;
                DisplayScore(scoreA,"A");
            }
        });
    }

    private void DisplayScore(int i,String ket){
        if(ket.equals("A"))
            binding.tvScoreA.setText(String.valueOf(i));
        else if(ket.equals("B"))
            binding.tvScoreB.setText(String.valueOf(i));
    }
}

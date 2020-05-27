package com.trustorg.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int score = 0;

    public void onAnswerClicked(View view) {

        if (view.getId() == R.id.rightanswer1) {
            score++;
        }
        if (view.getId() == R.id.rightanswer2) {
            score++;
        }
        if (view.getId() == R.id.rightanswer3) {
            score++;
        }
        if (view.getId() == R.id.rightanswer4) {
            score++;
        }
        if (view.getId() == R.id.rightanswer5) {
            score++;
        }
    }

    public void calculateScore(View view) {

        CheckBox checkAnswer1 = findViewById(R.id.checkanwser1);
        CheckBox checkAnswer2 = findViewById(R.id.checkanwser2);
        CheckBox checkAnswer3 = findViewById(R.id.checkanwser3);
        CheckBox checkAnswer4 = findViewById(R.id.checkanwser4);
        CheckBox checkAnswer5 = findViewById(R.id.checkanwser5);
        CheckBox checkAnswer6 = findViewById(R.id.checkanwser6);

        EditText editTextAnswer = findViewById(R.id.editText);


        if (editTextAnswer.getText().toString() == "Italy") {
            score++;
        }
        if (checkAnswer1.isChecked() && checkAnswer2.isChecked()) {
            score++;
        }
        if (checkAnswer3.isChecked() && checkAnswer4.isChecked()) {
            score++;
        }
        if (checkAnswer5.isChecked() && checkAnswer6.isChecked()) {
            score++;
        }
        final int END_SCORE = score;
        Toast.makeText(this, "Your Score is :" + END_SCORE, Toast.LENGTH_LONG).show();

    }

}
package com.example.android.physicsquiz;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.android.physicsquiz.R.id.answer10b;
import static com.example.android.physicsquiz.R.id.answer1a;
import static com.example.android.physicsquiz.R.id.answer1b;
import static com.example.android.physicsquiz.R.id.answer1c;
import static com.example.android.physicsquiz.R.id.answer1d;
import static com.example.android.physicsquiz.R.id.answer2b;
import static com.example.android.physicsquiz.R.id.answer3a;
import static com.example.android.physicsquiz.R.id.answer3b;
import static com.example.android.physicsquiz.R.id.answer3c;
import static com.example.android.physicsquiz.R.id.answer3d;
import static com.example.android.physicsquiz.R.id.answer5a;
import static com.example.android.physicsquiz.R.id.answer6b;
import static com.example.android.physicsquiz.R.id.answer7d;
import static com.example.android.physicsquiz.R.id.answer8a;
import static com.example.android.physicsquiz.R.id.answer9a;
import static com.example.android.physicsquiz.R.id.answer9b;
import static com.example.android.physicsquiz.R.id.answer9c;
import static com.example.android.physicsquiz.R.id.answer9d;
import static com.example.android.physicsquiz.R.id.result;


public class MainActivity extends AppCompatActivity {

    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


//    This method checks the answers and add a point to the "score" variable for each correct answer

    public void submit(View view) {

        // initialize some boolean to keep track of the correct answers
        boolean isAnswer1Correct=false;
        boolean isAnswer2Correct=false;
        boolean isAnswer3Correct=false;
        boolean isAnswer4Correct=false;
        boolean isAnswer5Correct=false;
        boolean isAnswer6Correct=false;
        boolean isanswer7Correct=false;
        boolean isAnswer8Correct=false;
        boolean isAnswer9correct=false;
        boolean isAnswer10Correct=false;

        //Checks if the correct CheckBoxes for question 1 are selected
        CheckBox checkBoxGravitationalForce = (CheckBox) findViewById(answer1a);
        boolean checkedGravitationalForce = checkBoxGravitationalForce.isChecked();
        CheckBox checkBoxTensionForce = (CheckBox) findViewById(answer1b);
        boolean checkedTensionForce = checkBoxTensionForce.isChecked();
        CheckBox checkBoxElectromagneticForce = (CheckBox) findViewById(answer1c);
        boolean checkedElectromagneticForce = checkBoxElectromagneticForce.isChecked();
        CheckBox checkBoxStrongForce = (CheckBox) findViewById(answer1d);
        boolean checkedStrongForce = checkBoxStrongForce.isChecked();
        if (checkedGravitationalForce && !checkedTensionForce && checkedElectromagneticForce && checkedStrongForce) {
            score++;
            isAnswer1Correct=true;
        }


        //Checks if the correct RadioButton for question 2 is selected
        RadioButton radioButton1000000000kmh = (RadioButton) findViewById(answer2b);
        boolean checked1000000000kmh = radioButton1000000000kmh.isChecked();
        if (checked1000000000kmh) {
            score++;
            isAnswer2Correct=true;
        }

        //Checks if the correct CheckBoxes for question 3 are selected
        CheckBox checkBoxTransistor = (CheckBox) findViewById(answer3a);
        boolean checkedTransistor = checkBoxTransistor.isChecked();
        CheckBox checkBoxResistance = (CheckBox) findViewById(answer3b);
        boolean checkedResistance = checkBoxResistance.isChecked();
        CheckBox checkBoxCapacitor = (CheckBox) findViewById(answer3c);
        boolean checkedCapacitor = checkBoxCapacitor.isChecked();
        CheckBox checkBoxLed = (CheckBox) findViewById(answer3d);
        boolean checkedLed = checkBoxLed.isChecked();
        if (checkedTransistor && !checkedResistance && checkedCapacitor && !checkedLed) {
            score++;
            isAnswer3Correct=true;
        }

        //Checks if the correct CheckBoxes for question 4 are selected
        EditText marsField = (EditText) findViewById(R.id.mars_field);
        String mars = marsField.getText().toString();
        if (mars.equals("2")) {
            score++;
            isAnswer4Correct = true;
        }



        //Checks if the correct RadioButton for question 5 is selected
        RadioButton radioButtonTritium = (RadioButton) findViewById(answer5a);
        boolean checkedTritium = radioButtonTritium.isChecked();
        if (checkedTritium) {
            score++;
            isAnswer5Correct=true;
        }

        //Checks if the correct RadioButton for question 6 is selected
        RadioButton radioButtonHydrogenPerioxide = (RadioButton) findViewById(answer6b);
        boolean checkedHydrogenPerioxide = radioButtonHydrogenPerioxide.isChecked();
        if (checkedHydrogenPerioxide) {
            score++;
            isAnswer6Correct=true;
        }

        //Checks if the correct RadioButton for question 7 is selected
        RadioButton radioButtonForce = (RadioButton) findViewById(answer7d);
        boolean checkedForce = radioButtonForce.isChecked();
        if (checkedForce) {
            score++;
            isanswer7Correct=true;
        }

        //Checks if the correct RadioButton for question 8 is selected
        RadioButton radioButtonTorque = (RadioButton) findViewById(answer8a);
        boolean checkedTorque = radioButtonTorque.isChecked();
        if (checkedTorque) {
            score++;
            isAnswer8Correct=true;
        }

        //Checks if the correct CheckBoxes for question 9 are selected
        CheckBox checkBoxECtoMF = (CheckBox) findViewById(answer9a);
        boolean checkedECtoMF = checkBoxECtoMF.isChecked();
        CheckBox checkBoxMFtoEC = (CheckBox) findViewById(answer9b);
        boolean checkedMFtoEC = checkBoxMFtoEC.isChecked();
        CheckBox checkBoxDMFtoEC = (CheckBox) findViewById(answer9c);
        boolean checkedDMFtoEC = checkBoxDMFtoEC.isChecked();
        CheckBox checkBoxNone = (CheckBox) findViewById(answer9d);
        boolean checkedNone = checkBoxNone.isChecked();
        if (checkedECtoMF && !checkedMFtoEC && checkedDMFtoEC && !checkedNone) {
            score++;
            isAnswer9correct=true;
        }

        //Checks if the correct RadioButton for question 10 is selected
        RadioButton radioButtonTraction = (RadioButton) findViewById(answer10b);
        boolean checkedTraction = radioButtonTraction.isChecked();
        if (checkedTraction) {
            score++;
            isAnswer10Correct=true;
        }

        displayResult(isAnswer1Correct, isAnswer2Correct, isAnswer3Correct, isAnswer4Correct,
                isAnswer5Correct, isAnswer6Correct, isanswer7Correct, isAnswer8Correct,
                isAnswer9correct, isAnswer10Correct);

    }

    public void displayResult (boolean get1, boolean get2, boolean get3, boolean get4, boolean get5,
                               boolean get6, boolean get7, boolean get8, boolean get9, boolean get10) {
        //Displays the score of the user
        String resultsMessage = getString(R.string.declaring_score_by_toast_pt1) + " " + score + "/10";

        //Initialize the strings to return for each answer
        String outcomeQuestion1=getString(R.string.incorrect_string);
        String outcomeQuestion2=getString(R.string.incorrect_string);
        String outcomeQuestion3=getString(R.string.incorrect_string);
        String outcomeQuestion4=getString(R.string.incorrect_string);
        String outcomeQuestion5=getString(R.string.incorrect_string);
        String outcomeQuestion6=getString(R.string.incorrect_string);
        String outcomeQuestion7=getString(R.string.incorrect_string);
        String outcomeQuestion8=getString(R.string.incorrect_string);
        String outcomeQuestion9=getString(R.string.incorrect_string);
        String outcomeQuestion10=getString(R.string.incorrect_string);

        //Give the value "correct" to the strings corresponding for all the answers correctly submitted
        if (get1==true) outcomeQuestion1=getString(R.string.correct_string);
        if (get2==true) outcomeQuestion2=getString(R.string.correct_string);
        if (get3==true) outcomeQuestion3=getString(R.string.correct_string);
        if (get4==true) outcomeQuestion4=getString(R.string.correct_string);
        if (get5==true) outcomeQuestion5=getString(R.string.correct_string);
        if (get6==true) outcomeQuestion6=getString(R.string.correct_string);
        if (get7==true) outcomeQuestion7=getString(R.string.correct_string);
        if (get8==true) outcomeQuestion8=getString(R.string.correct_string);
        if (get9==true) outcomeQuestion9=getString(R.string.correct_string);
        if (get10==true) outcomeQuestion10=getString(R.string.correct_string);

        //Add a toast mesage reporting the score of the test
        Toast.makeText(this, getString(R.string.result_toast) + " " + score + "/10", Toast.LENGTH_SHORT).show();


        //Add information to the massage displayed about which answers are correct and whicn not
        resultsMessage += "\n" + getString(R.string.first_question_answer_text) + " " + outcomeQuestion1;
        resultsMessage += "\n" + getString(R.string.second_question_answer_text) + " " + outcomeQuestion2;
        resultsMessage += "\n" + getString(R.string.third_question_answer_text) + " " + outcomeQuestion3;
        resultsMessage += "\n" + getString(R.string.fourth_question_answer_text) + " " + outcomeQuestion4;
        resultsMessage += "\n" + getString(R.string.fifth_question_answer_text) + " " + outcomeQuestion5;
        resultsMessage += "\n" + getString(R.string.sixth_question_answer_text) + " " + outcomeQuestion6;
        resultsMessage += "\n" + getString(R.string.seventh_question_answer_text) + " " + outcomeQuestion7;
        resultsMessage += "\n" + getString(R.string.eighth_question_answer_text) + " " + outcomeQuestion8;
        resultsMessage += "\n" + getString(R.string.ninth_question_answer_text) + " " + outcomeQuestion9;
        resultsMessage += "\n" + getString(R.string.tenth_question_answer_text) + " " + outcomeQuestion10;
        TextView scoreTextView = (TextView) findViewById(result);
        scoreTextView.setText(resultsMessage);
        score=0;

    }


}


package com.okanisik.odyoloji;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class KarmaSoru1Activity extends AppCompatActivity {


    private TextView optionA,optionB,optionC,optionD;
    private TextView questionnumber,question,score;
    private TextView chechkout1,checkout2;
    int currentIndex;
    int mscore=0;
    int qn=1;
    ProgressBar progressBar;


    int CurrentQuestion,CurrentOptionA,CurrentOptionB,CurrentOptionC,CurrentOptionD;




    private answerclass[] questionBank= new answerclass[]
            {
                    new answerclass(R.string.question_1Karma1,R.string.question1_AKarma1,R.string.question1_BKarma1,R.string.question1_CKarma1,R.string.question1_DKarma1,R.string.answer_1Karma1),
                    new answerclass(R.string.question_2Karma1,R.string.question1_2AKarma1,R.string.question1_2BKarma1,R.string.question1_2CKarma1,R.string.question1_2DKarma1,R.string.answer_2Karma1),
                    new answerclass(R.string.question_3Karma1,R.string.question1_3AKarma1,R.string.question1_3BKarma1,R.string.question1_3CKarma1,R.string.question1_3DKarma1,R.string.answer_3Karma1),
                    new answerclass(R.string.question_4Karma1,R.string.question1_4AKarma1,R.string.question1_4BKarma1,R.string.question1_4CKarma1,R.string.question1_4DKarma1,R.string.answer_4Karma1),
                    new answerclass(R.string.question_5Karma1,R.string.question1_5AKarma1,R.string.question1_5BKarma1,R.string.question1_5CKarma1,R.string.question1_5DKarma1,R.string.answer_5Karma1),
                    new answerclass(R.string.question_6Karma1,R.string.question1_6AKarma1,R.string.question1_6BKarma1,R.string.question1_6CKarma1,R.string.question1_6DKarma1,R.string.answer_6Karma1),
                    new answerclass(R.string.question_7Karma1,R.string.question1_7AKarma1,R.string.question1_7BKarma1,R.string.question1_7CKarma1,R.string.question1_7DKarma1,R.string.answer_7Karma1),
                    new answerclass(R.string.question_8Karma1,R.string.question1_8AKarma1,R.string.question1_8BKarma1,R.string.question1_8CKarma1,R.string.question1_8DKarma1,R.string.answer_8Karma1),





            };

    final int PROGRESS_BAR = (int) Math.ceil(100/questionBank.length);







    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_karma_soru1);






        optionA=findViewById(R.id.optionA);
        optionB=findViewById(R.id.optionB);
        optionC=findViewById(R.id.optionC);
        optionD=findViewById(R.id.optionD);


        question =findViewById(R.id.qestion);
        score = findViewById(R.id.score);
        questionnumber = findViewById(R.id.QestionNumber);


        chechkout1 =findViewById(R.id.selectoption);
        checkout2 =findViewById(R.id.CorrectAnswer);
        progressBar=findViewById(R.id.progress_bar);


        CurrentQuestion = questionBank[currentIndex].getQuestionid();
        question.setText(CurrentQuestion);
        CurrentOptionA=questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB=questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC=questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD=questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);


        optionA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkAnswer(CurrentOptionA);
                updateQuestion();

            }
        });

        optionB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkAnswer(CurrentOptionB);
                updateQuestion();

            }
        });

        optionC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkAnswer(CurrentOptionC);
                updateQuestion();

            }
        });

        optionD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                checkAnswer(CurrentOptionD);
                updateQuestion();

            }
        });





    }

    private void checkAnswer(int userSelection) {

        int correctanswer =questionBank[currentIndex].getAnswerid();

        chechkout1.setText(userSelection);
        checkout2.setText(correctanswer);

        String m= chechkout1.getText().toString().trim();
        String n= checkout2.getText().toString().trim();

        if (m.equals(n))
        {
            Toast.makeText(getApplicationContext(),"Doğru",Toast.LENGTH_SHORT).show();
            mscore=mscore+1;
        }
        else
        {
            Toast.makeText(getApplicationContext(),"Yanlış",Toast.LENGTH_SHORT).show();
        }

    }

    private void updateQuestion() {


        currentIndex = (currentIndex+1)%questionBank.length;


        if (currentIndex==0)
        {
            AlertDialog.Builder alert=new AlertDialog.Builder(this);
            alert.setTitle("Oyun Bitti");
            alert.setCancelable(false);
            alert.setMessage("Sonuç " + mscore + " puan");
            alert.setPositiveButton("Ekranı Kapat", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {

                    finish();
                }
            });

            alert.setNegativeButton("Başla", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    mscore=0;
                    qn=1;
                    progressBar.setProgress(0);
                    score.setText("Puan: " + mscore + "/" +questionBank.length);
                    questionnumber.setText(qn + "/" + questionBank.length + " Soru");


                }
            });

            alert.show();

        }




        CurrentQuestion = questionBank[currentIndex].getQuestionid();
        question.setText(CurrentQuestion);
        CurrentOptionA=questionBank[currentIndex].getOptionA();
        optionA.setText(CurrentOptionA);
        CurrentOptionB=questionBank[currentIndex].getOptionB();
        optionB.setText(CurrentOptionB);
        CurrentOptionC=questionBank[currentIndex].getOptionC();
        optionC.setText(CurrentOptionC);
        CurrentOptionD=questionBank[currentIndex].getOptionD();
        optionD.setText(CurrentOptionD);

        qn=qn+1;

        if (qn<=questionBank.length)

        {

            questionnumber.setText(qn + "/" + questionBank.length + " Soru");
        }
        score.setText("Puan: " + mscore + "/" +questionBank.length);
        progressBar.incrementProgressBy(PROGRESS_BAR);








    }
}
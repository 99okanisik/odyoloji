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

public class isitmesistemifizyolojibir extends AppCompatActivity {

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
                    new answerclass(R.string.question_F1,R.string.question1_FA,R.string.question1_FB,R.string.question1_FC,R.string.question1_FD,R.string.answer_F1),
                    new answerclass(R.string.question_F2,R.string.question1_F2A,R.string.question1_F2B,R.string.question1_F2C,R.string.question1_F2D,R.string.answer_F2),
                    new answerclass(R.string.question_F3,R.string.question1_F3A,R.string.question1_F3B,R.string.question1_F3C,R.string.question1_F3D,R.string.answer_F3),
                    new answerclass(R.string.question_F4,R.string.question1_F4A,R.string.question1_F4B,R.string.question1_F4C,R.string.question1_F4D,R.string.answer_F4),
                    new answerclass(R.string.question_F5,R.string.question1_F5A,R.string.question1_F5B,R.string.question1_F5C,R.string.question1_F5D,R.string.answer_F5),
                    new answerclass(R.string.question_F6,R.string.question1_F6A,R.string.question1_F6B,R.string.question1_F6C,R.string.question1_F6D,R.string.answer_F6),
                    new answerclass(R.string.question_F7,R.string.question1_F7A,R.string.question1_F7B,R.string.question1_F7C,R.string.question1_F7D,R.string.answer_F7),
                    new answerclass(R.string.question_F8,R.string.question1_F8A,R.string.question1_F8B,R.string.question1_F8C,R.string.question1_F8D,R.string.answer_F8),





            };

    final int PROGRESS_BAR = (int) Math.ceil(100/questionBank.length);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_isitmesistemifizyolojibir);

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
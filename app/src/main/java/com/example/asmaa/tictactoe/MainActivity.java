package com.example.asmaa.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> X= new ArrayList<>();
    ArrayList<Integer> O= new ArrayList<>();
     static Boolean convert=true;
    int B1=R.id.button1;
    int B2=R.id.button2;
    int B3=R.id.button3;
    int B4=R.id.button4;
    int B5=R.id.button5;
    int B6=R.id.button6;
    int B7=R.id.button7;
    int B8=R.id.button8;
    int B9=R.id.button9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }



    public void enter (View v){

        if(convert.equals(true)){
            convert=false;
            X.add(v.getId());
            v.setBackgroundResource(R.drawable.xicon);
            v.setEnabled(false);
            String Win ="X is Winner";
            winner(Win);
        }

        else {
            convert=true;
            O.add(v.getId());
            v.setBackgroundResource(R.drawable.oicon);
            v.setEnabled(false);
            String Win ="O is Winner";
            winner(Win);
        }


    }




    public void winner(String W) {

        if ((X.contains(B1) && X.contains(B2)&& X.contains(B3))
                ||(X.contains(B4) && X.contains(B5)&& X.contains(B6))
                ||(X.contains(B7) && X.contains(B8)&& X.contains(B9))
                ||(X.contains(B1) && X.contains(B5)&& X.contains(B9))
                ||(X.contains(B3) && X.contains(B5)&& X.contains(B7))
                ||(X.contains(B1) && X.contains(B4)&& X.contains(B7))
                ||(X.contains(B2) && X.contains(B5)&& X.contains(B8))
                ||(X.contains(B3) && X.contains(B6)&& X.contains(B9))




                ){
            Toast.makeText(MainActivity.this, W, Toast.LENGTH_SHORT).show();
              Bundle s =new Bundle();
              s.putString("Win",W);
              Intent intent =new Intent(this,WinnerPage.class);
              intent.putExtras(s);
              startActivity(intent);


        }
        else if ((O.contains(B1) && O.contains(B2)&& O.contains(B3))
                ||(O.contains(B4) && O.contains(B5)&& O.contains(B6))
                ||(O.contains(B7) && O.contains(B8)&& O.contains(B9))
                ||(O.contains(B1) && O.contains(B5)&& O.contains(B9))
                ||(O.contains(B3) && O.contains(B5)&& O.contains(B7))
                ||(O.contains(B1) && O.contains(B4)&& O.contains(B7))
                ||(O.contains(B2) && O.contains(B5)&& O.contains(B8))
                ||(O.contains(B3) && O.contains(B6)&& O.contains(B9)))
                 {
                     Toast.makeText(MainActivity.this, W, Toast.LENGTH_SHORT).show();
                     Bundle s =new Bundle();
                     s.putString("Win",W);
                     Intent intent =new Intent(this,WinnerPage.class);
                     intent.putExtras(s);
                      startActivity(intent);;


        }

        else{

            Toast.makeText(MainActivity.this,"No Winner Until Now", Toast.LENGTH_SHORT).show();


        }


    }


}





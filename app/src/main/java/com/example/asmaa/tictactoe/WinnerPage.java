package com.example.asmaa.tictactoe;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by Asmaa on 27-Feb-17.
 */


public class WinnerPage  extends MainActivity{


    TextView t1;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.winnerpage);
        t1=(TextView) findViewById(R.id.textView);
        Bundle D = getIntent().getExtras();
        t1.setText(D.getString("Win"));

    }
}

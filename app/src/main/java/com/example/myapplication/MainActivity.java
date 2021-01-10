package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button LRR,FTX,SMD,DMS,TBT,SMN,LMX,FSS,UCU,MNT,MRT,CRX,VNR,BSC,STE,MNO,CBY,ARC,STM,MRN,DRO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LRR = (Button) findViewById(R.id.LRR);
        FTX = (Button) findViewById(R.id.FTX);
        SMD = (Button) findViewById(R.id.SMD);
        DMS = (Button) findViewById(R.id.DMS);
        TBT = (Button) findViewById(R.id.TBT);
        SMN = (Button) findViewById(R.id.SMN);
        LMX = (Button) findViewById(R.id.LMX);
        FSS = (Button) findViewById(R.id.FSS);
        UCU = (Button) findViewById(R.id.UCU);
        MNT = (Button) findViewById(R.id.MNT);
        MRT = (Button) findViewById(R.id.MRT);
        CRX = (Button) findViewById(R.id.CRX);
        VNR = (Button) findViewById(R.id.VNR);
        BSC = (Button) findViewById(R.id.BSC);
        STE = (Button) findViewById(R.id.STE);
        MNO = (Button) findViewById(R.id.MNO);
        CBY = (Button) findViewById(R.id.CBY);
        ARC = (Button) findViewById(R.id.ARC);
        STM = (Button) findViewById(R.id.STM);
        MRN = (Button) findViewById(R.id.MRN);
        DRO = (Button) findViewById(R.id.DRO);


        LRR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent LRR = new Intent(getApplicationContext(), lrr.class);
                startActivity(LRR);
            }
        });

    }
}
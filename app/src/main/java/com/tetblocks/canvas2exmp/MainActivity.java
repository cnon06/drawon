package com.tetblocks.canvas2exmp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    // View v1;
    arrowview av;
    LinearLayout ln1;
    LinearLayout.LayoutParams lp1;
    LinearLayout.LayoutParams parms, controller_parms;
    ImageView right_arrow, left_arrow,  direction_arrow, down_arrow, double_down_arrow ;


    int y1=0;


    Handler handler;
    Runnable handlerTask;

    public void StartTimer(){
        handler = new Handler();
        handlerTask = new Runnable()
        {
            @Override
            public void run() {


                y1++;
              System.out.println("y1: "+y1);


              av.invalidate();
              /*
               // do something
                y++;
                System.out.println("Y: "+y);
                // ln1.setText(""+y);
               */

                handler.postDelayed(handlerTask, 1000);
            }
        };
        handlerTask.run();
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        ln1 = findViewById(R.id.ln1);


         lp1 = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT
        );



        ln1.setOrientation(LinearLayout.HORIZONTAL);

       // v1 = findViewById(R.id.view2);






        left_arrow= new ImageView(this);
        left_arrow.setImageResource(R.drawable.tet1);
        ln1.addView(left_arrow, lp1);
        controller_parms = new LinearLayout.LayoutParams(200,200);
        left_arrow.setLayoutParams(controller_parms);





        av= new arrowview(this);
      //  this.setContentView(av);

        ln1.addView(av, lp1);

        controller_parms = new LinearLayout.LayoutParams(400,800);
        av.setLayoutParams(controller_parms);

        /*
          ViewGroup.LayoutParams params = av.getLayoutParams();
        params.height = 600;
        params.width = 600;
        av.requestLayout();
         */



        //av.invalidate();

        //RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) av.getLayoutParams();
       // params.height = 130;
      //  av.setLayoutParams(params);


        StartTimer();

    }






}
package com.tetblocks.canvas2exmp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class arrowview extends View

{

    Boolean dsw = false;
    Bitmap ic_launcher = BitmapFactory.decodeResource(this.getResources(),R.drawable.tet1);
    Bitmap ic_launcher2 = BitmapFactory.decodeResource(this.getResources(),R.drawable.tet2);
    Bitmap ic_launcher3=Bitmap.createScaledBitmap(ic_launcher,70,70,false);
    Bitmap ic_launcher4=Bitmap.createScaledBitmap(ic_launcher2,70,70,false);

    public arrowview(Context context) {
        super(context);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        Paint paint = new Paint();


        int x = getWidth();
        int y = getHeight();
        int radius=100;

        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        canvas.drawPaint(paint);




          if(dsw)
        {
            canvas.drawBitmap(ic_launcher3,100,100,null);

          //  canvas.drawBitmap(tet2, 300, 300, null);
            dsw=false;

        }
        else
        {
            canvas.drawBitmap(ic_launcher4,100,100,null);
           // canvas.drawBitmap(tet4, 300, 300, null);
            dsw=true;
        }



    }
}

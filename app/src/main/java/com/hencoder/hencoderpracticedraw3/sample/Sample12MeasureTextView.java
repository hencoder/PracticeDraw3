package com.hencoder.hencoderpracticedraw3.sample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Sample12MeasureTextView extends View {
    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text1 = "三个月内你胖了";
    String text2 = "4.5";
    String text3 = "公斤";
    float measuredText1;
    float measuredText2;

    public Sample12MeasureTextView(Context context) {
        super(context);
    }

    public Sample12MeasureTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Sample12MeasureTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint1.setTextSize(60);
        paint2.setTextSize(120);
        paint2.setColor(Color.parseColor("#E91E63"));

        measuredText1 = paint1.measureText(text1);
        measuredText2 = paint2.measureText(text2);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawText(text1, 50, 200, paint1);
        canvas.drawText(text2, 50 + measuredText1, 200, paint2);
        canvas.drawText(text3, 50 + measuredText1 + measuredText2, 200, paint1);
    }
}

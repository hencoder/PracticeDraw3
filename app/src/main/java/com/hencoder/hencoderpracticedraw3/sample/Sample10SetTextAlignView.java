package com.hencoder.hencoderpracticedraw3.sample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Sample10SetTextAlignView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello HenCoder";

    public Sample10SetTextAlignView(Context context) {
        super(context);
    }

    public Sample10SetTextAlignView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Sample10SetTextAlignView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setTextAlign(Paint.Align.LEFT);
        canvas.drawText(text, getWidth() / 2, 100, paint);

        paint.setTextAlign(Paint.Align.CENTER);
        canvas.drawText(text, getWidth() / 2, 200, paint);

        paint.setTextAlign(Paint.Align.RIGHT);
        canvas.drawText(text, getWidth() / 2, 300, paint);
    }
}

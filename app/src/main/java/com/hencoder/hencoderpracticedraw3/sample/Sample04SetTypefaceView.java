package com.hencoder.hencoderpracticedraw3.sample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Sample04SetTypefaceView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello HenCoder";
    Typeface typeface;

    public Sample04SetTypefaceView(Context context) {
        super(context);
    }

    public Sample04SetTypefaceView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Sample04SetTypefaceView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint.setTextSize(60);

        typeface = Typeface.createFromAsset(getContext().getAssets(), "Satisfy-Regular.ttf");
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        paint.setTypeface(null);
        canvas.drawText(text, 50, 100, paint);
        paint.setTypeface(Typeface.SERIF);
        canvas.drawText(text, 50, 200, paint);
        paint.setTypeface(typeface);
        canvas.drawText(text, 50, 300, paint);
    }
}

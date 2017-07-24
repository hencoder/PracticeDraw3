package com.hencoder.hencoderpracticedraw3.sample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Sample13GetTextBoundsView extends View {
    Paint paint1 = new Paint(Paint.ANTI_ALIAS_FLAG);
    Paint paint2 = new Paint(Paint.ANTI_ALIAS_FLAG);
    String[] texts = {"A", "a", "J", "j", "Â", "â"};
    int[] yOffsets = {0, 0, 0, 0, 0, 0};
    int top = 200;
    int bottom = 400;

    public Sample13GetTextBoundsView(Context context) {
        super(context);
    }

    public Sample13GetTextBoundsView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Sample13GetTextBoundsView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        paint1.setStyle(Paint.Style.STROKE);
        paint1.setStrokeWidth(20);
        paint1.setColor(Color.parseColor("#E91E63"));
        paint2.setTextSize(160);

        Rect textBounds = new Rect();
        paint2.getTextBounds(texts[0], 0, texts[0].length(), textBounds);
        yOffsets[0] = - (textBounds.top + textBounds.bottom) / 2;
        paint2.getTextBounds(texts[1], 0, texts[1].length(), textBounds);
        yOffsets[1] = - (textBounds.top + textBounds.bottom) / 2;
        paint2.getTextBounds(texts[2], 0, texts[2].length(), textBounds);
        yOffsets[2] = - (textBounds.top + textBounds.bottom) / 2;
        paint2.getTextBounds(texts[3], 0, texts[3].length(), textBounds);
        yOffsets[3] = - (textBounds.top + textBounds.bottom) / 2;
        paint2.getTextBounds(texts[4], 0, texts[4].length(), textBounds);
        yOffsets[4] = - (textBounds.top + textBounds.bottom) / 2;
        paint2.getTextBounds(texts[5], 0, texts[5].length(), textBounds);
        yOffsets[5] = - (textBounds.top + textBounds.bottom) / 2;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawRect(50, top, getWidth() - 50, bottom, paint1);

        int middle = (top + bottom) / 2;
        canvas.drawText(texts[0], 100, middle + yOffsets[0], paint2);
        canvas.drawText(texts[1], 200, middle + yOffsets[1], paint2);
        canvas.drawText(texts[2], 300, middle + yOffsets[2], paint2);
        canvas.drawText(texts[3], 400, middle + yOffsets[3], paint2);
        canvas.drawText(texts[4], 500, middle + yOffsets[4], paint2);
        canvas.drawText(texts[5], 600, middle + yOffsets[5], paint2);
    }
}

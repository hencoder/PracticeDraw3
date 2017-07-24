package com.hencoder.hencoderpracticedraw3.sample;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;

public class Sample02StaticLayoutView extends View {
    TextPaint textPaint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello\nHenCoder";
    StaticLayout staticLayout;

    public Sample02StaticLayoutView(Context context) {
        super(context);
    }

    public Sample02StaticLayoutView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Sample02StaticLayoutView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    {
        textPaint.setTextSize(60);
        // 这两行的位置不能换哟
        staticLayout = new StaticLayout(text, textPaint, 600, Layout.Alignment.ALIGN_NORMAL, 1, 0, true);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.save();
        canvas.translate(50, 40);
        staticLayout.draw(canvas);
        canvas.restore();
    }
}

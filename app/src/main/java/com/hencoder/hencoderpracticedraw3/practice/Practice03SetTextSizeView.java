package com.hencoder.hencoderpracticedraw3.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice03SetTextSizeView extends View {
    Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
    String text = "Hello HenCoder";

    public Practice03SetTextSizeView(Context context) {
        super(context);
    }

    public Practice03SetTextSizeView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public Practice03SetTextSizeView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int y = 100;

        // 使用 paint.setTextSize() 来设置不同大小的文字

        // 第一处：文字大小 16
        canvas.drawText(text, 50, y, paint);

        y += 30;
        // 第一处：文字大小 24
        canvas.drawText(text, 50, y, paint);

        y += 55;
        // 第一处：文字大小 48
        canvas.drawText(text, 50, y, paint);

        y += 80;
        // 第一处：文字大小 72
        canvas.drawText(text, 50, y, paint);
    }
}
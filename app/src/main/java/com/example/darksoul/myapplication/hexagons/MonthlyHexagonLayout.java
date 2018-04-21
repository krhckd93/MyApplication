package com.example.darksoul.myapplication.hexagons;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;


public class MonthlyHexagonLayout extends HexagonLayout {
    public MonthlyHexagonLayout(Context context) {
        super(context);
    }

    public MonthlyHexagonLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MonthlyHexagonLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public Path Monthly() {
        float midx = getWidth() / 2;
        float midy = getHeight() / 2;

        Path p = new Path();
        p.moveTo(midx, midy);
        p.lineTo(midx, midy -Y2); // 1
        p.lineTo(midx + X, midy -Y); // 1
        p.lineTo(midx, midy);

        return p;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        DrawBaseHexagon(canvas);
        Paint paint = new Paint();
        paint.setColor(mColor);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        canvas.drawPath(Monthly(), paint);
        super.onDraw(canvas);
    }
}

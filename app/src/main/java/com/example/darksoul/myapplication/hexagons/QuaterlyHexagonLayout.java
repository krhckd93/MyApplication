package com.example.darksoul.myapplication.hexagons;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;


public class QuaterlyHexagonLayout extends HexagonLayout {

    public QuaterlyHexagonLayout(Context context) {
        super(context);
    }

    public QuaterlyHexagonLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public QuaterlyHexagonLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public Path Quaterly() {
        float midx = getWidth() / 2;
        float midy = getHeight() / 2;

        Path p = new Path();

        p.moveTo(midx, midy);
        p.lineTo(midx, midy-Y2);
        p.lineTo(midx + X, midy -Y);
        p.lineTo(midx + X, midy);
        p.lineTo(midx, midy);
        return p;
    }

    @Override
    protected void onDraw(Canvas canvas) {

        DrawBaseHexagon(canvas);
        Paint paint = new Paint();
        paint.setColor(mColor);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(4);
        canvas.drawPath(Quaterly(), paint);
        super.onDraw(canvas);

    }

}

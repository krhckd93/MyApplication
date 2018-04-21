package com.example.darksoul.myapplication.hexagons;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;


public class BiannualHexagonLayout extends HexagonLayout {
    public BiannualHexagonLayout(Context context) {
        super(context);
    }

    public BiannualHexagonLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public BiannualHexagonLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public Path BiAnnual() {
        float midx = getWidth() / 2;
        float midy = getHeight() / 2;

        Path p = new Path();
        p.moveTo(midx, midy);
        p.lineTo(midx + X, midy -Y); // 1
        p.lineTo(midx+X, midy + Y); // 2
        p.lineTo(midx, midy + Y2); //3
        p.lineTo(midx-X, midy+Y); // 4
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
        canvas.drawPath(BiAnnual(), paint);
        super.onDraw(canvas);

    }
}

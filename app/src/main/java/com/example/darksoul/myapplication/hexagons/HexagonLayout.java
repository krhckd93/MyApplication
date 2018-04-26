package com.example.darksoul.myapplication.hexagons;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

import com.example.darksoul.myapplication.R;

public class HexagonLayout extends RelativeLayout {

    public static int X = 55;
    public static int Y = 36;
    public static int Y2 = 2 * Y;
    public int mColor = Color.MAGENTA;

    public int getmColor() {
        return mColor;
    }

    public void setmColor(int res_color) {
        int color = ContextCompat.getColor(getContext(), res_color);
        this.mColor = color;
    }

    public HexagonLayout(Context context) {
        super(context);
    }

    public HexagonLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @SuppressLint("NewApi")
    public HexagonLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        DrawBaseHexagon(canvas);
//        setBackground(getResources().getDrawable(R.drawable.shape_hexagon_blue, null));
        super.onDraw(canvas);

    }

    protected void DrawBaseHexagon(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(mColor);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(4);
        canvas.drawPath(Hexagon(), paint);
    }

    private Path Hexagon() {

        float midx = getWidth() / 2;
        float midy = getHeight() / 2;

        Path p = new Path();

        p.moveTo(midx+X, midy + Y);
        p.lineTo(midx+X, midy + Y);
        p.lineTo(midx+ X, midy );
        p.lineTo(midx + X, midy -Y);
        p.lineTo(midx, midy-Y2);
        p.lineTo(midx-X, midy-Y);
        p.lineTo(midx-X, midy+Y);
        p.lineTo(midx, midy+Y2);
        p.lineTo(midx+ X, midy +Y);

        return p;

    }






}
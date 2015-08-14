package com.sy.skb.draw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.WindowManager;

public class MyRightSauteView extends View {

	public MyRightSauteView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void onDraw(Canvas canvas) {
		// TODO Auto-generated method stub
		WindowManager wm = (WindowManager) getContext().getSystemService(Context.WINDOW_SERVICE);
		int width = wm.getDefaultDisplay().getWidth();
		int height = wm.getDefaultDisplay().getHeight();
		
		int x = (int) (width * 0.35);
		int y = (int) (height * 0.04);
		float stroke = (float) (x * 0.011);
		int radio = (int) (x * 0.0202);
		
		super.onDraw(canvas);
		Paint paint = new Paint();
		
		paint.setColor(Color.rgb(252, 205, 58));
		paint.setStrokeWidth(stroke);
		canvas.drawLine(0, y, x, y, paint);
		
	}
}

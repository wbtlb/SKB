package com.sy.skb.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;

import com.sy.skb.R;

public class MenActivity extends Activity {
	private ImageView back = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_meng);
		
		back = (ImageView) findViewById(R.id.back);
		back.setOnClickListener(listener);
	}
	
	public OnClickListener listener = new OnClickListener()
	{
		Intent intent = new Intent();
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch(v.getId())
			{
				case R.id.back:
					intent.setClass(MenActivity.this, MainActivity.class);
					startActivity(intent);
					break;
			}
		}
		
	};
}

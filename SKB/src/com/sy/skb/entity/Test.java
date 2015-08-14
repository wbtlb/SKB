package com.sy.skb.entity;

import java.util.List;

import cn.bmob.v3.Bmob;
import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.listener.FindListener;

import com.sy.skb.R;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class Test extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.test);
		
		Bmob.initialize(this, "15d50d0b9ff1ee188c4f8630f92e8c33");
		
		final BmobQuery<ChaoMenu> query = new BmobQuery<ChaoMenu>();
		query.setLimit(1000);
		query.findObjects(this, new FindListener<ChaoMenu>() {
			
			@Override
			public void onSuccess(List<ChaoMenu> arg0) {
				// TODO Auto-generated method stub
				Toast.makeText(Test.this, "³É¹¦", Toast.LENGTH_LONG).show();
			}
			
			@Override
			public void onError(int arg0, String arg1) {
				// TODO Auto-generated method stub
				Toast.makeText(Test.this, "Ê§°Ü", Toast.LENGTH_LONG).show();
			}
		});
		
	}
}

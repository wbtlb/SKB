package com.sy.skb.ui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.AsyncTask.Status;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import cn.bmob.v3.Bmob;

import com.dodola.model.DuitangInfo;
import com.sy.skb.R;
import com.sy.skb.bitmapfunutil.Helper;
import com.sy.skb.bitmapfunutil.ImageFetcher;
import com.sy.skb.libraryviews.StaggeredGridView;

public class MainActivity extends Activity {
	private String[] names = new String[] { "香酥小蟹肉饼", "李白", "张三", "李四" };
	private String[] descs = new String[] { "可爱多一点", "大诗人", "傻逼一个", "不认识" };
	private int[] imageIds = new int[] { R.drawable.xsxrxsb,
			R.drawable.xsxrxsb, R.drawable.xsxrxsb, R.drawable.xsxrxsb };

	private ImageView find = null;
	private TextView chao = null;
	private TextView dun = null;
	private TextView men = null;
	private TextView shao = null;
	private TextView hui = null;
	private TextView liu = null;
	private TextView zha = null;
	private TextView zheng = null;
	private TextView pa = null;
	private TextView cuan = null;
	private TextView title = null;
	private LinearLayout layout_title = null;
	private ListView left_menu = null;

	private ImageFetcher mImageFetcher;
	private StaggeredAdapter mAdapter;
	private ContentTask task = new ContentTask(this, 2);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		Bmob.initialize(this, "15d50d0b9ff1ee188c4f8630f92e8c33");

		find = (ImageView) findViewById(R.id.find);
		chao = (TextView) findViewById(R.id.chao);
		dun = (TextView) findViewById(R.id.dun);
		men = (TextView) findViewById(R.id.men);
		shao = (TextView) findViewById(R.id.shao);
		hui = (TextView) findViewById(R.id.hui);
		liu = (TextView) findViewById(R.id.liu);
		zha = (TextView) findViewById(R.id.zha);
		zheng = (TextView) findViewById(R.id.zheng);
		pa = (TextView) findViewById(R.id.pa);
		cuan = (TextView) findViewById(R.id.cuan);
		title = (TextView) findViewById(R.id.textView_title);
		layout_title = (LinearLayout) findViewById(R.id.layout_title);
		//left_menu = (ListView) findViewById(R.id.left_menu);

		find.setOnClickListener(listener);
		chao.setOnClickListener(listener);
		dun.setOnClickListener(listener);
		men.setOnClickListener(listener);
		shao.setOnClickListener(listener);
		hui.setOnClickListener(listener);
		liu.setOnClickListener(listener);
		zha.setOnClickListener(listener);
		zheng.setOnClickListener(listener);
		pa.setOnClickListener(listener);
		cuan.setOnClickListener(listener);
		title.setOnClickListener(listener);
		layout_title.setOnClickListener(listener);

		mImageFetcher = new ImageFetcher(this, 240);
		mImageFetcher.setLoadingImage(R.drawable.empty_photo);
		StaggeredGridView gridView = (StaggeredGridView) this
				.findViewById(R.id.staggeredGridView1);

		int margin = getResources().getDimensionPixelSize(R.dimen.margin);

		gridView.setFastScrollEnabled(true);

		mAdapter = new StaggeredAdapter(MainActivity.this, mImageFetcher);
		gridView.setAdapter(mAdapter);
		mAdapter.notifyDataSetChanged();
		AddItemToContainer(1, 1);
		AddItemToContainer(2, 1);
		AddItemToContainer(3, 1);
		// final BmobQuery<Menu> query = new BmobQuery<Menu>();
		// query.getObject(this,"5GtL999R",new GetListener<Menu>(){
		//
		// @Override
		// public void onSuccess(Menu menu) {
		// // TODO Auto-generated method stub
		// Toast.makeText(MainActivity.this, menu.getM_name()+"",
		// Toast.LENGTH_SHORT).show();
		//
		// }
		//
		// @Override
		// public void onFailure(int arg0, String arg1) {
		// // TODO Auto-generated method stub
		// Toast.makeText(MainActivity.this, "识别"+arg1,
		// Toast.LENGTH_LONG).show();
		// }
		//
		// });

		List<Map<String, Object>> listItems = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < names.length; i++) {
			Map<String, Object> listItem = new HashMap<String, Object>();
			listItem.put("header", imageIds[i]);
			listItem.put("personName", names[i]);
			listItem.put("desc", descs[i]);
			listItems.add(listItem);
		}

		SimpleAdapter simpleAdapter = new SimpleAdapter(this, listItems,
				R.layout.item, new String[] { "personName", "header", "desc",
						"personName", "header", "desc" }, new int[] {
						R.id.name, R.id.header, R.id.desc });
		//ListView list = (ListView) findViewById(R.id.left_menu);
		//list.setAdapter(simpleAdapter);
	}

	public OnClickListener listener = new OnClickListener() {
		Intent intent = new Intent();

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			switch (v.getId()) {
			case R.id.find:
				intent.setClass(MainActivity.this, MainFindActivity.class);
				startActivity(intent);
				break;
			case R.id.chao:
				intent.setClass(MainActivity.this, ChaoActivity.class);
				startActivity(intent);
				break;
			case R.id.dun:
				intent.setClass(MainActivity.this, DunActivity.class);
				startActivity(intent);
				break;
			case R.id.men:
				intent.setClass(MainActivity.this, MenActivity.class);
				startActivity(intent);
				break;
			case R.id.shao:
				intent.setClass(MainActivity.this, ShaoActivity.class);
				startActivity(intent);
				break;
			case R.id.hui:
				intent.setClass(MainActivity.this, HuiActivity.class);
				startActivity(intent);
				break;
			case R.id.liu:
				intent.setClass(MainActivity.this, LiuActivity.class);
				startActivity(intent);
				break;
			case R.id.zha:
				intent.setClass(MainActivity.this, ZhaActivity.class);
				startActivity(intent);
				break;
			case R.id.zheng:
				intent.setClass(MainActivity.this, ZhengActivity.class);
				startActivity(intent);
				break;
			case R.id.pa:
				intent.setClass(MainActivity.this, PaActivity.class);
				startActivity(intent);
				break;
			case R.id.cuan:
				intent.setClass(MainActivity.this, CuanActivity.class);
				startActivity(intent);
				break;
			case R.id.layout_title:
				System.out.println("dd");
				// EditText editText = new EditText(MainActivity.this);
				// layout_title.addView(editText);

				break;
			}
		}

	};

	private void AddItemToContainer(int pageindex, int type) {
		if (task.getStatus() != Status.RUNNING) {
			String url = "http://www.duitang.com/album/1733789/masn/p/"
					+ pageindex + "/24/";
			Log.d("MainActivity", "current url:" + url);
			ContentTask task = new ContentTask(this, type);
			task.execute(url);

		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	private class ContentTask extends
			AsyncTask<String, Integer, List<DuitangInfo>> {

		private Context mContext;
		private int mType = 1;

		public ContentTask(Context context, int type) {
			super();
			mContext = context;
			mType = type;
		}

		@Override
		protected List<DuitangInfo> doInBackground(String... params) {
			try {
				return parseNewsJSON(params[0]);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(List<DuitangInfo> result) {
			if (mType == 1) {

				mAdapter.addItemTop(result);
				mAdapter.notifyDataSetChanged();

			} else if (mType == 2) {
				mAdapter.addItemLast(result);
				mAdapter.notifyDataSetChanged();

			}

		}

		@Override
		protected void onPreExecute() {
		}

		public List<DuitangInfo> parseNewsJSON(String url) throws IOException {
			List<DuitangInfo> duitangs = new ArrayList<DuitangInfo>();
			String json = "";
			if (Helper.checkConnection(mContext)) {
				try {
					json = Helper.getStringFromUrl(url);

				} catch (IOException e) {
					Log.e("IOException is : ", e.toString());
					e.printStackTrace();
					return duitangs;
				}
			}
			Log.d("MainActiivty", "json:" + json);

			try {
				if (null != json) {
					JSONObject newsObject = new JSONObject(json);
					JSONObject jsonObject = newsObject.getJSONObject("data");
					JSONArray blogsJson = jsonObject.getJSONArray("blogs");

					for (int i = 0; i < blogsJson.length(); i++) {
						JSONObject newsInfoLeftObject = blogsJson
								.getJSONObject(i);
						DuitangInfo newsInfo1 = new DuitangInfo();
						newsInfo1
								.setAlbid(newsInfoLeftObject.isNull("albid") ? ""
										: newsInfoLeftObject.getString("albid"));
						newsInfo1
								.setIsrc(newsInfoLeftObject.isNull("isrc") ? ""
										: newsInfoLeftObject.getString("isrc"));
						newsInfo1.setMsg(newsInfoLeftObject.isNull("msg") ? ""
								: newsInfoLeftObject.getString("msg"));
						newsInfo1.setHeight(newsInfoLeftObject.getInt("iht"));
						duitangs.add(newsInfo1);
					}
				}
			} catch (JSONException e) {
				e.printStackTrace();
			}
			return duitangs;
		}
	}
}

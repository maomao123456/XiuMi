package com.example.xiumi;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
/**
 * 主页面
 * @author 毛毛
 *
 */
public class MainActivity extends FragmentActivity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
	}

	/**
	 *  通过id找到控件 并设置相应的点击事件
	 */
	public void initView(){
		
	}
	
	/**
	 * 普通控件的点击事件
	 */
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * 页面切换监听事件
	 */
	OnPageChangeListener pageChange=new OnPageChangeListener() {
		
		@Override
		public void onPageSelected(int arg0) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onPageScrolled(int arg0, float arg1, int arg2) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void onPageScrollStateChanged(int arg0) {
			// TODO Auto-generated method stub
			
		}
	};

	

}

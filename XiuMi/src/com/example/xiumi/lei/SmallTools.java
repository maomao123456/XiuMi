package com.example.xiumi.lei;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.view.Gravity;
import android.widget.Toast;

/**
 * 小工具类：toast 联网检测等
 * @author 毛毛
 *
 */
public class SmallTools extends Activity{
	Application activity;
	
	/**
	 * 获得当前的Activity
	 */
	public Application getActivity(){
		activity=this.getApplication();
		return activity;
	}
	
	/**
	 * 验证网络状态
	 * (WiFi只能验证是否连接上 不能验证是否能上网)
	 */
	@SuppressWarnings("unused")
	private boolean checkNetwork() {
		ConnectivityManager connManager = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
		if (connManager.getActiveNetworkInfo() != null) {
			return connManager.getActiveNetworkInfo().isAvailable();
		}
		return false;
	}
	
	/**
	 * 实现Home键效果
	 */
	public void onBackPressed() {        
		Intent setIntent = new Intent(Intent.ACTION_MAIN);
		setIntent.addCategory(Intent.CATEGORY_HOME);
		setIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);        
		startActivity(setIntent);    
	}
	
	/**
	 *  提示全局通用
	 * @param string
	 * 提示语
	 */
	public void toast(String string) {
		Toast toast=Toast.makeText(getActivity(), string, Toast.LENGTH_SHORT);
		toast.setGravity(Gravity.CENTER, 0, 0);
		toast.show();
	}

}

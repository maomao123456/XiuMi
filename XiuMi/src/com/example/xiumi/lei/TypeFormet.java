package com.example.xiumi.lei;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * 判断格式是否正确类
 * @author 毛毛
 *
 */
public class TypeFormet {

	/**
	 * 判断号码是否为手机号
	 */
	public static boolean isPhoneNb(String phoneNumber) {
		/**
		 * 移动：134、135、136、137、138、139、150、151、157(TD)、158、159、187、188
		 * 联通：130、131、132、152、155、156、185、186 电信：133、153、180、189、（1349卫通）
		 * 总结起来就是第一位必定为1，第二位必定为3或5或8，其他位置的可以为0-9
		 */
		// "[1]"代表第1位为数字1，"[358]"代表第二位可以为3、5、8中的一个，"\\d{9}"代表后面是可以是0～9的数字，有9位。  
		String regExp = "^((13[0-9])|(14[5,7])|(15[^4,\\D])|(17[0,6-8])|(18[0-9]))\\d{8}$";
		Pattern p = Pattern.compile(regExp);
		Matcher m = p.matcher(phoneNumber);
		return m.matches();
	}

	
	/**
	 * // 判断email格式是否正确
	 * @param email
	 * @return
	 */
	public static boolean isRightEmail(String email) {
		String str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$";
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(email);
		return m.matches();
	}
	
	
	/**
	 * //判断输入的密码是否符合规定的格式
	 * @param password
	 * @return
	 */
	public static boolean isRightPassword(String password){
		String str = "^([A-Za-z]|[0-9])+$";
		Pattern p = Pattern.compile(str);
		Matcher m = p.matcher(password);
		return m.matches();
	}
}

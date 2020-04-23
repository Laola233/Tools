package xyz.mofangserver.api;

import java.text.SimpleDateFormat;
import java.util.Date;
import xyz.mofangserver.quote.*;

public class gettime extends apis implements finalDatas , finalStrings , functions {
	public static String Date() {
		Date currentTime = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String dateString = formatter.format(currentTime);
		return dateString;
	}

	public void time() {
		System.out.println(finalStrings.shijian + Date());
	}
}

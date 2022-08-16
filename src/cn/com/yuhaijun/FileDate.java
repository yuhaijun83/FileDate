package cn.com.yuhaijun;

import java.io.File;
import java.util.Date;

public class FileDate {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		if (null != args && args.length == 2) {
			File file = new File(args[0]);
			if (file.exists()) {
				Date date = new Date(args[1]);
				file.setLastModified(date.getTime());
			}
			System.exit(0);
		} else {
			System.out.println("パラメータ入力違う：");
			System.out.println("使い方：");
			System.out.println("　　java -jar FileDate.jar <プルパスのファイル名> <YYYY/MM/DD HH:MM:SS>");
			System.out.println("例：");
			System.out.println("　　java -jar FileDate.jar c:\\temp\\test.txt \"2022/08/16 23:59:59\"");
			System.exit(-1);
		}
		
	}

}

package xyz.mofangserver.classes;

import java.util.Scanner;
import xyz.mofangserver.quote.*;;

public class jsj implements finalDatas , finalStrings , functions {
	public static int[] arrint = new int[99];
	public static double[] arrdoub = new double[99];

	@SuppressWarnings("resource")
	public final static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		functions.jsjstart();
		int choose = a.nextInt();
		switch (choose) {
		case 1:
			functions.jsjstartmain();
			functions.jia();
			break;
		case 2:
			functions.jsjstartmain();
			functions.jian();
			break;
		case 3:
			functions.jsjstartmain();
			functions.cheng();
			break;
		case 4:
			functions.jsjstartmain();
			functions.chu();
			break;
		case 5:
			functions.jsjstartmain();
			functions.pingfang();
			break;
		case 6:
			functions.jsjstartmain();
			functions.lifang();
			break;
		}
	}
}

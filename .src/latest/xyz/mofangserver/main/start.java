package xyz.mofangserver.main;

import xyz.mofangserver.api.*;
import xyz.mofangserver.quote.*;
import xyz.mofangserver.classes.*;
import java.util.Scanner;

public final class start implements finalDatas , finalStrings , functions {
	@SuppressWarnings("resource")
	public final static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		gettime timeString = new gettime();
		while (dynamicDatas.i == 0) {
			functions.ss1();
			timeString.time();
			functions.enter();
			int c1 = a.nextInt();
			switch (c1) {
			case 1:
				guess.main(args);
				break;
			case 2:
				jsb.main(args);
				break;
			case 3:
				pump.cstart();
				break;
			case 4:
				jsj.main(args);
				break;
			}
			System.out.println(finalStrings.continues);
			dynamicDatas.i = a.nextInt();
		}
	}
}

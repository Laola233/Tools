package xyz.mofangserver.classes;

import java.util.*;
import xyz.mofangserver.quote.*;

public final class guess implements finalDatas , finalStrings , functions {
	@SuppressWarnings("resource")
	public final static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		Random MyR = new Random();
		dynamicDatas.Rs = MyR.nextInt(101);
		final String cancel = "真可惜!答案是:" + dynamicDatas.Rs;
		dynamicStrings.cancel2 = cancel;
		do {
			System.out.println("尝试次数" + dynamicDatas.ci);
			functions.guessstartmessage();
			dynamicDatas.guess = a.nextInt();
			panduan();
		} while (dynamicDatas.s != 2);
	}

	private final static void panduan() {
		if (dynamicDatas.guess == 666) {
			System.out.println(dynamicStrings.cancel2);
			dynamicDatas.s = 2;
		} else {
			if (dynamicDatas.Rs == dynamicDatas.guess) {
				System.out.println(finalStrings.right);
				dynamicDatas.s = 2;
			} else {
				if (dynamicDatas.Rs > dynamicDatas.guess) {
					System.out.println(finalStrings.small);
					dynamicDatas.ci = dynamicDatas.ci + 1;
				} else {
					System.out.println(finalStrings.big);
					dynamicDatas.ci = dynamicDatas.ci + 1;
				}
			}
		}
	}
}

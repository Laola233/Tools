package xyz.mofangserver.quote;

import xyz.mofangserver.classes.*;
import java.util.Scanner;

public interface functions {
	public static Scanner ab = new Scanner(System.in);

	public static void ss1() {
		System.out.println(finalStrings.s1);
		System.out.println(finalStrings.s2);
		System.out.println(finalStrings.s3);
		System.out.println(finalStrings.s4);
		System.out.println(finalStrings.s5);
		System.out.println(finalStrings.s6);
		System.out.println(finalStrings.s7);
		System.out.println(finalStrings.s8);
	}

	public static void enter() {
		System.out.println(finalStrings.choose);
		System.out.println(finalStrings.enter);
	}

	public static void guessstartmessage() {
		System.out.println(finalStrings.guessmessage1);
		System.out.println(finalStrings.guessmessage2);
		System.out.println(finalStrings.guessmessage3);
		System.out.println(finalStrings.enter);
	}

	public static void dspstart() {
		System.out.println(finalStrings.dsp1);
		System.out.println(finalStrings.dsp2);
		System.out.println(finalStrings.enter);
	}

	public static void dsppd() {
		functions.dspshow();
	}

	public static void dspshow() {
		if (dynamicDatas.Rs == 1) {
			dynamicStrings.dspshowt = "�Է������Ǽ���";
		} else {
			if (dynamicDatas.Rs == 2) {
				dynamicStrings.dspshowt = "�Է�������ʯͷ3 1 3 2 3";
			} else {
				if (dynamicDatas.Rs == 3) {
					dynamicStrings.dspshowt = "�Է������ǲ�";
				}
			}
		}
	}

	public static void dspping() {
		System.out.println(finalStrings.ping);
		System.out.println(dynamicStrings.dspshowt);
	}

	public static void dsplose() {
		System.out.println(finalStrings.lose);
		System.out.println(dynamicStrings.dspshowt);
	}

	public static void dspwin() {
		System.out.println(finalStrings.win);
		System.out.println(dynamicStrings.dspshowt);
	}

	public static void jsjstart() {
		System.out.println(finalStrings.jstype);
		System.out.println(finalStrings.enter);
	}

	public static void jsjendshow() {
		System.out.println(dynamicDatas.sum);
	}

	public static void jia() {
		for (int ci = 0; ci <= dynamicDatas.acc - 1; ci++) {
			dynamicDatas.sum = dynamicDatas.sum + jsj.arrdoub[ci];
		}
		functions.jsjendshow();
	}

	public static void jian() {
		dynamicDatas.sum = jsj.arrdoub[0];
		for (int ci = 0; ci <= dynamicDatas.acc - 1; ci++) {
			dynamicDatas.sum = dynamicDatas.sum - jsj.arrdoub[ci + 1];
		}
		functions.jsjendshow();
	}

	public static void cheng() {
		for (int ci = 0; ci <= dynamicDatas.acc - 1; ci++) {
			dynamicDatas.sum = dynamicDatas.sum * jsj.arrdoub[ci];
		}
		functions.jsjendshow();
	}

	public static void chu() {
		for (int ci = 0; ci <= dynamicDatas.acc - 1; ci++) {
			dynamicDatas.sum = dynamicDatas.sum / jsj.arrdoub[ci];
		}
		functions.jsjendshow();
	}

	public static void pingfang() {
		for (int ci = 0; ci <= dynamicDatas.acc - 1; ci++) {
			dynamicDatas.sum = jsj.arrdoub[ci] * jsj.arrdoub[ci];
		}
		functions.jsjendshow();
	}

	public static void lifang() {
		for (int ci = 0; ci <= dynamicDatas.acc - 1; ci++) {
			dynamicDatas.sum = jsj.arrdoub[ci] * jsj.arrdoub[ci] * jsj.arrdoub[ci];
		}
		functions.jsjendshow();
	}

	public static void jsjstartmain() {
		for (int i = 0; i < 99; i++) {
			dynamicDatas.acc = i + 1;
			System.out.println("�������" + dynamicDatas.acc + "����");
			jsj.arrdoub[i] = ab.nextDouble();
			System.out.println("��������?(0)��(1)");
			dynamicDatas.c = ab.nextInt();
			if (dynamicDatas.c == 0) {
				continue;
			} else {
				break;
			}
		}
	}

	public static void cstartmain() {
		System.out.println(finalStrings.cstartstr);
		System.out.println(finalStrings.enter);
	}

	public static void c15ren() {
		System.out.println("15��ȫ������" + finalDatas.member15 + "����¼��ϵͳ����" + dynamicDatas.sj15ren);
	}

	public static void c16ren() {
		System.out.println("16��ȫ������" + finalDatas.member16 + "����¼��ϵͳ����" + dynamicDatas.sj16ren);
	}

	public static void cstart1() {
		System.out.println("���������������ʼ,����333665����");
	}
}

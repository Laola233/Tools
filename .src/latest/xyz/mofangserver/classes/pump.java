package xyz.mofangserver.classes;

import xyz.mofangserver.quote.*;
import java.util.*;

public class pump implements finalDatas , finalStrings , functions {
	public static Scanner in = new Scanner(System.in);
	private static String[] name15 = { "κ��Ǭ", "��һ��", "��ѧ��", "��ʦ��", "κ����", "������", "�Ű���", "�Ϸ��u", "��һ��", "��ΰ��", "������",
			"������", "�����", "������", "������", "��һͮ", "������", "������", "��˼��", "�ň�", "����", "��ռ��", "����", "������", "������", "���ٿ�",
			"������", "����ΰ", "����", "�Т��", "���Ө", "��֮��", "����", "�¾���", "������", "�μ�˶", "��ӫӫ", "������", "������", "������", "����ٻ",
			"������", "����", "�ź���", "������", "������", "�Ե���", "�¼���", "��鸣", "������", "������", "�����" };
	private static String[] name16 = { "��־�", "�����", "������", "������", "���ڿ�", "˾����", "����ǿ", "���쳽��", "������", "Ѧ���", "������",
			"���ĳ�", "˾�ﺭ", "���ε�", "�����", "������", "������", "������", "���쳬", "������", "�Ժ���", "��ѩ��", "������", "��һ��", "������", "����־",
			"��ҫ��", "������", "������", "�����", "������", "������", "������", "�¹���", "�����", "������", "�Եǳ�", "�δ��", "������", "����Ѹ", "���ں�",
			"����ˬ", "������", "������", "��ѩ��", "������", "������", "�����", "����Զ", "������", "�¿���" };
	private static Random MyRan = new Random();

	public final static void cstart() {
		dynamicDatas.cRs16 = MyRan.nextInt(name16.length);
		dynamicDatas.sj15ren = name15.length;
		dynamicDatas.sj16ren = name16.length;
		functions.cstartmain();
		dynamicDatas.Rs = in.nextInt();
		switch (dynamicDatas.Rs) {
		case 15:
			functions.c15ren();
			cstart15();
			break;
		case 16:
			functions.c16ren();
			cstart16();
			break;
		}
	}

	private final static void cstart15() {
		functions.cstart1();
		do {
			dynamicDatas.c = in.nextInt();
			System.out.println(finalStrings.showc + name15[dynamicDatas.cRs15]);
			dynamicDatas.cRs15 = MyRan.nextInt(name15.length);
		} while (dynamicDatas.c != 333665);
	}

	private final static void cstart16() {
		functions.cstart1();
		do {
			dynamicDatas.c = in.nextInt();
			if(dynamicDatas.c !=333665) {
				System.out.println(finalStrings.showc + name16[dynamicDatas.cRs16]);
				dynamicDatas.cRs16 = MyRan.nextInt(name16.length);
			}else {
				return;
			}
		} while (dynamicDatas.c != 333665);
	}
}

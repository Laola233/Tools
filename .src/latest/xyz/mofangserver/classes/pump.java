package xyz.mofangserver.classes;

import xyz.mofangserver.quote.*;
import java.util.*;

public class pump implements finalDatas , finalStrings , functions {
	public static Scanner in = new Scanner(System.in);
	private static String[] name15 = { "魏义乾", "王一凡", "穆学博", "李师恒", "魏海青", "李媛媛", "张爱涛", "孟凡瑄", "王一心", "高伟华", "孙文萱",
			"杨兆渠", "蒋泽恒", "苏祺祺", "张玉鹏", "王一彤", "陈玉萌", "许晓轩", "朱思如", "张垚", "张宇", "朱占博", "李贵昊", "白天旭", "张丽婷", "郭少凯",
			"于龙浩", "张利伟", "徐大斌", "臧孝申", "苗翠莹", "王之洋", "李泽凯", "陈静茹", "郭荟鑫", "宋嘉硕", "孔荧荧", "张雯雯", "王含含", "冯素青", "吕琪倩",
			"张睦臻", "苗苏", "张海涛", "刘秀丽", "宋雨欣", "赵登坤", "郝继昶", "杨洪福", "孟雨琦", "王延哲", "王洪程" };
	private static String[] name16 = { "宫志昊", "徐光宇", "白树坤", "郭彦晴", "商腾凯", "司长洪", "李书强", "张徐辰珂", "王子砚", "薛宪昊", "方晓晗",
			"唐文超", "司语涵", "胡梦丹", "殷佳琪", "武瑞艳", "王旭瑞", "苏亚奇", "侯庆超", "李亚琪", "赵含雨", "陈雪娇", "段润哲", "洪一鸣", "俞正亚", "王修志",
			"赵耀洋", "李欣恬", "王雨曦", "孟珂冰", "张天琦", "闫雨晴", "丁佳欣", "陈功名", "侯慧茹", "刘安琪", "赵登辰", "宋存飞", "程庆哲", "王兆迅", "张宗豪",
			"徐晓爽", "郭庆阳", "王晓丹", "苏雪茗", "张亚琪", "王超林", "秦玟今", "陈文远", "刘项羽", "陈可依" };
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

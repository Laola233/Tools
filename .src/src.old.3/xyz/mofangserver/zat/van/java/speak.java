/*    */ package xyz.mofangserver.zat.van.java;
/*    */ 
/*    */ public final class speak {
/*  4 */   public static String s1 = "##################################################################";
/*  5 */   public static String s2 = "######|###############------------##########-----------###########";
/*  6 */   public static String s3 = "######|####################||###############|####|####|###########";
/*  7 */   public static String s4 = "######|####################||###############|####|####|###########";
/*  8 */   public static String s5 = "######|####################||###############|####|####|###########";
/*  9 */   public static String s6 = "######|####################||###############|####|####|###########";
/* 10 */   public static String s7 = "######---------############||###############|####|####|###########";
/* 11 */   public static String s8 = "##################################################################";
/* 12 */   public static String enter = "请输入:";
/* 13 */   public static String choose = "选择游戏： 猜数字(1) 剪刀石头布(2)";
/* 14 */   public static String small = "你输入的数比生成的数小";
/* 15 */   public static String big = "你输入的数比生成的数大";
/* 16 */   public static String right = "你答对了!";
/*    */   public static String cancel2;
/* 18 */   public static String shijian = "现在的时间是:";
/* 19 */   public static String dsp1 = "欢迎来到猜拳游戏!";
/* 20 */   public static String dsp2 = "剪刀(1),石头(2),布(3)";
/*    */   public static String dspshowt;
/* 22 */   public static String continues = "是否继续?是(0),否(1)";
/* 23 */   public static int s = 1;
/*    */   public static int guess;
/*    */   public static int Rs;
/* 26 */   public static int ci = 1;
/*    */   public static int enters;
/* 28 */   public static int i = 0;
/*    */   public static final void ss1() {
/* 30 */     System.out.println(s1);
/* 31 */     System.out.println(s2);
/* 32 */     System.out.println(s3);
/* 33 */     System.out.println(s4);
/* 34 */     System.out.println(s5);
/* 35 */     System.out.println(s6);
/* 36 */     System.out.println(s7);
/* 37 */     System.out.println(s8);
/*    */   }
/*    */   public static final void enter() {
/* 40 */     System.out.println(choose);
/* 41 */     System.out.println(enter);
/*    */   }
/*    */   public static final void guessstartmessage() {
/* 44 */     System.out.println("请猜一下电脑随机生成的数");
/* 45 */     System.out.println("范围(1-100)");
/* 46 */     System.out.println("如果你想放弃,输入666查看答案!");
/* 47 */     System.out.println(enter);
/*    */   }
/*    */   public static final void dspstart() {
/* 50 */     System.out.println(dsp1);
/* 51 */     System.out.println(dsp2);
/* 52 */     System.out.println(enter);
/*    */   }
/*    */   
/* 55 */   public static final void dsppd() { dspshow(); }
/*    */   
/*    */   private static final void dspshow() {
/* 58 */     if (Rs == 1) {
/* 59 */       dspshowt = "对方出的是剪刀";
/*    */     }
/* 61 */     else if (Rs == 2) {
/* 62 */       dspshowt = "对方出的是石头";
/*    */     }
/* 64 */     else if (Rs == 3) {
/* 65 */       dspshowt = "对方出的是布";
/*    */     } 
/*    */   }
/*    */ 
/*    */   
/*    */   public static final void dspping() {
/* 71 */     System.out.println("你们平局了!");
/* 72 */     System.out.println(dspshowt);
/*    */   }
/*    */   public static final void dsplose() {
/* 75 */     System.out.println("你输了!");
/* 76 */     System.out.println(dspshowt);
/*    */   }
/*    */   public static final void dspwin() {
/* 79 */     System.out.println("你赢了!");
/* 80 */     System.out.println(dspshowt);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\class\game.jar!\xyz\mofangserver\zat\van\java\speak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
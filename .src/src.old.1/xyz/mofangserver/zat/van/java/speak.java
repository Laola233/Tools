/*     */ package xyz.mofangserver.zat.van.java;
/*     */ 
/*     */ import com.zat.buildcast.jsjcore;
/*     */ 
/*     */ public final class speak {
/*   6 */   public static String s1 = "##################################################################";
/*   7 */   public static String s2 = "######|###############------------##########-----------###########";
/*   8 */   public static String s3 = "######|####################||###############|####|####|###########";
/*   9 */   public static String s4 = "######|####################||###############|####|####|###########";
/*  10 */   public static String s5 = "######|####################||###############|####|####|###########";
/*  11 */   public static String s6 = "######|####################||###############|####|####|###########";
/*  12 */   public static String s7 = "######---------############||###############|####|####|###########";
/*  13 */   public static String s8 = "##################################################################";
/*  14 */   public static String enter = "请输入:";
/*  15 */   public static String choose = "选择： 猜数字(1) 剪刀石头布(2) 15班数字抽号(3) 16班数字抽号(4) 计算器(5)";
/*  16 */   public static String small = "你输入的数比生成的数小";
/*  17 */   public static String big = "你输入的数比生成的数大";
/*  18 */   public static String right = "你答对了!";
/*     */   public static String cancel2;
/*  20 */   public static String shijian = "现在的时间是:";
/*  21 */   public static String dsp1 = "欢迎来到猜拳游戏!";
/*  22 */   public static String dsp2 = "剪刀(1),石头(2),布(3)";
/*     */   public static String dspshowt;
/*  24 */   public static String continues = "是否继续?是(0),否(1)";
/*  25 */   public static String ver = "0.0.1";
/*  26 */   public static int s = 1;
/*     */   public static int guess;
/*     */   public static int Rs;
/*  29 */   public static int ci = 1;
/*     */   public static int enters;
/*  31 */   public static int i = 0;
/*     */   
/*     */   public static final void ss1() {
/*  34 */     System.out.println(s1);
/*  35 */     System.out.println(s2);
/*  36 */     System.out.println(s3);
/*  37 */     System.out.println(s4);
/*  38 */     System.out.println(s5);
/*  39 */     System.out.println(s6);
/*  40 */     System.out.println(s7);
/*  41 */     System.out.println(s8);
/*     */   }
/*     */   
/*     */   public static final void enter() {
/*  45 */     System.out.println(choose);
/*  46 */     System.out.println(enter);
/*     */   }
/*     */   
/*     */   public static final void guessstartmessage() {
/*  50 */     System.out.println("请猜一下电脑随机生成的数");
/*  51 */     System.out.println("范围(1-100)");
/*  52 */     System.out.println("如果你想放弃,输入666查看答案!");
/*  53 */     System.out.println(enter);
/*     */   }
/*     */   
/*     */   public static final void dspstart() {
/*  57 */     System.out.println(dsp1);
/*  58 */     System.out.println(dsp2);
/*  59 */     System.out.println(enter);
/*     */   }
/*     */ 
/*     */   
/*  63 */   public static final void dsppd() { dspshow(); }
/*     */ 
/*     */   
/*     */   private static final void dspshow() {
/*  67 */     if (Rs == 1) {
/*  68 */       dspshowt = "对方出的是剪刀";
/*     */     }
/*  70 */     else if (Rs == 2) {
/*  71 */       dspshowt = "对方出的是石头3 1 3 2 3";
/*     */     }
/*  73 */     else if (Rs == 3) {
/*  74 */       dspshowt = "对方出的是布";
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public static final void dspping() {
/*  81 */     System.out.println("你们平局了!");
/*  82 */     System.out.println(dspshowt);
/*     */   }
/*     */   
/*     */   public static final void dsplose() {
/*  86 */     System.out.println("你输了!");
/*  87 */     System.out.println(dspshowt);
/*     */   }
/*     */   
/*     */   public static final void dspwin() {
/*  91 */     System.out.println("你赢了!");
/*  92 */     System.out.println(dspshowt);
/*     */   }
/*     */   
/*     */   public static final void jsjstart() {
/*  96 */     System.out.println("请选择类型:加法(1),减法(2),乘法(3),除法(4),平方(5),立方(6)");
/*  97 */     System.out.println(enter);
/*     */   }
/*     */ 
/*     */   
/* 101 */   public static final void jsjendshow() { System.out.println(jsjcore.sum); }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\class\Tools\resources\tools.old1.jar!\xyz\mofangserver\zat\van\java\speak.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
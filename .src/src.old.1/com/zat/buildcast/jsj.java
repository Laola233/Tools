/*    */ package com.zat.buildcast;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ import xyz.mofangserver.zat.van.java.speak;
/*    */ 
/*    */ public class jsj {
/*  7 */   public static int[] arrint = new int[99];
/*  8 */   public static double[] arrdoub = new double[99];
/*    */   
/*    */   public static final void main(String[] args) {
/* 11 */     Scanner a = new Scanner(System.in);
/* 12 */     speak.jsjstart();
/* 13 */     int choose = a.nextInt();
/* 14 */     switch (choose) {
/*    */       case 1:
/* 16 */         jsjcore.main();
/* 17 */         jsjcore.jia();
/*    */         break;
/*    */       case 2:
/* 20 */         jsjcore.main();
/* 21 */         jsjcore.jian();
/*    */         break;
/*    */       case 3:
/* 24 */         jsjcore.main();
/* 25 */         jsjcore.cheng();
/*    */         break;
/*    */       case 4:
/* 28 */         jsjcore.main();
/* 29 */         jsjcore.chu();
/*    */         break;
/*    */       case 5:
/* 32 */         jsjcore.main();
/* 33 */         jsjcore.pingfang();
/*    */         break;
/*    */       case 6:
/* 36 */         jsjcore.main();
/* 37 */         jsjcore.lifang();
/*    */         break;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\class\Tools\resources\tools.old1.jar!\com\zat\buildcast\jsj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
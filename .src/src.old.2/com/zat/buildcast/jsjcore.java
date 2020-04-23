/*    */ package com.zat.buildcast;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ import xyz.mofangserver.zat.van.java.speak;
/*    */ 
/*    */ public class jsjcore
/*    */ {
/*  8 */   private static Scanner ab = new Scanner(System.in);
/*    */   private static int acc;
/*    */   public static double zhongzhuan1;
/* 11 */   public static int c = 0;
/*    */   public static double sum;
/*    */   public static double sum1;
/*    */   
/*    */   public static void main() {
/* 16 */     for (i = 0; i < 99; ) {
/* 17 */       acc = i + 1;
/* 18 */       System.out.println("请输入第" + acc + "个数");
/* 19 */       jsj.arrdoub[i] = ab.nextDouble();
/* 20 */       System.out.println("继续输入?(0)否(1)");
/* 21 */       c = ab.nextInt();
/* 22 */       if (c == 0) {
/*    */         i++;
/*    */         continue;
/*    */       } 
/*    */       break;
/*    */     } 
/*    */   }
/*    */   
/*    */   public static void jia() {
/* 31 */     for (ci = 0; ci <= acc - 1; ci++) {
/* 32 */       sum += jsj.arrdoub[ci];
/*    */     }
/* 34 */     speak.jsjendshow();
/*    */   }
/*    */   
/*    */   public static void jian() {
/* 38 */     for (ci = 0; ci <= acc - 1; ci++) {
/* 39 */       sum = jsj.arrdoub[ci] - sum;
/*    */     }
/* 41 */     speak.jsjendshow();
/*    */   }
/*    */   
/*    */   public static void cheng() {
/* 45 */     for (ci = 0; ci <= acc - 1; ci++) {
/* 46 */       sum *= jsj.arrdoub[ci];
/*    */     }
/* 48 */     speak.jsjendshow();
/*    */   }
/*    */   
/*    */   public static void chu() {
/* 52 */     for (ci = 0; ci <= acc - 1; ci++) {
/* 53 */       sum /= jsj.arrdoub[ci];
/*    */     }
/* 55 */     speak.jsjendshow();
/*    */   }
/*    */   
/*    */   public static void pingfang() {
/* 59 */     for (ci = 0; ci <= acc - 1; ci++) {
/* 60 */       sum = jsj.arrdoub[ci] * jsj.arrdoub[ci];
/*    */     }
/* 62 */     speak.jsjendshow();
/*    */   }
/*    */   
/*    */   public static void lifang() {
/* 66 */     for (ci = 0; ci <= acc - 1; ci++) {
/* 67 */       sum = jsj.arrdoub[ci] * jsj.arrdoub[ci] * jsj.arrdoub[ci];
/*    */     }
/* 69 */     speak.jsjendshow();
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\class\Tools\resources\tools.old2.jar!\com\zat\buildcast\jsjcore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
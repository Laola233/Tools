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
/* 38 */     sum = jsj.arrdoub[0];
/* 39 */     for (ci = 0; ci <= acc - 1; ci++) {
/* 40 */       sum -= jsj.arrdoub[ci + 1];
/*    */     }
/* 42 */     speak.jsjendshow();
/*    */   }
/*    */   
/*    */   public static void cheng() {
/* 46 */     for (ci = 0; ci <= acc - 1; ci++) {
/* 47 */       sum *= jsj.arrdoub[ci];
/*    */     }
/* 49 */     speak.jsjendshow();
/*    */   }
/*    */   
/*    */   public static void chu() {
/* 53 */     for (ci = 0; ci <= acc - 1; ci++) {
/* 54 */       sum /= jsj.arrdoub[ci];
/*    */     }
/* 56 */     speak.jsjendshow();
/*    */   }
/*    */   
/*    */   public static void pingfang() {
/* 60 */     for (ci = 0; ci <= acc - 1; ci++) {
/* 61 */       sum = jsj.arrdoub[ci] * jsj.arrdoub[ci];
/*    */     }
/* 63 */     speak.jsjendshow();
/*    */   }
/*    */   
/*    */   public static void lifang() {
/* 67 */     for (ci = 0; ci <= acc - 1; ci++) {
/* 68 */       sum = jsj.arrdoub[ci] * jsj.arrdoub[ci] * jsj.arrdoub[ci];
/*    */     }
/* 70 */     speak.jsjendshow();
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\class\Tools\resources\tools.old1.jar!\com\zat\buildcast\jsjcore.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
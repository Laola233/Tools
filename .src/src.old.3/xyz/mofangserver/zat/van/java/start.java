/*    */ package xyz.mofangserver.zat.van.java;
/*    */ 
/*    */ import java.util.Scanner;
/*    */ import xyz.mofangserver.api.api;
/*    */ 
/*    */ public final class start
/*    */ {
/*    */   public static final void main(String[] args) {
/*  9 */     Scanner a = new Scanner(System.in);
/* 10 */     while (speak.i == 0) {
/* 11 */       speak.ss1();
/* 12 */       System.out.println(String.valueOf(speak.shijian) + api.Date());
/* 13 */       speak.enter();
/* 14 */       int c1 = a.nextInt();
/* 15 */       switch (c1) {
/*    */         case 1:
/* 17 */           guess.main(args);
/*    */           break;
/*    */         case 2:
/* 20 */           dsp.main(args);
/*    */           break;
/*    */       } 
/* 23 */       System.out.println(speak.continues);
/* 24 */       speak.i = a.nextInt();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\class\game.jar!\xyz\mofangserver\zat\van\java\start.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
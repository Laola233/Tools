/*    */ package xyz.mofangserver.zat.van.java;
/*    */ 
/*    */ import java.util.Random;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public final class dsp {
/*    */   public static final void main(String[] args) {
/*  8 */     Random MR = new Random();
/*  9 */     speak.Rs = MR.nextInt(4);
/* 10 */     Scanner cont = new Scanner(System.in);
/* 11 */     speak.dspstart();
/* 12 */     speak.enters = cont.nextInt();
/* 13 */     speak.dsppd();
/* 14 */     if (speak.enters == 1) {
/* 15 */       if (speak.Rs == 1) {
/* 16 */         speak.dspping();
/*    */       }
/* 18 */       else if (speak.Rs == 2) {
/* 19 */         speak.dsplose();
/*    */       }
/* 21 */       else if (speak.Rs == 3) {
/* 22 */         speak.dspwin();
/*    */       
/*    */       }
/*    */     
/*    */     }
/* 27 */     else if (speak.enters == 2) {
/* 28 */       if (speak.Rs == 1) {
/* 29 */         speak.dspwin();
/*    */       }
/* 31 */       else if (speak.Rs == 2) {
/* 32 */         speak.dspping();
/*    */       }
/* 34 */       else if (speak.Rs == 3) {
/* 35 */         speak.dsplose();
/*    */       
/*    */       }
/*    */     
/*    */     }
/* 40 */     else if (speak.enters == 3) {
/* 41 */       if (speak.Rs == 1) {
/* 42 */         speak.dsplose();
/*    */       }
/* 44 */       else if (speak.Rs == 2) {
/* 45 */         speak.dspwin();
/*    */       }
/* 47 */       else if (speak.Rs == 3) {
/* 48 */         speak.dspping();
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\class\Tools\resources\tools.old2.jar!\xyz\mofangserver\zat\van\java\dsp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
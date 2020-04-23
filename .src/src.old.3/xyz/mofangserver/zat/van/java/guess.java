/*    */ package xyz.mofangserver.zat.van.java;
/*    */ 
/*    */ import java.util.Random;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ public final class guess
/*    */ {
/*    */   public static final void main(String[] args) {
/*  9 */     speak speak = new speak();
/* 10 */     Scanner a = new Scanner(System.in);
/* 11 */     Random MyR = new Random();
/* 12 */     speak.Rs = MyR.nextInt(101);
/* 13 */     String cancel = "真可惜!答案是:" + speak.Rs;
/* 14 */     speak.cancel2 = cancel;
/*    */     do {
/* 16 */       System.out.println("尝试次数" + speak.ci);
/* 17 */       speak.guessstartmessage();
/* 18 */       speak.enter();
/* 19 */       speak.guess = a.nextInt();
/* 20 */       panduan();
/* 21 */     } while (speak.s != 2);
/*    */   }
/*    */   private static final void panduan() {
/* 24 */     if (speak.guess == 666) {
/* 25 */       System.out.println(speak.cancel2);
/* 26 */       speak.s = 2;
/*    */     }
/* 28 */     else if (speak.Rs == speak.guess) {
/* 29 */       System.out.println(speak.right);
/* 30 */       speak.s = 2;
/*    */     }
/* 32 */     else if (speak.Rs > speak.guess) {
/* 33 */       System.out.println(speak.small);
/* 34 */       speak.ci++;
/*    */     } else {
/* 36 */       System.out.println(speak.big);
/* 37 */       speak.ci++;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\class\game.jar!\xyz\mofangserver\zat\van\java\guess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
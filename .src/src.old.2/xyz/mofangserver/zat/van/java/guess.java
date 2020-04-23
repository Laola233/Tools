/*    */ package xyz.mofangserver.zat.van.java;
/*    */ 
/*    */ import java.util.Random;
/*    */ import java.util.Scanner;
/*    */ 
/*    */ 
/*    */ 
/*    */ public final class guess
/*    */ {
/*    */   public static final void main(String[] args) {
/* 11 */     speak speak = new speak();
/* 12 */     Scanner a = new Scanner(System.in);
/* 13 */     Random MyR = new Random();
/* 14 */     speak.Rs = MyR.nextInt(101);
/* 15 */     String cancel = "真可惜!答案是:" + speak.Rs;
/* 16 */     speak.cancel2 = cancel;
/*    */     do {
/* 18 */       System.out.println("尝试次数" + speak.ci);
/* 19 */       speak.guessstartmessage();
/* 20 */       speak.enter();
/* 21 */       speak.guess = a.nextInt();
/* 22 */       panduan();
/* 23 */     } while (speak.s != 2);
/*    */   }
/*    */   
/*    */   private static final void panduan() {
/* 27 */     if (speak.guess == 666) {
/* 28 */       System.out.println(speak.cancel2);
/* 29 */       speak.s = 2;
/*    */     }
/* 31 */     else if (speak.Rs == speak.guess) {
/* 32 */       System.out.println(speak.right);
/* 33 */       speak.s = 2;
/*    */     }
/* 35 */     else if (speak.Rs > speak.guess) {
/* 36 */       System.out.println(speak.small);
/* 37 */       speak.ci++;
/*    */     } else {
/* 39 */       System.out.println(speak.big);
/* 40 */       speak.ci++;
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\class\Tools\resources\tools.old2.jar!\xyz\mofangserver\zat\van\java\guess.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
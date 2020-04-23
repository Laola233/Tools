/*    */ package xyz.mofangserver.zat.van.java;
/*    */ 
/*    */ import com.zat.buildcast.jsj;
/*    */ import com.zat.schoolporj.proj1.chouhao15;
/*    */ import com.zat.schoolporj.proj1.chouhao16;
/*    */ import java.util.Scanner;
/*    */ import xyz.mofangserver.api.api;
/*    */ 
/*    */ 
/*    */ public final class start
/*    */ {
/*    */   public static final void main(String[] args) {
/* 13 */     Scanner a = new Scanner(System.in);
/* 14 */     while (speak.i == 0) {
/* 15 */       speak.ss1();
/* 16 */       System.out.println(String.valueOf(speak.shijian) + api.Date());
/* 17 */       speak.enter();
/* 18 */       int c1 = a.nextInt();
/* 19 */       switch (c1) {
/*    */         case 1:
/* 21 */           guess.main(args);
/*    */           break;
/*    */         case 2:
/* 24 */           dsp.main(args);
/*    */           break;
/*    */         case 3:
/* 27 */           chouhao15.cstart(args);
/*    */           break;
/*    */         case 4:
/* 30 */           chouhao16.cstart(args);
/*    */           break;
/*    */         case 5:
/* 33 */           jsj.main(args);
/*    */           break;
/*    */       } 
/* 36 */       System.out.println(speak.continues);
/* 37 */       speak.i = a.nextInt();
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\class\Tools\resources\tools.old1.jar!\xyz\mofangserver\zat\van\java\start.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
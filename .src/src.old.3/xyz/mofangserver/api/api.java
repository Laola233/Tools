/*    */ package xyz.mofangserver.api;
/*    */ import java.text.SimpleDateFormat;
/*    */ 
/*    */ public final class api {
/*    */   public static final void main(String[] args) {
/*  6 */     System.out.println("Thanks use mofangapi!");
/*  7 */     System.out.println("Ver:0.0.1");
/*    */   }
/*    */   
/*    */   public final void apis() {}
/*    */   
/*    */   public static String Date() {
/* 13 */     currentTime = new Date();
/* 14 */     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 15 */     return formatter.format(currentTime);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\class\game.jar!\xyz\mofangserver\api\api.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
/*    */ package xyz.mofangserver.api;
/*    */ 
/*    */ import java.text.SimpleDateFormat;
/*    */ import java.util.Date;
/*    */ import xyz.mofangserver.zat.van.java.speak;
/*    */ 
/*    */ public final class api {
/*  8 */   public static String aver = "0.0.1";
/*    */   
/*    */   public static final void main(String[] args) {
/* 11 */     System.out.println("Thanks use mofangapi!");
/* 12 */     System.out.println("Ver:0.0.1");
/*    */   }
/*    */ 
/*    */   
/*    */   public final void apis() {}
/*    */ 
/*    */   
/*    */   public static String Date() {
/* 20 */     currentTime = new Date();
/* 21 */     SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
/* 22 */     return formatter.format(currentTime);
/*    */   }
/*    */ 
/*    */ 
/*    */   
/* 27 */   public static void cstartfuctionshow() { System.out.println(speak.Rs); }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\class\Tools\resources\tools.old1.jar!\xyz\mofangserver\api\api.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.0.7
 */
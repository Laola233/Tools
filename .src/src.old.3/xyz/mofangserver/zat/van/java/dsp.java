     package xyz.mofangserver.zat.van.java;
     import java.util.*;
     
     public final class dsp {
       public static final void main(String[] args) {
        Random MR = new Random();
       speak.Rs = MR.nextInt(4);
       Scanner cont = new Scanner(System.in);
        speak.dspstart();
       speak.enters = cont.nextInt();
       speak.dsppd();
       if (speak.enters == 1) {
         if (speak.Rs == 1) {
           speak.dspping();
          }
         else if (speak.Rs == 2) {
          speak.dsplose();
           }
         else if (speak.Rs == 3) {
           speak.dspwin();
           
           }
         
         }
       else if (speak.enters == 2) {
         if (speak.Rs == 1) {
           speak.dspwin();
           }
         else if (speak.Rs == 2) {
          speak.dspping();
           }
       else if (speak.Rs == 3) {
          speak.dsplose();
           
           }
         
         }
       else if (speak.enters == 3) {
         if (speak.Rs == 1) {
           speak.dsplose();
           }
        else if (speak.Rs == 2) {
           speak.dspwin();
           }
         else if (speak.Rs == 3) {
          speak.dspping();
           } 
         } 
       }
     }

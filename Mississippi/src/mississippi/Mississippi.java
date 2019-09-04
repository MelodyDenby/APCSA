package mississippi;

public class Mississippi {
   public static void main(String args[]){
      letterM();
      TwoISS();
      TwoISS();
      letterI();
      letterP();
      letterP();
      letterI();
   }
   public static void letterM(){
   System.out.println("M     M\nMM   MM\nM M M M\nM  M  M\nM     M\nM     M\nM     M");
   }
   public static void letterI(){
   System.out.println("IIIII\n  I  \n  I  \n  I  \n  I  \n  I  \nIIIII");
   }
   public static void letterP(){
   System.out.println("PPPPPP\nP     P\nP     P\nPPPPPP\nP\nP");
   }
   public static void letterS(){
   System.out.println(" SSSSS\nS      S\nS\n SSSSS\n      S\nS      S\n SSSSS");
   }
   public static void TwoISS(){
   letterI();
   letterS();
   letterS();
   }
}
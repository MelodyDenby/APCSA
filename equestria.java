public class equestria{
   public static void main(String[] args){
      //exercise 1
      double diameter=5.5;
      double circumfrance= roadTrip(diameter);
      System.out.print(circumfrance);
      //Exercise 2
      distance(29,16,34,8);
      System.out.print(distance);
      
   }
  
   //Exercise 1
   public static double roadTrip(double diameter){
      return Math.PI * diameter;
   }
   //exercise 2
   public static double distance(int x1, int y1, int x2, int y2){
      return Math.sqrt (Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
   }
   //exercise 3
   public static double totaldistance(int x1, int y1, int x2, int y2){
   
   }
   }
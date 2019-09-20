package hourglass2;

public class hourglass2 {
    public static final int HEIGHT=4;
    
    public static void main(String[] args){
        drawLine();
        drawTop();
        System.out.println("     ||");
        drawBottom();
        drawLine();
    }
    public static void drawLine(){
        System.out.print("|");
        for(double i=1; i<=(2.5*HEIGHT); i++){
            System.out.print("-");
        }
        System.out.println("|");
    }
    public static void drawTop(){
        for (int line=1; line<=HEIGHT; line++){
            System.out.print("");
            for (int i=1; i<=(line-1); i++){
                System.out.print(" ");
            }
            System.out.print(" \\");
            double dots = 2.5*HEIGHT-2*line;
            for (int i =1; i<=dots; i++){
                System.out.print(":");
            }
            System.out.print("/");
            for (int i=1; i<=(line-1); i++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void drawBottom(){
        for (int line=1; line<=HEIGHT; line++){
            System.out.print("");
            for (int i=1; i<=(HEIGHT-line); i++){
                System.out.print(" ");
            }
            System.out.print(" /");
           for (int i=1; i<= 2*line; i++){
                System.out.print(":");
            }
           System.out.print("\\");
           for (int i=1; i<=(HEIGHT- line); i++){
                System.out.print(" ");
            }
           System.out.println("");
        }
    }
}
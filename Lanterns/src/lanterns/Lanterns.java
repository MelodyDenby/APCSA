package lanterns;

public class Lanterns {
    public static void main(String[] args) {
        cone();
        System.out.println("");
        cone();
        middle();
        System.out.println("*************");
        cone();
        System.out.println("");
        cone();
        shortOne();
        middle();
        middle();
        shortOne();
        shortOne();
        
    }
    public static void cone(){
        System.out.println("    *****\n  *********\n*************");
    }
    public static void middle(){
        System.out.println("* | | | | | *");
    }
    public static void shortOne(){
        System.out.println("    *****");
    }
}

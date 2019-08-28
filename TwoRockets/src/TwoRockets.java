public class TwoRockets {
    public static void main(String[] args){
        triangle();
        square();
        System.out.println("|United| |United|");
        System.out.println("|States| |States|");
        square();
        triangle();
    }
    public static void topBottom() {
        System.out.println("+------+ +------+");
    }
    public static void Sides(){
        System.out.println("|      | |      |");
    }
    public static void square(){
        topBottom();
        Sides();
        Sides();
        topBottom();
    }
    public static void triangle(){
        System.out.println("   /\\       /\\");
        System.out.println("  /  \\     /  \\");
        System.out.println(" /    \\   /    \\");
        System.out.println("/      \\ /      \\");
    }
}
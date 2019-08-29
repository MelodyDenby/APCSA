package fightsong;

public class FightSong {
    public static void main(String[] args) {
        shortOne();
        longerOne();
        longerOne();
        shortOne();
    }
    public static void shortOne(){
        System.out.println("Go, team, go! \nYou can do it!");
    }
    public static void longOne(){
        System.out.println("You're the best\nin the West!");
    }
    public static void longerOne(){
        System.out.println("");
        shortOne();
        longOne();
        shortOne();
        System.out.println("");
    }
}

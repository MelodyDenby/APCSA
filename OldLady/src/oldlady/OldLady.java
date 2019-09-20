@@ -0,0 +1,34 @@
public class OldLady {
    public static void main(String[] args) {
        basic();
        System.out.println("fly.");
        paraEnd();
        basic();
        System.out.println("spider,\nthat wriggled and iggled and jiggled inside her.");
        para1();
        basic();
        System.out.println("bird,\nhow absurd, to swallow a bird!");
        para2();
        basic();
        System.out.println("dog,\nWhat a hog! To swallow a dog!");
        para3();
        basic();
        System.out.println("horse,\nshe's dead, of course.");
    }
    public static void basic() {
        System.out.print("There was an old lady who swallowed a ");
    }
    public static void paraEnd(){
        System.out.println("I don't know why she swallowed that fly,\nPerhaps she'll die.");
    }
    public static void para1(){
        System.out.println("She swallowed the spider to catch the fly,");
        paraEnd(); 
    }
    public static void para2(){
      System.out.println("She swallowed the bird to catch the spider");
      para1();
    }
    public static void para3(){
      System.out.println("She swallowed the dog to catch the cat...");
      para2();
    }
}
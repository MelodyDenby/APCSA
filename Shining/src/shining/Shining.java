package shining;

 //Multiplies 100 by 10 to make 1,000
public class Shining {
    public static void main(String[] args) {
        hundred();
        hundred();
        hundred();
        hundred();
        hundred();
        hundred();
        hundred();
        hundred();
        hundred();
        hundred();
    }
    
    //original statement
    public static void orig(){
    System.out.println("All work and no play makes Jack a dull boy.");
    }
    
    //multiplies original by 10
    public static void ten(){
        orig();
        orig();
        orig();
        orig();
        orig();
        orig();
        orig();
        orig();
        orig();
        orig();
    }
    
    //multiplies the ten statements by 10 to make 100
    public static void hundred(){
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
        ten();
    }
}

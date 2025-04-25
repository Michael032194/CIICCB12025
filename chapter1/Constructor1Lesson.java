package chapter1;

public class Constructor1Lesson {

    public static void main(String[] args) {
    Chick c1 = new Chick(); c1 = Chick@14 
    Chick c2  = new Chick(); c2 = Chick@21
    c2.name = "wakikik";
    c1.Chick();
    System.out.println("end of program");
    }
}

class Chick{
    String name;
    public Chick(){
        System.out.println("creating new Chick Object");    
        this.name = "wakokok";
    }
    public void Chick(){
        System.out.println("this is a method");
    }
}

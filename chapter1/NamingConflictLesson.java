package chapter1;
import java.util.Date;
//import java.sql.Date;


import otherFolder.Sunflower;

public class NamingConflictLesson {
    java.sql.Date SqlDate;
    //java.util.Date Date;
    Date date;
    

    /**
     * @param args
     */
    public static void main(String[] args) {
        final otherFolder.Sunflower s1 = new Sunflower();
        System.out.println(s1.message);
    }
}
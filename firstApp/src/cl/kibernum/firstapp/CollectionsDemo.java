package cl.kibernum.firstapp;

import static cl.kibernum.firstapp.Bunnies.count;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    
    public static void main(String[] args) {
//        arraysDemo();
        pares();
//new Bunnies();
// new Bunnies(count);
// System.out.println(count++);
    }
    public static void arraysDemo(){
        int[][] vect = {{1,2,3,4},{5,6,7,8}} ;
        for (int i = 0; i < vect.length; i++) {
        System.out.println(vect[5]);
       }
    }
    private static void pares(){
        int[] inte = {1,2,4,5,6,7};
        for (int i = 0; i < inte.length; i++) {
            int j = inte[i];
        }
        System.out.println("\"");
    }
    
    
}

 class Bunnies {
 static int count = 0;
 Bunnies() {
 while(count < 10) new Bunnies(++count);
 }
 Bunnies(int x) { super(); }
// public static void main(String[] args) {
// new Bunnies();
// new Bunnies(count);
// System.out.println(count++);
// }
 }

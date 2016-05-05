package cl.kibernum.firstapp;

import java.util.Scanner;

public class BooleanDemo {

    public static void main(String[] args) {
     boolean b1 = false;
        if(b1==false){
            System.out.println("inner"+b1);
        }else{
            System.out.println("outter "+b1);
        }
        System.out.println("escriba");
        Scanner scan = new Scanner(System.in);
        String lee = scan.next();
        System.out.println(lee);
    }
}

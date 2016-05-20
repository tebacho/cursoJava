package cl.kibernum.tip;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tip {

    int x = -1;
    static int y = -1;
    {
        System.out.println("bloque inicializacion" + this.x);
        this.x = 2;
    }

    static {
        System.out.println("bloque inicializacion estático" + Tip.y);
        Tip.y = 3;
        System.out.println("bloque inicializacion estático" + Tip.y);
    }
    
    Tip() {
        System.out.println("bloque Constructor");
        System.out.println("y " + Tip.y + " x " + this.x);
    }

    public static void main(String[] args) {
//        new Tip();
        int num = readInt();
        System.out.println(num);
    }

    public static int readInt() {
        int s = 0;
        Scanner scann = new Scanner(System.in);
        while(!scann.hasNextInt()){
            s = scann.nextInt();
        }
        return s;
    }
}

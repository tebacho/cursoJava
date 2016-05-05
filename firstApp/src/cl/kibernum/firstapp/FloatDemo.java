/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.kibernum.firstapp;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 *
 * @author Kibernum
 */
public class FloatDemo {
    
    public static void main(String[] args) {
        double weight = 30.123456789012345678901234567890D;
        float weightFloat= Float.MAX_VALUE;
        float sumaFloat = weightFloat++;
        BigDecimal bd = new BigDecimal(30.123456789012345678901234567890);
//        System.out.println("peso = "+weight);
        System.out.println("peso = "+weightFloat);
        System.out.println("Peso Sumado = "+sumaFloat);
//        System.out.println("Bigdecimal :"+bd);
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.kibernum.collections;

import cl.kibernum.objeto.Persona;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Kibernum
 */
public class MyCollection {
    
    public static void main(String[] args) {
              
        sampleList();
    }
    
    private static void sampleList(){
        
        List<String> list = new ArrayList<>();
        list.add("d");
        list.add("f");
        list.add("n");
        list.add("b");
        list.add("a");
        
        Collections.sort(list);
        System.out.println(Arrays.toString(list.toArray()));
        
        Collections.shuffle(list);
        System.out.println(Arrays.toString(list.toArray()));
        
    }
    private static void stackOverFlow(){
        List<String> list = new ArrayList<>();
        do{
            list.add(list.toString());
            System.out.println('c');
            System.out.println(Runtime.getRuntime().totalMemory());
        }while(1<2);
    }

}
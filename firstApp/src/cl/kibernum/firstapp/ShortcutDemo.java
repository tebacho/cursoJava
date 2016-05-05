package cl.kibernum.firstapp;

public class ShortcutDemo {

    public static void main(String[] args) {
//        if(true1() || true2() ||false1());
//        if(true1() |  true2() | false1());
//        if(true1() && true2() &&false1());
//        if(true1() &  true2() & false1());
//        if(true1() || true2() ||false1());
        boolean x = false;
        boolean y = true;
        if(x^x || y^!y){
            System.out.println("SI");
        }
    }
static boolean true1(){
    System.out.println("true1");
    return true;
}    
static boolean true2(){
    System.out.println("true2");
    return true;
}    
static boolean false1(){
    System.out.println("false1");
    return false;
}    

}

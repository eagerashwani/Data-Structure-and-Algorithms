package functions.demo;

public class Demo {

    public static void function1(){
        System.out.println("Hello");
    }

    public static void function2(int a){
        System.out.println(a);
    }

    public static int function3(){
        return 10+20;
    }

    public static int function4(int x, int y, int z){
        return x+y+z;

    }

    public static void main(String[] args) {

        function1();
        function2(10);
        int ans = function3();
        System.out.println(ans);
        int anssum = function4(10, 15, 25);
        System.out.println(anssum);
        
    }
    
}


package lecture8.pkg15;

public class slide27 {
    void sum(int a, long b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    
    public static void main(String[] args) {
        slide27 obj = new slide27();
        obj.sum(10, 10);
        obj.sum(20, 20, 20);
    }
}

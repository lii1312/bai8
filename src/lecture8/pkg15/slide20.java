
package lecture8.pkg15;

public class slide20 { // method overloading ( thay đổi số lượng )
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(int a, int b, int c){
        System.out.println(a+b+c);
    }
    
    public static void main(String[] args) {
        slide20 obj = new slide20();
        obj.sum(10, 10);
        obj.sum(10, 10, 10);
    }
}

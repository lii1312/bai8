
package lecture8.pkg15;

public class slide21 { // method overloading ( thay đổi kiểu dũ liệu )
    void sum(int a, int b){
        System.out.println(a+b);
    }
    void sum(double a, double b){
        System.out.println(a+b);
    }
    
    public static void main(String[] args) {
        slide21 obj = new slide21();
        obj.sum(10, 20);
        obj.sum(2.3, 30);
    }
}

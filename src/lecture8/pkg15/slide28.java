
package lecture8.pkg15;

public class slide28 {
    void sum(int a, int b){
        System.out.println("int arg method invoked");
    }
    void sum(long a, long b){
        System.out.println("long arg method invoked");
    }
    
    public static void main(String[] args) {
        slide28 obj = new slide28();
        obj.sum(20, 20);
        obj.sum(1, 10);
    }
}

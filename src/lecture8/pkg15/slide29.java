
package lecture8.pkg15;

public class slide29 {
    void sum(int a, long b){ 
        System.out.println("a method invoked");
    }
    void sum(long a, int b){
        System.out.println("b method invoked");
    }
    
    public static void main(String[] args) {
        slide29 obj = new slide29();
        // obj.sum(20, 20); // lỗi mơ hồ
        obj.sum(20, 20L); // sử lỗi 
    }
}

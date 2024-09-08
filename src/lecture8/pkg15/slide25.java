
package lecture8.pkg15;

public class slide25 {  // có thể overload ham main
    public static void main(int a) {
        System.out.println(a);
    }
    
    public static void main(String[] args) {
        System.out.println("main() methode invoked");
        main(10);
    }
}


package lecture8.pkg15;

public class slide54 {
   void m(){
       System.out.println("method is invoked");
   }
   void n(){
       this.m();
   }
   void d(){
       n();
   }
    public static void main(String[] args) {
        slide54 s1 = new slide54();
        s1.d();
    }
}

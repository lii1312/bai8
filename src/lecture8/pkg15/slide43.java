
package lecture8.pkg15;

public class slide43 {
    int id;
    String name;
    int age;
    
    slide43(int i, String n){
        id=i;
        name = n;
    }
    slide43(int i, String n, int a){
        id=i;
        name=n;
        age=a;
    }
    void dislay(){
        System.out.println(id+ " " +name+ " " +age);
    }
    public static void main(String[] args) {
        slide43 s1=new slide43(22, "lili");
        slide43 s2=new slide43(33, "kietkiet", 19);
        s1.dislay();
        s2.dislay();
    }
}

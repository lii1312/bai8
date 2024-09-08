
package lecture8.pkg15;

public class slide41 {
    int id;
    String name;

    slide41(int i, String n) {
        id = i;
        name = n;
    }
    void dislay(){
        System.out.println(id+":"+name);
    }
    public static void main(String[] args) {
        slide41 s1 = new slide41(111, "lili");
        slide41 s2 = new slide41(222, "kietkiet");
        s1.dislay();
        s2.dislay();
    }
}


package lecture8.pkg15;

public class slide51 {
    int id;
    String name;
    slide51() {
        System.out.println("default constructer is invoked");
    }

    public slide51(int id, String name) {
        this(); 
        this.id = id;
        this.name = name;
    }
    void dislay(){
        System.out.println(id+" "+name);
    }
    public static void main(String[] args) {
        slide51 s1 = new slide51(11,"lili");
        slide51 s2 = new slide51();
        s1.dislay();
        s2.dislay();
    }
    
}

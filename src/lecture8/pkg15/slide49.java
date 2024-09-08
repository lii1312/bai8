
package lecture8.pkg15;

public class slide49 { // this keyword
    int id;
    String name;
    
    slide49(int i, String n){
        this.id = i;
        this.name = n;
    }
    void dislay(){
        System.out.println(id+ " "+name);
    }
    
    public static void main(String[] args) {
        slide49 s1=new slide49(333, "lili");
        slide49 s2=new slide49(222, "lulu");
        s1.dislay();
        s2.dislay();
          
    }
}

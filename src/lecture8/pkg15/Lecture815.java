
package lecture8.pkg15;

public class Lecture815 {
    int ID;
    String name;
    public Lecture815(int ID, String name){
        this.ID=ID;
        this.name=name;
    }
    void displayInformation(){
        System.out.println("id:"+ID );
        System.out.println("name:"+name);
    }
    public static void main(String[] args) {
        Lecture815 st1 = new Lecture815(1, "lili");
        Lecture815 st2 = new Lecture815(2, "lulu");
        st1.displayInformation();
        st2.displayInformation();
    }
}

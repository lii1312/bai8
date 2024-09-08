
package lecture8.pkg15;

public class slide39 {
    int id;
    String name;
    
    void display(){
        System.out.println(id+ ":" +name);
    } 
    public static void main(String[] args) {
        slide39 s1 = new slide39();
        slide39 s2 = new slide39();
        s1.display();  
        s2.display();
        /* Khi các đối tượng s1 và s2 được tạo, vì các biến id và name trong lớp slide39 không được khởi tạo giá trị, 
        chúng sẽ nhận giá trị mặc định theo loại dữ liệu:
       */
    }
}

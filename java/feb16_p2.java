public class feb16_p2 {
    static int count =0;
    int id;
    int generateId(){
        count++;
        id=count;
        return id;
    }
    static void createUsers(){
        feb16_p2 obj1=new feb16_p2();
        feb16_p2 obj2=new feb16_p2();
        System.out.println(obj1.generateId());
        System.out.println(obj2.generateId());
        

    }
    public static void main(String[] args) {
     createUsers();   
    }
}

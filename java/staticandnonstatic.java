public class staticandnonstatic {
    int age;
    static String country ="India";
    public void show(){
        System.out.println(country +": "+age);
    }
    public static void main(String[] args) {
       
        staticandnonstatic s=new staticandnonstatic();
        

        s.age=10;
        s.show();

    }
}

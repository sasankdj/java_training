//create a java apllication where we have 1 class it contains a non stattic method m1 having no params and returns int and a static method m2 having integer as params returns ntg then invoke these methods under main method , invoke m2 method by passing m1 method return value as params 
class feb16_2{
    int m1(){
        return 10;
    }
    static void m2(int a){
        System.out.println(a);
    }

public static void main(String[] args) {
    feb16_2 obj=new feb16_2();
    System.out.println(obj.m1());
    m2(obj.m1());

}
}
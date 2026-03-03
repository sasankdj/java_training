//create a java application where we have 1 classs it contains a non static method m1 having float,int as params and return boolean and a non satatic method m2 having string , double as params and returns float then invoke this methods under main method by providing dynamic inps
class feb16_1{
    boolean m1(float f, int i) {
        System.out.println(f);
        System.out.println(i);
       return true;
    }
    float m2(String s, double d){
        System.out.println(s);
        System.out.println(d);
        return 10.1f;
    }
    public static void main(String[] args) {
        feb16_1 obj=new feb16_1();
        System.out.println(obj.m1(10.1f, 10));
        System.out.println(obj.m2("sasank", 10.1));
    }
}
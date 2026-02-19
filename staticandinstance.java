public class staticandinstance {
  static int a ;
  int b;
static void sum(){
 
    System.out.println("inside the static method");
    a=100;
    System.out.println(a);

}
void nonstaticsum(){
    System.out.println("inside the non static method");
    this.b=30;
    System.out.println(b);
   
}
public static void main(String[] args) {
    sum();
    staticandinstance s=new staticandinstance();
    s.nonstaticsum();
}
}

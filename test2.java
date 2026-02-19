//create a java application where we have 1 class it contains 1 static and 2 instance variables and a nonstatic method having no parameters and returns nothing then print all these variables under this method and invoke this method under main method 
class test2{
    static int a=10;
    int b=20;
    int c =30;
    void printing(){
        System.out.println("in the non static method ");
        System.out.println(a);
        
        System.out.println(b);
        System.out.println(c);


    } 
    public static void main(String[] args) {
     
        test2 obj = new test2();
    
        obj.printing();

    }
}
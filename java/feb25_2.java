//create a java application where we have 1 class batch 251 here user need to enter data of 5 boys & 5 girls and have a method called display of non static which displays student data then if user want to see boys data display boys data , if user wants to see girls data display girls data, if user want to see both the data display both by providing dynamic inps 

import java.util.Scanner;


class feb25_2 {
    static Scanner sc = new Scanner(System.in);
     String BName;
     String GName;
    // static Scanner sc = new Scanner(System.in);
   void inputs(){
    System.out.println("enter a boy name:");
    BName=sc.next();
    System.out.println("enter a girl name:");
    GName=sc.next();
   }
   void display(int b){
        if(b==1){
            System.out.println(BName);
        }
        else if(b==2){
            System.out.println(GName);
        }
        else if(b==3){
            System.out.println(BName);
            System.out.println(GName);

        }

    }

    public static void main(String[] args) {
        //  int i=1;
        feb25_2 obj1 = new feb25_2();
        feb25_2 obj2 = new feb25_2();
        feb25_2 obj3 = new feb25_2();
        feb25_2 obj4 = new feb25_2();
        feb25_2 obj5 = new feb25_2();
        System.out.println("enter the names of boys and girls like 1 boty and 1 girl ");
        obj1.inputs();
        obj2.inputs();
        obj3.inputs();
        obj4.inputs();
        obj5.inputs();
        System.out.println("eneter a choice to display the names ");
        System.out.println("1 for boys \n 2 for girls \n 3 for both");

        int a=sc.nextInt();
        switch (a) {
            case 1:
                obj1.display(a);
                obj2.display(a);
                obj3.display(a);
                obj4.display(a);
                obj5.display(a);

                break;
            case 2:
                obj1.display(a);
                obj2.display(a);
                obj3.display(a);
                obj4.display(a);
                obj5.display(a);
                
                break;
        case 3:
                obj1.display(a);
                obj2.display(a);
                obj3.display(a);
                obj4.display(a);
                obj5.display(a);
                break;
        
            default:
                System.out.println("enter a valid option");
                break;
        }

        
    
    }
}
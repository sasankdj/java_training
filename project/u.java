import java.util.ArrayList;
import java.util.Scanner;

class user{
    String name;
    int score;
    user(String name , int score){
        this.name= name;
        this.score= score;

    }
}
public class u {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter details to signup");
        user u1= new user(sc.next(),0);
        ArrayList<user> users = new ArrayList<>();
        users.add(u1);

        // for (user user : users) {
        //     System.out.println(user.name +" "+ user.score);
        // }
        System.out.println(users.get(0));
    }
}

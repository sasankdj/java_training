//cja where we have 3 interfaces which contains 2 abstarct methods 1 defined method in each then inherit these 3 interfaces into 1 abstract class which contains 1 abstarct method, parameterised constructor then inherit this class into 3 concrete classes provide implementation for all abstract methods we also have another class test which contains 1 user defined method name display haing abstarct class as parameter and returns any one of the interface we need to invoke all the props by using parameter in display method invoke display method under main method by passing abstarct class obj as arguement according to the user choice 
import java.util.*;
interface I1
{
    Scanner sc=new Scanner(System.in);
    int m1(String a);
    String m2(float a);
    static long m3(short a)
    {
        System.out.println(a);
        return sc.nextLong();
    }
}
interface I2
{
    float m4(double a);
    int m5(char a);
    default float m6(int a)
    {
        System.out.println(a);
        return I1.sc.nextFloat();
    }
}
interface I3
{
    double m7(float a);
    char m8(double a);
    default String m9(int a)
    {
        System.out.println(a);
        return I1.sc.next();
    }
}
abstract class Ab implements I1,I2,I3
{
    abstract double m10(float a);
    Ab(boolean a)
    {
        System.out.println(a);
    }
}
class CC1 extends Ab
{
    CC1()
    {
        super(sc.nextBoolean());
        System.out.println("CC1");
    }
    public int m1(String a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    public String m2(float a)
    {
        System.out.println(a);
        return sc.next();
    }
    public float m4(double a)
    {
        System.out.println(a);
        return sc.nextFloat();
    }
    public int m5(char a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    public double m7(float a)
    {
        System.out.println(a);
        return sc.nextDouble();
    }
    public char m8(double a)
    {
        System.out.println(a);
        return sc.next().charAt(0);
    }
    double m10(float a)
    {
        System.out.println(a);
        return sc.nextDouble();
    }
}
class CC2 extends Ab
{
    CC2()
    {
        super(sc.nextBoolean());
        System.out.println("CC2");
    }
    public int m1(String a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    public String m2(float a)
    {
        System.out.println(a);
        return sc.next();
    }
    public float m4(double a)
    {
        System.out.println(a);
        return sc.nextFloat();
    }
    public int m5(char a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    public double m7(float a)
    {
        System.out.println(a);
        return sc.nextDouble();
    }
    public char m8(double a)
    {
        System.out.println(a);
        return sc.next().charAt(0);
    }
    double m10(float a)
    {
        System.out.println(a);
        return sc.nextDouble();
    }
}
class CC3 extends Ab
{
    CC3()
    {
        super(sc.nextBoolean());
        System.out.println("CC3");
    }
    public int m1(String a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    public String m2(float a)
    {
        System.out.println(a);
        return sc.next();
    }
    public float m4(double a)
    {
        System.out.println(a);
        return sc.nextFloat();
    }
    public int m5(char a)
    {
        System.out.println(a);
        return sc.nextInt();
    }
    public double m7(float a)
    {
        System.out.println(a);
        return sc.nextDouble();
    }
    public char m8(double a)
    {
        System.out.println(a);
        return sc.next().charAt(0);
    }
    double m10(float a)
    {
        System.out.println(a);
        return sc.nextDouble();
    }
}
public class apr7_1
{
    static Scanner sc=I1.sc;
    static I1 display(Ab obj)
    {
        System.out.println(obj.m1(sc.next()));
        System.out.println(obj.m2(sc.nextFloat()));
        System.out.println(I1.m3(sc.nextShort()));
        System.out.println(obj.m4(sc.nextDouble()));
        System.out.println(obj.m5(sc.next().charAt(0)));
        System.out.println(obj.m6(sc.nextInt()));
        System.out.println(obj.m7(sc.nextFloat()));
        System.out.println(obj.m8(sc.nextDouble()));
        System.out.println(obj.m9(sc.nextInt()));
        System.out.println(obj.m10(sc.nextFloat()));
        return obj;
    }
	public static void main(String[] args) 
	{
		System.out.println("1 - CC1\n2 - CC2\n3 - CC3");
		int n=sc.nextInt();
		if(n==1)
		{
		    display(new CC1());
		}
		else if(n==2)
		{
		    display(new CC2());
		}
		else if(n==3)
		{
		    display(new CC3());
		}
		else
		{
		    System.out.println("Invalid input try again :)");
		    main(args);
		}
	}
}


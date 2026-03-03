public class twostaticand2nonstatic {
    int roll;
    int batch;
    static String name="cvcorp";
    static String sname; 
    public static void main(String[] args) {
        // System.out.println(name);
        twostaticand2nonstatic s1= new twostaticand2nonstatic();
        s1.roll=10;
        s1.batch=251;
        sname="sasank";
        System.out.println(s1.roll+":"+s1.batch +":"+name +":"+sname);
    }
}

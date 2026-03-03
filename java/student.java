public class student {
    static int batch_name=251;
    String name;
    public void show(){
        System.out.println(batch_name+":"+name);
    
    }
    public static void main(String[] args) {
        student s1=new student();
        student s2=new student();
        student s3=new student();
        s1.name="bhargav ";
        s1.show();
        s2.name="adil";
        s2.show();
        s3.name="rupesh";
        s3.show();
        
    }
}

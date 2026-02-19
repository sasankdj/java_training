public class cv3 {
    static String courseName;
    static String mentor;
    int marks ;
    int batch;
    public static void main(String[] args) {
        String course="java";
        System.out.println(course);
        cv3 obj = new cv3();
        System.out.println("without initialisation");
        System.out.println(courseName+":"+mentor);
        System.out.println("Batch "+obj.batch+":"+obj.marks );
       courseName="Core java";
        mentor="Charan sir";
         obj.marks=99;
         obj.batch=251;
        System.out.println("with initialisation");

         System.out.println(courseName+":"+mentor);
        System.out.println("Batch "+obj.batch+":"+obj.marks );
        
        
    }
}

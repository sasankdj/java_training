class SmartCalc{
    static float rate=10.3f;
    boolean m1(float f, int i ){
        if((f+rate )>i){
            return true;
        }
        return false;
    } 
    float m2(String s , double d){
        if(s==null){

            return 0; 
        }
        else
            return (s.length()*rate)+(float)d;
    }

}
public class TestApp {
        public static void main(String[] args) {
        SmartCalc s1=new SmartCalc();
       System.out.println(s1.m1(10.2f, 4)) ;
        System.out.println(s1.m2("sasank", 35.22222222));
    }
}

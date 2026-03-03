class calc{
    boolean m1(float f ,int i ){
        if(f>i){
            return true;
        }
        else{
            return false;
        
        }
    }
    float m2(String s,double d){
    return s.length()+(float)d;
    }
}
class feb16_p{
    public static void main(String[] args) {
        calc c1= new calc();
       System.out.println(c1.m1(10.2f,2)); 
        System.out.println(c1.m2("sasank",10.2));
    


    }
}
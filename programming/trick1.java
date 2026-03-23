class trick1{
    static void pattern(int n){
        int var=0;
        int i=1;
        while(true){
            int mul=5*i;
            if(mul>n)break;
            System.out.println(mul);
           if(i%2==1){
            var=mul+1;
            i++;

           }
           else{

            var=mul+2;
            i++;
           }
           if(var>n)break;
           System.out.println(var);
            
        }
        
    }
    public static void main(String[] args) {
        pattern(22);
    }
}
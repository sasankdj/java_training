public class apr20_2 {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            if((i&1)==0){
                try {
                    
                    throw new StringIndexOutOfBoundsException();
                } catch (StringIndexOutOfBoundsException e) {
                    System.out.println(e);
                }

            }
            else{
                try {
                    
                    throw new ArrayIndexOutOfBoundsException();
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

public class apr21_2 {
    static void print() throws InterruptedException{
        for (int i = 0; i < 10; i++) {
            System.out.print(i+" ");
            Thread.sleep(1000);
        }
    }
    public static void main (String[] args) throws Exception {
        print();
    }
}

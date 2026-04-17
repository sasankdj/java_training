public class apr16_2 {
    String s;
    apr16_2(String s){
        this.s=s;
    }
    public String toString(){
        return s;
    }
    public static void main(String[] args) {
        apr16_2 obj = new apr16_2("hello");
        System.out.println(obj);
    }
}

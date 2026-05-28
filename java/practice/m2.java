
abstract class login{
    private String uname;
    private int pin;
    login(String uname,int pin){
        this.uname=uname;
        this.pin=pin;
    }
    abstract void validate(String s, int i);

}

class fb extends login{
    public void validate(String s,  int i){
System.out.println(s+" "+i);

    }
}

package lab1;


public class MyClass {
    int x;
    String s;
    double d = 1.52;

    public MyClass(){
        this.x = 5;
        this.s = "Johnny";
    }


    public MyClass(int x, String s){
        this.x = x;
        this.s = s;
    }

    public int getX(){
        return x;
    }
    public void printS(){
        System.out.println(s);
    }

}

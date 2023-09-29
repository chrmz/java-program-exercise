package lab1;


public class MyMain {

    public static void main(String[] args) {
        MyClass mc1 = new MyClass();
        mc1.printS();

        MyClass mc2 = new MyClass(5, "Billy");

        mc2.d = 2.5;
        System.out.println(mc2.getX());
       //Yes we can print the value of x through its getter method

        // variable d can be accessed outside lab1.MyClass through the instance variable i.e. mc2.d .This is because variable d has a public access
        // If we change its access to private, then we will not be able to access it unless we create a public getter method for it.
        //However it is bad practice to access member variables directly.

        //Variable d can be modified out site the class without modifying lab1.MyClass by setting its value directly through the
        //class instance i.e.  mc2.d = 2.5; this is because it has a public access. if we change it to private, then it will
        //on be possible to modify it through a public setter method

    }
}

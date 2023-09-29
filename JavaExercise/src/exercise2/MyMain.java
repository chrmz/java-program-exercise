package lab3;

import javax.swing.*;


public class MyMain {

    public static void main(String[] args) {
        //create a new instance of MyComponent
        MyComponent myComponent = new MyComponent();

        //create a new instance of JFrame
        JFrame jFrame = new JFrame();

        //add myComponet to the instance of JFrame
        jFrame.add(myComponent);

        //set width and height to 200px
        jFrame.setSize(200, 200);

        //center the jframe
        jFrame.setLocationRelativeTo(null);

        //set the jframe visible
        jFrame.setVisible(true);

        //ensure the application closes on close
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

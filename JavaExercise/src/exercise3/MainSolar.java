package lab4;


import javax.swing.*;


public class MainSolar {


    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Solar System");
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // add the JComponent to main frame
        SolarDisplay solarDisplay = new SolarDisplay();
        frame.add(solarDisplay);
        solarDisplay.setSize(frame.getSize());
        solarDisplay.createCircles();
        frame.setVisible(true);



    }
}
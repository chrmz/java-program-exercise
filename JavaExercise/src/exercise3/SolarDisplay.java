package lab4;

import javax.swing.*;
import java.awt.*;
import java.util.*;

public class SolarDisplay extends JComponent {

    //List containing all the celestial bodies
    private java.util.List<Circle> celestialBodies;


    public SolarDisplay()
    {
        this.celestialBodies = new ArrayList<>();
    }

    public void createCircles()
    {
        // Determine the center of the panel
        int cntrX = getWidth()/2;
        int cntrY = getHeight()/2;

        // Calculate the radius
        int sunRadius = 50;


        Circle sun = new Circle(cntrX-sunRadius, cntrY-sunRadius, sunRadius,   Color.YELLOW);

        int planetsRadius = 10;
        double mercuryOrbit = 0.387;
        double venusOrbit = 0.723;
        double earthOrbit = 1.0;
        double marsOrbit = 1.524;


        //creating more celestial bodies
        Circle mercury = new Circle(90, 130,  planetsRadius,  0.387,  0.2409,  1.607, Color.ORANGE);
        Circle venus = new Circle(100, 150, planetsRadius, 0.723, 0.616, 1.174,  Color.YELLOW);
        Circle earth = new Circle(120, 170, planetsRadius,  1.0,1.,1.000, Color.BLUE);
        Circle mars = new Circle(130, 190, planetsRadius,  1.524, 1.9, 0.802, Color.RED);

        celestialBodies.add(sun);
        celestialBodies.add(mercury);
        celestialBodies.add(venus);
        celestialBodies.add(earth);
        celestialBodies.add(mars);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Circle circle : celestialBodies) {
            circle.draw(g);
        }
        repaint();
    }
}
package lab4;


import java.awt.*;

/**
 * Circle object representing each celestial body
 */
public class Circle {

    private int x,y,radius;
    private double velX, velY, speed;
    private Color color;


    public Circle(int x, int y, int radius, Color color) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        this.color = color;
        this.velX = 0;
        this.velY = 0;
        this.speed = 0;
    }

    public Circle(int x, int y, int radius, double velX, double velY, double speed, Color color) {
        this(x, y, radius, color);
        this.velX = velX;
        this.velY = velY;
        this.speed = speed;
    }

    public void move()
    {
        this.x += velX;
        this.y += velY;
    }

    public void draw(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(color);
        g2.fillOval(x,y,radius*2,radius*2);
    }
}


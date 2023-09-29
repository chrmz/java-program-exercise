package lab3;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.*;

public class MyComponent extends JComponent {

    //create a HasSet if type object because we want to boh integer and char in the this set
    private Set<Object> mySet = new HashSet<>();

    //Create a map of key MyEventInfo and value Integer to store the number of time an event info has occurred
    private Map<MyEventInfo, Integer> eventInfoMap = new HashMap<>();

    public MyComponent() {
        // we set focusable to true so the component can listen to key pressed events
        setFocusable(true);

        //create a new mouse listener event
        MouseListener mouseListener = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {}

            @Override
            public void mousePressed(MouseEvent e) {

                //add the mouse button clicked to the hashset
                mySet.add(e.getButton());

                //create a new instance of MyEvenInfo of type mouse event and the mouse button clicked
                MyEventInfo info = new MyEventInfo(MyEventInfo.EventTye.MOUSE, e.getButton());

                //if the mouse event exists in the eventInfoMap  increment its value or else insert a new mouse event into the map and initiates its value to 1
                eventInfoMap.merge(info, 1, Integer::sum);
            }

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }
        };


        KeyListener keyListener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {

                //check if the key pressed is enter then print myset and the sorted eventInfoMap
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    //print the hashSet
                    System.out.println(mySet);
                    //print the map using a tree map as it sorts by the Comparator provided at in MyEventInfo
                    System.out.println(new TreeMap<>(eventInfoMap));
                } else {
                    //add the key pressed to the set
                    mySet.add(e.getKeyChar());

                    //create a new instance of MyEvenInfo of type key  event and the key button pressed
                    MyEventInfo info = new MyEventInfo(MyEventInfo.EventTye.KEY, e.getKeyChar());

                    //if the key event exists in the eventInfoMap  increment its value or else insert a new key event into the map and initiates its value to 1
                    eventInfoMap.merge(info, 1, Integer::sum);
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
            }
        };

        //attach the mouse listener created to this instance of myComponent
        addMouseListener(mouseListener);

        //attach the key listener created to this instance of myComponent
        addKeyListener(keyListener);
    }

}

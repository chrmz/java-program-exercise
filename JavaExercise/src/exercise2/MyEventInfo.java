package lab3;

import java.util.Objects;

public class MyEventInfo implements Comparable<MyEventInfo>{

    //create an enum do differentiate the event type
    enum EventTye{
        MOUSE,
        KEY
    }

    private EventTye evenType;
    private int eventValue;

    //A constructor that takes in an eventType and eventValue
    public MyEventInfo(EventTye evenType, int eventValue)
    {
        this.evenType  = evenType;
        this.eventValue = eventValue;
    }

    @Override
    public int compareTo(MyEventInfo other) {

        //first compare the event type name, if they are the same the compare its values
       int returnVal = other.evenType.name().compareTo(this.evenType.name());
        if(returnVal == 0)
        {
             returnVal = this.eventValue - other.eventValue;
        }
        return returnVal;
    }


    @Override
    public String toString()
    {
        //override the toString method of this object to print the Mouse button or key and its value
        return evenType.equals(EventTye.MOUSE)? "“MouseButton " + eventValue :  " Key " + (char) eventValue;
    }

    //override the equals  so we can check if the instance of this object is the same as another instance with the same eventType and eventValue
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEventInfo that = (MyEventInfo) o;
        return eventValue == that.eventValue && evenType == that.evenType;
    }

    //override the hasCode method so it does not return a new hashCode for each object
    @Override
    public int hashCode() {
        return Objects.hash(evenType, eventValue);
    }
}

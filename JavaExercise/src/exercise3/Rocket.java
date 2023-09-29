package lab4;


public class Rocket {

    private int[] payload;

    public Rocket(int[] payload) //constructor that takes in payload array
    {
        this.payload = payload; // assign the payload array to the payload of a Rocket instance
    }

    public int getLaunchWeight()
    {
        int sum = 0;

        for (int i : payload) { // loop through the values of payload
            sum += i; // add the index value the new value of sum
        }

        return sum; // return the value of sum
    }

    public double getAverageWeight()
    {
        // return the sum of all values in payload and divide by the number of items it has to get its average
        return  (double)getLaunchWeight() / payload.length;
    }

    public int getMaxWeight()
    {
        int max = 0; //initialise max with zero
        for (int i : payload) { // loop through the values of payload
            if (i > max) { // if the value of this index is greater than max
                max = i; // swap max to the new value
            }
        }
        return max; //return max
    }

    public int getMinWeight()
    {
        int min = payload[0]; //initialise min to the first index value of the array
        for (int j : payload) { // loop through the values of payload
            if (j < min) { // if the value of this index is less than min
                min = j; // swap min to the new value
            }
        }
        return min; //return min
    }

    public void printCountdown(int time)
    {
        if(time < 1) // if time is less than 0 print invalid time
        {
            System.out.println("Invalid time");
        }
        else {
            for (int i = 0; i <= time; i++)
            {
                //loop from 0 to value of time and if time minus the value of i is 0 then print 'List off'
                // or else subtract value of i from time and print the result.
                int currentTime = (time - i);
                System.out.println( currentTime == 0? "Lift off!" :  String.valueOf(currentTime));
            }
        }

    }

    //created a getter for payload in order to access it outside this lass as payload property is private
    // and it is best practice not to access instance properties directly by making them public
    public int[] getPayload() {
        return payload;
    }
}

package lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Crew {
    private static final String[] RANK = {"Commander", "Pilot", "Payload Commander",
            "Mission Specialist", "Spaceflight Participant"};
    private String[] nationalities;
    private List<Astronaut> crew ;

    //Constructor that  takes in nationalities file path
    public Crew(String nationalitiesFilePath) {
        this.nationalities = readNationalities(nationalitiesFilePath);
        this.crew = generateAstronauts();

    }

    public void printCrew()
    {
        System.out.println(crew);
    }

    public void sortCrew()
    {
        Collections.sort(crew);
    }

    public void shuffleCrew()
    {
        Collections.shuffle(crew);
    }

    public Map<String , Astronaut> assembleMissionCrew()
    {
        Map<String, Astronaut> astronautMap = new HashMap<>();
        for (String s : RANK) {
            astronautMap.put(s, getRandomAstronaut(s));
        }
        return astronautMap;
    }

    private Astronaut getRandomAstronaut(String rank)
    {
        List<Astronaut> filteredCrew = new ArrayList<>();

        //filter astronaut of type rank
        for (Astronaut astronaut : crew) {
            if(astronaut.getRank().equals(rank))
            {
                filteredCrew.add(astronaut);
            }
        }

        //generate a random number between 0 and the size of the filteredCrew
        int index = ThreadLocalRandom.current().nextInt(filteredCrew.size());

        //return a random crew member
        return  filteredCrew.get(index);
    }

    private String[] readNationalities(String nationalitiesFilePath) {
        List<String> temps = new ArrayList<>(); // a temporary array list to stores the libes in the file
        try {

            //read file from disk add add each line into the temp array list
            File file = new File(nationalitiesFilePath);
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                temps.add(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //convert the arraylist to a string array and return it
        return temps.toArray(new String[0]);
    }

    private List<Astronaut> generateAstronauts() {
        List<Astronaut> astronauts = new ArrayList<>();
        // for each rank create all nationalities in the nationaliites array with random ages between 20 to 50
        for (int i = 0; i < RANK.length; i++) {
            for (int j = 0; j < nationalities.length; j++) {
                astronauts.add(new Astronaut(nationalities[j], RANK[i],
                        i, ThreadLocalRandom.current().nextInt(20, 50)));
            }

        }

        return astronauts;
    }


}

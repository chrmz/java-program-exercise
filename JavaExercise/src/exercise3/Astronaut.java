package lab4;

import java.util.Objects;

public class Astronaut implements Comparable<Astronaut> {
    private String nationality;
    private String rank;
    private int rankNum;
    private int age;

    public Astronaut(String nationality, String rank, int rankNum, int age) {
        this.nationality = nationality;
        this.rank = rank;
        this.rankNum = rankNum;
        this.age = age;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return rank + " (" + nationality + ", " + age + ")";
    }

    @Override
    public int compareTo(Astronaut other) {
        int i = rank.compareTo(other.rank);
        if (i != 0) return i;

        i = nationality.compareTo(other.nationality);
        if (i != 0) return i;

        return Integer.compare(age, other.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        Astronaut astronaut = (Astronaut) o;
        return age == astronaut.age && Objects.equals(nationality, astronaut.nationality) && Objects.equals(rank, astronaut.rank);
    }

}

package Exercises;

public class TakeaTenMinutesWalk {
    //https://www.codewars.com/kata/54da539698b8a2ad76000228/train/java

    public boolean isValid(char[] walk) {

        int north = 0;
        int south = 0;
        int west = 0;
        int east = 0;

        if(walk.length != 10){
            return false;
        }

        for (int i = 0; i < walk.length; i++) {
            if (walk[i] == 'n')
                north += 1;
            if (walk[i] == 's')
                south += 1;
            if (walk[i] == 'w')
                west += 1;
            if (walk[i] == 'e')
                east += 1;
        }

        if(north - south == 0 && west - east == 0)
            return true;

        return false;
    }

}

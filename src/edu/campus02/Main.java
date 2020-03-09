package edu.campus02;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int moisture = 90;
        int duration = castingtime(moisture);
        if (moisture > 75)
            System.out.println("Humidity is greater than 75% and therefore the plant does not need to be watered!");
        else
            System.out.println("The plant will be watered for "+duration+" second(s) because the humidity is "+moisture+"%");
        int plant = 4;
        int water = fertiliser(plant);
        if (plant == 3)
            System.out.println("Plant 3 does not require any fertiliser!");
        else
            System.out.println("Plant "+plant +" will receive fertiliser diluted with "+water+"% water");
    }
    public static int fertiliser (int plant){
        int water = 0;
        switch (plant){
            case 1:
                water = 99;
                break;
            case 2:
                water = 95;
                break;
            case 3:
                water = 100;
                break;
            case 4:
                water = 98;
                break;
            default:
                water = 99;
                break;
        }
        return water;
    }
    public static int castingtime(int moisture){
        int duration;
        if (moisture <=20)
            duration = 5;
        else if (moisture >20 && moisture <=40)
            duration = 3;
        else if (moisture > 40 && moisture <=75)
            duration = 1;
        else
            duration = 0;
        return duration;
    }
}
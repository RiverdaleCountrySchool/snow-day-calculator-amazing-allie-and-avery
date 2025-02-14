package PACKAGE_NAME;

public class SnowDayCalculator {
    public static void main(String[] args) {
     /*
     first argument  1-24
     second argument 1-365
     third argument infinity
     fourth argument 1-100
     fifth argument 1-5
     sixth argument l or m or h
      */

        double endOfStorm = (double)Integer.parseInt(args[0]);
        double endOfStormValue = 0; //how much the end of storm will impact the final percentage
        double amountOfSnowDays = (double)Integer.parseInt(args[1]);
        double amountOfSnowDaysValue = 0; //how much the number of snow days will impact the final percentage
        double tempAt7 = (double)Integer.parseInt(args[2]);
        double tempAt7Value = 0; // how much the temperature will impact the final percentage
        double stormChance = Double.parseDouble(args[3]);
        double stormChanceValue = 0; //how much the possibility of a storm will impact the final percentage
        double leniencyOfAdmin = (double)Integer.parseInt(args[4]);
        double leniencyOfAdminValue = 0; //how much the leniency of the administration will impact the final percentage
        char snowLevel = args[5].charAt(0);
        double snowLevelValue = 0; //how much the leniency of the administration will impact the final percentage
        double finalPercentage;

        if (endOfStorm > 8 && endOfStorm < 15) {
            endOfStormValue = 90; // if the storm ends from 8am-3pm
        } else if (endOfStorm > 16 && endOfStorm < 24) {
            endOfStormValue = 20; // if the storm ends from 4pm-12am
        } else if (endOfStorm > 1 && endOfStorm < 7) {
            endOfStormValue = 30; // if the storm ends from 1am-7am
        } else {
            System.out.println("Your value is invalid");
                    return;
        }

        if (amountOfSnowDays > 0 && amountOfSnowDays < 3) {
            amountOfSnowDaysValue = 90; // if the school has had less than three snow days
        } else if (amountOfSnowDays > 4 && amountOfSnowDays < 10) {
            amountOfSnowDaysValue = 40; // if the school has had more than 4 but less than 10 school days
        } else if (amountOfSnowDays > 10) {
            amountOfSnowDaysValue = 10; // if the school has had more than 10 school days
        }else{
            System.out.println("Your value is invalid. Please provide a number from 1-365");
            return;
        }

        if (tempAt7 < 20) {
            tempAt7Value = 90; // if the temperature is below 20 degrees
        } else if (tempAt7 > 20 && tempAt7 < 32) {
            tempAt7Value = 60; // if the temperature is above 20 and below 32
        } else if (tempAt7 > 32) {
            tempAt7Value = 10; // if the temperature is above 32
        } else {
            System.out.println("Your value is invalid.");
            return;
        }

        if (stormChance > 80) {
            stormChanceValue = 90; // if the chance of a snow is greater than 80
        } else if (stormChance > 50 && stormChance < 80) {
            stormChanceValue = 50; // if the chance of snow is greater than 50 but less than 80
        } else if (stormChance > 1 && stormChance < 50) {
            stormChanceValue = 10; // if the chance of snow is greater than 1 but less than 50
        } else {
            System.out.println ("Your value is invalid.");
            return;
        }

        if (leniencyOfAdmin == 1) {
            leniencyOfAdminValue = 20; // if the leniency of the admin is 1
        } else if (leniencyOfAdmin == 2) {
            leniencyOfAdminValue = 40; // if the leniency of the admin is 2
        } else if (leniencyOfAdmin == 3) {
            leniencyOfAdminValue = 60; // if the leniency of the admin is 3
             leniencyOfAdminValue = 80; // if the leniency of the admin is 4
        } else if (leniencyOfAdmin == 5) {
            leniencyOfAdminValue = 100; // if the leniency of the admin is 5
        } else {
            System.out.println ("Your value is invalid");
            return;
        }

        if (snowLevel == 'l') {
            snowLevelValue = 10;
        } else if (snowLevel == 'm') {
            snowLevelValue = 50;
        } else if (snowLevel == 'h') {
            snowLevelValue = 90;
        } else {
            System.out.println("Your value is invalid.");
            return;
        }
        finalPercentage = (endOfStormValue * .1) + ((double)amountOfSnowDaysValue * .05) + ((double)tempAt7Value * .25) + ((double)stormChanceValue *.2) + ((double) leniencyOfAdminValue * .1) + ((double) snowLevelValue *.25);
        System.out.println ("The odds of having a snow day are " + finalPercentage + "%.");

    }
}

package org.fasttrackit;

public class Rescurer extends People {

    Animal animal;
    private double remainingTimePlay;
    private double totalDurationPlay;
    private double maxMinutesPlay;
    private double maxFedUp;
    private double levelFed;
    private double maxHappy;
    private double levelHappy;
    private double levelFood;
    private double money;

    public Rescurer(Animal animal) {
        this.animal = animal;
    }


    public void feeds(Animal animal, double fedUp) {
        if (levelFed <= 0) {

            System.out.println(" The animal need food ");
        }

        if (fedUp > maxFedUp) {

            System.out.println(" The " + animal + " is feed ");
        }
        levelFed = levelFed + fedUp;

        System.out.println(" The level fed is : " + levelFed);

        levelFood = levelFood - fedUp;

        System.out.println(" Remaining food : " + levelFood);

    }

    public void happy(Animal animal, double makeHappy) {
        if (levelHappy <= 0) {
            System.out.println(" The animal need more happy.");
        }

        if (makeHappy > maxHappy) {

            System.out.println(" The " + animal + " is happy.");
        }

        levelHappy = levelHappy + makeHappy;

        System.out.println(" The level happy is : " + levelHappy);

    }

    public void play(Animal animal, double gameRound, double durationInMinutes) {

        if (durationInMinutes > maxMinutesPlay) {

            System.out.println(" You have reached the maximum playing time ");
        }
        System.out.println(getName() + " play with " + animal + "for" + durationInMinutes + " m.");

        double minutes = gameRound * durationInMinutes;

        System.out.println(" You played  : " + minutes + " minutes.");

        totalDurationPlay = totalDurationPlay + minutes;

        System.out.println(remainingTimePlay);

        remainingTimePlay = remainingTimePlay - minutes;

        System.out.println("Remaining time play  " + remainingTimePlay);

        levelHappy = 1 * minutes;

        System.out.println(levelHappy);

    }

    public double getRemainingTimePlay() {
        return remainingTimePlay;
    }

    public void setRemainingTimePlay(double remainingTimePlay) {
        this.remainingTimePlay = remainingTimePlay;
    }

    public double getTotalDurationPlay() {
        return totalDurationPlay;
    }

    public void setTotalDurationPlay(double totalDurationPlay) {
        this.totalDurationPlay = totalDurationPlay;
    }

    public double getMaxMinutesPlay() {
        return maxMinutesPlay;
    }

    public void setMaxMinutesPlay(double maxMinutesPlay) {
        this.maxMinutesPlay = maxMinutesPlay;
    }

    public double getMaxFedUp() {
        return maxFedUp;
    }

    public void setMaxFedUp(double maxFedUp) {
        this.maxFedUp = maxFedUp;
    }

    public double getLevelFed() {
        return levelFed;
    }

    public void setLevelFed(double levelFed) {
        this.levelFed = levelFed;
    }

    public double getMaxHappy() {
        return maxHappy;
    }

    public void setMaxHappy(double maxHappy) {
        this.maxHappy = maxHappy;
    }

    public double getLevelHappy() {
        return levelHappy;
    }

    public void setLevelHappy(double levelHappy) {
        this.levelHappy = levelHappy;
    }

    public double getLevelFood() {
        return levelFood;
    }

    public void setLevelFood(double levelFood) {
        this.levelFood = levelFood;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Rescurer{" +
                "remainingTimePlay=" + remainingTimePlay +
                ", totalDurationPlay=" + totalDurationPlay +
                ", maxMinutesPlay=" + maxMinutesPlay +
                ", maxFedUp=" + maxFedUp +
                ", levelFed=" + levelFed +
                ", maxHappy=" + maxHappy +
                ", levelHappy=" + levelHappy +
                ", levelFood=" + levelFood +
                ", money=" + money +
                '}';
    }
}

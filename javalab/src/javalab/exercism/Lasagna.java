package javalab.exercism;

public class Lasagna {
    // TODO: define the 'expectedMinutesInOven()' method

    // TODO: define the 'remainingMinutesInOven()' method

    // TODO: define the 'preparationTimeInMinutes()' method

    // TODO: define the 'totalTimeInMinutes()' method

    public int expectedMinutesInOven() {
        return 40;
    }

    public int remainingMinutesInOven(int minutesInOven) {
        int expectedMinutes = expectedMinutesInOven();

        return expectedMinutes - minutesInOven;
    }

    public int preparationTimeInMinutes(int numberOfLayers) {
        return numberOfLayers * 2;
    }

    public int totalTimeInMinutes(int numberOfLayer, int timeInOven) {
        int preparationTime = preparationTimeInMinutes(numberOfLayer);

        return preparationTime + timeInOven;
    }
}

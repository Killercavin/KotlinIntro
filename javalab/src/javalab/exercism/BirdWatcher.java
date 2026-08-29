package javalab.exercism;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public static int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {
        boolean isPresent = false;

        for (int element : birdsPerDay) {
            if (element == 0) {
                isPresent = true;
                break;
            }
        }

        return isPresent;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int sum = 0;

        for (int i = 0; i < numberOfDays && i < birdsPerDay.length; i++) {
            sum = sum + birdsPerDay[i];
        }

        return sum;
    }

    public int getBusyDays() {
        int count = 0;

        for (int i : birdsPerDay) {
            if (i >= 5) {
                count ++;
            }
        }

        return count;
    }

    static void main() {
        int[] birdsPerDay = { 2, 5, 0, 7, 4, 1 };
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        IO.println(birdCount.getBusyDays());
    }
}
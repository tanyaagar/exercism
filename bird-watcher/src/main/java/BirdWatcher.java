import java.util.Arrays;
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        int size = birdsPerDay.length;
        int [] birdsLastWeek = Arrays.copyOfRange(birdsPerDay , size-7 , size );
        return birdsLastWeek;
    }

    public int getToday() {
        int size = birdsPerDay.length;
        if(size ==0)
            return 0;
        return birdsPerDay[birdsPerDay.length -1];
    }

    public void incrementTodaysCount() {
        int size = birdsPerDay.length;
        birdsPerDay[size-1] = birdsPerDay[size-1]+1;
    }

    public boolean hasDayWithoutBirds() {
        for(int i : birdsPerDay){
            if(i == 0)
                return true;
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        int [] lastweek = getLastWeek();
        int size = lastweek.length;
        if(numberOfDays > size)
            numberOfDays = size;
        for(int i = 0 ; i < numberOfDays ; i++)
            count +=lastweek[i];
        return count;
    }

    public int getBusyDays() {
        int busyCount = 0;
        for(int i : birdsPerDay){
            if(i>=5)
                busyCount++;
        }
        return busyCount;
    }
}

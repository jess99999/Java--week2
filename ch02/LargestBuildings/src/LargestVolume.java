public class LargestVolume extends Building{
    private int year;
    private int volume;
    
    public LargestVolume(String name, String country, String place, int year, int volume) {
        super(name, country, place);
        this.year = year;
        this.volume = volume;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "LargestVolume [volume=" + volume + ", year=" + year + "]";
    }
}

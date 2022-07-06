public class LargestFloorArea extends Building{
    private int floorArea;

    public LargestFloorArea(String name, String country, String place, int floorArea) {
        super(name, country, place);
        this.floorArea = floorArea;
    }

    public int getFloorArea() {
        return floorArea;
    }

    public void setFloorArea(int floorArea) {
        this.floorArea = floorArea;
    }

    @Override
    public String toString() {
        return "LargestFloorArea [floorArea=" + floorArea + "]";
    }

    
}

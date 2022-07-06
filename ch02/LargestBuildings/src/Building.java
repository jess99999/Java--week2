public class Building {
    private String name;
    private String country;
    private String place;
    
    public Building(String name, String country, String place) {
        this.name = name;
        this.country = country;
        this.place = place;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getPlace() {
        return place;
    }
    public void setPlace(String place) {
        this.place = place;
    }
    @Override
    public String toString() {
        return "Building [country=" + country + ", name=" + name + ", place=" + place + "]";
    }

    
}

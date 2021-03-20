package base.location;

public class Place implements Locatable{
    private String name;
    private PlaceType type;
    private double location_radius;
    private Location location;

    public Place(String name, PlaceType type,double lati, double longi, double location_radius) {
        this.name = name;
        this.type = type;
        this.location_radius = location_radius;
        this.location = new Location(lati, longi);
    }

    public String getName() {
        return name;
    }

    public PlaceType getType() {
        return type;
    }

    public double getLocation_radius() {
        return location_radius;
    }

    public Location getLocation() {
        return location;
    }
    
    @Override
    public double[] getLatLong() {
        return this.location.getLatLong();
    }

    @Override
    public void setLatLong(double lati, double longi) {
        this.location.setLatLong(lati, longi);
    }

    @Override
    public String toString() {
        return "{" + name + "," + location + '}';
    }
    
    
}

package base.location;

public class Location implements Locatable{
    private double[] latLong ;

    public Location(double[] latLong) {
        this.setLatLong(latLong);
    }

    public Location(double lati, double longi) {
        this.setLatLong(lati, longi);
    }

    public Location(Locatable location) {
        this.setLocation(location);
    }
    
    @Override
    public double[] getLatLong() {
        return this.latLong;
    }

    @Override
    public void setLatLong(double lati, double longi) {
        this.latLong= new double[]{lati,longi};
    }

    @Override
    public String toString() {
        return "("+this.latLong[0]+","+this.latLong[1]+")";
    }
    
    
}

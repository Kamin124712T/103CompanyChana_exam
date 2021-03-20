package base.location_log;
import base.location.Locatable;
import java.util.ArrayList;

public class LocationHistory  {

    private ArrayList<LocationLog> locations;

    public LocationHistory() {
        this.locations = new ArrayList<>();
    }

    public double[] getLastLatLong() {
        if (!this.locations.isEmpty()) {
            return this.locations.get(this.locations.size() - 1).getLocation().getLatLong();
        }
        return null;
    }


    public void addLocation(Locatable newLoc) {
        this.locations.add(new LocationLog(newLoc));
    }

    public ArrayList<LocationLog> getLocations() {
        return locations;
    }
    
}

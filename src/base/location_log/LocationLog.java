package base.location_log;

import base.location.Locatable;
import java.time.LocalDateTime;

public class LocationLog {
    private final Locatable locations;
    private final LocalDateTime dateTime;

    public LocationLog(Locatable locations) {
        this.locations = locations;
        this.dateTime = LocalDateTime.now();
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public Locatable getLocation() {
        return locations;
    }

    @Override
    public String toString() {
        return "LocationLog{" + "locations=" + locations + ", dateTime=" + dateTime + '}';
    }
    
}

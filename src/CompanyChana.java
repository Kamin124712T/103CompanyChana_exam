
import base.location.Locatable;
import base.user.User;
import base.location.Place;
import base.location.PlaceType;
import base.location.Location;
import base.location_log.LocationHistory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CompanyChana {

    public static void main(String[] args) {
        List<Place> knowPlaces = getKnownPlaceData();
        User ann = new User("Ann", "ann.mobile@kmutt.ac.th");
        LocationHistory annHistory = new LocationHistory();
        Locatable place = getNearestLocatable(Utility.getCurrentLocation(), knowPlaces.iterator());
        annHistory.addLocation(place);
        annHistory.addLocation(new Location(100, 10));
        annHistory.addLocation(new Location(15, 10));
        annHistory.addLocation(new Location(15, 10));

        System.out.println(annHistory.getLocations());

    }

    public static Locatable getNearestLocatable(Location location, Iterator<Place> places) {
        Place temp;
        while (places.hasNext()) {
            temp = places.next();
            if (temp.getDistanceFromLocationInKm(location) <= temp.getLocation_radius()) {
                return temp;
            }
        }
        return location;
    }

    public static List<Place> getKnownPlaceData() {
        List<Place> places = new ArrayList<>();
        places.add(new Place("SIT", PlaceType.UNIVERSITY, 13.6524564, 100.4929596, 2));
        places.add(new Place("Thonburirom Park", PlaceType.PARK, 13.6512366, 100.4909372, 2));
        return places;
    }

}

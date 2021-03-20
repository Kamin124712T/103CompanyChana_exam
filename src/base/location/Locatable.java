package base.location;


public interface Locatable {

    double[] getLatLong();
    void setLatLong(double lati,double longi);
    
    public default void setLocation(Locatable location) {
        this.setLatLong(location.getLatLong());
    }
    
    public default void setLatLong(double[] latLong){
        if(latLong == null) return;
        if(latLong.length!=2) return;
        this.setLatLong(latLong[0],latLong[1]);
    }
    
    public default double getDistanceFromLocationInKm(Locatable loc02) {
        return getDistanceFromLocationInKm(this,loc02); // Distance in km
    }

    public static double getDistanceFromLocationInKm(Locatable loc01, Locatable loc02) {
        // the shortest distance over the earth’s surface – using the ‘Haversine’ formula.
        double R = 6371; // Radius of the earth in km
        double dLat = deg2rad(loc02.getLatLong()[0] - loc01.getLatLong()[0]);  // deg2rad below
        double dLon = deg2rad(loc02.getLatLong()[1] - loc01.getLatLong()[1]);
        double a= Math.sin(dLat / 2) * Math.sin(dLat / 2)
                + Math.cos(deg2rad(loc01.getLatLong()[0])) * Math.cos(deg2rad(loc02.getLatLong()[0]))
                * Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return R * c; // Distance in km
    }

    public static double deg2rad(double deg) {
        return deg * (Math.PI / 180);
    }

}

package learning.com.learningandroidfeatures;

/**
 * Created by Ankit on 5/28/2017.
 */

public class Coord {

    private Float lon;
    private Float lat;

    public Float getLon() {
        return lon;
    }

    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Float getLat() {
        return lat;
    }


    public void setLat(Float lat) {
        this.lat = lat;
    }

    @Override
    public String toString() {
        return "Coord{" +
                "lon=" + lon +
                ", lat=" + lat +
                '}';
    }


}

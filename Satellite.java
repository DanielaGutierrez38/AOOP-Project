/**
 * The Satellite class represents a space object classified specifically as a satellite.
 * <p>
 * It extends the SpaceObject class but does not add new fields.
 * Satellites are treated differently from debris based on their intended function.
 * </p>
 * 
 * @author Caitlin Gregory
 * @author Daniela Gutierrez
 */

public class Satellite extends SpaceObject {

    /**
     * Constructs a Satellite object with the provided attributes.
     *
     * @param recordId Unique record ID of the satellite.
     * @param satelliteName Name of the satellite.
     * @param country Country of origin.
     * @param orbitType Orbit type (LEO, GEO, etc.).
     * @param launchYear Year the satellite was launched.
     * @param launchSite Code for the launch site.
     * @param longitude Current longitude of the satellite.
     * @param avgLongitude Average longitude over its orbit.
     * @param geohash Geospatial hash representing approximate location.
     * @param daysOld Number of days since launch.
     */
    public Satellite(String recordId, String satelliteName, String country, String orbitType,
                 int launchYear, String launchSite, double longitude, double avgLongitude,
                 String geohash, String hrrCategory, boolean isNominated,
                 boolean hasDossier, boolean isUnknownObject, int daysOld, int conjunctionCount) {
        super(recordId, satelliteName, country, orbitType, launchYear, launchSite,
            longitude, avgLongitude, geohash, hrrCategory, isNominated, hasDossier, isUnknownObject, daysOld, conjunctionCount);
    }
    @Override
    public void displayInfo() {
      System.out.println("Record ID: " + recordId);
      System.out.println("Satellite Name: " + satelliteName);
      System.out.println("Country: " + country);
      System.out.println("Orbit Type: " + orbitType);
      System.out.println("Launch Year: " + launchYear);
      System.out.println("Launch Site: " + launchSite);
      System.out.println("Longitude: " + longitude);
      System.out.println("Avg Longitude: " + avgLongitude);
      System.out.println("Geohash: " + geohash);
      System.out.println("Days Old: " + daysOld);
    }
}

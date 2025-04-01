//TODO: Finish METHODS, REWRITE THE BATTER LEVEL LOW WARNING IN A CLEANER MANNER

// Class Definition of GCSData
public class GCSData {

    //instance variables (our attributes of the GCS) or also known as field declaration
    private double altitude;
    private double speed;
    private int battery;
    private double gpsposition;
    private double heading;
    private long timestamp;

    //constructor for GCSData, initializing our objects fields (characteristics).
    public GCSData(double startAltitude, double startSpeed, int startBattery, double startGpsposition, double startHeading, long startTimestamp) {
        altitude = startAltitude;
        speed = startSpeed;
        battery = startBattery;
        gpsposition = startGpsposition;
        heading = startHeading;
        timestamp = startTimestamp;
    }
// Retrieving the instance variables from their private classes with getter methods.

    public double getAltitude() {
        return altitude;
    }

    public double getSpeed() {
        return speed;
    }

    public int getBattery() {
        return battery;
    }

    public double getGpsposition() {
        return gpsposition;
    }

    public double getHeading() {
        return heading;
    }

    public double getTimestamp() {
        return timestamp;
    }

    //add Methods below the getters due to writing conventions

    public boolean isBatteryLow() {
        return battery <= 25;
    }

    public void setBattery(int newBattery) {
        battery = newBattery;
    }

    public void setAltitude(double newAltitude) {
    altitude = newAltitude;
    }


    public static void main(String[] args) {

        //create object reference name --> myGCSData, and by saying --> new GCSData (the class name) we have created 1 object.

        GCSData myGCSData = new GCSData(1, 0.0, 30, 100, 0.0, 1); // these arguments now get passed to the parameters in the constructor

        // e.g. startAltitude = 0, then the constructor assigns them to the fields, altitude = startAltitude = 0
        double altimeter = myGCSData.getAltitude();
        {
            if (altimeter == 0)
                System.out.println("GROUNDED");

            if (altimeter >= 1 && altimeter <= 25)
                System.out.println("LOW ALTITUDE! ");
        }

        System.out.println("Altitude: " + myGCSData.getAltitude());
        System.out.println("Speed: " + myGCSData.getSpeed());
        System.out.println("Battery: " + myGCSData.getBattery());
        System.out.println("Is battery low? " + myGCSData.isBatteryLow());



        // start time
        long startTime = System.currentTimeMillis(); // this method currentTimeMillis is the active time right now

        // here is our loop that will check as the battery decays, down to 25, then report back a warning label
        while (true) {
            long elapsedTime = System.currentTimeMillis() - startTime; // takes current time and subtracts from loop start time

            System.out.println("Battery Level: " + myGCSData.getBattery() + "%");


            if (myGCSData.isBatteryLow()) {
                System.out.println("⚠️ WARNING: Battery Low!");
            }
            // Simulate battery draining (for demo/testing)
            int currentBattery = myGCSData.getBattery();
            if (currentBattery > 0) {
                myGCSData.setBattery(currentBattery - 1);
            }
            // Stop after 2 seconds
            if (currentBattery == 25) {
                System.out.println("Plug in Battery!");
                break; // this means once this part is TRUE we break out of the loop.
            }

        }
    }
}
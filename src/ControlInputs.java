//TODO: GETTERMETHODS, METHOD BEHAVIORS, CONDITIONS, OUTPUTS

public class ControlInputs {

// attributes of the Control Inputs

private double throttle;
private double roll;
private double pitch;
private double yaw;
private boolean returnHome;
private boolean arm;            // later on combine arm/disarm in one condition
private boolean disarm;

// Custom Enum 'Types' like int, string etc --> eg: variable 'Type' TakeOffStatus, where it can only be grounded or inflight

public enum TakeOffStatus {
    GROUNDED,
    INFLIGHT
}

public enum FlightStatus {
    INFLIGHT,
    GROUNDED
}

public enum FlightMode {
    LOITERING,
    MANUAL,
    AUTOPILOT
}

//Enum Fields --> These tell us what state to start it in, then we can change via methods when drone is moving

private TakeOffStatus takeOffStatus = TakeOffStatus.GROUNDED;
private FlightStatus flightStatus = FlightStatus.INFLIGHT;
private FlightMode flightMode = FlightMode.LOITERING;


//constructor

public ControlInputs(double startStopThrottle, double changeRoll, double changePitch, double changeYaw, boolean returnHome, boolean arm, boolean disarm) {
throttle = startStopThrottle;
roll = changeRoll;
pitch = changePitch;
yaw = changeYaw;
this.returnHome = returnHome;     // this.example allows us to call the field varibles without making a new varible for the constructor
this.arm = arm;
this.disarm = disarm;

//GETTER METHODS

//METHODS Below GETTERS

//OUTPUTS

//CONDITONALS
}
}
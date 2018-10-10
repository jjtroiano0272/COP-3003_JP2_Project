import java.util.regex.MatchResult;

public class VehicleChassis implements Chassis {
	
	/**
	 * === SPECS
	 * Create a String named chassisName instance variable.
	 *
	 */
	private String chassisName;

	/**
	 * A public default constructor and an overloaded constructor with the following value: A String
	 * with a parameter value of chassisName
	 * "Default" meaning the constructor that doesn't have any p[aramters.
	 * Same name, differnet number of things
	 * */
	// Public default constructor String chassisName gets the interface constant as its value.
	public VehicleChassis(){this.chassisName = chassis;}
	
	// Overloaded constructor where you pass in String chassisName
	public VehicleChassis(String chassisName) { this.chassisName = chassisName; }
	
	/**
	 *
	 * @return
	 * A public method named getChassisType that doesn't have a formal parameter and that returns an
	 * instance of the interface Chassis (hint that would be a copy of this class).
	 */
	public Chassis getChassisType() {
		return this;
	}
	
	/**
	 * A public method setChassisType that takes a String parameter vehicleChassis and that returns
	 * void. It should set the instance variable chassisName.
	 */
	public void setChassisType(String chassisName) {
		this.chassisName = chassisName;
	}


	/**
	 * A public toString method that returns the following:
	 *  Chassis Name  : Chassis
	 *
	 * Hardest part of the whole program.
	 */
	public String toString(){
		return "Chassis Name: Chassis";
	}
	
	
	/*Write a static main method that creates two objects, one with the default constructor and the other with the
	constructor with parameters.  Give sample
	data for the parameters.*/
	public static createTwoObjects() {
		// Default shit
		VehicleChassis(){ this.chassisName = chassis; }
		
		// Overloaded...do not know how the fuck to reference these from the above vehicleChassis
		// constructors.
		VehicleChassis(String chassisName) { this.chassisName = chassisName; }
		
		
	}
}

// you can't run or make an object when it's just an interface so you can't yet   do unit testing.
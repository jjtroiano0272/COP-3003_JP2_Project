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
	public VehicleChassis(String chassisName) {
		this.chassisName = chassisName; // ???
	}
	
	/**
	 *
	 * Set the chassisName instance variable in both, use the interface constant as the
	 */
	default String value. // MALFORMED!
	
	setChassisName(String chassisName) {
		this.chassisName = ; // this means were grabbing the one from the object; the class.
	}

	public void setChassisType(){}
	
	/**
	 *
	 * @return
	 * A public method named getChassisType that doesn't have a formal parameter and that returns an
	 * instance of the interface Chassis (hint that would be a copy of this class).
	 */
	public Chassis getChassisType() {
		return this;// hardest part of the whole program.
	}

	/**
	 * A public method setChassisType that takes a String parameter vehicleChassis and that returns
	 * void. It should set the instance variable chassisName.
	 * A public toString method that returns the following: Chassis Name        : Chassis
	 */
	public String soString(){ 
		return "Chassis Name: Chassis";
	}
	
	public getChassisType(){return this;}
	
	// Abstract method.
	// Doesn't belong in public interface Chassis.
	public void setChassisType(String vehicleChassis){
		this.chassis = vehicleChassis;
	}
	
}

// you can't run or makef an object when it's just an interface so you can't yetdo unit testing.
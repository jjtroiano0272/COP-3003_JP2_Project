public interface Chassis {

	// Because the interface is already public, setting these to public would be redundant.
	// Because this is an interface, the variable is already 'final', or constant by default.
	String chassis = "MFing chassis";
	
	/**
	 * Abstract METHODS here but not abstract CLASS!
	 * Abstract method CANNOT have a body. This is setting it up to be used in a class.
	 * @return
	 */
	
	/**
	 *
	 * The definition of a public getChassisType method that returns an instance of Chassis.
	 */
	Chassis getChassisType();
	
	void setChassisType(String vehicleChassis);
	
}

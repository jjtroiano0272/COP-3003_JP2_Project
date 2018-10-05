public class VehicleFrame implements Chassis {
	
	// Static being a class variable; nonstatic being for only the object.
	private String vehicleFrameType;
	
	/*
	Want default const. so don't initialize ANY fields
	Read instruction for rest here..
	*/
	
	// This is the default constructor, with an instance variable.
	public VehicleFrame(){String vehicleFrameType = "Unibody";}
	
	/**
	 * @param vehicleFrameType
	 *
	 * This is the overloaded constructor???
	 * This is where the user passes vehicleFrameType and the private class variable gets set to
	 * this arg.
	*/
	public VehicleFrame(String vehicleFrameType){
		// Don't think you'll need this one!
		// this.vehicleFrameType = vehicleFrameType;
		this.vehicleFrameType = vehicleFrameType;
	}
	
	/**
	 * Is supposed to return an instance of the interface...mais  commment how?
	 * Returns instance of..interface??? Here this keyword refers to Chassis, the interface
	 * implemented on this class
	 *
 	 */
	public Chassis getChassisType() {
		return this;
	}
	
	// ...Needed?
	/**
	 * A public method setChassisType that takes a String parameter vehicleFrameType and that
	 * returns a void. It should set the instance variable vehicleFrameType.
	 * this.vehicleFrameType sets the instance variable.
	 *
	 */
	@Override
	public void setChassisType(String vehicleFrameType){
		this.vehicleFrameType = vehicleFrameType;
	}
}

// Froms tep 4 create a vehicle frame with def constructor and.....
// Just use generate to do these. Along with toString
// You don't need a method that just prints the vehicle frame. Call that same toString on separate objects.A
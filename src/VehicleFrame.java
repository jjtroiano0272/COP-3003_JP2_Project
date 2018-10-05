public class VehicleFrame implements Chassis {
	
	// Static being a class variable; nonstatic being for only the object.
	private String vehicleFrameType;
	
	/**
	 * Default constructor with instance variable.
	 */
	public VehicleFrame(){this.vehicleFrameType = "Unibody";}
	
	/**
	 * @param vehicleFrameType
	 *
	 * This is the overloaded constructor???
	 * This is where the user passes vehicleFrameType and the private class variable gets set to
	 * this arg.
	 */
	public VehicleFrame(String vehicleFrameType){
		this.vehicleFrameType = vehicleFrameType;
	}
	
	/**
	 * Returns instance of the INTERFACE Chassis, even though this is called within a class.
 	 */
	public Chassis getChassisType() {
		return this;
	}
	
	/**
	 */
	@Override
	public void setChassisType(String vehicleFrameType){
		this.vehicleFrameType = vehicleFrameType;
	}
	
	@Override
	public String toString() {
		return "Chassis\t\t: "+chassis+
				"Vehicle Frame\t\t: "+vehicleFrameType+"\n\n";
	}

}

// Froms tep 4 create a vehicle frame with def constructor and.....
// Just use generate to do these. Along with toString
// You don't need a method that just prints the vehicle frame. Call that same toString on separate objects.A
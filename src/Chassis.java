public interface Chassis {

	public final String chassis = "MFing chassis";
	
	/**
	 *
	 * @return
	 * public abstract Chassis getChassisType(){
	 * return new Chassis();
	 * };
	 *
	 * Previous iteration of getChassisType; was abstract.
	 */
	/**
	 *
	 * @param vehicleChassis
	 *
	 * The definition of a public getChassisType method that returns an instance of Chassis.
	 */
	public getChassisType(){return this;}

	// Abstract method.
	public void setChassisType(String vehicleChassis){
		this.chassis = vehicleChassis;
	}

}

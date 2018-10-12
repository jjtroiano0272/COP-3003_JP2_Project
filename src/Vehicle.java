import java.util.Date;

public class Vehicle implements Engine, Chassis {
	
	// I think these declarations for INSTANCE VARIABLES are malformed...
	private Date       vehicleManufacturedDate;
	private String     vehicleManufacturer;
	private String     vehicleMake;
	private String     vehicleModel;
	private Chassis    vehicleFrame;
	private String     vehicleType;
	private String     driveTrain;
	private Engine     vehicleEngine;
	
	/**
	 * >>> "A public default constructor with no formal parameters and initialize all instance variables
	 * with generic literal values." <<<
	 *
	 *    NOTE: By 'generic literal values', they probably just mean DUMMY VARIABLES.
	 *
	 * The instance variable must be set something like...
	 *    this.variable = T;
	 *
	 * Here the form 'ClassName<>' is used instead of 'ClassName()'--meaning that '()' implies FORMAL
	 * PARAMETERS.
	 */
	public Vehicle<T> {
		this.vehicleManufacturedDate = new Date(); // This may or may not have
		this.vehicleManufacturer = "BSC Germany";
		this.vehicleMake = "Honda";
		this.vehicleModel = "Civics Class";
		this.vehicleFrame = vehicleFrame; // PROBABLY MALFORMED!!!
		this.vehicleType = "Sedan";
		this.driveTrain = "2WD";
		this.vehicleEngine = vehicleEngine;
	}
	
	/**
	 * >>> "A public overloaded constructor with values for all of the variables defined above." <<<
	 */
	// NO FUCKING CLUE WHAT I'M DOING HERE.
	
	
	
}

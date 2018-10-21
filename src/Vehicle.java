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
	public Vehicle() {
		this.vehicleManufacturedDate = new Date();
		this.vehicleManufacturer = "BSC Germany";
		this.vehicleMake = "Honda";
		this.vehicleModel = "Civics Class";
		this.vehicleFrame = new VehicleChassis(); // Heads up on this one.
		this.vehicleType = "Sedan";
		this.driveTrain = "2WD";
		this.vehicleEngine = new ManufacturedEngine();
	}
	
	/**
	 * >>> "A public overloaded constructor with values for all of the variables defined above." <<<
	 */
	public Vehicle(Date vehicleManufacturedDate, String vehicleManufacturer, String vehicleMake,
			String vehicleModel, Chassis vehicleFrame, String vehicleType, String driveTrain,
			Engine vehicleEngine) {
		this.vehicleManufacturedDate = vehicleManufacturedDate;
		this.vehicleManufacturer = vehicleManufacturer;
		this.vehicleMake = vehicleMake;
		this.vehicleModel = vehicleModel;
		this.vehicleFrame = vehicleFrame;
		this.vehicleType = vehicleType;
		this.driveTrain = driveTrain;
		this.vehicleEngine = vehicleEngine;
		
	}
	
	/**
	 * "Public method implementations for all of the public methods found in the Engine interface."
	 *
	 * Note on the form: these just basically set themselves. So in the first,
	 *    "this.vehicleEngine.setEngineCylinders(engineCylinders);"
	 * it sets the PRIVATE vehicleEngine variable belonging to the created object and accesses the
	 * setEngineCylinders method calling it, to have the engineCylinders being passed in.
	 **/
	public Chassis getChassisType() { return vehicleFrame.getChassisType(); }
	public void setEngineCylinders(int engineCylinders) {
		this.vehicleEngine.setEngineCylinders(engineCylinders);
	}
	public void setEngineManufacturedDate(Date date) {
		this.vehicleEngine.setEngineManufacturedDate(date);
	}
	public void setEngineManufacturer(String manufacturer) {
		this.vehicleEngine.setEngineManufacturer(manufacturer);
	}
	public void setEngineMake(String engineMake) {
		this.vehicleEngine.setEngineMake(engineMake);
	}
	public void setEngineModel(String engineModel) {
		this.vehicleEngine.setEngineModel(engineModel);
	}
	public void setDriveTrain(String driveTrain) {
		this.vehicleEngine.setDriveTrain(driveTrain);
	}
	public void setEngineType(String fuel) {
		this.vehicleEngine.setEngineType(fuel);
	}
	public void setChassisType(String vehicleChassis) {
		this.vehicleFrame.setChassisType(vehicleChassis);
	}
	
	/**
	 * "A public toString method that returns the following:
	 * Manufacturer Name : Generic
	 * Manufactured Date : Thu Feb 02 01:38:31 MST 2015
	 * Vehicle Make : Generic
	 * Vehicle Model : Generic
	 * Vehicle Type : None
	 * Engine Manufacturer : Generic
	 * Engine Manufactured : Thu Feb 02 01:38:31 MST 2015
	 * Engine Make : Generic
	 * Engine Model : Generic
	 * Engine Type : 88 AKI
	 * Engine Cylinders : 0
	 * Drive Train : 2WD: Two-Wheel Drive"
	 */
	public String toString() {
		return "Manufacturer Name:\t\t"+vehicleManufacturer+"\n"+
					 "Manufactured Date:\t\t"+vehicleManufacturedDate+"\n"+
					 "Vehicle Make:\t\t"+vehicleMake+"\n"+
					 "Vehicle Model:\t\t"+vehicleModel+"\n"+
					 "Vehicle Type:\t\t"+vehicleType+"\n"+
					 "Engine Manufacturer:\t\t"+vehicleEngine.toString();
	}
	
	public static void main(String[] args) {
			/*
	Manufacturer Name : Honda
	Manufactured Date : Tue Jan 03 07:13:19 MST 2015
	Vehicle Make : Honda
	Vehicle Model : Prelude
	Vehicle Type : null
	Engine Manufacturer : Honda
	Engine Manufactured : Thu Feb 02 01:38:31 MST 2015
	Engine Make : H-Series
	Engine Model : H23A1
	Engine Type : 88 AKI
	Engine Cylinders : 4
	Drive Train : 2WD: Two-Wheel Drive
			 */
		System.out.println(""+
				"Manufacturer Name: "+"Generic"+"\n"+
				"Manufacturer Date: "+"Generic"+"\n"+
				"Vehicle Make: "+"Generic"+"\n"+
				"Vehicle Model: "+"Generic"+"\n"+
				"Vehicle Type: "+"Generic"+"\n"+
				"Engine Manufacturer: "+"Generic"+"\n"+
				"Engine Manufactured: "+"Generic"+"\n"+
				"Engine Make: "+"Generic"+"\n"+
				"Engine Model: "+"Generic"+"\n"+
				"Engine Model: "+"Generic"+"\n"+
				"Engine Type: "+"Generic"+"\n"+
				"Engine Cylinders: "+"Generic"+"\n"+
				"Drive Train: "+"Generic");
	}
	
}

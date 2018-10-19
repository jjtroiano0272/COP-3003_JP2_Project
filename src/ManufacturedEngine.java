/*
* Reference available here for multiple-line selection and simultaneous editing:
* https://stackoverflow.com/questions/36102652/turning-public-items-into-private-items-java-intellij
* IF you leave column mode ON, the caret won't wrap to next line!
*
* TLDR:   Ctrl+CMD+G and type || Ctrl+Alt+J
*         Column Mode -> alt + up/down to select columns to edit.
* */

import java.util.Date;

public class ManufacturedEngine implements Engine {
	
	private String     engineManufacturer;
	private Date       engineManufacturedDate;
	private String     engineMake;
	private String     engineModel;
	private int        engineCylinders;
	private String     engineType;
	private String     driveTrain;
	
	/**
	 * Making sure to implement methods FROM Engine to avoid errors here. Methods MUST be 're-defined'.
	 */
	public void setEngineManufacturer(String manufacturer) {
		this.engineManufacturer = manufacturer;
	}
	public void setEngineManufacturedDate(Date date) {
		this.engineManufacturedDate = date;
	}
	public void setEngineMake(String engineMake) {
		this.engineMake = engineMake;
	}
	public void setEngineModel(String engineModel) {
		this.engineModel = engineModel;
	}
	public void setEngineCylinders(int engineCylinders) {
		this.engineCylinders = engineCylinders;
	}
	public void setEngineType(String fuel) {
		this.engineType = fuel;
	}
	public void setDriveTrain(String driveTrain) {
		this.driveTrain = driveTrain;
	}
	
	
	/**
	 * THIS MUST BE STRING LITERAL 'GENERIC'
	 * We're just initializing all fields here with dummy values.
	 *
	 * Public default constructor.
	 */
	
	public ManufacturedEngine() {
		this.engineManufacturer = "Generic";
		this.engineManufacturedDate = new Date();
		this.engineMake = "Generic";
		this.engineModel = "Generic";
		this.engineCylinders = 0;
		this.engineType = "Generic";
		this.driveTrain = "Generic";
	}
	
	@Override
	public String toString() {
		return  "Engine Manufacturer\t\t: "+engineManufacturer+
						"Engine Manufactured\t\t: "+engineManufacturedDate+
						"Engine Make\t\t: "+        engineMake+
						"Engine Model\t\t: "+       engineModel+
						"Engine Type\t\t: "+        engineType+
						"Engine Cylinders\t\t: "+   engineCylinders+
						"Drive Train\t\t: "+        driveTrain; // Potential error
	}
	
}

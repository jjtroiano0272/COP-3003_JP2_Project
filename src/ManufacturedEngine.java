/*
* Reference available here for multiple-line selection and simultaneous editing:
* https://stackoverflow.com/questions/36102652/turning-public-items-into-private-items-java-intellij
* IF you leave column mode ON, the caret won't wrap to next line!
*
* TLDR:   Ctrl+CMD+G and type || Ctrl+Alt+J
*         Column Mode -> alt + up/down to select columns to edit.
* */

import java.util.Date;

public class ManufacturedEngine {
	
	public String     engineManufacturer;
	public Date       engineManufacturedDate;
	public String     engineMake;
	public String     engineModel;
	public int        engineCylinders;
	public String     engineType;
	public String     driveTrain;

	// How the hell is this supposed to be structured???
	ManufacturedEngine<T>{
		/*
		EXAMPLE:
		public class Box<T> {
			// T stands for "Type"
			private T t;
			
			public void set(T t) { this.t = t; }
			public T get() { return t; }
		}
		*/
		this.engineManufacturer = T;
		this.engineManufacturedDate = T;
		this.engineMake = T;
		this.engineModel = T;
		this.engineCylinders = T;
		this.engineType = T;
		this.driveTrain = T;
	}
	
	@Override
	public String toString() {
		return  "Engine Manufacturer\t\t: "+engineManufacturer+
						"Engine Manufactured\t\t: "+engineManufacturedDate+
						"Engine Make\t\t: "+engineMake+
						"Engine Model\t\t: "+engineModel+
						"Engine Type\t\t: "+engineType+
						"Engine Cylinders\t\t: "+engineCylinders+
						"Drive Train\t\t: "+driveTrain;
	}
	
	
}

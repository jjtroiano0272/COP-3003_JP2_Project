public interface Engine {
	
	// Create an interface Engine with the following list of public method definitions that return a void:
	void setEngineCylinders(int engineCylinders);
	void setEngineManufacturedDate(java.util.Date date);
	void setEngineManufacturer(String manufacturer);
	void setEngineMake(String engineMake);
	void setEngineModel(String engineModel);
	void setDriveTrain(String driveTrain);
	void setEngineType(String fuel);
	
}

// Why would you create an interface or a class without object? To take advantage of ___ and
// polymorphism.
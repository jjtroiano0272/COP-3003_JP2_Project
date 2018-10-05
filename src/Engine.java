public interface Engine {

	public void setEngineCylinders(int engineCylinders);
	public void setEngineManufacturedDate(Date date);
	public void setEngineManufacturer(String manufacturer);
	public void setEngineMake(String engineMake);
	public void setEngineModel(String engineModel);
	public void setDriveTrain(String driveTrain);
	public void setEngineType(String fuel);

}

// Why would you create an interface or a class without object? To take advantage of ___ and
// polymorphism.
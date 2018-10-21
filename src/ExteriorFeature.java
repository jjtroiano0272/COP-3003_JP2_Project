public class ExteriorFeature implements Feature {

	private String exteriorFeature;
	
	public ExteriorFeature() {
		this.exteriorFeature = "Generic";
	}
	public ExteriorFeature(String exteriorFeature) {
		this.exteriorFeature = exteriorFeature;
	}
	
	public String getFeature() {
		return exteriorFeature;
	}
	public void setFeature(String exteriorFeature) {
		this.exteriorFeature = exteriorFeature;
	}
	public String toString() {
		return "Exterior:\t\t"+exteriorFeature;
	}
	
	public static void main(String[] args) {
		ExteriorFeature testFeature = new ExteriorFeature();
		System.out.println(testFeature.toString());
		ExteriorFeature overloadFeature = new ExteriorFeature("Fog Lamps");
		System.out.println(overloadFeature.toString());
		
	}
}

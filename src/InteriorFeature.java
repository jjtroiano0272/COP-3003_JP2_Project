public class InteriorFeature implements Feature {

	private String interiorFeature;
	
	public InteriorFeature() { interiorFeature = "Generic"; }
	public InteriorFeature(String interiorFeature) { this.interiorFeature = interiorFeature; }
	public String getFeature() { return interiorFeature; }
	public void setFeature(String interiorFeature) { this.interiorFeature = interiorFeature; }
	public String toString() { return "Interior\t\t"+interiorFeature;}
	
	public static void main(String[] args) {
		InteriorFeature testFeature = new InteriorFeature();
		System.out.println(testFeature.toString());
		InteriorFeature overloadFeature = new InteriorFeature("Climate Control");
		System.out.println(overloadFeature.toString());
	}
	
}

package DataType;

public class DemoDatatype {
		
	static double fa=212.0;
	static double cels;
	static double kelvin;
	public static double converttocelisus(){
		double cels=((5*(fa-32.0)/9.0));
		return cels;
	}
	public  static double converttokelvin(){
		
		kelvin=(converttocelisus()+273.14);
		return kelvin;		
	}
	public static void main(String args[]) {
		
		converttokelvin();
		System.out.println(fa+"degree in faheriht" +converttocelisus()+ "celsius scale");
		System.out.println("The temperature in kelvin scale"+kelvin);
	}
	
}

package KeywordExercises;

public class Employee {
	
	public String name;
	public String jobTitle;
	public double hourlyWage;
	public static double minimumWage = 7.25;
	
	//constructor
	public Employee(String name, String jobTitle, double hourlyWage) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.hourlyWage = hourlyWage;
		
	}
	

	//setters and getters
	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getJobTitle() {
		return jobTitle;
	}




	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}




	public double getHourlyWage() {
		return hourlyWage;
	}




	public void setHourlyWage(double hourlyWage) {
		
		if(hourlyWage < minimumWage) {
			hourlyWage = minimumWage;}
		
		this.hourlyWage = hourlyWage;
	}




	public static double getMinimumWage() {
		return minimumWage;
	}




	public static void setMinimumWage(double minimumWage) {
		Employee.minimumWage = minimumWage;
	}




}

package KeywordExercises;



public class Runner {
	private Employee employee;
	

	public static void main(String[] args) {
		
		
		
		Employee Jane = new Employee("Jane", "manager", 20.00);
		Jane.setHourlyWage(9.53);
		
		Employee employee1 = new Employee("Joe", "clerk", 6.25);
		Employee employee2 = new Employee("Mark", "clerk", 5.25);
		Employee employee3 = new Employee("Ami", "lead", 10.00);
		
		employee1.setHourlyWage(5.25);
		employee2.setHourlyWage(6.25);
		employee3.setHourlyWage(12.00);
		
		System.out.println(employee1.getHourlyWage());
		System.out.println(employee2.getHourlyWage());
		System.out.println(employee3.getHourlyWage());
		
		//
		EnergyMatterCalculator calc = new EnergyMatterCalculator();
		
		System.out.println(calc.energyToMatter(10.0));
		System.out.println(calc.matterToEnergy(1.1126500560536184E-16));

	}

}

package Entities;

public class TaxPayer {
	private double salaryIncome;
	private double servicesIncome;
	private double capitalIncome;
	private double healthSpending;
	private double educationSpending;
	
	public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending,
			double educationSpending) {
		this.salaryIncome = salaryIncome;
		this.servicesIncome = servicesIncome;
		this.capitalIncome = capitalIncome;
		this.healthSpending = healthSpending;
		this.educationSpending = educationSpending;
	}

	public double getSalaryIncome() {
		return salaryIncome;
	}
	
	public double getServicesIncome() {
		return servicesIncome;
	}

	public double getCapitalIncome() {
		return capitalIncome;
	}

	public double getHealthSpending() {
		return healthSpending;
	}

	public double getEducationSpending() {
		return educationSpending;
	}

	public double salaryTax() {
		double tax;
		if(salaryIncome/12 < 3000) {
			tax = 0;
		}
		else if(salaryIncome/12 <5000) {
			tax = 0.1;
		}
		else {
			tax = 0.2;
		}
		return salaryIncome*tax ;
	}
	
	public double servicesTax() {
		if(servicesIncome >0) {
			return servicesIncome *0.15;
		}
		else {
			return 0;
		}
	}
	
	public double capitalTax() {
		if(	capitalIncome >0) {
			return capitalIncome * 0.2;
		}
		else {
			return 0;
		}
	}
	
	public double grossTax() {
		return salaryTax() + servicesTax() + capitalTax();
	}
	
	public double taxRebate() {
		double sum = getHealthSpending() + getEducationSpending();
		double thirtyPercentageSalary =  grossTax() * 0.3;
		if(thirtyPercentageSalary >= sum) {
			return sum;
		}
		else {
			return thirtyPercentageSalary;
		}
	}
	
	public double netTax() {
		return grossTax() - taxRebate() ;
	}
	
	public String toString() {
		return 
				"Imposto bruto total: "
				+String.format("%.2f%n", grossTax())
				+"Abatimento:  "
				+String.format("%.2f%n", taxRebate())
				+"Imposto devido: "
				+String.format("%.2f%n", netTax());
	}
	
	
	
	
	
	
	
	
	
}

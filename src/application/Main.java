package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.TaxPayer;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos contribuintes você vai digitar? ");
		int n = sc.nextInt();
		
		List<TaxPayer> list = new ArrayList<>();
		for(int i = 0; i<n; i++) {
			System.out.println();
			System.out.println("Digite os dados do "+(i+1)+ "o contribuinte:");
			System.out.print("Renda anual com salário: ");
			double salaryIncome = sc.nextDouble();
			System.out.print("Renda anual com prestação de serviço: ");
			double servicesIncome = sc.nextDouble();
			System.out.print("Renda anual com ganho de capital: ");
			double capitalIncome = sc.nextDouble();
			System.out.print("Gastos médicos: ");
			double heathSpending = sc.nextDouble();
			System.out.print("Gastos educacionais: ");
			double educationSpending = sc.nextDouble();
			
			TaxPayer taxPayer = new TaxPayer(salaryIncome, servicesIncome, capitalIncome, heathSpending, educationSpending);
			list.add(taxPayer);
		}
		int count= 0;
		for(TaxPayer obj: list) {
			System.out.println();
			System.out.println("Resumo do "+(count+1)+"o contribuinte:");
			System.out.println(list.get(count));
			count++;
		}
	
		sc.close();
	}

}

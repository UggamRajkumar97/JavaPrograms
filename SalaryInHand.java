package Excercise.classes;

import java.util.Scanner;

public class SalaryInHand {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("monthly salary");
		double monthSalary = sc.nextDouble();
		System.out.println("savings investment");
		double investment = sc.nextDouble();
		double maxSaving = 100000;
		double taxbleAmount = 0;
		double salaryInHand = 0;
		double taxPerYear = 0;

		double annualIncome = monthSalary * 12;

		if (investment <= 100000) {
			taxbleAmount = annualIncome - investment;
			maxSaving = investment;
		} else {
			taxbleAmount = annualIncome - maxSaving;
//			maxSaving=investment-maxSaving;
		}
		if (taxbleAmount <= 250000) {
			salaryInHand = (taxbleAmount + maxSaving) / 12;
		} else if (taxbleAmount <= 500000) {
			taxPerYear = ((taxbleAmount-250000) * 5) / 100;
			salaryInHand = taxbleAmount + maxSaving - taxPerYear;
		}
		else if(taxbleAmount<=1000000) {
			taxPerYear=((250000 * 5) + (taxbleAmount-500000)*20)/100;
			salaryInHand=taxbleAmount + maxSaving-taxPerYear;
		}
		else{
			taxPerYear=((250000 * 5) + (500000*20) + (taxbleAmount-1000000)*30)/100;
			salaryInHand=taxbleAmount + maxSaving-taxPerYear;
		}
		System.out.println("annualIncome is : " + annualIncome);
		System.out.println("taxbleAmount is : " + taxbleAmount);
		System.out.println("taxPerYear is : " + taxPerYear);
		System.out.println("salaryInHand is : " + salaryInHand / 12);

	}

}

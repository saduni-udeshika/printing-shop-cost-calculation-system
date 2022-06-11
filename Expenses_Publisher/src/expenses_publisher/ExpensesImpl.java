package expenses_publisher;

import java.util.Scanner;

public class ExpensesImpl implements IExpenses   {

	int inkCost = 150;
	int tShirt = 500;
	int mug = 300;
	int designerSal = 30000;
	int allowance,totalExpenses,labourCost,otherCosts,tshirttotal,mugtotal,totalIncome;
	
	@Override
	public void mugExpenses() {
		System.out.println("Please insert your monthly  printed mugs amount");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		int mugPrice = inkCost*mug;
		int mugtotal = mugPrice*no;
		
		System.out.println("Total Mugs Expense is = "+mugPrice);
		
	}

	@Override
	public void tShirtExpenses() {
		System.out.println("Please insert your monthly  printed tshirts amount");
		Scanner sc = new Scanner(System.in);
		int no = sc.nextInt();
		
		int tshirtPrice = inkCost*tShirt;
		int tshirttotal = tshirtPrice*no;
		
		System.out.println("Total Tshirts Expense is = "+tshirtPrice);
		mugExpenses();
		showExpenses();
		totalProfit();
		
		
	}
	
	@Override
	public void showExpenses() {
		System.out.println("Enter your Labour Costs : ");
		Scanner sc = new Scanner(System.in);
		 labourCost = sc.nextInt();
		
		System.out.println("Enter your Allowances : ");
		 allowance = sc.nextInt();
	
		 System.out.println("Enter your Other Costs : ");
		 otherCosts = sc.nextInt();
		
		 
				 totalExpenses = labourCost+allowance+designerSal+otherCosts+tshirttotal+mugtotal;
				 System.out.println("Your Total Expense is : "+totalExpenses);
	}

	@Override
	public void totalProfit() {
		System.out.println("Enter your Total income");
		Scanner sc = new Scanner(System.in);
		 totalIncome = sc.nextInt();
		
		 int totalProfit = totalIncome - totalExpenses;
		 System.out.println("Your Total Profit is = "+totalProfit);
	}


}

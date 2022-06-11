package mug_publisher;

import java.util.Scanner;

public class MugImpl implements IMug{
	Scanner sc = new Scanner(System.in);
	int colorNumber = 0; float mugPrice = 0;

	public void selectMugType() {
		System.out.println("Choose Mug Type");
		System.out.println();
		System.out.println("1). -Magic Mug-");
		System.out.println("2). -Normal Mug-");
		System.out.println("0). -Exit-");
		System.out.println("----------------------------------");
		System.out.println();
		System.out.print("Enter Menu No : ");
		
		int mug = sc.nextInt();
		while(true) {
			if(mug == 1) {
				calcMagicMugCost();
			}else if(mug == 2) {
				calcPlaneMugCost();
			}else if(mug == 0) {
				break;
			}
			System.out.print("Do you want to Continue ? Y/N   ");
			String s = sc.next();

			if (s.equalsIgnoreCase("N")) {
				break;
			} else {
				continue;
			}
		}
		
	}
	@Override
	public void calcMagicMugCost() {
		System.out.println("Magic Mug");
		System.out.println("1). -Colored Mug-");
		System.out.println("2). -Black and white Mug-");
		
		int colorNumber = sc.nextInt();
		
		if(colorNumber == 1) {
			mugPrice = 1800;
		}else if(colorNumber == 2) {
			mugPrice = 1700;
		}
		System.out.println("Mug Price: " + mugPrice);
		
	}

	@Override
	public void calcPlaneMugCost() {
		System.out.println("Mug");
		System.out.println("1). -Couloured Printed Mug-");
		System.out.println("2). -Black and white Printed Mug-");
		
		
		
		if(colorNumber == 1) {
			mugPrice = 1750;
		}
		else if(colorNumber == 2){
			mugPrice = 1650;
		}
		System.out.println("Mug Price: " + mugPrice);
	}

	
}

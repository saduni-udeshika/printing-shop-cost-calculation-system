package rowmaterials_publisher;

import java.util.Scanner;

public class RowmaterialImpl implements IRowmaterial{
	
	Scanner sc = new Scanner(System.in);
	
	int materialItem;
	int materialType;
	float price =0;
	float cost;
    String str= "y";
    
	@Override
	public void calculateCosts() {
		 while(str == "y") {
		    	System.out.println("************************************************");
		    	System.out.println("----Calculate Row Materials Cost-----");
		    	System.out.println("1.Cards");
		    	System.out.println("2.Tshirts");
		    	System.out.println("3.Mugs");
		    	System.out.println("4.Stickers");
		    	System.out.println("0.Exit");
		    	
		    	
		      	System.out.println("");
		    	System.out.println(" Please Enter Item  Number:");
		    	int materialItem = sc.nextInt();
		    	
		    	if(materialItem == 1) {
		    		System.out.println("");
		    		System.out.println("************************************************");
			    	System.out.println("1.Decorative Brads ");
			    	System.out.println("2.Construction Papers");
			    	System.out.println("Choose Material Type :");
			    	int materialType = sc.nextInt();
			    	
			    	switch(materialType) {
			    	  case 1:
			    	    cost = 30;
			    	    calculateFullCost();
			    	    break;
			    	    
			    	  case 2:
			    		 System.out.println("-----------------------");
			    		 System.out.println("1.Small Size (Type s)");
					     System.out.println("2.Large Size (Type l)");
					     System.out.println("Choose Construction Cards Type :");
					     Scanner cc = new Scanner(System.in);
					     String cardType = cc.next();
					     
					     switch(cardType) {
					     case "s":
					    	 cost =50;
					    	 calculateFullCost();
					    	   break; 
			    	  	 case "l":
			    	  		 cost=100;
			    	  		calculateFullCost();
			    	  		 break;
			    	  default:
			    	    System.out.println("Invalid Card Type");
			    	}
					     break;
			    	  default:
				    	    System.out.println("Invalid Material Type");
			    	}
			    	
			    	
		 }else if(materialItem == 2) {
			 System.out.println("");
	    		System.out.println("************************************************");
		    	System.out.println("1.Tshirt Inks ");
		    	System.out.println("2.Dryers");
		    	System.out.println("Choose Material Type :");
		    	int materialType = sc.nextInt();
		    	
		    	switch(materialType) {
		    		case 1:
		    			System.out.println("------------------------------");
			    		System.out.println("Enter Colour : ");
			    		String color = sc.next();
			    		//price for 1L
			    	    cost = 500;
			    	    System.out.println("------------------------------");
			    	    System.out.println("Ink 1L Price is Rs."+cost);
			    	    System.out.println("");
			    	    calculateFullCost();
			    	    System.out.println("Color = "+color);
			    	    break;
			    	    
		    		case 2:
		    			System.out.println("-----------------------");
			    		 System.out.println("1.Flash Dryer (Type f)");
					     System.out.println("2.Conveyor Dryer (Type c)");
					     System.out.println("Choose Dryers Type :");
					     Scanner cc = new Scanner(System.in);
					     String dryType = cc.next();
					     
					     switch(dryType) {
					     case "f":
					    	 cost =10000;
					    	 calculateFullCost();
					    	   break; 
			    	  	 case "c":
			    	  		 cost=20000;
			    	  		calculateFullCost();
			    	  		 break;
			    	  default:
			    	    System.out.println("Invalid Card Type");
			    	}
					     break;
			    	  default:
				    	    System.out.println("Invalid Material Type");
			    	}
		    	
		    	}    	else if(materialItem == 3) {
		    		 		System.out.println("");
		    		 		System.out.println("************************************************");
		    		 		System.out.println("1.Sublimation Papers ");
		    		 		System.out.println("2.Heat resistance tapes");
		    		 		System.out.println("Choose Material Type :");
		    		 		int materialType = sc.nextInt();
		    		 		
		    		 		switch(materialType) {
		    		 			case 1:
		    		 				System.out.println("-----------------------");
		    		 				System.out.println("a) A3 Size");
		    		 				System.out.println("b) A4 Size");
		    		 				System.out.println("Choose The Size :");
		    		 				Scanner cc = new Scanner(System.in);
		    		 				String paperSize = cc.next();
							     
		    		 					switch(paperSize) {
		    		 						case "a":
		    		 								cost =30;
		    		 								calculateFullCost();
		    		 								System.out.println("---------------------------------------");
		    		 								System.out.println("Enterd Paper Size is A3");
		    		 								break; 
		    		 						case "b":
		    		 								cost=20;
		    		 								calculateFullCost();
		    		 								System.out.println("---------------------------------------");
		    		 								System.out.println("Enterd Paper Size is A4");
		    		 								break;
		    		 						default:
		    		 								System.out.println("Invalid Size Type");
		    		 					}
		    		 						break;
		    		 					
		    		 			case 2:
		    		 				cost = 1000;
		    			    	    calculateFullCost();
		    			    	    break;
		    		 		}
		    		
		    	}else if(materialItem == 4) {
		    		System.out.println("");
    		 		System.out.println("************************************************");
    		 		System.out.println("1.Label Sheets ");
    		 		System.out.println("2.Pens & Pencils");
    		 		System.out.println("Choose Material Type :");
    		 		int materialType = sc.nextInt();
    		 		
    		 		switch(materialType) {
    		 				case 1:
    		 					cost = 1000;
	    			    	    calculateFullCost();
	    			    	    break;
    		 				case 2:
    		 					System.out.println("-----------------------");
	    		 				System.out.println("a) Glowing Pens");
	    		 				System.out.println("b) Jel Pens");
	    		 				System.out.println("c) Color Pencils");
	    		 				System.out.println("Choose the Type :");
	    		 				Scanner cc = new Scanner(System.in);
	    		 				String penType = cc.next();
	    		 				
	    		 					switch(penType) {
	    		 						case "a":
	    		 							cost =20;
	    		 							costStickerPens();	    		 							
	    		 							break; 
	    		 						case "b":
	    		 							cost =10;
	    		 							costStickerPens();
	    		 							break;
	    		 						case "c":
	    		 							cost =8;
	    		 							costStickerPens();
	    		 							break;
	    		 						default:
	    		 				    	    System.out.println("Invalid Pen Type");
	    		 					}
						     
    		 		}
		    	}else
		    		break;
		    	
		    	System.out.println("Do you want to continue(y/n)?");
			 	   String str = sc.next();
			 	  System.out.println("Total Cost is: "+price);
			      System.out.println("Thank you"); 
		 }	    	
	}


	@Override
	public void calculateFullCost() {
 		System.out.println("************************************************");
		System.out.println("Please Enter  Amount :");
		int qty = sc.nextInt();
		price = price +(cost * qty);
		System.out.println("");
		System.out.println("Entered Amount = "+qty );
		System.out.println("Full cost for entered Materials = Rs. "+ price );
		
	}


	@Override
	public void costStickerPens() {
		System.out.println("Enter Colour : ");
 		String color = sc.next();
 		System.out.println("Color = "+color);
 	    calculateFullCost();
 	  
		
	}
	
}


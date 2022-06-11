package card_publisher;

import java.util.Scanner;

public class CardImpl implements ICard {
	//card type variable decleration
		Scanner sc = new Scanner(System.in);
		int amount,totalprice,amtdiscount;
		
		@Override
		public void cardTypeSelection() {
			//card type depends on user input value
			System.out.println("-----Calculate Printing Card Cost-----");
			System.out.println("1. Calculate Card Price");
			System.out.println("0. Exit");
			System.out.println("------------------------------------------");
			System.out.println();
			System.out.print("Enter No : ");
			int n = sc.nextInt();
			
			System.out.println();
			if(n==1) {
				while(true) {
					System.out.println("-----Choose Card Type-----");
					System.out.println("1). -Birthday Card-");
					System.out.println("2). -Wedding Card-");
					System.out.println("3). -Christmas Card-");
					System.out.println("0). -Exit-");
					System.out.println("----------------------------------");
					System.out.println();
					System.out.print("Enter Menu No : ");
					int cardType = sc.nextInt();
					
					if(cardType == 1){
						int birthdaycardprice = 110;
						System.out.println("Birthday card price is Rs. "+birthdaycardprice);
						
					
						System.out.println("Please Choose the scale you need to print.*** ");
						System.out.println(" Small ***  (1)  ");
						System.out.println(" Medium ***  (2)  ");
						System.out.println(" Large ***  (3)  ");
						
						Scanner sc = new Scanner(System.in);
						int scale= sc.nextInt();
						
						int scalePrice;
						int small = 8;
						int medium = 10;
						int large = 15;
						int scaleAddedprice;
					
						if(scale==1){
						
						
							scaleAddedprice =small+birthdaycardprice;
							Scanner sc1 = new Scanner(System.in);
							
							System.out.println("Please Choose the quantity you need to print. ");
							int amount= sc1.nextInt();
							
							int totalprice = scaleAddedprice*amount;
							
							System.out.println("Please choose Your Customer Type !!!");
							System.out.println("######");
							System.out.println("######");
							System.out.println("######");
							System.out.println(" Default customer (cash) ----  (1)  ");
							System.out.println(" Credit card customer ----  (2)  ");
							System.out.println(" Loyality card customer ----  (3)  ");
							
							int payType= sc.nextInt();
								if(payType==1){
										//default customer(<100)
										if(amount<100){
											
											amtdiscount = 0;
											
											System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
											System.out.println("Your total new price is =  Rs."+ totalprice);
						
								
												//default customer<100)
												}else if(amount>=100){
													int totalpriceDis,newtotalDis,amtdiscount;
													
													amtdiscount = totalprice/100*2;
													newtotalDis = totalprice-amtdiscount;
													
													System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
													System.out.println("Your total new price is = Rs."+ newtotalDis);						
									}
										
													}else if (payType == 2) {
														if(amount<100){
															int amtdiscount = 0;
															int cardDiscount = totalprice/100*3;
															int newPrice = totalprice-cardDiscount;
															
															System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
															System.out.println("Your credit card discount is = Rs."+ cardDiscount);
															System.out.println("Your total new price"+ newPrice);
										
												
																//creditcard customer(<100)
																}else if(amount>=100){
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int cardDiscount = totalprice/100*3;
																	int newPrice = totalprice-(cardDiscount+amtdiscount);
																	
																
																	
																	System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																	System.out.println("Your credit card discount is = Rs."+ cardDiscount);
																	System.out.println("Your total new price is = Rs."+ newPrice);
								
																}
														}else if (payType==3) {
															if(amount<100){
															int amtdiscount = 0;
															int loyalitycardDiscount = totalprice/100*2;
															int newPrice = totalprice-loyalitycardDiscount;
															
															System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
															System.out.println("Your Loyalty card discount is = Rs."+ loyalitycardDiscount);
															System.out.println("Your total new price is = Rs."+ newPrice);
															} else if (amount>=100){
																
																int totalpriceDis,newtotalDis,amtdiscount;
																amtdiscount = totalprice/100*2;
																int loyaltycardDiscount = totalprice/100*2;
																int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																
															
																
																System.out.println("Your  discount for the cards quantity is = Rs."+ amtdiscount);
																System.out.println("Your  Loyalty card discount is = Rs. "+ loyaltycardDiscount);
																System.out.println("Your total new price is = Rs."+ newPrice);			
															}			
														}			
							}else if(scale == 2) {
								
								scaleAddedprice =medium+birthdaycardprice;
								Scanner sc1 = new Scanner(System.in);
								
								System.out.println("Please Choose the quantity you need to print. ");
								int amount= sc1.nextInt();
								
								int totalprice = scaleAddedprice*amount;
								
								System.out.println("Please choose Your Customer Type !!!");
								System.out.println("######");
								System.out.println("######");
								System.out.println("######");
								System.out.println(" Default customer (cash) ***  (1)  ");
								System.out.println(" Credit card customer ***  (2)  ");
								System.out.println(" Loyality card customer ***  (3)  ");
								
								
								int payType= sc.nextInt();
							
									if(payType==1){
									
											//default customer(<100)
											if(amount<100){
												
												amtdiscount = 0;
												
												System.out.println("Your discount is ::"+ amtdiscount);
												System.out.println("Your total new price"+ totalprice);
							
									
													//default customer<100)
													}else if(amount>=100){
														int totalpriceDis,newtotalDis,amtdiscount;
														
														amtdiscount = totalprice/100*2;
														newtotalDis = totalprice-amtdiscount;
														
														System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
														System.out.println("Your total new price is = Rs."+ newtotalDis);					
										}
														}else if (payType == 2) {
															if(amount<100){
																
																int amtdiscount = 0;
																int cardDiscount = totalprice/100*3;
																int newPrice = totalprice-cardDiscount;
																
																System.out.println("Yourdiscount for the cards quantity is = Rs."+ amtdiscount);
																System.out.println("Your credit card discount is = Rs."+ cardDiscount);
																System.out.println("Your total new price is = Rs."+ newPrice);
											
													
																	//creditcard customer(<100)
																	}else if(amount>=100){
																		int totalpriceDis,newtotalDis,amtdiscount;
																		amtdiscount = totalprice/100*2;
																		int cardDiscount = totalprice/100*3;
																		int newPrice = totalprice-(cardDiscount+amtdiscount);
																		
																	
																		System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																		System.out.println("Your credit card discount is = Rs."+ cardDiscount);
																		System.out.println("Your total new price is = Rs."+ newPrice);
																	}
															}else if (payType==3) {
																if(amount<100){
																int amtdiscount = 0;
																int loyalitycardDiscount = totalprice/100*2;
																int newPrice = totalprice-loyalitycardDiscount;
																
																System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																System.out.println("Your Loyalty card discount is = Rs."+ loyalitycardDiscount);
																System.out.println("Your total new price is = Rs."+ newPrice);
																} else if (amount>=100){
																	
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int loyaltycardDiscount = totalprice/100*2;
																	int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																	
																	System.out.println("Your  discount for the cards quantity is = Rs."+ amtdiscount);
																	System.out.println("Your  Loyalty card discount is = Rs. "+ loyaltycardDiscount);
																	System.out.println("Your total new price is = Rs."+ newPrice);
																			
																}	
															}
						}else if(scale == 3) {
							scaleAddedprice =large+birthdaycardprice;
							Scanner sc1 = new Scanner(System.in);
							
							System.out.println("Please Choose the quantity you need to print. ");
							int amount= sc1.nextInt();
							
							int totalprice = scaleAddedprice*amount;
							
							System.out.println("Please choose Your Customer Type !!!");
							System.out.println("######");
							System.out.println("######");
							System.out.println("######");
							System.out.println(" Default customer (cash) ***  (1)  ");
							System.out.println(" Credit card customer ***  (2)  ");
							System.out.println(" Loyality card customer ***  (3)  ");
							
							
							int payType= sc.nextInt();
						
								if(payType==1){
										//default customer(<100)
										if(amount<100){
											
											amtdiscount = 0;
											
											System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
											System.out.println("Your total new price is = Rs."+ totalprice);
						
								
												//default customer<100)
												}else if(amount>=100){
													int totalpriceDis,newtotalDis,amtdiscount;
													
													amtdiscount = totalprice/100*2;
													newtotalDis = totalprice-amtdiscount;
													
													System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
													System.out.println("Your total new price is = Rs."+ newtotalDis);
									}
										
													}else if (payType == 2) {
														if(amount<100){
															
															int amtdiscount = 0;
															int cardDiscount = totalprice/100*3;
															int newPrice = totalprice-cardDiscount;
															
															System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
															System.out.println("Your credit card discount is = Rs."+ cardDiscount);
															System.out.println("Your total new price is = Rs."+ newPrice);
										
																//creditcard customer(<100)
																}else if(amount>=100){
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int cardDiscount = totalprice/100*3;
																	int newPrice = totalprice-(cardDiscount+amtdiscount);
																			
																	System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																	System.out.println("Your credit card discount is = Rs."+ cardDiscount);
																	System.out.println("Your total new price is = Rs."+ newPrice);
																}
														}else if (payType==3) {
															if(amount<100){
															int amtdiscount = 0;
															int loyalitycardDiscount = totalprice/100*2;
															int newPrice = totalprice-loyalitycardDiscount;
															
															System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
															System.out.println("Your Loyalty card discount is = Rs."+ loyalitycardDiscount);
															System.out.println("Your total new price is = Rs."+ newPrice);
															} else if (amount>=100){
																
																int totalpriceDis,newtotalDis,amtdiscount;
																amtdiscount = totalprice/100*2;
																int loyaltycardDiscount = totalprice/100*2;
																int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																
																System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																System.out.println("Your  Loyalty card discount is = Rs. "+ loyaltycardDiscount);
																System.out.println("Your total new price is = Rs."+ newPrice);		
															}	
														}
						}
					}else if(cardType == 2) {
						int weddingcardprice = 250;
						System.out.println("Wedding card price is Rs. "+weddingcardprice);
						
					
						System.out.println("Please Choose the scale you need to print.*** ");
						System.out.println(" Small ***  (1)  ");
						System.out.println(" Medium ***  (2)  ");
						System.out.println(" Large ***  (3)  ");
						
						Scanner sc = new Scanner(System.in);
						int scale= sc.nextInt();
						
						int scalePrice;
						int small = 8;
						int medium = 10;
						int large = 15;
						int scaleAddedprice;
					
						if(scale==1){
							scaleAddedprice =small+weddingcardprice;
							Scanner sc1 = new Scanner(System.in);
							
							System.out.println("Please Choose the quantity you need to print. ");
							int amount= sc1.nextInt();
							
							int totalprice = scaleAddedprice*amount;
							
							System.out.println("Please choose Your Customer Type !!!");
							System.out.println("######");
							System.out.println("######");
							System.out.println("######");
							System.out.println(" Default customer (cash) ***  (1)  ");
							System.out.println(" Credit card customer ***  (2)  ");
							System.out.println(" Loyality card customer ***  (3)  ");
							
							int payType= sc.nextInt();
						
								if(payType==1){
										//default customer(<100)
										if(amount<100){
											
											amtdiscount = 0;
											
											System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
											System.out.println("Your total new price is = Rs."+ totalprice);
						
								
												//default customer<100)
												}else if(amount>=100){
													int totalpriceDis,newtotalDis,amtdiscount;
													
													amtdiscount = totalprice/100*2;
													newtotalDis = totalprice-amtdiscount;
													
													System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
													System.out.println("Your total new price is = Rs."+ newtotalDis);
									}
													}else if (payType == 2) {
														if(amount<100){
															
															int amtdiscount = 0;
															int cardDiscount = totalprice/100*3;
															int newPrice = totalprice-cardDiscount;
															
															System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
															System.out.println("Your credit card discount is = Rs."+ cardDiscount);
															System.out.println("Your total new price is = Rs."+ newPrice);
										
												
																//creditcard customer(<100)
																}else if(amount>=100){
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int cardDiscount = totalprice/100*3;
																	int newPrice = totalprice-(cardDiscount+amtdiscount);
																	
																	System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																	System.out.println("Your credit card discount is = Rs."+ cardDiscount);
																	System.out.println("Your total new price is = Rs."+ newPrice);
								
																}
														}else if (payType==3) {
															if(amount<100){
															int amtdiscount = 0;
															int loyalitycardDiscount = totalprice/100*2;
															int newPrice = totalprice-loyalitycardDiscount;
															
															System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
															System.out.println("Your Loyalty card discount is = Rs. "+ loyalitycardDiscount);
															System.out.println("Your total new price is = Rs."+ newPrice);
															} else if (amount>=100){
																
																int totalpriceDis,newtotalDis,amtdiscount;
																amtdiscount = totalprice/100*2;
																int loyaltycardDiscount = totalprice/100*2;
																int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																
																System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																System.out.println("Your  Loyalty card discount is = Rs."+ loyaltycardDiscount);
																System.out.println("Your total new price is = Rs."+ newPrice);
															}	
															
														}	
							}else if(scale == 2) {
								scaleAddedprice =medium+weddingcardprice;
								Scanner sc1 = new Scanner(System.in);
								
								System.out.println("Please Choose the quantity you need to print. ");
								int amount= sc1.nextInt();
								
								int totalprice = scaleAddedprice*amount;
								
								System.out.println("Please choose Your Customer Type !!!");
								System.out.println("######");
								System.out.println("######");
								System.out.println("######");
								System.out.println(" Default customer (cash) ***  (1)  ");
								System.out.println(" Credit card customer ***  (2)  ");
								System.out.println(" Loyality card customer ***  (3)  ");
								
								
								int payType= sc.nextInt();
							
									if(payType==1){
											//default customer(<100)
											if(amount<100){
												
												amtdiscount = 0;
												System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
												System.out.println("Your total new price is = Rs."+ totalprice);
							
													//default customer<100)
													}else if(amount>=100){
														int totalpriceDis,newtotalDis,amtdiscount;
														
														amtdiscount = totalprice/100*2;
														newtotalDis = totalprice-amtdiscount;
														
														System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
														System.out.println("Your total new price is = Rs."+ newtotalDis);
										}
											
														}else if (payType == 2) {
															if(amount<100){
																
																int amtdiscount = 0;
																int cardDiscount = totalprice/100*3;
																int newPrice = totalprice-cardDiscount;
																
																System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																System.out.println("Your credit card discount is = Rs."+ cardDiscount);
																System.out.println("Your total new price"+ newPrice);
											
													
																	//creditcard customer(<100)
																	}else if(amount>=100){
																		int totalpriceDis,newtotalDis,amtdiscount;
																		amtdiscount = totalprice/100*2;
																		int cardDiscount = totalprice/100*3;
																		int newPrice = totalprice-(cardDiscount+amtdiscount);
																		
																		System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																		System.out.println("Your credit card discount is = Rs."+ cardDiscount);
																		System.out.println("Your total new price is = Rs."+ newPrice);
																	}
															}else if (payType==3) {
																if(amount<100){
																int amtdiscount = 0;
																int loyalitycardDiscount = totalprice/100*2;
																int newPrice = totalprice-loyalitycardDiscount;
																
																System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																System.out.println("Your Loyalty card discount is = Rs."+ loyalitycardDiscount);
																System.out.println("Your total new price is = Rs."+ newPrice);
																} else if (amount>=100){
																	
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int loyaltycardDiscount = totalprice/100*2;
																	int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																	
																	System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																	System.out.println("Your  Loyalty card discount is = Rs."+ loyaltycardDiscount);
																	System.out.println("Your total new price is = Rs."+ newPrice);		
																}	
															}
							
						}else if(scale == 3) {
							scaleAddedprice =large+weddingcardprice;
							Scanner sc1 = new Scanner(System.in);
							
							System.out.println("Please Choose the quantity you need to print. ");
							int amount= sc1.nextInt();
							
							int totalprice = scaleAddedprice*amount;
							
							System.out.println("Please choose Your Customer Type !!!");
							System.out.println("######");
							System.out.println("######");
							System.out.println("######");
							System.out.println(" Default customer (cash) ***  (1)  ");
							System.out.println(" Credit card customer ***  (2)  ");
							System.out.println(" Loyality card customer ***  (3)  ");
							
							
							int payType= sc.nextInt();
						
								if(payType==1){
										//default customer(<100)
										if(amount<100){
											
											amtdiscount = 0;
											
											System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
											System.out.println("Your total new price is = Rs."+ totalprice);
						
								
												//default customer<100)
												}else if(amount>=100){
													int totalpriceDis,newtotalDis,amtdiscount;
													
													amtdiscount = totalprice/100*2;
													newtotalDis = totalprice-amtdiscount;
													
													System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
													System.out.println("Your total new price is = Rs."+ newtotalDis);
									}
										
													}else if (payType == 2) {
														if(amount<100){
															
															int amtdiscount = 0;
															int cardDiscount = totalprice/100*3;
															int newPrice = totalprice-cardDiscount;
															
															System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
															System.out.println("Your credit card discount is = Rs."+ cardDiscount);
															System.out.println("Your total new price is = Rs."+ newPrice);
										
												
																//creditcard customer(<100)
																}else if(amount>=100){
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int cardDiscount = totalprice/100*3;
																	int newPrice = totalprice-(cardDiscount+amtdiscount);
																	
																	System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																	System.out.println("Your credit card discount is = Rs."+ cardDiscount);
																	System.out.println("Your total new price is = Rs."+ newPrice);
																}
														}else if (payType==3) {
															if(amount<100){
															int amtdiscount = 0;
															int loyalitycardDiscount = totalprice/100*2;
															int newPrice = totalprice-loyalitycardDiscount;
															
															System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
															System.out.println("Your Loyalty card discount is = Rs."+ loyalitycardDiscount);
															System.out.println("Your total new price is = Rs."+ newPrice);
															} else if (amount>=100){
																
																int totalpriceDis,newtotalDis,amtdiscount;
																amtdiscount = totalprice/100*2;
																int loyaltycardDiscount = totalprice/100*2;
																int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																	
																System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																System.out.println("Your  Loyalty card discount is = Rs."+ loyaltycardDiscount);
																System.out.println("Your total new price is = Rs."+ newPrice);		
															}	
														}
						}	
					}else if(cardType == 3) {
						int christmascardprice = 300;
						System.out.println("Wedding card price is Rs. "+christmascardprice);
						
					
						System.out.println("Please Choose the scale you need to print.*** ");
						System.out.println(" Small ***  (1)  ");
						System.out.println(" Medium ***  (2)  ");
						System.out.println(" Large ***  (3)  ");
						
						Scanner sc = new Scanner(System.in);
						int scale= sc.nextInt();
						
						int scalePrice;
						int small = 8;
						int medium = 10;
						int large = 15;
						int scaleAddedprice;
					
						if(scale==1){
							scaleAddedprice =small+christmascardprice;
							Scanner sc1 = new Scanner(System.in);
							
							System.out.println("Please Choose the quantity you need to print. ");
							int amount= sc1.nextInt();
							
							int totalprice = scaleAddedprice*amount;
							
							System.out.println("Please choose Your Customer Type !!!");
							System.out.println("######");
							System.out.println("######");
							System.out.println("######");
							System.out.println(" Default customer (cash) ***  (1)  ");
							System.out.println(" Credit card customer ***  (2)  ");
							System.out.println(" Loyality card customer ***  (3)  ");	
							
							int payType= sc.nextInt();
						
								if(payType==1){
										//default customer(<100)
										if(amount<100){
											
											amtdiscount = 0;
											
											System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
											System.out.println("Your total new price is = Rs."+ totalprice);
												//default customer<100)
												}else if(amount>=100){
													int totalpriceDis,newtotalDis,amtdiscount;
													
													amtdiscount = totalprice/100*2;
													newtotalDis = totalprice-amtdiscount;
													
													System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
													System.out.println("Your total new price is = Rs."+ newtotalDis);
									}
													}else if (payType == 2) {
														if(amount<100){
															
															int amtdiscount = 0;
															int cardDiscount = totalprice/100*3;
															int newPrice = totalprice-cardDiscount;
															
															System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
															System.out.println("Your credit card discount is = Rs."+ cardDiscount);
															System.out.println("Your total new price is = Rs."+ newPrice);
										
												
																//creditcard customer(<100)
																}else if(amount>=100){
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int cardDiscount = totalprice/100*3;
																	int newPrice = totalprice-(cardDiscount+amtdiscount);
																	
																	System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																	System.out.println("Your credit card discount is = Rs."+ cardDiscount);
																	System.out.println("Your total new price is = Rs."+ newPrice);
																}
														}else if (payType==3) {
															if(amount<100){
															int amtdiscount = 0;
															int loyalitycardDiscount = totalprice/100*2;
															int newPrice = totalprice-loyalitycardDiscount;
															
															System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
															System.out.println("Your Loyalty card discount is = Rs."+ loyalitycardDiscount);
															System.out.println("Your total new price = Rs."+ newPrice);
															} else if (amount>=100){
																
																int totalpriceDis,newtotalDis,amtdiscount;
																amtdiscount = totalprice/100*2;
																int loyaltycardDiscount = totalprice/100*2;
																int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																System.out.println("Your  Loyalty card discount is = Rs."+ loyaltycardDiscount);
																System.out.println("Your total new price is = Rs."+ newPrice);	
															}	
															
														}	
							}else if(scale == 2) {
								scaleAddedprice =medium+christmascardprice;
								Scanner sc1 = new Scanner(System.in);
								
								System.out.println("Please Choose the quantity you need to print. ");
								int amount= sc1.nextInt();
								
								int totalprice = scaleAddedprice*amount;
								
								System.out.println("Please choose Your Customer Type !!!");
								System.out.println("######");
								System.out.println("######");
								System.out.println("######");
								System.out.println(" Default customer (cash) ***  (1)  ");
								System.out.println(" Credit card customer ***  (2)  ");
								System.out.println(" Loyality card customer ***  (3)  ");
								
								
								int payType= sc.nextInt();
							
									if(payType==1){
											//default customer(<100)
											if(amount<100){
												
												amtdiscount = 0;
												System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
												System.out.println("Your total new price is = Rs."+ totalprice);
							
									
													//default customer<100)
													}else if(amount>=100){
														int totalpriceDis,newtotalDis,amtdiscount;
														
														amtdiscount = totalprice/100*2;
														newtotalDis = totalprice-amtdiscount;
														
														System.out.println("Your discount for the cards quantity is = Rs.iscount is ::"+ amtdiscount);
														System.out.println("Your total new price is = Rs."+ newtotalDis);
										}
											
														}else if (payType == 2) {
															if(amount<100){
																
																int amtdiscount = 0;
																int cardDiscount = totalprice/100*3;
																int newPrice = totalprice-cardDiscount;
																
																System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																System.out.println("Your credit card discount is = Rs."+ cardDiscount);
																System.out.println("Your total new price is = Rs."+ newPrice);
											
													
																	//creditcard customer(<100)
																	}else if(amount>=100){
																		int totalpriceDis,newtotalDis,amtdiscount;
																		amtdiscount = totalprice/100*2;
																		int cardDiscount = totalprice/100*3;
																		int newPrice = totalprice-(cardDiscount+amtdiscount);
																		
																		System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																		System.out.println("Your credit card discount is = Rs."+ cardDiscount);
																		System.out.println("Your total new price is = Rs."+ newPrice);
																	}
															}else if (payType==3) {
																if(amount<100){
																int amtdiscount = 0;
																int loyalitycardDiscount = totalprice/100*2;
																int newPrice = totalprice-loyalitycardDiscount;
																
																System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																System.out.println("Your Loyalty card discount is = Rs."+ loyalitycardDiscount);
																System.out.println("Your total new price is = Rs."+ newPrice);
																} else if (amount>=100){
																	
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int loyaltycardDiscount = totalprice/100*2;
																	int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																	
																	System.out.println("Your discount for the cards quantity is = Rs. "+ amtdiscount);
																	System.out.println("Your  Loyalty card discount is = Rs."+ loyaltycardDiscount);
																	System.out.println("Your total new price is = Rs."+ newPrice);	
	
																}	
															}		
						}else if(scale == 3) {
							
							scaleAddedprice =large+christmascardprice;
							Scanner sc1 = new Scanner(System.in);
							
							System.out.println("Please Choose the quantity you need to print. ");
							int amount= sc1.nextInt();
							
							int totalprice = scaleAddedprice*amount;
							
							System.out.println("Please choose Your Customer Type !!!");
							System.out.println("######");
							System.out.println("######");
							System.out.println("######");
							System.out.println(" Default customer (cash) ***  (1)  ");
							System.out.println(" Credit card customer ***  (2)  ");
							System.out.println(" Loyality card customer ***  (3)  ");
							
							int payType= sc.nextInt();
						
								if(payType==1){
										//default customer(<100)
										if(amount<100){
											
											amtdiscount = 0;
											
											System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
											System.out.println("Your total new price is = Rs."+ totalprice);
												//default customer<100)
												}else if(amount>=100){
													int totalpriceDis,newtotalDis,amtdiscount;
													
													amtdiscount = totalprice/100*2;
													newtotalDis = totalprice-amtdiscount;
													
													System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
													System.out.println("Your total new price is = Rs."+ newtotalDis);				
									}		
													}else if (payType == 2) {
														if(amount<100){
															
															int amtdiscount = 0;
															int cardDiscount = totalprice/100*3;
															int newPrice = totalprice-cardDiscount;
															
															System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
															System.out.println("Your credit card discount is = Rs."+ cardDiscount);
															System.out.println("Your total new price is = Rs."+ newPrice);
																//creditcard customer(<100)
																}else if(amount>=100){
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int cardDiscount = totalprice/100*3;
																	int newPrice = totalprice-(cardDiscount+amtdiscount);
																
																	System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																	System.out.println("Your credit card discount is = Rs."+ cardDiscount);
																	System.out.println("Your total new price is = Rs."+ newPrice);
																}
														}else if (payType==3) {
															if(amount<100){
															int amtdiscount = 0;
															int loyalitycardDiscount = totalprice/100*2;
															int newPrice = totalprice-loyalitycardDiscount;
															
															System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
															System.out.println("Your Loyalty card discount is = Rs."+ loyalitycardDiscount);
															System.out.println("Your total new price is = Rs."+ newPrice);
															} else if (amount>=100){
																
																int totalpriceDis,newtotalDis,amtdiscount;
																amtdiscount = totalprice/100*2;
																int loyaltycardDiscount = totalprice/100*2;
																int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																
																System.out.println("Your discount for the cards quantity is = Rs."+ amtdiscount);
																System.out.println("Your  Loyalty card discount is = Rs."+ loyaltycardDiscount);
																System.out.println("Your total new price is = Rs."+ newPrice);		
															}		
														}					
						}	
					}else if(cardType == 0) {
						System.out.println("Exit to menu");
						break;				
					}else if(n == 0){
					break;
				}
					System.out.print("");
					System.out.print("Do you want to Continue ? (press N for no.. any key to continue)  ");
					String s = sc.next();

					if (s.equalsIgnoreCase("N")) {
						System.out.println("Thank you Dear Valuable Cusromer");
						break;
					} else {
						continue;
					}	
				}
			}
	}
}
package tshirt_publisher;

import java.util.Scanner;

public class TshirtImpl implements ITshirt{

	Scanner sc = new Scanner(System.in);
	int amount =0,totalprice=0,amtdiscount=0;
	@Override
	public void findTshirtCost() {
		//card type depends on user input value
		System.out.println("-----Calculate Printing Tshirts Cost-----");
		System.out.println("1. Calculate Tshirts Price");
		System.out.println("0. Exit");
		System.out.print("Enter No : ");
		
		int n = sc.nextInt();
		
		if(n==1) {
			while(true) {
				System.out.println("-----Choose Tshirt Design-----");
				System.out.println("1). -Logo Design-");
				System.out.println("2). -Text Design-");
				System.out.println("3). -Pattern Design-");
				System.out.println("0). -Exit-");
				System.out.println("----------------------------------");
				System.out.println();
				System.out.print("Enter Menu No : ");
				int tshirtDesign = sc.nextInt();
				
				if(tshirtDesign == 1){
					int logodesignPrice = 2500;
					System.out.println("Logo design price is Rs. "+logodesignPrice);
					
				
					System.out.println("Please Choose the size you need to print.*** ");
					System.out.println(" XS  (1)  ");
					System.out.println(" Small   (2)  ");
					System.out.println(" Medium   (3)  ");
					System.out.println(" Large   (4)  ");
				    System.out.println(" XL   (5)  ");
				    System.out.println(" XXL   (6)  ");
					
	
					int size= sc.nextInt();
					
					int scalePrice;
					int xs = 200;
					int small = 300 ;
					int medium = 400;
					int large = 500 ;
					int xl=600;
					int xxl=700;
					int sizeAddedPrice;
				
					if(size==1){
					
					
						sizeAddedPrice =xs+logodesignPrice;
						Scanner sc1 = new Scanner(System.in);
						
						System.out.println("Please Choose the quantity you need to print. ");
						int amount= sc1.nextInt();
						
						int totalprice = sizeAddedPrice*amount;
						
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
												
												System.out.println("Your discount is ::"+ amtdiscount);
												System.out.println("Your total new price"+ newtotalDis);
												
												
												
						
								}
									
												}else if (payType == 2) {
													if(amount<100){
														
														int amtdiscount = 0;
														int cardDiscount = totalprice/100*3;
														int newPrice = totalprice-cardDiscount;
														
														System.out.println("Your credit card discount is ::"+ amtdiscount);
														System.out.println("Your credit card discount is ::"+ cardDiscount);
														System.out.println("Your total new price"+ newPrice);
									
											
															//creditcard customer(<100)
															}else if(amount>=100){
																int totalpriceDis,newtotalDis,amtdiscount;
																amtdiscount = totalprice/100*2;
																int cardDiscount = totalprice/100*3;
																int newPrice = totalprice-(cardDiscount+amtdiscount);
																
															
																
																System.out.println("Your credit card discount is ::"+ amtdiscount);
																System.out.println("Your credit card discount is ::"+ cardDiscount);
																System.out.println("Your total new price"+ newPrice);
																
							
							
							
															}
													}else if (payType==3) {
														if(amount<100){
														int amtdiscount = 0;
														int loyalitycardDiscount = totalprice/100*2;
														int newPrice = totalprice-loyalitycardDiscount;
														
														System.out.println("Your Loyalty card discount is : "+ amtdiscount);
														System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
														System.out.println("Your total new price"+ newPrice);
														} else if (amount>=100){
															
															int totalpriceDis,newtotalDis,amtdiscount;
															amtdiscount = totalprice/100*2;
															int loyaltycardDiscount = totalprice/100*2;
															int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
															
														
															
															System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
															System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
															System.out.println("Your total new price"+ newPrice);
															
																
														}
														
														
														
														
														
													}
													
						}else if(size == 2) {
							
							
							sizeAddedPrice =small+logodesignPrice;
							Scanner sc1 = new Scanner(System.in);
							
							System.out.println("Please Choose the quantity you need to print. ");
							int amount= sc1.nextInt();
							
							int totalprice = sizeAddedPrice*amount;
							
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
													
													System.out.println("Your discount is ::"+ amtdiscount);
													System.out.println("Your total new price"+ newtotalDis);
													
													
													
							
									}
										
													}else if (payType == 2) {
														if(amount<100){
															
															int amtdiscount = 0;
															int cardDiscount = totalprice/100*3;
															int newPrice = totalprice-cardDiscount;
															
															System.out.println("Your credit card discount is ::"+ amtdiscount);
															System.out.println("Your credit card discount is ::"+ cardDiscount);
															System.out.println("Your total new price"+ newPrice);
										
												
																//creditcard customer(<100)
																}else if(amount>=100){
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int cardDiscount = totalprice/100*3;
																	int newPrice = totalprice-(cardDiscount+amtdiscount);
																	
																
																	
																	System.out.println("Your credit card discount is ::"+ amtdiscount);
																	System.out.println("Your credit card discount is ::"+ cardDiscount);
																	System.out.println("Your total new price"+ newPrice);
																	
								
								
								
																}
														}else if (payType==3) {
															if(amount<100){
															int amtdiscount = 0;
															int loyalitycardDiscount = totalprice/100*2;
															int newPrice = totalprice-loyalitycardDiscount;
															
															System.out.println("Your Loyalty card discount is : "+ amtdiscount);
															System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
															System.out.println("Your total new price"+ newPrice);
															} else if (amount>=100){
																
																int totalpriceDis,newtotalDis,amtdiscount;
																amtdiscount = totalprice/100*2;
																int loyaltycardDiscount = totalprice/100*2;
																int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																
															
																
																System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																System.out.println("Your total new price"+ newPrice);
																
																	
															}
															
															
															
															
															
														}
														
							}else if(size == 3) {
								
								
								sizeAddedPrice =medium+logodesignPrice;
								Scanner sc1 = new Scanner(System.in);
								
								System.out.println("Please Choose the quantity you need to print. ");
								int amount= sc1.nextInt();
								
								int totalprice = sizeAddedPrice*amount;
								
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
														
														System.out.println("Your discount is ::"+ amtdiscount);
														System.out.println("Your total new price"+ newtotalDis);
														
														
														
								
										}
											
														}else if (payType == 2) {
															if(amount<100){
																
																int amtdiscount = 0;
																int cardDiscount = totalprice/100*3;
																int newPrice = totalprice-cardDiscount;
																
																System.out.println("Your credit card discount is ::"+ amtdiscount);
																System.out.println("Your credit card discount is ::"+ cardDiscount);
																System.out.println("Your total new price"+ newPrice);
											
													
																	//creditcard customer(<100)
																	}else if(amount>=100){
																		int totalpriceDis,newtotalDis,amtdiscount;
																		amtdiscount = totalprice/100*2;
																		int cardDiscount = totalprice/100*3;
																		int newPrice = totalprice-(cardDiscount+amtdiscount);
																		
																	
																		
																		System.out.println("Your credit card discount is ::"+ amtdiscount);
																		System.out.println("Your credit card discount is ::"+ cardDiscount);
																		System.out.println("Your total new price"+ newPrice);
																		
									
									
									
																	}
															}else if (payType==3) {
																if(amount<100){
																int amtdiscount = 0;
																int loyalitycardDiscount = totalprice/100*2;
																int newPrice = totalprice-loyalitycardDiscount;
																
																System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																System.out.println("Your total new price"+ newPrice);
																} else if (amount>=100){
																	
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int loyaltycardDiscount = totalprice/100*2;
																	int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																	
																
																	
																	System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																	System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																	System.out.println("Your total new price"+ newPrice);
																	
																		
																}
																
																
																
																
																
															}
															
							}else if(size == 4) {
								
								sizeAddedPrice =large+logodesignPrice;
								Scanner sc1 = new Scanner(System.in);
								
								System.out.println("Please Choose the quantity you need to print. ");
								int amount= sc1.nextInt();
								
								int totalprice = sizeAddedPrice*amount;
								
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
														
														System.out.println("Your discount is ::"+ amtdiscount);
														System.out.println("Your total new price"+ newtotalDis);
														
														
														
								
										}
											
														}else if (payType == 2) {
															if(amount<100){
																
																int amtdiscount = 0;
																int cardDiscount = totalprice/100*3;
																int newPrice = totalprice-cardDiscount;
																
																System.out.println("Your credit card discount is ::"+ amtdiscount);
																System.out.println("Your credit card discount is ::"+ cardDiscount);
																System.out.println("Your total new price"+ newPrice);
											
													
																	//creditcard customer(<100)
																	}else if(amount>=100){
																		int totalpriceDis,newtotalDis,amtdiscount;
																		amtdiscount = totalprice/100*2;
																		int cardDiscount = totalprice/100*3;
																		int newPrice = totalprice-(cardDiscount+amtdiscount);
																		
																	
																		
																		System.out.println("Your credit card discount is ::"+ amtdiscount);
																		System.out.println("Your credit card discount is ::"+ cardDiscount);
																		System.out.println("Your total new price"+ newPrice);
																		
									
									
									
																	}
															}else if (payType==3) {
																if(amount<100){
																int amtdiscount = 0;
																int loyalitycardDiscount = totalprice/100*2;
																int newPrice = totalprice-loyalitycardDiscount;
																
																System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																System.out.println("Your total new price"+ newPrice);
																} else if (amount>=100){
																	
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int loyaltycardDiscount = totalprice/100*2;
																	int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																	
																
																	
																	System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																	System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																	System.out.println("Your total new price"+ newPrice);
																	
																		
																}
																
																
																
																
																
															}
							}else if(size == 5) {
								
								
								sizeAddedPrice =xl+logodesignPrice;
								Scanner sc1 = new Scanner(System.in);
								
								System.out.println("Please Choose the quantity you need to print. ");
								int amount= sc1.nextInt();
								
								int totalprice = sizeAddedPrice*amount;
								
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
														
														System.out.println("Your discount is ::"+ amtdiscount);
														System.out.println("Your total new price"+ newtotalDis);
														
														
														
								
										}
											
														}else if (payType == 2) {
															if(amount<100){
																
																int amtdiscount = 0;
																int cardDiscount = totalprice/100*3;
																int newPrice = totalprice-cardDiscount;
																
																System.out.println("Your credit card discount is ::"+ amtdiscount);
																System.out.println("Your credit card discount is ::"+ cardDiscount);
																System.out.println("Your total new price"+ newPrice);
											
													
																	//creditcard customer(<100)
																	}else if(amount>=100){
																		int totalpriceDis,newtotalDis,amtdiscount;
																		amtdiscount = totalprice/100*2;
																		int cardDiscount = totalprice/100*3;
																		int newPrice = totalprice-(cardDiscount+amtdiscount);
																		
																	
																		
																		System.out.println("Your credit card discount is ::"+ amtdiscount);
																		System.out.println("Your credit card discount is ::"+ cardDiscount);
																		System.out.println("Your total new price"+ newPrice);
																		
									
									
									
																	}
															}else if (payType==3) {
																if(amount<100){
																int amtdiscount = 0;
																int loyalitycardDiscount = totalprice/100*2;
																int newPrice = totalprice-loyalitycardDiscount;
																
																System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																System.out.println("Your total new price"+ newPrice);
																} else if (amount>=100){
																	
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int loyaltycardDiscount = totalprice/100*2;
																	int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																	
																
																	
																	System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																	System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																	System.out.println("Your total new price"+ newPrice);
																	
																		
																}
																
																
																
																
																
															}
								
							}else if(size == 6) {
								
								
								sizeAddedPrice =xxl+logodesignPrice;
								Scanner sc1 = new Scanner(System.in);
								
								System.out.println("Please Choose the quantity you need to print. ");
								int amount= sc1.nextInt();
								
								int totalprice = sizeAddedPrice*amount;
								
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
														
														System.out.println("Your discount is ::"+ amtdiscount);
														System.out.println("Your total new price"+ newtotalDis);
														
														
														
								
										}
											
														}else if (payType == 2) {
															if(amount<100){
																
																int amtdiscount = 0;
																int cardDiscount = totalprice/100*3;
																int newPrice = totalprice-cardDiscount;
																
																System.out.println("Your credit card discount is ::"+ amtdiscount);
																System.out.println("Your credit card discount is ::"+ cardDiscount);
																System.out.println("Your total new price"+ newPrice);
											
													
																	//creditcard customer(<100)
																	}else if(amount>=100){
																		int totalpriceDis,newtotalDis,amtdiscount;
																		amtdiscount = totalprice/100*2;
																		int cardDiscount = totalprice/100*3;
																		int newPrice = totalprice-(cardDiscount+amtdiscount);
																		
																	
																		
																		System.out.println("Your credit card discount is ::"+ amtdiscount);
																		System.out.println("Your credit card discount is ::"+ cardDiscount);
																		System.out.println("Your total new price"+ newPrice);
																		
									
									
									
																	}
															}else if (payType==3) {
																if(amount<100){
																int amtdiscount = 0;
																int loyalitycardDiscount = totalprice/100*2;
																int newPrice = totalprice-loyalitycardDiscount;
																
																System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																System.out.println("Your total new price"+ newPrice);
																} else if (amount>=100){
																	
																	int totalpriceDis,newtotalDis,amtdiscount;
																	amtdiscount = totalprice/100*2;
																	int loyaltycardDiscount = totalprice/100*2;
																	int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																	
																
																	
																	System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																	System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																	System.out.println("Your total new price"+ newPrice);
																	
																		
																}
																
																
																
																
																
															}
								
							}	} else if(tshirtDesign == 2) {

								int textdesignPrice = 3000;
								System.out.println("Logo design price is Rs. "+textdesignPrice);
								
							
								System.out.println("Please Choose the size you need to print.*** ");
								System.out.println(" XS  (1)  ");
								System.out.println(" Small   (2)  ");
								System.out.println(" Medium   (3)  ");
								System.out.println(" Large   (4)  ");
							    System.out.println(" XL   (5)  ");
							    System.out.println(" XXL   (6)  ");
								
				
								int size= sc.nextInt();
								
								int scalePrice;
								int xs = 200;
								int small = 300 ;
								int medium = 400;
								int large = 500 ;
								int xl=600;
								int xxl=700;
								int sizeAddedPrice;
							
								if(size==1){
								
								
									sizeAddedPrice =xs+textdesignPrice;
									Scanner sc1 = new Scanner(System.in);
									
									System.out.println("Please Choose the quantity you need to print. ");
									int amount= sc1.nextInt();
									
									int totalprice = sizeAddedPrice*amount;
									
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
															
															System.out.println("Your discount is ::"+ amtdiscount);
															System.out.println("Your total new price"+ newtotalDis);
															
															
															
									
											}
												
															}else if (payType == 2) {
																if(amount<100){
																	
																	int amtdiscount = 0;
																	int cardDiscount = totalprice/100*3;
																	int newPrice = totalprice-cardDiscount;
																	
																	System.out.println("Your credit card discount is ::"+ amtdiscount);
																	System.out.println("Your credit card discount is ::"+ cardDiscount);
																	System.out.println("Your total new price"+ newPrice);
												
														
																		//creditcard customer(<100)
																		}else if(amount>=100){
																			int totalpriceDis,newtotalDis,amtdiscount;
																			amtdiscount = totalprice/100*2;
																			int cardDiscount = totalprice/100*3;
																			int newPrice = totalprice-(cardDiscount+amtdiscount);
																			
																		
																			
																			System.out.println("Your credit card discount is ::"+ amtdiscount);
																			System.out.println("Your credit card discount is ::"+ cardDiscount);
																			System.out.println("Your total new price"+ newPrice);
																			
										
										
										
																		}
																}else if (payType==3) {
																	if(amount<100){
																	int amtdiscount = 0;
																	int loyalitycardDiscount = totalprice/100*2;
																	int newPrice = totalprice-loyalitycardDiscount;
																	
																	System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																	System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																	System.out.println("Your total new price"+ newPrice);
																	} else if (amount>=100){
																		
																		int totalpriceDis,newtotalDis,amtdiscount;
																		amtdiscount = totalprice/100*2;
																		int loyaltycardDiscount = totalprice/100*2;
																		int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																		
																	
																		
																		System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																		System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																		System.out.println("Your total new price"+ newPrice);
																		
																			
																	}
																	
																	
																	
																	
																	
																}
																
									}else if(size == 2) {
										
										
										sizeAddedPrice =small+textdesignPrice;
										Scanner sc1 = new Scanner(System.in);
										
										System.out.println("Please Choose the quantity you need to print. ");
										int amount= sc1.nextInt();
										
										int totalprice = sizeAddedPrice*amount;
										
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
																
																System.out.println("Your discount is ::"+ amtdiscount);
																System.out.println("Your total new price"+ newtotalDis);
																
																
																
										
												}
													
																}else if (payType == 2) {
																	if(amount<100){
																		
																		int amtdiscount = 0;
																		int cardDiscount = totalprice/100*3;
																		int newPrice = totalprice-cardDiscount;
																		
																		System.out.println("Your credit card discount is ::"+ amtdiscount);
																		System.out.println("Your credit card discount is ::"+ cardDiscount);
																		System.out.println("Your total new price"+ newPrice);
													
															
																			//creditcard customer(<100)
																			}else if(amount>=100){
																				int totalpriceDis,newtotalDis,amtdiscount;
																				amtdiscount = totalprice/100*2;
																				int cardDiscount = totalprice/100*3;
																				int newPrice = totalprice-(cardDiscount+amtdiscount);
																				
																			
																				
																				System.out.println("Your credit card discount is ::"+ amtdiscount);
																				System.out.println("Your credit card discount is ::"+ cardDiscount);
																				System.out.println("Your total new price"+ newPrice);
																				
											
											
											
																			}
																	}else if (payType==3) {
																		if(amount<100){
																		int amtdiscount = 0;
																		int loyalitycardDiscount = totalprice/100*2;
																		int newPrice = totalprice-loyalitycardDiscount;
																		
																		System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																		System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																		System.out.println("Your total new price"+ newPrice);
																		} else if (amount>=100){
																			
																			int totalpriceDis,newtotalDis,amtdiscount;
																			amtdiscount = totalprice/100*2;
																			int loyaltycardDiscount = totalprice/100*2;
																			int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																			
																		
																			
																			System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																			System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																			System.out.println("Your total new price"+ newPrice);
																			
																				
																		}
																		
																		
																		
																		
																		
																	}
																	
										}else if(size == 3) {
											
											
											sizeAddedPrice =medium+textdesignPrice;
											Scanner sc1 = new Scanner(System.in);
											
											System.out.println("Please Choose the quantity you need to print. ");
											int amount= sc1.nextInt();
											
											int totalprice = sizeAddedPrice*amount;
											
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
																	
																	System.out.println("Your discount is ::"+ amtdiscount);
																	System.out.println("Your total new price"+ newtotalDis);
																	
																	
																	
											
													}
														
																	}else if (payType == 2) {
																		if(amount<100){
																			
																			int amtdiscount = 0;
																			int cardDiscount = totalprice/100*3;
																			int newPrice = totalprice-cardDiscount;
																			
																			System.out.println("Your credit card discount is ::"+ amtdiscount);
																			System.out.println("Your credit card discount is ::"+ cardDiscount);
																			System.out.println("Your total new price"+ newPrice);
														
																
																				//creditcard customer(<100)
																				}else if(amount>=100){
																					int totalpriceDis,newtotalDis,amtdiscount;
																					amtdiscount = totalprice/100*2;
																					int cardDiscount = totalprice/100*3;
																					int newPrice = totalprice-(cardDiscount+amtdiscount);
																					
																				
																					
																					System.out.println("Your credit card discount is ::"+ amtdiscount);
																					System.out.println("Your credit card discount is ::"+ cardDiscount);
																					System.out.println("Your total new price"+ newPrice);
																					
												
												
												
																				}
																		}else if (payType==3) {
																			if(amount<100){
																			int amtdiscount = 0;
																			int loyalitycardDiscount = totalprice/100*2;
																			int newPrice = totalprice-loyalitycardDiscount;
																			
																			System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																			System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																			System.out.println("Your total new price"+ newPrice);
																			} else if (amount>=100){
																				
																				int totalpriceDis,newtotalDis,amtdiscount;
																				amtdiscount = totalprice/100*2;
																				int loyaltycardDiscount = totalprice/100*2;
																				int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																				
																			
																				
																				System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																				System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																				System.out.println("Your total new price"+ newPrice);
																				
																					
																			}
																			
																			
																			
																			
																			
																		}
																		
										}else if(size == 4) {
											
											sizeAddedPrice =large+textdesignPrice;
											Scanner sc1 = new Scanner(System.in);
											
											System.out.println("Please Choose the quantity you need to print. ");
											int amount= sc1.nextInt();
											
											int totalprice = sizeAddedPrice*amount;
											
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
																	
																	System.out.println("Your discount is ::"+ amtdiscount);
																	System.out.println("Your total new price"+ newtotalDis);
																	
																	
																	
											
													}
														
																	}else if (payType == 2) {
																		if(amount<100){
																			
																			int amtdiscount = 0;
																			int cardDiscount = totalprice/100*3;
																			int newPrice = totalprice-cardDiscount;
																			
																			System.out.println("Your credit card discount is ::"+ amtdiscount);
																			System.out.println("Your credit card discount is ::"+ cardDiscount);
																			System.out.println("Your total new price"+ newPrice);
														
																
																				//creditcard customer(<100)
																				}else if(amount>=100){
																					int totalpriceDis,newtotalDis,amtdiscount;
																					amtdiscount = totalprice/100*2;
																					int cardDiscount = totalprice/100*3;
																					int newPrice = totalprice-(cardDiscount+amtdiscount);
																					
																				
																					
																					System.out.println("Your credit card discount is ::"+ amtdiscount);
																					System.out.println("Your credit card discount is ::"+ cardDiscount);
																					System.out.println("Your total new price"+ newPrice);
																					
												
												
												
																				}
																		}else if (payType==3) {
																			if(amount<100){
																			int amtdiscount = 0;
																			int loyalitycardDiscount = totalprice/100*2;
																			int newPrice = totalprice-loyalitycardDiscount;
																			
																			System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																			System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																			System.out.println("Your total new price"+ newPrice);
																			} else if (amount>=100){
																				
																				int totalpriceDis,newtotalDis,amtdiscount;
																				amtdiscount = totalprice/100*2;
																				int loyaltycardDiscount = totalprice/100*2;
																				int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																				
																			
																				
																				System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																				System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																				System.out.println("Your total new price"+ newPrice);
																				
																					
																			}
																			
																			
																			
																			
																			
																		}
										}else if(size == 5) {
											
											
											sizeAddedPrice =xl+textdesignPrice;
											Scanner sc1 = new Scanner(System.in);
											
											System.out.println("Please Choose the quantity you need to print. ");
											int amount= sc1.nextInt();
											
											int totalprice = sizeAddedPrice*amount;
											
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
																	
																	System.out.println("Your discount is ::"+ amtdiscount);
																	System.out.println("Your total new price"+ newtotalDis);
																	
																	
																	
											
													}
														
																	}else if (payType == 2) {
																		if(amount<100){
																			
																			int amtdiscount = 0;
																			int cardDiscount = totalprice/100*3;
																			int newPrice = totalprice-cardDiscount;
																			
																			System.out.println("Your credit card discount is ::"+ amtdiscount);
																			System.out.println("Your credit card discount is ::"+ cardDiscount);
																			System.out.println("Your total new price"+ newPrice);
														
																
																				//creditcard customer(<100)
																				}else if(amount>=100){
																					int totalpriceDis,newtotalDis,amtdiscount;
																					amtdiscount = totalprice/100*2;
																					int cardDiscount = totalprice/100*3;
																					int newPrice = totalprice-(cardDiscount+amtdiscount);
																					
																				
																					
																					System.out.println("Your credit card discount is ::"+ amtdiscount);
																					System.out.println("Your credit card discount is ::"+ cardDiscount);
																					System.out.println("Your total new price"+ newPrice);
																					
												
												
												
																				}
																		}else if (payType==3) {
																			if(amount<100){
																			int amtdiscount = 0;
																			int loyalitycardDiscount = totalprice/100*2;
																			int newPrice = totalprice-loyalitycardDiscount;
																			
																			System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																			System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																			System.out.println("Your total new price"+ newPrice);
																			} else if (amount>=100){
																				
																				int totalpriceDis,newtotalDis,amtdiscount;
																				amtdiscount = totalprice/100*2;
																				int loyaltycardDiscount = totalprice/100*2;
																				int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																				
																			
																				
																				System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																				System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																				System.out.println("Your total new price"+ newPrice);
																				
																					
																			}
																			
																			
																			
																			
																			
																		}
											
										}else if(size == 6) {
											
											
											sizeAddedPrice =xxl+textdesignPrice;
											Scanner sc1 = new Scanner(System.in);
											
											System.out.println("Please Choose the quantity you need to print. ");
											int amount= sc1.nextInt();
											
											int totalprice = sizeAddedPrice*amount;
											
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
																	
																	System.out.println("Your discount is ::"+ amtdiscount);
																	System.out.println("Your total new price"+ newtotalDis);
																	
																	
																	
											
													}
														
																	}else if (payType == 2) {
																		if(amount<100){
																			
																			int amtdiscount = 0;
																			int cardDiscount = totalprice/100*3;
																			int newPrice = totalprice-cardDiscount;
																			
																			System.out.println("Your credit card discount is ::"+ amtdiscount);
																			System.out.println("Your credit card discount is ::"+ cardDiscount);
																			System.out.println("Your total new price"+ newPrice);
														
																
																				//creditcard customer(<100)
																				}else if(amount>=100){
																					int totalpriceDis,newtotalDis,amtdiscount;
																					amtdiscount = totalprice/100*2;
																					int cardDiscount = totalprice/100*3;
																					int newPrice = totalprice-(cardDiscount+amtdiscount);
																					
																				
																					
																					System.out.println("Your credit card discount is ::"+ amtdiscount);
																					System.out.println("Your credit card discount is ::"+ cardDiscount);
																					System.out.println("Your total new price"+ newPrice);
																					
												
												
												
																				}
																		}else if (payType==3) {
																			if(amount<100){
																			int amtdiscount = 0;
																			int loyalitycardDiscount = totalprice/100*2;
																			int newPrice = totalprice-loyalitycardDiscount;
																			
																			System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																			System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																			System.out.println("Your total new price"+ newPrice);
																			} else if (amount>=100){
																				
																				int totalpriceDis,newtotalDis,amtdiscount;
																				amtdiscount = totalprice/100*2;
																				int loyaltycardDiscount = totalprice/100*2;
																				int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																				
																			
																				
																				System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																				System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																				System.out.println("Your total new price"+ newPrice);
																				
																					
																			}
																			
																			
																			
																			
																			
																		}
											
					
				}
						
			}else if(tshirtDesign == 3) {

								int patterndesignPrice = 4000;
								System.out.println("Logo design price is Rs. "+patterndesignPrice);
								
							
								System.out.println("Please Choose the size you need to print.*** ");
								System.out.println(" XS  (1)  ");
								System.out.println(" Small   (2)  ");
								System.out.println(" Medium   (3)  ");
								System.out.println(" Large   (4)  ");
							    System.out.println(" XL   (5)  ");
							    System.out.println(" XXL   (6)  ");
								
				
								int size= sc.nextInt();
								
								int scalePrice;
								int xs = 200;
								int small = 300 ;
								int medium = 400;
								int large = 500 ;
								int xl=600;
								int xxl=700;
								int sizeAddedPrice;
							
								if(size==1){
								
								
									sizeAddedPrice =xs+patterndesignPrice;
									Scanner sc1 = new Scanner(System.in);
									
									System.out.println("Please Choose the quantity you need to print. ");
									int amount= sc1.nextInt();
									
									int totalprice = sizeAddedPrice*amount;
									
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
															
															System.out.println("Your discount is ::"+ amtdiscount);
															System.out.println("Your total new price"+ newtotalDis);
															
															
															
									
											}
												
															}else if (payType == 2) {
																if(amount<100){
																	
																	int amtdiscount = 0;
																	int cardDiscount = totalprice/100*3;
																	int newPrice = totalprice-cardDiscount;
																	
																	System.out.println("Your credit card discount is ::"+ amtdiscount);
																	System.out.println("Your credit card discount is ::"+ cardDiscount);
																	System.out.println("Your total new price"+ newPrice);
												
														
																		//creditcard customer(<100)
																		}else if(amount>=100){
																			int totalpriceDis,newtotalDis,amtdiscount;
																			amtdiscount = totalprice/100*2;
																			int cardDiscount = totalprice/100*3;
																			int newPrice = totalprice-(cardDiscount+amtdiscount);
																			
																		
																			
																			System.out.println("Your credit card discount is ::"+ amtdiscount);
																			System.out.println("Your credit card discount is ::"+ cardDiscount);
																			System.out.println("Your total new price"+ newPrice);
																			
										
										
										
																		}
																}else if (payType==3) {
																	if(amount<100){
																	int amtdiscount = 0;
																	int loyalitycardDiscount = totalprice/100*2;
																	int newPrice = totalprice-loyalitycardDiscount;
																	
																	System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																	System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																	System.out.println("Your total new price"+ newPrice);
																	} else if (amount>=100){
																		
																		int totalpriceDis,newtotalDis,amtdiscount;
																		amtdiscount = totalprice/100*2;
																		int loyaltycardDiscount = totalprice/100*2;
																		int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																		
																	
																		
																		System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																		System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																		System.out.println("Your total new price"+ newPrice);
																		
																			
																	}
																	
																	
																	
																	
																	
																}
																
									}else if(size == 2) {
										
										
										sizeAddedPrice =small+patterndesignPrice;
										Scanner sc1 = new Scanner(System.in);
										
										System.out.println("Please Choose the quantity you need to print. ");
										int amount= sc1.nextInt();
										
										int totalprice = sizeAddedPrice*amount;
										
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
																
																System.out.println("Your discount is ::"+ amtdiscount);
																System.out.println("Your total new price"+ newtotalDis);
																
																
																
										
												}
													
																}else if (payType == 2) {
																	if(amount<100){
																		
																		int amtdiscount = 0;
																		int cardDiscount = totalprice/100*3;
																		int newPrice = totalprice-cardDiscount;
																		
																		System.out.println("Your credit card discount is ::"+ amtdiscount);
																		System.out.println("Your credit card discount is ::"+ cardDiscount);
																		System.out.println("Your total new price"+ newPrice);
													
															
																			//creditcard customer(<100)
																			}else if(amount>=100){
																				int totalpriceDis,newtotalDis,amtdiscount;
																				amtdiscount = totalprice/100*2;
																				int cardDiscount = totalprice/100*3;
																				int newPrice = totalprice-(cardDiscount+amtdiscount);
																				
																			
																				
																				System.out.println("Your credit card discount is ::"+ amtdiscount);
																				System.out.println("Your credit card discount is ::"+ cardDiscount);
																				System.out.println("Your total new price"+ newPrice);
																				
											
											
											
																			}
																	}else if (payType==3) {
																		if(amount<100){
																		int amtdiscount = 0;
																		int loyalitycardDiscount = totalprice/100*2;
																		int newPrice = totalprice-loyalitycardDiscount;
																		
																		System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																		System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																		System.out.println("Your total new price"+ newPrice);
																		} else if (amount>=100){
																			
																			int totalpriceDis,newtotalDis,amtdiscount;
																			amtdiscount = totalprice/100*2;
																			int loyaltycardDiscount = totalprice/100*2;
																			int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																			
																		
																			
																			System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																			System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																			System.out.println("Your total new price"+ newPrice);
																			
																				
																		}
																		
																		
																		
																		
																		
																	}
																	
										}else if(size == 3) {
											
											
											sizeAddedPrice =medium+patterndesignPrice;
											Scanner sc1 = new Scanner(System.in);
											
											System.out.println("Please Choose the quantity you need to print. ");
											int amount= sc1.nextInt();
											
											int totalprice = sizeAddedPrice*amount;
											
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
																	
																	System.out.println("Your discount is ::"+ amtdiscount);
																	System.out.println("Your total new price"+ newtotalDis);
																	
																	
																	
											
													}
														
																	}else if (payType == 2) {
																		if(amount<100){
																			
																			int amtdiscount = 0;
																			int cardDiscount = totalprice/100*3;
																			int newPrice = totalprice-cardDiscount;
																			
																			System.out.println("Your credit card discount is ::"+ amtdiscount);
																			System.out.println("Your credit card discount is ::"+ cardDiscount);
																			System.out.println("Your total new price"+ newPrice);
														
																
																				//creditcard customer(<100)
																				}else if(amount>=100){
																					int totalpriceDis,newtotalDis,amtdiscount;
																					amtdiscount = totalprice/100*2;
																					int cardDiscount = totalprice/100*3;
																					int newPrice = totalprice-(cardDiscount+amtdiscount);
																					
																				
																					
																					System.out.println("Your credit card discount is ::"+ amtdiscount);
																					System.out.println("Your credit card discount is ::"+ cardDiscount);
																					System.out.println("Your total new price"+ newPrice);
																					
												
												
												
																				}
																		}else if (payType==3) {
																			if(amount<100){
																			int amtdiscount = 0;
																			int loyalitycardDiscount = totalprice/100*2;
																			int newPrice = totalprice-loyalitycardDiscount;
																			
																			System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																			System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																			System.out.println("Your total new price"+ newPrice);
																			} else if (amount>=100){
																				
																				int totalpriceDis,newtotalDis,amtdiscount;
																				amtdiscount = totalprice/100*2;
																				int loyaltycardDiscount = totalprice/100*2;
																				int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																				
																			
																				
																				System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																				System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																				System.out.println("Your total new price"+ newPrice);
																				
																					
																			}
																			
																			
																			
																			
																			
																		}
																		
										}else if(size == 4) {
											
											sizeAddedPrice =large+patterndesignPrice;
											Scanner sc1 = new Scanner(System.in);
											
											System.out.println("Please Choose the quantity you need to print. ");
											int amount= sc1.nextInt();
											
											int totalprice = sizeAddedPrice*amount;
											
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
																	
																	System.out.println("Your discount is ::"+ amtdiscount);
																	System.out.println("Your total new price"+ newtotalDis);
																	
																	
																	
											
													}
														
																	}else if (payType == 2) {
																		if(amount<100){
																			
																			int amtdiscount = 0;
																			int cardDiscount = totalprice/100*3;
																			int newPrice = totalprice-cardDiscount;
																			
																			System.out.println("Your credit card discount is ::"+ amtdiscount);
																			System.out.println("Your credit card discount is ::"+ cardDiscount);
																			System.out.println("Your total new price"+ newPrice);
														
																
																				//creditcard customer(<100)
																				}else if(amount>=100){
																					int totalpriceDis,newtotalDis,amtdiscount;
																					amtdiscount = totalprice/100*2;
																					int cardDiscount = totalprice/100*3;
																					int newPrice = totalprice-(cardDiscount+amtdiscount);
																					
																				
																					
																					System.out.println("Your credit card discount is ::"+ amtdiscount);
																					System.out.println("Your credit card discount is ::"+ cardDiscount);
																					System.out.println("Your total new price"+ newPrice);
																					
												
												
												
																				}
																		}else if (payType==3) {
																			if(amount<100){
																			int amtdiscount = 0;
																			int loyalitycardDiscount = totalprice/100*2;
																			int newPrice = totalprice-loyalitycardDiscount;
																			
																			System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																			System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																			System.out.println("Your total new price"+ newPrice);
																			} else if (amount>=100){
																				
																				int totalpriceDis,newtotalDis,amtdiscount;
																				amtdiscount = totalprice/100*2;
																				int loyaltycardDiscount = totalprice/100*2;
																				int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																				
																			
																				
																				System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																				System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																				System.out.println("Your total new price"+ newPrice);
																				
																					
																			}
																			
																			
																			
																			
																			
																		}
										}else if(size == 5) {
											
											
											sizeAddedPrice =xl+patterndesignPrice;
											Scanner sc1 = new Scanner(System.in);
											
											System.out.println("Please Choose the quantity you need to print. ");
											int amount= sc1.nextInt();
											
											int totalprice = sizeAddedPrice*amount;
											
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
																	
																	System.out.println("Your discount is ::"+ amtdiscount);
																	System.out.println("Your total new price"+ newtotalDis);
																	
																	
																	
											
													}
														
																	}else if (payType == 2) {
																		if(amount<100){
																			
																			int amtdiscount = 0;
																			int cardDiscount = totalprice/100*3;
																			int newPrice = totalprice-cardDiscount;
																			
																			System.out.println("Your credit card discount is ::"+ amtdiscount);
																			System.out.println("Your credit card discount is ::"+ cardDiscount);
																			System.out.println("Your total new price"+ newPrice);
														
																
																				//creditcard customer(<100)
																				}else if(amount>=100){
																					int totalpriceDis,newtotalDis,amtdiscount;
																					amtdiscount = totalprice/100*2;
																					int cardDiscount = totalprice/100*3;
																					int newPrice = totalprice-(cardDiscount+amtdiscount);
																					
																				
																					
																					System.out.println("Your credit card discount is ::"+ amtdiscount);
																					System.out.println("Your credit card discount is ::"+ cardDiscount);
																					System.out.println("Your total new price"+ newPrice);
																					
												
												
												
																				}
																		}else if (payType==3) {
																			if(amount<100){
																			int amtdiscount = 0;
																			int loyalitycardDiscount = totalprice/100*2;
																			int newPrice = totalprice-loyalitycardDiscount;
																			
																			System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																			System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																			System.out.println("Your total new price"+ newPrice);
																			} else if (amount>=100){
																				
																				int totalpriceDis,newtotalDis,amtdiscount;
																				amtdiscount = totalprice/100*2;
																				int loyaltycardDiscount = totalprice/100*2;
																				int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																				
																			
																				
																				System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																				System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																				System.out.println("Your total new price"+ newPrice);
																				
																					
																			}
																			
																			
																			
																			
																			
																		}
											
										}else if(size == 6) {
											
											
											sizeAddedPrice =xxl+patterndesignPrice;
											Scanner sc1 = new Scanner(System.in);
											
											System.out.println("Please Choose the quantity you need to print. ");
											int amount= sc1.nextInt();
											
											int totalprice = sizeAddedPrice*amount;
											
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
																	
																	System.out.println("Your discount is ::"+ amtdiscount);
																	System.out.println("Your total new price"+ newtotalDis);
																	
																	
																	
											
													}
														
																	}else if (payType == 2) {
																		if(amount<100){
																			
																			int amtdiscount = 0;
																			int cardDiscount = totalprice/100*3;
																			int newPrice = totalprice-cardDiscount;
																			
																			System.out.println("Your credit card discount is ::"+ amtdiscount);
																			System.out.println("Your credit card discount is ::"+ cardDiscount);
																			System.out.println("Your total new price"+ newPrice);
														
																
																				//creditcard customer(<100)
																				}else if(amount>=100){
																					int totalpriceDis,newtotalDis,amtdiscount;
																					amtdiscount = totalprice/100*2;
																					int cardDiscount = totalprice/100*3;
																					int newPrice = totalprice-(cardDiscount+amtdiscount);
																					
																				
																					
																					System.out.println("Your credit card discount is ::"+ amtdiscount);
																					System.out.println("Your credit card discount is ::"+ cardDiscount);
																					System.out.println("Your total new price"+ newPrice);
																					
												
												
												
																				}
																		}else if (payType==3) {
																			if(amount<100){
																			int amtdiscount = 0;
																			int loyalitycardDiscount = totalprice/100*2;
																			int newPrice = totalprice-loyalitycardDiscount;
																			
																			System.out.println("Your Loyalty card discount is : "+ amtdiscount);
																			System.out.println("Your Loyalty card discount is : "+ loyalitycardDiscount);
																			System.out.println("Your total new price"+ newPrice);
																			} else if (amount>=100){
																				
																				int totalpriceDis,newtotalDis,amtdiscount;
																				amtdiscount = totalprice/100*2;
																				int loyaltycardDiscount = totalprice/100*2;
																				int newPrice = totalprice-(loyaltycardDiscount+amtdiscount);
																				
																			
																				
																				System.out.println("Your  Loyalty card discount is : "+ amtdiscount);
																				System.out.println("Your  Loyalty card discount is : "+ loyaltycardDiscount);
																				System.out.println("Your total new price"+ newPrice);
																				
																					
																			}
																			
																			
																			
																			
																			
																		}
				continue;
			}
			
			

			}
			}
		}
		
		
		
		
		
		
		
	}

	
	/*	@Override
	public void payTypeCash() {


		
		
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
					
					System.out.println("Your discount is ::"+ amtdiscount);
					System.out.println("Your total new price"+ newtotalDis);
					
					
					

	}
		
					
		
	}*/
		
	
	}	
	



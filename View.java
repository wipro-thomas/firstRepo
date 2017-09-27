import java.util.Arrays;
import java.util.Scanner;

public class View {
	private Scanner sc;
	private String systemSwitch;
	private String[] newUserData;
	private String modUserData;
	private String custID;
	private String[] newProductData;
	private String modProductData;
	private String prodId;
	private String prodQUantity;

	public View() {
		this.sc = new Scanner(System.in);
		this.systemSwitch = "on";
	}

	public void startApp() {
		System.out
				.println("Sainsbury`s product management system is running...");
		// This works until off is provided as input!
		while (!systemSwitch.equals("off")) {
			System.out.println("For customer management press enter 1;");
			System.out.println("For stock management enter 2;");
			System.out.println("For check-out platform enter 3;");
			System.out.println("For terminating the system press 4;");
			// Input for the first menu
			int firstMenuInput = sc.nextInt();
			if (firstMenuInput == 1) {
				int secontMenuInput = 0;
				customerManagement(secontMenuInput);
			} else if (firstMenuInput == 2) {
				int secondMenuInput = 0;
				stockManagement(secondMenuInput);
			} else if (firstMenuInput == 3) {
				int secondMenuInput = 0;
				checOutPlatform(secondMenuInput);
			} else if (firstMenuInput == 4) {
				System.out
						.println("To terminate the system enter 'off' otherwise enter anything else!");
				systemSwitch = sc.next().toLowerCase();
			} else {
				System.out.println("The option you have entered is not valid!");
			}
		}
	}

	private void customerManagement(int secontMenuInput) {
		// customer management.
		while (secontMenuInput != 3) {
			System.out.println("To add a new client enter 1;");
			System.out
					.println("To modify the data of an existing client enter 2;");
			System.out.println("To go back to the initial menu enter 3;");
			secontMenuInput = sc.nextInt();
			if (secontMenuInput == 1) {
				createNewCustomer();
			} else if (secontMenuInput == 2) {
				editCustomerData();
			} else if (secontMenuInput == 3) {
				System.out.println("Sending back to previous menu...");
			} else {
				System.out.println("This is invalid input");
			}
		}
	}

	private void createNewCustomer() {
		String loopBreak = "";
		while (!loopBreak.equals("y")) {
			newUserData = new String[7];
			System.out
					.println("Enter the customer`s first name or enter 'q' to go back to the initial menu!");
			sc.nextLine();
			String newCustFName = sc.nextLine();
			if (!newCustFName.toLowerCase().equals("q")) {
				newUserData[0] = newCustFName;
				System.out
						.println("Enter the customer`s last name or enter 'q' to go back to the initial menu!");
				// Customer last name
				String newCustLName = sc.nextLine();
				if (!newCustLName.toLowerCase().equals("q")) {
					newUserData[1] = newCustLName;
					System.out
							.println("Enter the customer`s firts line of address or enter 'q' to go back to the initial menu!");
					// customer address line 1
					String newCustLAdd1 = sc.nextLine();
					if (!newCustLAdd1.equals("q")) {
						newUserData[2] = newCustLAdd1;
						System.out
								.println("Enter the customer`s second line of address or enter 'q' to go back to the initial menu!");
						String newCustAdd2 = sc.nextLine();
						// customer address line 2
						if (!newCustAdd2.toLowerCase().equals("q")) {
							newUserData[3] = newCustAdd2;
							System.out
									.println("Enter the customer`s city or enter 'q' to go back to the initial menu!");
							String newCustLCity = sc.nextLine();
							// customer city
							if (!newCustLCity.toLowerCase().equals("q")) {
								newUserData[4] = newCustLCity;
								System.out
										.println("Enter the customer`s post code or enter 'q' to go back to the initial menu!");
								String newCustPC = sc.nextLine();
								if (!newCustPC.toLowerCase().equals("q")) {
									newUserData[5] = newCustPC;
									System.out
											.println("Enter the customer`s phone number or enter 'q' to go back to the initial menu!");
									String newCustPN = sc.nextLine();
									// phone number
									if (!newCustPN.toLowerCase().endsWith("q")) {
										newUserData[6] = newCustPN;
										int cusCreFinalConf = 0;
										while (cusCreFinalConf != 1
												&& cusCreFinalConf != 2) {
											System.out
													.println("To save the the new customer in the database enter 1;");
											System.out
													.println("To discard the changes enter 2;");
											// save / discard option.
											cusCreFinalConf = sc.nextInt();
											if (cusCreFinalConf == 1) {
												// create and add the customer
												// to the library!
												System.out
														.println("The customer entry has successfully been created!");
												System.out
														.println("user input "
																+ Arrays.toString(newUserData));
												System.out
														.println("Would you like to go back to the previous menu? (y/n)");
												loopBreak = sc.next();
											} else if (cusCreFinalConf == 2) {
												newUserData = null;
												System.out
														.println("The customer data has been delated!");
												System.out
														.println("Would you like to go back to the previous menu? (y/n)");
												loopBreak = sc.next();
											} else {
												System.out
														.println("The option you have entered is not valid!");
											}
										}
									} else if (newCustPN.toLowerCase().equals(
											"q")) {
										System.out
												.println("Would you like to go back to the previous menu? (y/n)");
										newUserData = null;
										loopBreak = sc.next();
									}
								} else if (newCustPC.toLowerCase().equals("q")) {
									System.out
											.println("Would you like to go back to the previous menu? (y/n)");
									newUserData = null;
									loopBreak = sc.next();
								}
							} else if (newCustLCity.toLowerCase().equals("q")) {
								System.out
										.println("Would you like to go back to the previous menu? (y/n)");
								newUserData = null;
								loopBreak = sc.next();
							}
						} else if (newCustAdd2.toLowerCase().equals("q")) {
							System.out
									.println("Would you like to go back to the previous menu? (y/n)");
							newUserData = null;
							loopBreak = sc.next();
						}
					} else if (newCustLAdd1.toLowerCase().equals("q")) {
						System.out
								.println("Would you like to go back to the previous menu? (y/n)");
						newUserData = null;
						loopBreak = sc.next();
					}
				} else if (newCustLName.toLowerCase().equals("q")) {
					System.out
							.println("Would you like to go back to the previous menu? (y/n)");
					newUserData = null;
					loopBreak = sc.next();
				}
			} else if (newCustFName.toLowerCase().equals("q")) {
				System.out
						.println("Would you like to go back to the previous menu? (y/n)");
				newUserData = null;
				loopBreak = sc.next();
			}
		}
	}

	private void editCustomerData() {
		String loopBreak = "";
		while (!loopBreak.equals("y")) {
			System.out
					.println("Enter the customer`s id number or enter 'q' to go back to the initial menu!");
			custID = sc.next();
			// get the user info for the provided id number and print the user
			// info;
			if (!custID.equals("q")) {
				// Print user data from database!
				System.out
						.println("Is that the user entry you would like to modidy? (y/n)");
			} else {
				System.out
						.println("Would you like to go back to the previous menu? (y/n)");
				loopBreak = sc.next();
				if (loopBreak.equals("y")) {
					break;
				}
			}
			String answer = sc.next();
			if (answer.toLowerCase().equals("y")) {
				int modChoice = 0;
				while (modChoice != 9) {
					System.out.println("To modify the first name enter 1;");
					System.out.println("To modify the last name enter 2;");
					System.out
							.println("To modify the first line address enter 3;");
					System.out
							.println("To modify the second line address enter 4;");
					System.out.println("To modify the city enter 5;");
					System.out.println("To modify the post code enter 6;");
					System.out
							.println("To modify the telephone number enter 7;");
					System.out.println("To delete the customer enter 8;");
					System.out.println("To go to the previous menu enter 9;");
					modChoice = sc.nextInt();
					// modify first name
					if (modChoice == 1) {
						System.out
								.println("Enter the new first name  or enter 'q' to go back");
						modUserData = sc.next();
						if (!modUserData.equals("q")) {
							// mod data
							System.out
									.println("First name updated successfully");
						}
					}
					// modify last name
					else if (modChoice == 2) {
						System.out
								.println("Enter the new last name  or enter 'q' to go back");
						modUserData = sc.next();
						if (!modUserData.equals("q")) {
							// mod data
							System.out
									.println("Last name updated successfully");
						}
					}
					// modify addres line 1
					else if (modChoice == 3) {
						System.out
								.println("Enter the new first line address  or enter 'q' to go back");
						modUserData = sc.nextLine();
						sc.nextLine();
						if (!modUserData.equals("q")) {
							// mod data
							System.out
									.println("First line address updated successfully");
						}

					}
					// modify address line 2
					else if (modChoice == 4) {
						System.out
								.println("Enter the new second line address  or enter 'q' to go back");
						modUserData = sc.nextLine();
						sc.nextLine();
						if (!modUserData.equals("q")) {
							// mod data
							System.out
									.println("Second line updated successfully");
						}
					}
					// modify city
					else if (modChoice == 5) {
						System.out
								.println("Enter the new city  or enter 'q' to go back");
						modUserData = sc.next();
						if (!modUserData.equals("q")) {
							// mod data
							System.out.println("City updated successfully");
						}
					}
					// modify post code
					else if (modChoice == 6) {
						System.out
								.println("Enter the new post code  or enter 'q' to go back");
						modUserData = sc.next();
						if (!modUserData.equals("q")) {
							// mod data
							System.out
									.println("Post code updated successfully");
						}
					}
					// modify telephone number
					else if (modChoice == 7) {
						System.out
								.println("Enter the new telephone number  or enter 'q' to go back");
						modUserData = sc.next();
						if (!modUserData.equals("q")) {
							// mod data
							System.out
									.println("Phone number updated successfully");
						}
					}
					// delete customer
					else if (modChoice == 8) {
						// delete customer
						System.out
								.println("You have successfuly deleted the customer");
						modChoice = 9;
					}
					// go back
					else if (modChoice == 9) {
						System.out.println("Sending back the previous menu...");
					} else {
						System.out.println("This is not a valid input");
					}
				}
			} else if (!answer.toLowerCase().equals("y")
					&& !answer.toLowerCase().equals("n")) {
				System.out.println("This is not a valid input!");
			}
		}
	}

	private void stockManagement(int secondMenuInput) {
		while (secondMenuInput != 3) {
			System.out.println("To add a new product enter 1;");
			System.out.println("To modify an existing product enter 2;");
			System.out.println("To go back enter 3");
			secondMenuInput = sc.nextInt();
			if (secondMenuInput == 1) {
				addANewProduct();
			} else if (secondMenuInput == 2) {
				moidfyProduct();
			} else if (secondMenuInput == 3) {
				System.out.println("Sending back to previous menu...");
			} else {
				System.out.println("The option you have entered is not valid!");
			}
		}
	}

	private void addANewProduct() {
		String loopBreak = "";
		while (!loopBreak.equals("y")) {
			newProductData = new String[4];
			System.out.println("Enter product name or enter 'q' to go back!");
			String newProdname = sc.next();
			if (!newProdname.equals("q")) {
				newProductData[0] = newProdname;
				System.out
						.println("Enter the buy at price or enter 'q' to go back!");
				String newProdBAP = sc.next();
				if (!newProdBAP.equals("q")) {
					newProductData[1] = newProdBAP;
					System.out
							.println("Enter the sell at price or enter 'q' to go back!");
					String newProdSAP = sc.next();
					if (!newProdSAP.equals("")) {
						newProductData[2] = newProdSAP;
						System.out
								.println("Enter the quantity of the new products or enter 'q' to go back!");
						String newProdQuant = sc.next();
						if (!newProdQuant.equals("q")) {
							newProductData[3] = newProdQuant;
							int cusCreFinalConf = 0;
							while (cusCreFinalConf != 1 && cusCreFinalConf != 2) {
								System.out
										.println("To save the the new product in the database enter 1;");
								System.out
										.println("To discard the changes enter 2;");
								// save / discard option.
								cusCreFinalConf = sc.nextInt();
								if (cusCreFinalConf == 1) {
									// create and add the product to the
									// library!
									System.out.println("prod data "
											+ Arrays.toString(newProductData));
									System.out
											.println("The product entry has successfully been created!");
								} else if (cusCreFinalConf == 2) {
									System.out
											.println("The product data has been delated!");
									newProductData = null;
								} else {
									System.out
											.println("The option you have entered is not valid!");
								}
							}
						} else if (newProdQuant.toLowerCase().equals("q")) {
							System.out
									.println("Would you like to go back to the previous menu? (y/n)");
							newProductData = null;
							loopBreak = sc.next();
						}
					} else if (newProdSAP.toLowerCase().equals("q")) {
						System.out
								.println("Would you like to go back to the previous menu? (y/n)");
						newProductData = null;
						loopBreak = sc.next();
					}
				} else if (newProdBAP.toLowerCase().equals("q")) {
					System.out
							.println("Would you like to go back to the previous menu? (y/n)");
					newProductData = null;
					loopBreak = sc.next();
				}
			} else if (newProdname.toLowerCase().equals("q")) {
				System.out
						.println("Would you like to go back to the previous menu? (y/n)");
				newProductData = null;
				loopBreak = sc.next();
			}
		}
	}

	private void moidfyProduct() {
		String loopBreak = "";
		while (!loopBreak.equals("y")) {
			System.out
					.println("Enter the product id number or enter 'q' to go back to the initial menu!");
			prodId = sc.next();
			if (!prodId.equals("q")) {
				// get the product info for the provided id number and print the
				// product info;
				System.out
						.println("Is that the product entry you would like to modidy? (y/n)");
				String answer = sc.next();
				if (answer.equals("y")) {
					int modChoice = 0;
					while (modChoice != 6) {
						System.out.println("To modify the name enter 1");
						System.out.println("To modify the buy price enter 2;");
						System.out.println("To modify the sell price enter 3;");
						System.out.println("To modify the quantity enter 4;");
						System.out.println("To delete the product enter 5;");
						System.out.println("To go back enter 6;");
						modChoice = sc.nextInt();
						// modify name
						if (modChoice == 1) {
							System.out
									.println("Enter the new product name or enter 'q' to go back");
							modProductData = sc.next();
							if (!modProductData.equals("q")) {
								// process input.
								System.out
										.println("The changes have been approved!");
							}
						}
						// modify buy price
						else if (modChoice == 2) {
							System.out
									.println("Enter the new buy price or enter 'q' to go back");
							modProductData = sc.next();
							if (!modProductData.equals("q")) {
								// process input.
								System.out
										.println("The changes have been approved!");
							}
						}
						// modify sell price
						else if (modChoice == 3) {
							System.out
									.println("Enter the new sell price or enter 'q' to go back");
							modProductData = sc.next();
							if (!modProductData.equals("q")) {
								// process input.
								System.out
										.println("The changes have been approved!");
							}
						}
						// modify quantity
						else if (modChoice == 4) {
							System.out
									.println("Enter the new quantity or enter 'q' to go back");
							modProductData = sc.next();
							if (!modProductData.equals("q")) {
								// process input.
								System.out
										.println("The changes have been approved!");
							}
						}
						// delete
						else if (modChoice == 5) {
							// detele product
							System.out.println("Product successfuly deleted!");
							modChoice = 6;
						}
						// exit
						else if (modChoice == 6) {
							System.out
									.println("Sending back to initial menu...");
						} else {
							System.out
									.println("You have entered an invalid input!");
						}
					}

				} else if (answer.equals("n")) {
					System.out
							.println("You will need to enter the details again!");
				} else {
					System.out
							.println("The option you have entered is not valid!");
				}
			} else if (prodId.toLowerCase().equals("q")) {
				System.out
						.println("Would you like to go back to the previous menu? (y/n)");
				loopBreak = sc.next();
			}
		}
	}

	private void checOutPlatform(int secondMenuInput) {
		while (secondMenuInput != 4) {
			System.out.println("To add a transaction enter 1");
			System.out.println("To modify a transaction enter 2;");
			System.out.println("To complete a transaction enter 3;");
			System.out.println("To go back enter 4;");
			secondMenuInput = sc.nextInt();
			if (secondMenuInput == 1) {
				addATransaction();
			} else if (secondMenuInput == 2) {
				modifyATransaction();
			} else if (secondMenuInput == 3) {
				completeATransaction();
			} else if (secondMenuInput == 4) {
				System.out.println("Sending back to previous menu...");
			} else {
				System.out.println("The option you have entered is not valid!");
			}
		}
	}

	private void addATransaction() {
		System.out.println("Enter the productID or enter 'q' to go back");
		prodId = sc.next();
		if (!prodId.equals("q")) {
			System.out
					.println("Enter the quantity you need or enter 'q' to go back");
			prodQUantity = sc.next();
			if (!prodQUantity.equals("q")) {
				// create and add the transaction.
				System.out.println("The transaction has been added");
			}
		}
	}

	private void modifyATransaction() {
		System.out
				.println("Enter the productID of the transaction you want to modify or enter 'q' to go back");
		prodId = sc.next();
		if (!prodId.equals("q")) {
			int optionSelected = 0;
			while (optionSelected != 3) {
				System.out.println("To delete a transaction enter 1");
				System.out
						.println("To change the quantity of products enter 2");
				System.out.println("To go back to the previous menu enter 3");
				optionSelected = sc.nextInt();
				if (optionSelected == 1) {
					// delete a transaction
					System.out
							.println("The transaction has been deleted sucessfully");
					optionSelected = 3;
				} else if (optionSelected == 2) {
					System.out
							.println("Enter the new quantity of products or enter 'q' to go back");
					prodQUantity = sc.next();
					// change product quantity
					System.out.println("The changes have been approved!");

				} else if (optionSelected == 3) {
					System.out.println("Sending back to initial menu...");
				} else {
					System.out.println("The input you provided is invalid");
				}
			}
		}
	}

	private void completeATransaction() {
		int userInput = 0;
		while (userInput != 3) {
			System.out
					.println("To execute the transatinn for a known customer enter 1;");
			System.out
					.println("To execute the transatinn for an unknown customer enter 2;");
			System.out.println("To go back enter 3;");
			userInput = sc.nextInt();
			if (userInput == 1) {
				System.out.println("To enter an existing customer enter 1;");
				System.out.println("To create a new customer enter 2;");
				System.out.println("To go back enter 3;");
				int userSelection = sc.nextInt();
				if (userSelection == 1) {
					System.out
							.println("Enter customer id or enter 'q' to go back!");
					custID = sc.next();
					if (!custID.equals("q")) {
						System.out
								.println("Is this the customer you want to do the complete for? (y/n)");
						String choice = sc.next();
						if (choice.equals("y")) {
							// execute transaction
							userInput = 3;
						}
					}
				} else if (userSelection == 2) {
					createNewCustomer();
					// execute transaction
					userInput = 3;
				} else if (userSelection == 3) {
					System.out.println("Sending back to previous menu...");
				} else {
					System.out.println("You have entered an invalid input!");
				}
			} else if (userInput == 2) {
				// execute transaction
				userInput = 3;
			} else if (userInput == 3) {
				System.out.println("Sending back to previous menu...");
			} else {
				System.out.println("You have entered an invalid input!");
			}
		}
		System.out
				.println("Transaction executed successfully the total price is:");
	}
}

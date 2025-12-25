import java.util.Scanner;

public class FakeNokia{

	public static void main(String[] args){

	 mainMenu();

	}


    public static void mainMenu(){
	
	Scanner input  = new Scanner(System.in);

	String prompt = """

             WELCOME TO YOUR NOKIA PHONE

		YOUR NOKIA PHONE MENU:
                  PRESS:
	    1 -> Phone book
	    2 -> messages
	    3 -> Chat
	    4 -> Call register
	    5 -> Tones
	    6 -> Settings
	    7 -> call divert
	    8 -> Games
	    9 -> Calulator
	    10 -> Reminders
	    11 -> Clock
	    12 -> Profiles
	    13 -> SIM services
	    14 -> Exit
               
		""";

	System.out.println(prompt);

	System.out.print("Press any key from 1 - 13: ");
    	String menuFunctions = input.nextLine();

	switch(menuFunctions){
				case "1" : printPhoneBook(); break;
				case "2" : printMessages(); break;
				case "3" : printChat(); break;
				case "4" : printCallRegister(); break;
				case "5" : printTones(); break;
				case "6" : printSettings();break;
				case "7" : printCallDivert();break;
				case "8" : printGames();break;
				case "9" : printCalculator();break;
				case "10": printReminder();break;
				case "11": printClock();break;
				case "12" : printProfiles();break;
				case "13" : printSimServices();break;
				case "14": System.out.println("exiting..."); break;
				default : System.out.print("shine your eyes..Oga,enter better number");break;

				}					 

	}


	public static void printPhoneBook(){
		System.out.println("PhoneBook");

		System.out.println(""" 
		PHONE BOOK MENU:
				 
		1 : search
		2 : Service Nos
		3 : Add name
		4 : Erase
		5 : edit
		6 : Assign tone
		7 : Send  b'card
		8 : options
		9 : Speed dials
		10 : Voice tags
		0 : back
		""");



		System.out.print("press any key from 1-10: ");
		Scanner input  = new Scanner(System.in);
		String phoneBookPrompt = input.nextLine();

			switch(phoneBookPrompt){
				case "1" : printSearch(); break;
				case "2" :  printService();break;
				case "3" : printAddName();break;
				case "4" :  printErase();break;
				case "5" :  printEdit();break;
				case "6" : printAssignTone();break;
				case "7" : printSendCard();break;
				case "8" : printOption();break;
				case "9" : printSpeedDials();break;
				case "10" : printVoiceTags();break;
				case "0": mainMenu(); break; 
				default : System.out.print("entered wrong");
					printPhoneBook();
					break;
			}

		
					
		}


		public static void printSearch(){
			System.out.println("Search");

			System.out.print("press 0 for phonebook menu : ");
			Scanner input  = new Scanner(System.in);
			String search = input.nextLine();
			switch (search) {
				case "0": printPhoneBook(); break;
				default: System.out.print("Exiting..."); break;
			}
		}

		public static void printService(){
			System.out.println("Service Nos");

			System.out.print("press 0 for phoneBook menu : ");
			Scanner input  = new Scanner(System.in);
			String service = input.nextLine();
			switch(service){
				case "0" : printPhoneBook(); break;
				default : System.out.print("Exiting...");break;

			}
		}

		public static void printAddName(){
			System.out.println("Add name");

			System.out.print("press 0 for menu : ");
			Scanner input  = new Scanner(System.in);
			String addName = input.nextLine();
		        switch(addName){
				case "0" : printPhoneBook();break;
				default: System.out.print("Existing");break;
			}
		}

		public static void printErase(){
			System.out.println("Erase");

			System.out.print("press 0 for phone book menu : ");
			Scanner input  = new Scanner(System.in);
			String erase = input.nextLine();
			 switch(erase){
				case "0" : printPhoneBook();break;
				default: System.out.print("Existing");break;
			}

		}

		
		public static void printEdit(){
			System.out.println("Edit");

			System.out.print("press 0 for phone book menu : ");
			Scanner input  = new Scanner(System.in);
			String edit = input.nextLine();
			 switch(edit){
				case "0" : printPhoneBook();break;
				default: System.out.print("Existing");break;
			}

		}

		public static void printAssignTone(){
			System.out.println("AssignTone");

			System.out.print("press 0 for phone book menu : ");
			Scanner input  = new Scanner(System.in);
			String assign = input.nextLine();
			 switch(assign){
				case "0" : printPhoneBook();break;
				default: System.out.print("Existing");break;
			}

		}

		
		public static void printSendCard(){
			System.out.println("Send b card");

			System.out.print("press 0 for phone book menu : ");
			Scanner input  = new Scanner(System.in);
			String send = input.nextLine();
			 switch(send){
				case "0" : printPhoneBook();break;
				default: System.out.print("Existing");break;
			}

		}


		public static void printOption(){
			System.out.println("Options");

				System.out.println("""
					1 -> Type of view
					2 -> Memory status
					3 -> Exit options	
					""");

				System.out.print("Press any keys from 1 - 2: ");
				Scanner input  = new Scanner(System.in);
				String optionsPrompt = input.nextLine();

				switch(optionsPrompt){
					case "1" : printTypeView(); break;
					case "2" :  printMemoryStatus(); break;
					case "3" :  printPhoneBook();break;
					default : System.out.print("wrong"); 
						 printOption();
						 break;
				}

		}

			public static void printTypeView(){
				Scanner input = new Scanner("System.in");
				System.out.println("Type of view");
				System.out.println("Enter 0 to option menu : ");
				printOption();


			}
			

			public static void printMemoryStatus(){
				System.out.println("Memory Status");
				Scanner input = new Scanner("System.in");
				System.out.println("Enter 0 to option menu : ");
				printOption();

				
			}

 


		public static void printSpeedDials(){
			System.out.println("Speed dials");

			System.out.print("press 0 for phone book menu : ");
			Scanner input  = new Scanner(System.in);
			String speed = input.nextLine();
			 switch(speed){
				case "0" : printPhoneBook();break;
				default: System.out.print("Existing");break;
			}

		}

	
		public static void printVoiceTags(){
			System.out.println("Voice Tags");

			System.out.print("press 0 for phone book menu : ");
			Scanner input  = new Scanner(System.in);
			String voice = input.nextLine();
			 switch(voice){
				case "0" : printPhoneBook();break;
				default: System.out.print("Existing");break;
			}

		}











	public static void printMessages(){
		System.out.println("Messages");
		
		System.out.println(""" 
		MESSAGES MENU:
				 
		1 : Write messages
		2 : Inbox
		3 : OutBox
		4 : picture messages
		5 : Templates
		6 : Smileys
		7 : Messages settingd
		8 : info services
		9 : voice mailbox number
		10 : Service command editor 
		0 : back
		""");



		System.out.print("press any key from 1-10: ");
		Scanner input  = new Scanner(System.in);
		String messageMenuPrompt = input.nextLine();

			switch(messageMenuPrompt){
				case "1" :printWriteMessages(); break;
				case "2" :  printInbox();break;
				case "3" : printOutbox();break;
				case "4" :  printPicture();break;
				case "5" :  printTemplates();break;
				case "6" : printSmileys();break;
				case "7" : printMessageSetting();break;
				case "8" : printInfoService();break;
				case "9" : printVoice();break;
				case "10" : printServiceCommand();break;
				case "0": mainMenu(); break; 
				default : System.out.print("entered wrong");
					printMessages();
					break;
			}

			
		
		}


		public static void printWriteMessages(){
			System.out.println("Write Messages");

			System.out.print("press 0 for Message menu : ");
			Scanner input  = new Scanner(System.in);
			String write = input.nextLine();
			
			switch(write){
				case "0" : printMessages(); break;
				default : System.out.print("Existing...");break;

			}

		   }

		public static void printInbox(){
			System.out.println("Inbox");

			System.out.print("press 0 for Message menu : ");
			Scanner input  = new Scanner(System.in);
			String inbox = input.nextLine();
			
			switch(inbox){
				case "0" : printMessages(); break;
				default : System.out.print("Existing...");break;

			}

		   }

		public static void printOutbox(){
			System.out.println("Outbox");

			System.out.print("press 0 for Message menu : ");
			Scanner input  = new Scanner(System.in);
			String outbox = input.nextLine();
			
			switch(outbox){
				case "0" : printMessages(); break;
				default : System.out.print("Existing...");break;

			}

		   }

		public static void printPicture(){
			System.out.println("Picture messages");

			System.out.print("press 0 for Message menu : ");
			Scanner input  = new Scanner(System.in);
			String picture = input.nextLine();
			
			switch(picture){
				case "0" : printMessages(); break;
				default : System.out.print("Existing...");break;

			}

		   }

		public static void printTemplates(){
			System.out.println("Templates");

			System.out.print("press 0 for Message menu : ");
			Scanner input  = new Scanner(System.in);
			String template = input.nextLine();
			
			switch(template){
				case "0" : printMessages(); break;
				default : System.out.print("Existing...");break;

			}

		   }

		public static void printSmileys(){
			System.out.println("Smileys");

			System.out.print("press 0 for Message menu : ");
			Scanner input  = new Scanner(System.in);
			String smileys = input.nextLine();
			
			switch(smileys){
				case "0" : printMessages(); break;
				default : System.out.print("Existing...");break;

			}

		   }

		public static void printMessageSetting(){
			System.out.println("Message Settings");

			System.out.println("""
					1 -> set 1
					2 -> Common
					0 -> Exit message setting	
					""");

				System.out.print("Press any keys from 1 - 2: ");
				Scanner input  = new Scanner(System.in);
				String messageSetting = input.nextLine();

	
			
			switch(messageSetting){
				case "1" :  printSet();break;
				case "2" : printCommon();break;
				case "0" : printMessages(); break;
				default : System.out.print("Existing...");break;

			}

		   }


			public static void printSet(){
				System.out.print("Set 1");

				System.out.println("""
					1 -> massage centre number
					2 -> Message sent as
					3 -> Message validity
					0 -> Exit print set	
					""");

				System.out.print("Press any keys from 1 - 3: ");
				Scanner input  = new Scanner(System.in);
				String set = input.nextLine();
				
				switch(set){
					case "1" :  System.out.print("massage centre number");break;
					case "2" :  System.out.print("Message sent as");break;
					case "3" :  System.out.print("Message validity");break;
					case "0" : printMessageSetting();break;
					default :   System.out.print(" you entered wrong!");printSet();
							break;
				}				

	

			}


			public static void printCommon(){
				System.out.print("Common");

				System.out.println("""
					1 -> Delivery report
					2 -> Reply via same centre
					3 -> Character support
					0 -> Exit print common	
					""");

				System.out.print("Press any keys from 1 - 3: ");
				Scanner input  = new Scanner(System.in);
				String common = input.nextLine();
				
				switch(common){
					case "1" :  System.out.print("Delivery report");break;
					case "2" :  System.out.print("Reply via same centre");break;
					case "3" :  System.out.print("Character support");break;
					case "0" : printMessageSetting();break;
					default :   System.out.print(" you entered wrong!");printCommon();
							break;
				}				

			}







		public static void printInfoService(){
			System.out.println("Info Service");

			System.out.print("press 0 for Message menu : ");
			Scanner input  = new Scanner(System.in);
			String info = input.nextLine();
			
			switch(info){
				case "0" : printMessages(); break;
				default : System.out.print("Existing...");break;

			}

		   }

		
		public static void printVoice(){
			System.out.println("Voice mailbox number");

			System.out.print("press 0 for Message menu : ");
			Scanner input  = new Scanner(System.in);
			String mail = input.nextLine();
			
			switch(mail){
				case "0" : printMessages(); break;
				default : System.out.print("Existing...");break;

			}

		   }

		public static void printServiceCommand(){
			System.out.println("Service command editor");

			System.out.print("press 0 for Message menu : ");
			Scanner input  = new Scanner(System.in);
			String serviceCommand = input.nextLine();
			
			switch(serviceCommand){
				case "0" : printMessages(); break;
				default : System.out.print("Existing...");break;

			}

		   }



	public static void printChat(){
		System.out.println("Chat");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String chat = input.nextLine();
	mainMenu();
	}










	public static void printCallRegister(){
		System.out.println("Call register");

		System.out.println("""
					1 -> missed calls
					2 -> Received calls
					3 -> Dialled numbers
					4 -> Erase recent call lists
					0 -> Exit call register	
					""");

				System.out.print("Press any keys from 1 - 4: ");
				Scanner input  = new Scanner(System.in);
				String callRegister = input.nextLine();



				switch(callRegister){
					case "1" :  System.out.print("Missed calls");break;
					case "2" :  System.out.print("Received calls");break;
					case "3" :  System.out.print("Dialed numbers");break;
					case "0" : printMessages();break;
					default :   System.out.print(" you entered wrong!");printCallRegister();
							break;
				}	
		
	}



	
	public static void printTones(){
		System.out.println("Tones");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String tones = input.nextLine();
	mainMenu();
	}


	public static void printSettings(){
		System.out.println("Setting");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String settings = input.nextLine();
	mainMenu();
	}


	public static void printCallDivert(){
		System.out.println("Call divert");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String callDivert = input.nextLine();
	mainMenu();
	}


	public static void printGames(){
		System.out.println("Games");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String games = input.nextLine();
	mainMenu();
	}


	public static void printCalculator(){
		System.out.println("Calculator");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String calculator = input.nextLine();
	mainMenu();
	}


	public static void printReminder(){
		System.out.println("Reminder");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String reminder = input.nextLine();
	mainMenu();
	}


	public static void printClock(){
		System.out.println("Clock");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String clock = input.nextLine();
	mainMenu();
	}


	public static void printProfiles(){
		System.out.println("Profiles");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String profiles = input.nextLine();
	mainMenu();
	}


	public static void printSimServices(){
		System.out.println("Sim Services");
		System.out.print("press 0 for menu : ");
		Scanner input  = new Scanner(System.in);
		String sim = input.nextLine();
	mainMenu();
	}



















}


















	
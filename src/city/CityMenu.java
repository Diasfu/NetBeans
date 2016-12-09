/*
 Creating menus to start off the program with options, and other options to 
 */
package city;
import java.util.Scanner;

public class CityMenu {
    public void StartCityMainMenu(){
        Scanner scan = new Scanner(System.in);
		
		//content of the menu
		System.out.println("Welcome to the Your City\n\n"
				+ "You will be able to create your Own City.\n\nSelect from the following Options:\n\n");
		System.out.println("1) Create a Person\n"
						+"2) \n"
						+"3) \n"
						+"4) Exit\n");
		int userMenuInput = scan.nextInt();scan.nextLine();
		//using a label
		//mainMenuLabel:
                    do{
			switch(userMenuInput){
				case 1 :	System.out.println("Create a person\n");
														//continue mainMenuLabel;
                                    break;
					
				case 2 :	System.out.println("\n");
					
                                    break;
				case 3 :	System.out.println("");
						
                                    break;
				case 4 :	System.out.println("Exit!");
							
                                    break;	
				default : System.out.println("Wrong option, please select again: \n");
							//Thread.sleep(1100);
							//clearScreen();
							//returns to the main menu(back to the top)
							//continue mainMenuLabel;
			}//switch ends
                    }while(true);
	 scan.close();	
    }//StartCityMainMenu ends
   
    
    
    
    
    
    
}//CityMenu ends

package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	static int happinessLevel = 0;
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static void cuddle() {
		JOptionPane.showMessageDialog(null, "Your pet wants to go outside.");
	}
	static void walk() {
		JOptionPane.showMessageDialog(null, "Your pet just pooped clean it up!");
	}
	static void poop() {
		JOptionPane.showMessageDialog(null, "The people living near there are happy you cleaned up after your pet. Now your pet is hungry.");
	}
	static void groom() {
		JOptionPane.showInputDialog(null, "You and your pet are free.");
	}
	static void feed() {
		JOptionPane.showMessageDialog(null, "Your pet is thirsty too.");
	}
	static void water() {
		JOptionPane.showMessageDialog(null, "Your pet wants to go outside.");
	}
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
			String petBuy = JOptionPane.showInputDialog(null, "What kind of pet do you want to get?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
	
			for(int i = 0;i<100000;i++) {
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do with your pet?", "Do it", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "clean up poop", "groom", "take a walk", "feed", "cuddle", "give water" }, null);
		

			// 5. Use user input to call the appropriate method created in step 4.
				
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
				if(task==0) {
					poop();
					happinessLevel ++;
				}else if(task==1) {
					groom();
					happinessLevel -= 1;
				}else if(task==2) {
					walk();
					happinessLevel += 2;
				}else if(task==3) {
					feed();
					happinessLevel +=3;
				}else if(task==4) {
					cuddle();
					happinessLevel += 2;
				}else {
					water();
					happinessLevel++;
				}
				if(happinessLevel>=10) {
					JOptionPane.showMessageDialog(null, "Your "+petBuy+" loves you!!!") ;
					break;
				}
			
		}
		
			
	}

	
	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
}
import java.util.Scanner;

public class VirtualPet {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int happy = 5;
      int hunger = 5;
      int energy = 5;
      
      int choice = 0;
      String petName;
      
      boolean end = false;
      
      
      
      System.out.println("Welcome to Virtual Pet Simulator!");
      System.out.print("Name your pet: ");
      petName = input.nextLine();
      System.out.println("Your pet's name is " + petName + ".\n\n");
      
      
      while(end == false) {
      System.out.print("\n\n\n\n\n\n");
      // TODO 1:
      // Create a while loop that continues while:
      // happiness < 15
      // hunger < 10
      // energy > 0
      // choice != 5
         System.out.println("Health checkup:\nHappy: " + happy + "\nHunger: " + hunger + "\nEnergy: " + energy);
      
      

         // TODO 2:
         // Display happiness, hunger, and energy.
         
         System.out.println("\n\nWhat would you like to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Bath");
         System.out.println("5. Quit");
         
         choice = input.nextInt();
         
         if (choice == 1) {System.out.println("Yummy!"); happy ++; hunger -= 3;}
         else if (choice == 2) {System.out.println("Fun!"); happy += 3; hunger += 2; energy -= 2;}
         else if (choice == 3) {System.out.println("eepy.."); happy --; hunger ++; energy += 3;}
         else if (choice == 4) {System.out.println("Squeaky Clean!"); happy += 2; hunger ++; energy --;}
         else if (choice == 5) {System.out.println("Goodbye!"); end = true;}
         else if (choice == 0) {System.out.println("Your pet has no clue what this means and promptly explodes."); end = true;}
         else {System.out.println("!error!");}
         
         System.out.print("\n\n");
         
         if (hunger > 9) {System.out.println("Monster! You let them starve.."); end = true;}
         else if (energy < 1) {System.out.println("Monster! They no longer have the energy to continue.."); end = true;}
         else if (happy > 14) {System.out.println("Winner! They left home due to happiness."); end = true;}
         // TODO 3:
         // Create an if / else if / else statement
         // to handle the player's choice.
         //
         // Update the three statistics according
         // to the table in the instructions.
         //
         // Print a funny message for each action.


      // TODO 4:
      // After the loop, determine WHY the game ended.
      //
      // Did the pet become happy enough?
      // Did it get too hungry?
      // Did it run out of energy?
      // Did the player quit?
      }
      // Print the appropriate ending message.
      input.close();
   }
}
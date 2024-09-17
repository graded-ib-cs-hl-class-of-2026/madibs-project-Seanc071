import java.util.Scanner;

public class App {
    
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */

    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        doMadlib();

    }
    
    /* Here you should create all missing methods used by the start() method
     * I have created the signature for ONE of the methods below.
     * You can create any other methods you need as well!
     */ 
   
    public String getUserName() {
       Scanner scan = new Scanner(System.in); 
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        return name;
    }

    public void printGreeting(String userName) {
      
        System.out.println("Hello "+ userName + "! Welcome to the Mad Libs game.");
       
    }
     /** Prints instructions */
    public void printInstructions() {


        System.out.println("In this game, you will be asked to provide a series of words");
        System.out.println("once you've provided the words, fun story will come out with your words!");
        System.out.println("Now let's get started!");
       
    }
    
    public void doMadlib() {
        String mode;
        Scanner scan = new Scanner(System.in); 
        System.out.println("Choose a mode")
        mode = scan.nextLine();
        
        if(mode == 1)
        System.out.println
     
        String adjective1;
        String name;
        String verb1;
        String adjective2;
        String nounPlural;
        String number;
        String animal;
        String verb2;
        String object;
        String verb3;
        String adjective4;
        String typeOfBuilding;
        String geographicalFeature;
        String verbEndingInIng;
        String food;
        String adjective5;

        System.out.print("Enter a adjective 1:  ");
        adjective1 = scan.nextLine();
        System.out.print("Enter a name:  ");
        name = scan.nextLine();
        System.out.print("Enter a verb 1:  ");
        verb1 = scan.nextLine();
        System.out.print("Enter a adjective 2:  ");
        adjective2 = scan.nextLine();
        System.out.print("Enter a noun plural:  ");
        nounPlural = scan.nextLine();
        System.out.print("Enter a number:  ");
        number = scan.nextLine();
        System.out.print("Enter a animal:  ");
        animal = scan.nextLine();
        System.out.print("Enter a verb 2:  ");
        verb2 = scan.nextLine();
        System.out.print("Enter a object:  ");
        object = scan.nextLine();
        System.out.print("Enter a verb 3:  ");
        verb3 = scan.nextLine();
        System.out.print("Enter a noun adjective 4:  ");
        adjective4 = scan.nextLine();
        System.out.print("Enter a type of building:  ");
        typeOfBuilding = scan.nextLine();
        System.out.print("Enter a geographical feature:  ");
        geographicalFeature = scan.nextLine();
        System.out.print("Enter a verb ending in -ing:  ");
        verbEndingInIng = scan.nextLine();
        System.out.print("Enter a food:  ");
        food = scan.nextLine();
        System.out.print("Enter a adjective 5:  ");
        adjective5 = scan.nextLine();
     
        

        String story = "Once upon a time, in a " + adjective1 + " jungle, there was a explorer named " + name + " who loved to " + verb1 + " every day. One day, while exploring hidden cave, he stumbled upon a " + adjective2 + " treasure chest filled with " + nounPlural+ ". Excitedly, he grabbed " + number +  " of them and ran outside. But suddenly, a giant " + animal + " appeared and started to " + verb2 + "! The explorer,without hesitation used their trusty " + object + " to " + verb3 + " the creature and escape. After the " + adjective4 + " escape, the explorer returned to his home, a cozy " + typeOfBuilding + " located on top of a " + geographicalFeature + ". He celebrated the escape with his family by " + verbEndingInIng + " and eating " + food + " for dinner. It was truly a " + adjective5 +" day!";
        System.out.print(story);
        scan.close();}
    
        







    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
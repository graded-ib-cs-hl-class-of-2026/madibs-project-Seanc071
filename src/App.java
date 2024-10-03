/**To add scanner in my coding, I imported Scanner
 *  I find out this from 
 * https://www.w3schools.com/java/java_user_input.asp
 * */
import java.util.Scanner;//import the scanner

public class App {
    Scanner scan = new Scanner(System.in); //Creates a scanner to read input from the user
    int mode;//This varable will store the numbers in integer
    
    
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */
//start
    public void start() {
        String userName = getUserName();//get user's name
        printGreeting(userName);//greet the user
        printInstructions();//provide instructions on how to play
        playGame();//start the game process
    }
 
    /**This method handles the entire game flow
     * It asks the user to choose a mode, confirms their choice, and play the game
     * and, it asks if users would like to paly again
    */
    public void playGame(){
        chooseMode();//user selects a mdoe(1,2, or 3)
        confirm();// Confirm user's mode selction
        doMadlib();//Generate the madelib story based on user input
        again();// Ask if the user wants to play again
        
        

    }
   /**This method lets the user to enter their name
    * First it asks to input the name, and give a space to put ur name 
    by using scanner.
    *Then, it return the name as a string
    */
    public String getUserName() {
        System.out.println("Please enter your name");
        String name;
        name = scan.nextLine();
        return name;
    }
/**This method prints a greeting message to the user using their name
 * it uses the user's name entered previously
 */
    public void printGreeting(String name) {
      
        System.out.println("Hello "+ name + "! Welcome to the Mad Libs game.");
       
    }
     /** this method provides instructions to the user, explaing how the
      * game works
     */
    public void printInstructions() {


        System.out.println("In this game, you will be asked to provide a series of words");
        System.out.println("once you've provided the words, fun story will come out with your words!");
        System.out.println("Now let's get started!");}
         
      //** This method makes the uswer to choose a mode for the game.*/
        public void chooseMode(){
        System.out.println("Choose a mode");
          System.out.println("mode 1: Jungle exploring");
          System.out.println("mode 2: Ocean exploring");
          System.out.println("mode 3: Desert exploring");
          System.out.println("Enter mode 1,2 or 3");

       /** 
        * https://docs.google.com/document/d/15cSsXSbyq7P4n614_HGMQOjGWnXu_1e1-TiqNMuv4bs/edit?usp=sharing
      So the while(true) makes a infite loop until the player answers correctly
        */
    
          while (true){
           
/**https://www.youtube.com/watch?v=1XAfapkBQjk
 * learned from this link.
*/
                try{
                    //only gets an ingeger input from the user
                    mode = Integer.parseInt(scan.nextLine());
                  
                    //Check if the input is in the range 1 to 3
                  if(mode >= 1 && mode <=3){
                        break;//if the answer is between them, exit the loop
                    //If the number isn't in range 1-3, print a message and repeat the loop
                    }else{
                        System.out.println("Invalid number. please enter 1,2 or 3.");}}
                        //if the input isn't a ingteger number, print this message
                        catch (NumberFormatException nfe) {
                            System.out.println("Invalid input. Please enter a number.");
                       
                    }
                    }}
    
    
  //**This method asks the user to confirm the mode they chose.It gives them the option to either continue or change the mode */
 public void confirm(){

        String answer;
//made a infinte loop,until I get the answer I want.
        while (true){
        System.out.println("If you want to continue with mode " + mode +" type yes or not, type no");
        answer = scan.nextLine();
       
        if (answer.equals("yes")) {
           System.out.println("Let's continue");
           break; //exit the loop
        } else if(answer.equals("no") ) {
            System.out.println("Pick another mode!");
           }
           //If player type 'yes' it will exit the loop, but if player type 'no' player will enter other loop
            while (true) {
                try {
                mode = Integer.parseInt(scan.nextLine());
                if (mode>= 1 && mode<=3) {
                    break;}
                    else{
                       System.out.println("Invalid number. Please enter 1,2, or 3.");      
                    }
                } catch(NumberFormatException nfe) {
                    System.out.println("Invalid input. Please enter a number.");
                }
            }
        }

            
        

                
}



//**This method is generating the madlib stories based on the player's chosen mode. It makes players to fill the blanks of the story */

    //stories of the madlib depend on case 1, 2, 3
    public void doMadlib() {
//https://www.youtube.com/watch?v=wcwWlasmLWs
//used a swith(mode) to play story based on player's choice previously
       //if player choose mode 1
switch(mode){
     case 1: 

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
//let player to choose the word
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
        
     
        
       //Add the words that player wrote previously
        String story1 = "Once upon a time, in a " + adjective1 + " jungle, there was a explorer named " + name + " who loved to " +
         verb1 + " every day. One day, while exploring hidden cave, he stumbled upon a " + adjective2 + " treasure chest filled with " + 
         nounPlural + ". Excitedly, he grabbed " + number +  " of them and ran outside. But suddenly, a giant " + animal + " appeared and started to " + 
          verb2 + "! The explorer,without hesitation used their trusty " + object + " to " + verb3 + " the creature and escape. After the " + adjective4 + 
          " escape, the explorer returned to his home, a cozy " + typeOfBuilding + " located on top of a " + geographicalFeature +
           ". He celebrated the escape with his family by " + verbEndingInIng + " and eating " + food + " for dinner. It was truly a " + adjective5 +" day!";
        System.out.print(story1);
        break;
        //exit the method
        
    //If player choose mode 2
        case 2:

        String name2;
        String adjective6;
        String place;
        String seaCreature;
        String adjective7;
        String name3;
        String verb4;
        String noun1;
        String nounPlural2;
        String verbEndingInIng2;
        String food2;
        String number2;
//let player to choose the word

        System.out.print("Enter a name :  ");
        name2 = scan.nextLine();
        System.out.print("Enter a adjective :  ");
        adjective6 = scan.nextLine();
        System.out.print("Enter a place :  ");
        place = scan.nextLine();
        System.out.print("Enter a sea creature :  ");
        seaCreature = scan.nextLine();
        System.out.print("Enter a adjective :  ");
        adjective7 = scan.nextLine();
        System.out.print("Enter a name :  ");
        name3 = scan.nextLine();  
        System.out.print("Enter a verb :  ");
        verb4 = scan.nextLine();
        System.out.print("Enter a noun :  ");
        noun1 = scan.nextLine();
        System.out.print("Enter a noun plural :  ");
        nounPlural2 = scan.nextLine();
        System.out.print("Enter a verb ending in -ing :  ");
        verbEndingInIng2 = scan.nextLine();
        System.out.print("Enter a food2 :  ");
        food2 = scan.nextLine();
        System.out.print("Enter a number2 :  ");
        number2 = scan.nextLine();
      



       //Add the words that player wrote previously
      String story2 ="One day, " + name2 + " decided to go on an " + adjective6 + " ocean expedition. " +
      "While diving near " + place + ", they encountered a huge " + seaCreature + " that looked very " + adjective7 + ". " +
                    name3 + " quickly " + verb4 + " and hid behind a " + noun1 + ". As they watched, more " + nounPlural2 + 
                    " appeared, and soon, they were all " + verbEndingInIng2 + " around. After the thrilling adventure, " + name3 + 
                    " returned to the boat and enjoyed a delicious meal of " + food2 + ". It was a day filled with wonder and excitement, " +
                    "and the crew counted " + number2 + " sea creatures in total!";
                    System.out.println(story2); break;
                    
    //exit the method

                    case 3: 

                    String explorerName;
                    String adjective8;
                    String desertFeature;
                    String animal2;
                    String verb5;
                    String object1;
                    String verb6;
                    String treasure;
                    String adjective9;
                    String object2;
                    String activity;
                    String food3;
                    String number3;
                    //let player to choose the word

                    System.out.print("Enter a exploer name :  ");
                    explorerName = scan.nextLine();
                    System.out.print("Enter a adjective :  ");
                    adjective8 = scan.nextLine();
                    System.out.print("Enter a desert feature :  ");
                    desertFeature = scan.nextLine();
                    System.out.print("Enter a animal :  ");
                    animal2 = scan.nextLine();
                    System.out.print("Enter a verb :  ");
                    verb5 = scan.nextLine();
                    System.out.print("Enter a object :  ");
                    object1 = scan.nextLine();
                    System.out.print("Enter a verb :  ");
                    verb6 = scan.nextLine();
                    System.out.print("Enter a treasure :  ");
                    treasure = scan.nextLine();
                    System.out.print("Enter a adjective :  ");
                    adjective9 = scan.nextLine();
                    System.out.print("Enter a object :  ");
                    object2 = scan.nextLine();
                    System.out.print("Enter a activity :  ");
                    activity = scan.nextLine();
                    System.out.print("Enter a food :  ");
                    food3 = scan.nextLine();
                    System.out.print("Enter a number :  ");
                    number3 = scan.nextLine();
       //Add the words that player wrote previously

                    String story3;
                     story3 = "Once upon a time, " + explorerName + " set out on an adventurous journey through the " + adjective8 + 
                    " desert." +"While exploring a vast " +desertFeature + ", they encountered a " + animal2 + " and decided to " + verb5 +
                     " to avoid it. " + "AFter some time, they found a mysterious " + object1 + " to " + verb6 + " the item and discovered a hidden " +
                      treasure + ". The treasure was " + adjective9 + "and included a rare" + object2 + ". Feeling accomplished, " + explorerName + 
                      " spent the evening " + activity + "and enjoyed a delicious meal of " + food3 + " with " + number3 + " friends.";  
                      System.out.println(story3);
                      break;
    //exit the method


                        }}

/**This method asks if the players liked the game.
 * If they say no, game asks the feedback and asks if they wants to play again
 * If they say yes, game just asks if they want to play again
 * 
 */
                public void again() {
                    String answer2;
                    String feedback;
                    String answer3;
                    String answer4;
                    //created a infinite loop until player write a correct answer
                    while(true){
                        System.out.println("Did you like the game?(yes/no)");
                        answer2 = scan.nextLine();
                       
                        if(answer2.equals("yes")){
                            System.out.println("do you want to play this again?");
                            answer4 = scan.nextLine();
                            if(answer4.equals("yes")){
                                playGame(); break;

                            }else if(answer4.equals("no")){
                                System.out.println("Thanks for playing bye!");
                                break;
                            }else{
                                System.out.println("Wrong input. Please type yes or no");
                            }

                        } else if(answer2.equals("no")){
                            System.out.println("That's sad! please give us a feedback");
                            feedback = scan.nextLine();
                            System.out.println("Thank you for the feedback! do you want to replay this game? (yes/no)");
                            answer3 = scan.nextLine();
                           //If player wants to play again, go back to method playGame() and restart the game from there
                            if(answer3.equals("yes")){
                            playGame(); break;}
                                else if(answer3.equals("no")){
                                    System.out.println("Thank you for playing! Bye!");
                                    break;
                                }else{
                                    System.out.println("Wrong input. Please type yes or no");
                                }}else{System.out.println("Wrong input. Please type yes or no");


                                }

                        }}



                
                    
                    
                        



                

    
        







    /* DO NOT TOUCH OR EDIT THE METHOD BELOW! ADD NO CODE BELOW THIS LINE */
    public static void main(String[] args) throws Exception {
        new App().start();
    }
}
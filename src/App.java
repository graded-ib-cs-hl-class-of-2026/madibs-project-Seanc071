import java.util.Scanner;

public class App {
    Scanner scan = new Scanner(System.in); 
    int mode;//as the mode should be 1, 2, or 3
    
    
    /**
     * This method is the primary driver method for your program.
     * It should primarily call other methods to do its work.
     * Do NOT edit this method until after you have fully satisfied the reqs for a 5
     */
//start
    public void start() {
        String userName = getUserName();
        printGreeting(userName);
        printInstructions();
        playGame();
    }
    /* Here you should create all missing methods used by the start() method
     * I have created the signature for ONE of the methods below.
     * You can create any other methods you need as well!
     */ 
    
    public void playGame(){
        //order of the game progress
        chooseMode();
        confirm();
        doMadlib();
        again();
        
        

    }
   //get username
    public String getUserName() {
        System.out.println("Please enter your name");
        String name;
        name = scan.nextLine();
        return name;
    }
//greeting
    public void printGreeting(String userName) {
      
        System.out.println("Hello "+ userName + "! Welcome to the Mad Libs game.");
       
    }
     /** Prints instructions */
    public void printInstructions() {


        System.out.println("In this game, you will be asked to provide a series of words");
        System.out.println("once you've provided the words, fun story will come out with your words!");
        System.out.println("Now let's get started!");}
         
        //choosing the mode
        public void chooseMode(){
        System.out.println("Choose a mode");
          System.out.println("mode 1: Jungle exploring");
          System.out.println("mode 2: Ocean exploring");
          System.out.println("mode 3: Desert exploring");
          System.out.println("Enter mode 1,2 or 3");

       
          while (true){
           
//https://www.youtube.com/watch?v=1XAfapkBQjk
//stackoverflow.com/questions/19799838/only-allow-input-of-integers-with-java-scanner
                try{
                    mode = Integer.parseInt(scan.nextLine());
                  
                    if(mode >= 1 && mode <=3){
                        break;
                    }else{
                        System.out.println("Invalid number. please enter 1,2 or 3.");}}
                        
                        catch (NumberFormatException nfe) {
                            System.out.println("Invalid input. Please enter a number.");
                        //code that i need to exexute if this type of exception
                    }
                    }}
    
    
    //confirm the choice
 public void confirm(){

        String answer;

        while (true){
        System.out.println("If you want to continue with mode " + mode +" type yes or not, type no");
        answer = scan.nextLine();
       
        if (answer.equals("yes")) {
           System.out.println("Let's continue");
           break; //exit the loop
        } else if(answer.equals("no") ) {
            System.out.println("Pick another mode!");
            
           }

            while (true) {
                try {
                mode = Integer.parseInt(scan.nextLine());
                if (mode>= 1 && mode<=3) {
                    break;}
                    else{
                       System.out.println("Invalid number. Please enter 1,2, or 3.");      
                    }
                } catch(NumberFormatException e) {
                    System.err.println("Invalid input. Please enter a number.");
                }
            }
        }

            
        

                
}




    //stories of the madlib depend on case 1, 2, 3
    public void doMadlib() {
//https://www.youtube.com/watch?v=wcwWlasmLWs
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
        
     
        

        String story1 = "Once upon a time, in a " + adjective1 + " jungle, there was a explorer named " + name + " who loved to " +
         verb1 + " every day. One day, while exploring hidden cave, he stumbled upon a " + adjective2 + " treasure chest filled with " + 
         nounPlural + ". Excitedly, he grabbed " + number +  " of them and ran outside. But suddenly, a giant " + animal + " appeared and started to " + 
          verb2 + "! The explorer,without hesitation used their trusty " + object + " to " + verb3 + " the creature and escape. After the " + adjective4 + 
          " escape, the explorer returned to his home, a cozy " + typeOfBuilding + " located on top of a " + geographicalFeature +
           ". He celebrated the escape with his family by " + verbEndingInIng + " and eating " + food + " for dinner. It was truly a " + adjective5 +" day!";
        System.out.print(story1);
        break;
        
        
    
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
      



       
      String story2 ="One day, " + name2 + " decided to go on an " + adjective6 + " ocean expedition. " +
      "While diving near " + place + ", they encountered a huge " + seaCreature + " that looked very " + adjective7 + ". " +
                    name3 + " quickly " + verb4 + " and hid behind a " + noun1 + ". As they watched, more " + nounPlural2 + 
                    " appeared, and soon, they were all " + verbEndingInIng2 + " around. After the thrilling adventure, " + name3 + 
                    " returned to the boat and enjoyed a delicious meal of " + food2 + ". It was a day filled with wonder and excitement, " +
                    "and the crew counted " + number2 + " sea creatures in total!";
                    System.out.println(story2); break;
                    
    

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

                    String story3;
                     story3 = "Once upon a time, " + explorerName + " set out on an adventurous journey through the " + adjective8 + 
                    " desert." +"While exploring a vast " +desertFeature + ", they encountered a " + animal2 + " and decided to " + verb5 +
                     " to avoid it. " + "AFter some time, they found a mysterious " + object1 + " to " + verb6 + " the item and discovered a hidden " +
                      treasure + ". The treasure was " + adjective9 + "and included a rare" + object2 + ". Feeling accomplished, " + explorerName + 
                      " spent the evening " + activity + "and enjoyed a delicious meal of " + food3 + " with " + number3 + " friends.";  
                      System.out.println(story3);
                      break;


                        }}

// playing agian
                public void again() {
                    String answer2;
                    String feedback;
                    String answer3;
                    String answer4;
                    
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
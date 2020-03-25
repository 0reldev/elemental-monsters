import java.util.Scanner;

class Arena {

    public static Scanner input = new Scanner(System.in);

    public static void counterAttack(Monster ennemy, Monster champion) {
        if (ennemy.getLife() > 0 ) {
            ennemy.attack(champion);                                                                                                                                                                                                                                                                                                                                                                                          
        }
    }

    public static void fight(Monster champion, Monster ennemy) {        
            
            String answer = "";
            boolean stop = false;

            while (answer != "a" || answer != "h") {
                if (champion.getLife() > 0 && ennemy.getLife() > 0){
                    System.out.println("What is your next action? Type 'a' for attacking, 'h' for healing.");
                    answer = input.nextLine();
                    if (answer.equals("a")) { 
                        champion.attack(ennemy);
                        answer = "";
                        counterAttack(ennemy, champion);

                    } else if (answer.equals("h")){
                        champion.heal();
                        answer = "";
                        counterAttack(ennemy, champion);
                    } else {
                        System.out.println( "Invalid answer!");
                    }
                }
            
                else {
                    if (champion.getLife()<= 0 && !stop) {
                        System.out.println("GAME OVER!");
                        stop = true;
                        break;
                                                
                    } else {
                        System.out.println(champion.getName() + " wins! ");
                        break;
                    }                          
                }
            }                   
    }


    public static void main (String[] args) {

        // creation of new instances
        Monster champion = new Monster("Champion", 40.0); // rendre aléatoire le choix du type
        Monster ennemy1 = new Monster("Ennemy 1"); 
        Monster ennemy2 = new Monster("Ennemy 2");
        Monster ennemy3 = new Monster("Ennemy 3");
        int nbVictories = 0;


        
        System.out.println("\nROUND 1\n");
        champion.status();
        ennemy1.status();
        while (ennemy1.getLife() > 0 && champion.getLife() > 0) {
            fight(champion, ennemy1);
    
        }
        if (champion.getLife() > 0) {
            nbVictories++;
            System.out.println("\nROUND 2\n");
            champion.status();
            ennemy2.status();
            while (ennemy2.getLife() > 0 && champion.getLife() > 0) {
                fight(champion, ennemy2);
            }
        } 
    
        if (champion.getLife() > 0) {
            nbVictories++;
            System.out.println("\nROUND 3\n");
            champion.status();
            ennemy3.status();
            while (ennemy3.getLife() > 0 && champion.getLife() > 0) {
                fight(champion, ennemy3);
            }
        }

        if (champion.getLife() > 0) {
            nbVictories++;
        }
        
        System.out.println("Victorious rounds: " + nbVictories);



    }

}
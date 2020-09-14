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

            if (champion.getLife() > 0 && ennemy.getLife() > 0) {

                System.out.println("What is your next action? Type 'a' for attacking, 'h' for healing.");
                answer = input.nextLine();
                if (answer.equals("a")) {

                    champion.attack(ennemy);
                    answer = "";
                    counterAttack(ennemy, champion);
                } else if (answer.equals("h")) {

                    champion.heal();
                    answer = "";
                    counterAttack(ennemy, champion);
                } else {

                    System.out.println( "Invalid answer!");
                }
            } else {
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

    private static int round(Monster champion, Monster opponent, int round) {

        if (champion.getLife() > 0) {

            System.out.println("\nROUND " + round + "\n");
            champion.status();
            opponent.status();
            while (opponent.getLife() > 0 && champion.getLife() > 0) {

                fight(champion, opponent);
            }
        }
        if (champion.getLife() > 0) {

            return 1;
        }
        return 0;
    }

    public static void main (String[] args) {

        Monster champion = new Monster("Champion", 40.0);
        Monster ennemy1 = new Monster("Ennemy 1"); 
        Monster ennemy2 = new Monster("Ennemy 2");
        Monster ennemy3 = new Monster("Ennemy 3");
        int nbVictories = 0;

        nbVictories += round(champion, ennemy1, 1);
        nbVictories += round(champion, ennemy2, 2);
        nbVictories += round(champion, ennemy3, 3);
        
        System.out.println("Victorious rounds: " + nbVictories);
    }
}
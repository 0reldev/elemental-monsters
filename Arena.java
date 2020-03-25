class Arena {


    public static void main (String[] args) {

        // creation of new instances
        Monster champion = new Monster("Champion", "fire");
        Monster ennemy1 = new Monster("Ennemy 1"); 
        Monster ennemy2 = new Monster("Ennemy 2");
        Monster ennemy3 = new Monster("Ennemy 3");



        champion.status();
        ennemy1.status();
        ennemy2.status();
        ennemy3.status();

        while (champion.getLife() > 0 && ennemy1.getLife() > 0 ) {
        // champion attacks ennemy
            String affichage = champion.attack(ennemy1);
            System.out.println(affichage);

        // ennemy couter-attacks champion
            if (ennemy1.getLife() > 0 ) {
                String affichage2 = ennemy1.attack(champion);                                                                                                                                                                                                                                                                                                                                                                                          
                System.out.println(affichage2);
            }
        }
        // while (roudou.getLife() > 0 && mewtwo.getLife() > 0 ) {
        
        //     // mewtwo attacks roudou
        //     String affichage = mewtwo.attack(roudou);
        //     System.out.println(affichage);

        //     // roudou attacks mewtwo
        //     String affichage2 = roudou.attack(mewtwo);                                                                                                                                                                                                                                                                                                                                                                                          
        //     System.out.println(affichage2);
            
        // }
        
    }

}
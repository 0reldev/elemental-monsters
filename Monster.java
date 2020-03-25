import java.util.Random;

class Monster {

    Random r = new Random();
    String[] elements = {"fire", "water", "air"};

    // attributes
    private String name;
    private int strength;   // de 0 à 9
    private int intelligence;   // de 0 à 9
    private double life;   // 40 ou de 10 à 30
    private String element; // "fire", "water", "air"


    // constructors
    public Monster(String name, String element){
        this.name = name;
        this.strength = r.nextInt(9);
        this.intelligence = r.nextInt(9);
        this.life = 40.0;
        this.element = element;
    }

    public Monster(String name){
        this.name = name;
        this.strength = r.nextInt(9);
        this.intelligence = r.nextInt(9);
        this.life = (double) r.nextInt(21) + 10 ; // r.nextInt(max - min + 1) + min
        this.element = elements[r.nextInt(3)];
    }
  


    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setLife(double life) {
        this.life = life;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
    
    public void setElement(String element) {
        this.element = element;
    }
    
    // getters
    public String getName() {
        return this.name;
    }

    public int getStrength() {
        return this.strength;
    }

    public double getLife() {
        return this.life;
    }

    public int getIntelligence() {
        return this.intelligence;
    }
    
    public String getElement() {
        return this.element;
    }
    

    // instance method

    public String attack(Monster ennemyMonster) {
        
        int attack = getStrength() + 1;
             
        double efficiency = 1.0;
        if (this.element == "fire" && ennemyMonster.element == "air" 
            || this.element == "water" && ennemyMonster.element == "fire"
            || this.element == "air" && ennemyMonster.element == "water") {
                efficiency = 2.0 ;
        } else if ( this.element == "air" && ennemyMonster.element == "fire" 
        || this.element == "fire" && ennemyMonster.element == "water"
        || this.element == "water" && ennemyMonster.element == "air") {
                efficiency = 0.5 ;
        }

        ennemyMonster.setLife( ennemyMonster.getLife() - attack * efficiency );

        if (ennemyMonster.getLife() > 0) {
            return this.getName() + " attacks " + ennemyMonster.getName() + ".\n" + ennemyMonster.getName() + " has " + ennemyMonster.getLife() + " points remaining.\n";
        } else {
            return this.getName() + " attacks " + ennemyMonster.getName() + ".\n" + ennemyMonster.getName() +" is KO!\n" ;          
        }                                
    }


    // display the stats of a monster
    public void status() {
        System.out.println(this.getName());
        System.out.println("Strength: " + this.getStrength());
        System.out.println("Intelligence: " + this.getIntelligence());
        System.out.println("Life: " + this.getLife());
        System.out.println("Element: " + this.getElement() + "\n");
    }



}
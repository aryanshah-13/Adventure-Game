/**
 * This class is called player, It takes cares of all the actions of the player such as the location of the player --> in which direction 
 * the player is going and in what direction the player should go it a certain key is pressed.
 * It also has the inventory management system for the player, that is it takes care of the items collected/dropped by the user or playe.
 * Overall it is a class to manage the action of the player.
 * The methods in the class are move(method to move in a certain direction), takeItem(method to pick up an item when found),
 * useItem(as obviuos this is a method to use a certain item from the inventory) and finally the last method of the class is 
 * displayCurrentLocation(method to display the current location of the player).
 */

import java.util.Scanner;
import java.lang.Thread;

public class player {

    // Initializing the variables of the player 
    private static int health; 
    private int xp;
    private static int healingPotion;
    private static int combatPotion;
    private static int shieldPotion;
    private int totalNumPotions;
    private int level;
    public static int maxHP = 100;
    private int attack;
    private int defend;
    private String name;
    private int age;
    

    public void initialValues() { // Method to set the initial values of the player when starting the game.
        maxHP = 100; // Setting the maximum health points to 100 so that when the player uses a potion then the health replenishes to 100.
        health = maxHP;
        level = 1;
        xp = 0;
        totalNumPotions = 3;
        healingPotion = 1;
        combatPotion = 1;
        shieldPotion = 1;
    }
    

    // Creating getters and setters for showing the information of the screen and changing the values

    // getters 

    public static int getHealth() {
        return health;
    }

    public int getXP() {
        return xp;
    }

    public int getTotalNumPotions() {
        return totalNumPotions;
    }

    public static int getHealingPotion() {
        return healingPotion;
    }

    public static int getCombatPotion() {
        return combatPotion;
    }

    public static int getShieldPotion() {
        return shieldPotion;
    }

    public int getLevel() {
        return level;
    }

    public int getAttack() {
        return attack;
    }
    public int getDefend() {
        return defend;
    }
    
    // Setters 

    public static void setHealth(int health) {
        player.health = health;
    }

    public void setXP(int xp) {
        this.xp = xp;
    }

    public void setTotalNumPotions(int totalNumPotions) {
        this.totalNumPotions = totalNumPotions;
    }

    public static void setHealingPotion(int healingPotion) {
        player.healingPotion = healingPotion;
    }

    public static void setCombatPotion(int combatPotion) {
        player.combatPotion = combatPotion;
    }

    public static void setShieldPotion(int shieldPotion) {
        player.shieldPotion = shieldPotion;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setDefend(int defend) {
        this.defend = defend;
    }


    // helper method to check if the player is alive or not 
    public boolean isAlive() {
        return health > 0; // returns true if the health of the player is greater than 0, and false otherwise
    }  


    // parametrized constructor to take the player details and make a character 
    public player(String name, int age) {
        this.name = name;
        this.age = age;
    }


    // getters and setters for constructor
    public String getName() {
        return name;
    } 

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    } 

 // making a default constructor for the player 
    public player() {

    }


    // Making instance variables for the enemies 
    private String enemyName;
    private int enemyHealth;
    private String enemyDescription;

    // Making a parametrized constructor for the enemy values

    public player(String enemyName, String enemyDescription, int enemyHealth) {
        this.enemyName = enemyName;
        this.enemyDescription =enemyDescription;
        this.enemyHealth = enemyHealth;
    }

    // Making getters and setters for the enemy characters 

    public String getEnemyName() {
        return enemyName;
    }

    public String getEnemyDescription() {
        return enemyDescription;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    // Making a enemy health setter for changing the values of the enemies
    public void setEnemyHealth(int enemyHealth) {
        this.enemyHealth = enemyHealth;
    }

    // Creating the enemies 
    static player skeleton = new player("Bone crawler", "A skeletal arachnid creature with razor-sharp limbs and a relentless pursuit.", 100);
    static player bomb = new player("Bomb", "A spherical explosive entity with a mischievous grin.", 100);

    
    // method to get the login information of the user and get they started
    public static void login() throws InterruptedException {

        Scanner in = new Scanner(System.in);
        String name1;
        int age1;
        //player player1 = new player();
        System.out.println("Register before playing the game");
        System.out.println("\n------------------------------------------");

        System.out.println("\nEnter you name you would like to have for your character: ");
        name1 = in.nextLine(); // Getting the name as input from the user 
        //player1.setName(name1); // Populating the player1 object with the input obtaied from the user 
        System.out.println("Enter your age: ");
        age1 = in.nextInt(); // Getting the age as input from the user 
        //player1.setAge(age1); // Populating the player1 object with the input obtained from the user 
        System.out.println("Logged in !");
        System.out.println("\n--------------------------------------------");
        player player1 = new player(name1, age1);

    }

    public void instructions() throws InterruptedException {
        System.out.println("\nThis is a text based game in which you have you go roam in the map and find different objects and defeat characters to find the gem that is hidden in one of the rooms !!");
        System.out.println("\nBasic instructions for the gameplay: ");
        System.out.println("Avail commands NORTH, EAST, SOUTH or WEST to move in the direction desired \n Avail command heal to use the healing potion and regain your health after a fight with some character \n Avail command shield to use the shield potion and get a armour when fighting against any enemy \n Avail command combat to use the combat potion and get extra hit points \n Avail commands attack or defend when an enemy is encountered \n All the best.....");
        System.out.println("\nPress enter to continue");
        Scanner in = new Scanner(System.in);

        // If enter is pressed then the code resumed
        if (in.hasNextLine()) {
            String s = in.nextLine();
        }
        storyline();
    }



    
    // Small method to start the game with and storyline introduction
    public void storyline() throws InterruptedException {

        Thread.sleep(2000); // Console waits for 2 seconds before printing the next statement to create a game effect
        System.out.println("The room is dark and gloomy, it reeks of dead corpses and rotten food");
        Thread.sleep(2000);
        System.out.println("You look behind you, the skeleton you recently killed and the damaged map are on the floor");
        Thread.sleep(3500);
        System.out.println("\nThe only choice is to move forward");
        Thread.sleep(2500);
        System.out.println("Avail commands: heal");
        System.out.println("\n---------------------------------------");

    }

    public static void showEnemy(room room1) {
        
        room1.getRoom();

         if (room1.equals(room.dragonRoom)) {
            System.out.println("\nYou have an enemy in the room !! :" + "\n" + skeleton.getEnemyName() + "\n" + skeleton.getEnemyDescription());
        }

        else if (room1.equals(room.forgottenCrypt)) {
            System.out.println("\nYou have an enemy in the room !! :" + "\n" + bomb.getEnemyName() + "\n" + bomb.getEnemyDescription());
        }

        else if (room1.equals(room.whisperingCaves)) {
            System.out.println("\nYou have an enemy in the room !! :" + "\n" + skeleton.getEnemyName() + "\n" + skeleton.getEnemyDescription());
        }

        else if(room1.equals(room.abyssalThroneRoom)) {
            System.out.println("\nYou have an enemy in the room !! :" + "\n" + bomb.getEnemyName() + "\n" + bomb.getEnemyDescription());
        }

        else if (room1.equals(room.enchantedLibrary)) {
            System.out.println("\nYou have an enemy in the room !! :" + "\n" + skeleton.getEnemyName() + "\n" + skeleton.getEnemyDescription());
        }

        else {
            System.out.println("\nNo room found");
        }

        // some rooms dont have enemies .. for example the room chamber of shadows and the celestial gardens 
    }

    // Method to kill the enemy by using the different potions according to the choice of the user 
    public static void  killingEnemy() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nEmploy the elixir at your disposal to counter the adversary.");
        String input = in.nextLine();
        int updatedHealth = getHealth() - 50;
        
        while(true) {

            if (input.equals("Shield potion")) {
                setShieldPotion(getShieldPotion() - 1);
                System.out.println("\nYou used a shield potion to be protected from this enemy ... Move to another move as soon as possible till the potion lasts !!");
                break;
            }

            else if (input.equals("Combat potion")) {
                setCombatPotion(getCombatPotion() - 1);
                System.out.println("\nYou used the combat potion to fight the enemy ... You killed the it !!");
                System.out.println("Your HP after the fight is: " + updatedHealth);
                break;
            }
            else if (input.equals("Healing potion")) {
                setHealingPotion(getHealingPotion() - 1);
                System.out.println("\nYou used a healing potion.. You are now at your max HP");
                setHealth(maxHP);
                break;
            }
            else {
                System.out.println("\nPotion doesn't exist !!");
                break;
            } 

        }

    }
    
}

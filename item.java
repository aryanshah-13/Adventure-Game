import java.util.Scanner;

/**
 * It is a class that defines the properties and behaviours of the items picked by the user while in the game that he 
 * can use or collect if he wants to.
 * Some of the methods in this class are use(), getdescription() etc.
 * 
 */
import java.util.Scanner;

public class item {
      
    // Creating instance variables for method to add items to the inventory
    private String itemName;
    private String descriptionOfItem;


    // Creating parametrized constructor for making items

    public item(String itemName, String descriptionOfItem) {
        this.itemName = itemName;
        this.descriptionOfItem = descriptionOfItem;
    }

    // default constructor

    public item() {}

    // Creating getters for the constructor

    public String getName() {
        return itemName;
    }

    public String getDescription() {
        return descriptionOfItem;
    }    

    // Creating items of different types for the player to use 

    static item healingPotion = new item("Healing Potion", " Glowing vial containing a revitalizing elixir, able to mend wounds and restore vitality with a single sip.");
    static item shieldPotion = new item("Shield Potion", "Shimmering concoction sealed in a radiant flask, providing a temporary magical barrier to deflect incoming attacks and enhance defense.");
    static item combatPotion = new item("Combat Potion", "Fiery brew in a potion bottle, granting a surge of strength and heightened combat prowess, empowering adventurers for intense battles");
    static item sword = new item("Sword", "Enchanted blade with a gleaming, silvered edge and a hilt adorned with mystical runes, capable of slicing through the darkness with a swift and precise strike.");
    static item gem = new item("GEM", "Radiant gem pulsating with arcane energy, coveted for its mystical properties and potential use in unlocking hidden secrets or enhancing magical abilities");

    // Method to heal and use the potion
    public static void heal(player player1) { // Passing player1 as a paramter in meathod heal so that we can use object player1 wherever we want

        Scanner scan = new Scanner(System.in);
    
        while (true) {

            String input;
            input = scan.nextLine();

            if (input.equals("heal")) {

                if(player1.getHealingPotion() > 0) {

                    player1.setTotalNumPotions(player1.getTotalNumPotions() - 1);  // Setting the Number of potions of player 1 as numpotions - 1 since the user used one potion
                    player1.setHealingPotion(player1.getHealingPotion() - 1); // Reducing the number of healing potions by 1
                    player1.setHealth(player1.maxHP); // Since the user used 1 potion the health of the player is maxed 
                    

                    System.out.println("\nYou used a healing potion and you are at your max HP, your health points are " + player1.getHealth());
                    
                    break;
                }

                else {
                    System.out.println("You don't have enough Healing potions");
                } 
            }
            

            else {
                System.out.println("Please enter a valid command !");
            }

        }
        
    }

    public static void stats(player player1) { // Passsing player1 as parameter so that we can use object player 1 wherever we want

        System.out.println("\n------------------------");
        System.out.println("\nSTATS: "); // Printing the stats of the suer 
        System.out.println("Health: " + player1.getHealth());
        System.out.println("Level: " + player1.getLevel());
        System.out.println("XP: " + player1.getXP());
        System.out.println("Total potions: " + player1.getTotalNumPotions());
        System.out.println("Healing Potions: " + player1.getHealingPotion());
        System.out.println("Combat potions: " + player1.getCombatPotion());
        System.out.println("Shield potions: " + player1.getShieldPotion());
        System.out.println("Combat Potion: " + player1.getCombatPotion());
        System.out.println("\n------------------------");   

    }

    public static void showItems(room room1) {
        room1.getRoom();
        if (room1.equals(room.dragonRoom)) {
            System.out.println("The items in the room are: " + "\n" + room.dragonRoom.getArtifact().getName() + "\n" + room.dragonRoom.getDescriptionOfItem());
        }

        else if (room1.equals(room.forgottenCrypt)) {
            System.out.println("The items in the room are: " + "\n" + room.forgottenCrypt.getArtifact().getName() + "\n" + room.forgottenCrypt.getDescriptionOfItem());
        }

        else if (room1.equals(room.whisperingCaves)) {
            System.out.println("The items in the room are: " + "\n" + room.whisperingCaves.getArtifact().getName() + "\n" + room.whisperingCaves.getDescriptionOfItem());
        }

        else if (room1.equals(room.celestialGarden)) {
            System.out.println("The items in the room are: " + "\n" + room.celestialGarden.getArtifact().getName() + "\n" + room.celestialGarden.getDescriptionOfItem());
        }

        else if (room1.equals(room.chamberOfShadows)) {
            System.out.println("The items in the room are: " + "\n" + room.chamberOfShadows.getArtifact().getName() + "\n" + room.chamberOfShadows.getDescriptionOfItem());
        }

        else if(room1.equals(room.abyssalThroneRoom)) {
            System.out.println("The items in the room are: " + "\n" + room.abyssalThroneRoom.getArtifact().getName() + "\n" + room.abyssalThroneRoom.getDescriptionOfItem());
        }

        else if (room1.equals(room.enchantedLibrary)) {
            System.out.println("The items in the room are: " + "\n" + room.enchantedLibrary.getArtifact().getName() + "\n" + room.enchantedLibrary.getDescriptionOfItem());
        }

        else {
            System.out.println("No room found");
        }
    }

    public static String choice() {
        Scanner in = new Scanner(System.in);
        System.out.println("\nDo you want to pick up the item (yes/no)");
        String choice = in.nextLine();
        return choice;
    }

    public void pickItem(String artifact) {

        String userChoice = choice();
        
        player player1 = new player();
        
        String Sword = sword.getName();
        String Heal = healingPotion.getName();
        String Shield = shieldPotion.getName();
        String Combat = combatPotion.getName();
        String Gem = gem.getName();

        if (userChoice.equals("yes")) {

            if (artifact.equals(Sword)) {
                System.out.println("You picked up the sword !!");
            }

            else if (artifact.equals(Heal)) {
                System.out.println("You picked up the healing potion !!");
                player1.setHealingPotion(player1.getHealingPotion() + 1);
            }

            else if (artifact.equals(Shield)) {
                System.out.println("You picked up the Shield potion");
                player1.setShieldPotion(player1.getShieldPotion() + 1);
            }

            else if (artifact.equals(Combat)) {
                System.out.println("You picked up the Combat potion");
                player1.setCombatPotion(player1.getCombatPotion() + 1);
            }

            else if (artifact.equals(Gem)) {
                System.out.println("You picked up the GEM !!");
            }
        }

        else if (userChoice.equals("no")) {
            System.out.println("OK lets move forward");
        }
        
    }

    public void checkRoomAndPickItem() {

        room room1 = new room();

        String checkRoom = new room().getRoom().getName(); // getting the current room 
        

        if (checkRoom.equals(room1.dragonRoom.getName())) {
            pickItem("Sword");
        }

        else if (checkRoom.equals(room1.whisperingCaves.getName())) {
            pickItem("Shield Potion");
        }

        else if (checkRoom.equals(room1.celestialGarden.getName())) {
            pickItem("Healing Potion");
        }

        else if (checkRoom.equals(room1.chamberOfShadows.getName())) {
            pickItem("Combat Potion");
        }

        else if (checkRoom.equals(room1.abyssalThroneRoom.getName())) {
            pickItem("Sword");
        }

        else if (checkRoom.equals(room1.labyrinthOfIllusions.getName())) {
            pickItem("Shield Potion");
        }

        else if (checkRoom.equals(room1.elysianFields.getName())) {
            pickItem("Healing Potion");
        }

        else if (checkRoom.equals(room1.forgottenCrypt.getName())) {
            pickItem("Shield Potion");
        }

        else if (checkRoom.equals(room1.echoingHalls.getName())) {
            pickItem("Combat Potion");
        }

        else if (checkRoom.equals(room1.enchantedLibrary.getName())) {
            pickItem("GEM");
        }

    }


    

}

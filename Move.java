import java.util.Scanner;

public class Move {

    static String dir;
    static int exit = 0;

    public static enum Direction { // Creating an enum called Direction 
        // An enum is a a set of pre defined variables that act as constants
            NORTH,
            EAST,
            SOUTH,
            WEST,
            NO_EXIT
        }

    
    // Default constructor   
    public Move() {

    }


    public static void moveFromDragonRoom() {
            if (Direction.valueOf(dir) == Direction.NORTH) {
            System.out.println("No exit");
            
            }

            else if (Direction.valueOf(dir) == Direction.EAST) {
            System.out.println("The room is: " + room.whisperingCaves.getName());
            System.out.println(room.whisperingCaves.getDescription());
            System.out.println("\n");
            item.showItems(room.whisperingCaves);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.whisperingCaves);
            player.killingEnemy();
            
            
            }

            else if (Direction.valueOf(dir) == Direction.SOUTH) {
            System.out.println("The room is: " + room.forgottenCrypt.getName());
            System.out.println(room.forgottenCrypt.getDescription());
            System.out.println("\n");
            item.showItems(room.forgottenCrypt);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.forgottenCrypt);
            player.killingEnemy();
            
                        
            }

            else if (Direction.valueOf(dir) == Direction.WEST) {
            System.out.println("The room is: " + room.chamberOfShadows.getName());
            System.out.println(room.chamberOfShadows.getDescription());
            System.out.println("\n");
            item.showItems(room.chamberOfShadows);
            pickitem.checkRoomAndPickItem();
            
                     
            }
    }

    public static void moveFromWhisperingCaves() {
        if (Direction.valueOf(dir) == Direction.NORTH) {
            System.out.println("No exit");
            getExit();
            moveFromWhisperingCaves();
            
            }

            else if (Direction.valueOf(dir) == Direction.EAST) {
            System.out.println("The room is: " + room.celestialGarden.getName());
            System.out.println(room.celestialGarden.getDescription());
            System.out.println("\n");
            item.showItems(room.celestialGarden);
            pickitem.checkRoomAndPickItem();
            getExit();
            moveFromCelestialGarden();

            }

            else if (Direction.valueOf(dir) == Direction.SOUTH) {
            System.out.println("No exit");
            getExit();
            moveFromWhisperingCaves();
            
            }

            else if (Direction.valueOf(dir) == Direction.WEST) {
            System.out.println("The room is: " + room.dragonRoom.getName());
            System.out.println(room.dragonRoom.getDescription());
            System.out.println("\n");
            item.showItems(room.dragonRoom);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.dragonRoom);
            player.killingEnemy();
            getExit();
            moveFromDragonRoom();
            
            }
    }

    public static void moveFromCelestialGarden() {
         if (Direction.valueOf(dir) == Direction.NORTH) {
            System.out.println("No exit");
            getExit();
            
            }

            else if (Direction.valueOf(dir) == Direction.EAST) {
            System.out.println("No exit");
            getExit();
            
            }

            else if (Direction.valueOf(dir) == Direction.SOUTH) {
            System.out.println("The room is: " + room.elysianFields.getName());
            System.out.println(room.elysianFields.getDescription());
            System.out.println("\n");
            item.showItems(room.elysianFields);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.elysianFields);
            player.killingEnemy();
            getExit();
            moveFromElysianFields();
            
            }

            else if (Direction.valueOf(dir) == Direction.WEST) {
            System.out.println("The room is: " + room.whisperingCaves.getName());
            System.out.println(room.whisperingCaves.getDescription());
            System.out.println("\n");
            item.showItems(room.whisperingCaves);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.whisperingCaves);
            player.killingEnemy();
            getExit();
            moveFromWhisperingCaves();
            
            }
    }

    public static void moveFromChamberOfShadows() {
            if (Direction.valueOf(dir) == Direction.NORTH) {
            System.out.println("No exit");
            getExit();
            
            }

            else if (Direction.valueOf(dir) == Direction.EAST) {
            System.out.println("The room is: " + room.dragonRoom.getName());
            System.out.println(room.dragonRoom.getDescription());
            System.out.println("\n");
            item.showItems(room.dragonRoom);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.dragonRoom);
            player.killingEnemy();
            getExit();
            moveFromDragonRoom();
            
            }

            else if (Direction.valueOf(dir) == Direction.SOUTH) {
            System.out.println("The room is: " + room.abyssalThroneRoom.getName());
            System.out.println(room.abyssalThroneRoom.getDescription());
            System.out.println("\n");
            item.showItems(room.abyssalThroneRoom);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.abyssalThroneRoom);
            player.killingEnemy();
            getExit();
            moveFromAbyssalThroneRoom();
            
            }

            else if (Direction.valueOf(dir) == Direction.WEST) {
            System.out.println("No exit");
            getExit();
            
            }
    }

    public static void moveFromAbyssalThroneRoom() {
            if (Direction.valueOf(dir) == Direction.NORTH) {
            System.out.println("The room is: " + room.chamberOfShadows.getName());
            System.out.println(room.chamberOfShadows.getDescription());
            System.out.println("\n");
            item.showItems(room.chamberOfShadows);
            pickitem.checkRoomAndPickItem();
            getExit();
            moveFromChamberOfShadows();
            
            }

            else if (Direction.valueOf(dir) == Direction.EAST) {
            System.out.println("The room is: " + room.labyrinthOfIllusions.getName());
            System.out.println(room.labyrinthOfIllusions.getDescription());
            System.out.println("\n");
            item.showItems(room.labyrinthOfIllusions);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.labyrinthOfIllusions);
            player.killingEnemy();
            getExit();
            moveFromLabrynthOfIllusions();
            
            }

            else if (Direction.valueOf(dir) == Direction.SOUTH) {
            System.out.println("No exit");
            getExit();
            
            }

            else if (Direction.valueOf(dir) == Direction.WEST) {
            System.out.println("No exit");
            getExit();
            
            }
    }

    public static void moveFromLabrynthOfIllusions() {

            if (Direction.valueOf(dir) == Direction.NORTH) {
            System.out.println("No exit");
            getExit();
            }

            else if (Direction.valueOf(dir) == Direction.EAST) {
            System.out.println("The room is: " + room.elysianFields.getName());
            System.out.println(room.elysianFields.getDescription());
            System.out.println("\n");
            item.showItems(room.elysianFields);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.elysianFields);
            player.killingEnemy();
            getExit();
            moveFromElysianFields();
            
            }

            else if (Direction.valueOf(dir) == Direction.SOUTH) {
            System.out.println("The room is: " + room.echoingHalls.getName());
            System.out.println(room.echoingHalls.getDescription());
            System.out.println("\n");
            item.showItems(room.echoingHalls);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.echoingHalls);
            player.killingEnemy();
            getExit();
            moveFromEchoingHalls();
            
            }

            else if (Direction.valueOf(dir) == Direction.WEST) {
            System.out.println("The room is: " + room.abyssalThroneRoom.getName());
            System.out.println(room.abyssalThroneRoom.getDescription());
            System.out.println("\n");
            item.showItems(room.abyssalThroneRoom);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.abyssalThroneRoom);
            player.killingEnemy();
            getExit();
            moveFromAbyssalThroneRoom();
            
            }
    }

    public static void moveFromElysianFields() {

            if (Direction.valueOf(dir) == Direction.NORTH) {
            System.out.println("The room is: " + room.celestialGarden.getName());
            System.out.println(room.celestialGarden.getDescription());
            System.out.println("\n");
            item.showItems(room.celestialGarden);
            pickitem.checkRoomAndPickItem();
            getExit();
            moveFromCelestialGarden();
            
            }

            else if (Direction.valueOf(dir) == Direction.EAST) {
            System.out.println("No exit");
            getExit();
            
            }

            else if (Direction.valueOf(dir) == Direction.SOUTH) {
            System.out.println("No exit");
            getExit();
            
            }

            else if (Direction.valueOf(dir) == Direction.WEST) {
            System.out.println("The room is: " + room.labyrinthOfIllusions.getName());
            System.out.println(room.labyrinthOfIllusions.getDescription());
            System.out.println("\n");
            item.showItems(room.labyrinthOfIllusions);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.labyrinthOfIllusions);
            player.killingEnemy();
            getExit();
            moveFromLabrynthOfIllusions();

            
            }
    }

    public static void moveFromForgottenCrypt() {

            if (Direction.valueOf(dir) == Direction.NORTH) {
            System.out.println("The room is: " + room.dragonRoom.getName());
            System.out.println(room.dragonRoom.getDescription());
            System.out.println("\n");
            item.showItems(room.dragonRoom);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.dragonRoom);
            player.killingEnemy();
            getExit();
            moveFromDragonRoom();
            
            }

            else if (Direction.valueOf(dir) == Direction.EAST) {
            System.out.println("No exit");
            getExit();
            
            }

            else if (Direction.valueOf(dir) == Direction.SOUTH) {
            System.out.println("No exit");
            getExit();
            
            }

            else if (Direction.valueOf(dir) == Direction.WEST) {
            System.out.println("No exit");
            getExit();
            
            }
    }

    public static void moveFromEchoingHalls() {
        
            if (Direction.valueOf(dir) == Direction.NORTH) {
            System.out.println("The room is: " + room.labyrinthOfIllusions.getName());
            System.out.println(room.labyrinthOfIllusions.getDescription());
            System.out.println("\n");
            item.showItems(room.labyrinthOfIllusions);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.labyrinthOfIllusions);
            player.killingEnemy();
            getExit();
            moveFromLabrynthOfIllusions();
            
            }

            else if (Direction.valueOf(dir) == Direction.EAST) {
            System.out.println("The room is: " + room.enchantedLibrary.getName());
            System.out.println(room.enchantedLibrary.getDescription());
            System.out.println("\n");
            item.showItems(room.enchantedLibrary);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.enchantedLibrary);
            player.killingEnemy();
            getExit();
            moveFromEnchantedLibrary();
            
            }

            else if (Direction.valueOf(dir) == Direction.SOUTH) {
            System.out.println("No exit");
            getExit();
            
            }

            else if (Direction.valueOf(dir) == Direction.WEST) {
            System.out.println("The room is: " + room.forgottenCrypt.getName());
            System.out.println(room.forgottenCrypt.getDescription());
            System.out.println("\n");
            item.showItems(room.forgottenCrypt);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.forgottenCrypt);
            player.killingEnemy();
            getExit();
            moveFromForgottenCrypt();
            }
    }

    public static void moveFromEnchantedLibrary() {
            
            if (Direction.valueOf(dir) == Direction.NORTH) {
            System.out.println("No exit");
            getExit();
            
            }

            else if (Direction.valueOf(dir) == Direction.EAST) {
            System.out.println("No exit");
            getExit();
            
            }

            else if (Direction.valueOf(dir) == Direction.SOUTH) {
            System.out.println("No exit");
            getExit();
            
            }

            else if (Direction.valueOf(dir) == Direction.WEST) {
            System.out.println("The room is: " + room.echoingHalls.getName());
            System.out.println(room.echoingHalls.getDescription());
            System.out.println("\n");
            item.showItems(room.echoingHalls);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.echoingHalls);
            player.killingEnemy();
            getExit();
            moveFromEchoingHalls();
            }
    }

    public static item pickitem = new item();

    public static void movePlayer() {

        if (Direction.valueOf(dir) == Direction.NORTH) {
            System.out.println("No exit");
            System.out.println();
            getExit();
            moveFromDragonRoom();
            
            }

            else if (Direction.valueOf(dir) == Direction.EAST) {
            room.setRoom(room.whisperingCaves);
            System.out.println("The room is: " + room.whisperingCaves.getName());
            System.out.println(room.whisperingCaves.getDescription());
            System.out.println();
            item.showItems(room.whisperingCaves);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.whisperingCaves);
            player.killingEnemy();
            getExit();
            moveFromWhisperingCaves();
                
            }

            else if (Direction.valueOf(dir) == Direction.SOUTH) {
            room.setRoom(room.forgottenCrypt);
            System.out.println("The room is: " + room.forgottenCrypt.getName());
            System.out.println(room.forgottenCrypt.getDescription());
            System.out.println();
            item.showItems(room.forgottenCrypt);
            pickitem.checkRoomAndPickItem();
            player.showEnemy(room.forgottenCrypt);
            player.killingEnemy();
            getExit();
            moveFromForgottenCrypt();    
        
            }

            else if (Direction.valueOf(dir) == Direction.WEST) {
            room.setRoom(room.chamberOfShadows);
            System.out.println("The room is: " + room.chamberOfShadows.getName());
            System.out.println(room.chamberOfShadows.getDescription());
            System.out.println();
            item.showItems(room.chamberOfShadows);
            pickitem.checkRoomAndPickItem();
            getExit();  
            moveFromChamberOfShadows();

            }
        
    }

    public static void getExit() {

        Scanner scan = new Scanner(System.in);

                System.out.println("Enter the direction you want to go in (NORTH/ EAST/ SOUTH/ WEST): ");

                dir = scan.nextLine(); // Getting the value of the exit

                try {
                switch(Direction.valueOf(dir)) { /*valueOf is a function provided by the enum class and used to convert a string rep of an enum const
                                                    to the corresponding enum const */  
                    case NORTH:

                        exit = room.currentRoom.getN();   
                        break; 

                    case EAST:

                        exit = room.currentRoom.getE();               
                        
                        break;

                    case SOUTH:

                        exit = room.currentRoom.getS();                  
                        
                        break;

                    case WEST:

                        exit = room.currentRoom.getW();                   
                        
                        break;
                    
                    default:

                        System.out.println("Please enter a valid direction");
                        break;
                }

            }
                
            catch(IllegalArgumentException e) {
                System.out.println("Invalid direction Input");
            }
    }

    public static void advance() {
        while(true) {
            getExit();

            movePlayer();
        }
        
    }
}


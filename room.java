/**
 * This is a crucial class because it performs activities such as representing a location of the player in the game,
 * store information of the room etc and handle information about the room.
 * The functions in this class are getDescription(), getExits(), addItem(), removeItem() etc. 
 */

import java.sql.Array;
import java.util.ArrayList; // Importing Arraylist in order to create resizable arrays
import java.util.Scanner;

public class room {
    
    // initializing variables 
    private String name;
    private String description;
    private int n, e, s, w;
    item artifact;
    String descriptionofItem;
    

    // creating a default parametrized constructor

    public room() {

    }
    

    // Creating parametrized constructor for instantiating room objects
    public room(String name, String description, int n, int e, int s, int w, item artifact, String descriptionofItem) { // constructor method for creating a room in the map
            this.name = name;
            this.description = description;
            this.n = n;
            this.e = e;
            this.s = s;
            this.w = w;
            this.artifact = artifact;
            this.descriptionofItem = descriptionofItem;
    }

    // Creating getter and setter methods for the variables 

    // getters
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getN() {
        return n;
    }

    public int getE() {
        return e;
    }

    public int getS() {
        return s;
    }

    public int getW() {
        return w;
    }

    public item getArtifact() {
        return artifact;
    }

    public String getDescriptionOfItem() {
        return descriptionofItem;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setE(int e) {
        this.e = e;
    }

    public void setS(int s) {
        this.s = s;
    }

    public void setW(int w) {
        this.w =w;
    }


    // Creating rooms for the map

    // Syntax for the room is room (name, description of room, N, E, S, W);
    public static room dragonRoom = new room("The Dragon's Ball","\nIn the heart of the ancient castle, hidden away from prying eyes, there existed a room unlike any other the Dragon Room. The air in this mystical chamber was thick with an otherworldly energy that seemed to dance and shimmer with every breath. The entrance was a massive, ornately carved door, depicting fierce dragons in a perpetual dance of fire and ice.", 0, 2, 3, 4, item.sword , item.sword.getDescription());

    public static room whisperingCaves = new room("Whispering Caves", "\nA hidden chamber concealed within the heart of a mystical mountain range. In the heart of the Whispering Caves, a mesmerizing pool reflects the ambient light, revealing ancient symbols etched into the stone floor. Whispers seem to dance upon the water, carrying tales of forgotten adventurers and the magic that permeates the very air. As you explore, you notice hidden alcoves adorned with crystalline formations that emit a gentle, soothing hum when touched." , 0, 2, 0, 4, item.shieldPotion, item.shieldPotion.getDescription());

    public static room celestialGarden = new room("The Celestial Garden", "\nBeware the Celestial Gardens, for beneath their ethereal beauty lies a perilous realm. The radiant flowers conceal thorns that gleam like shards of starlight, ready to ensnare the unsuspecting wanderer. The celestial orbs, once benign, now pulse with unpredictable energy, casting unpredictable spells that warp reality itself.", 0, 0, 3, 4, item.healingPotion, item.healingPotion.getDescription());

    public static room chamberOfShadows = new room("Chamber Of Shadows", "\nA lightless abyss where every step is shrouded in perpetual darkness. Sinister whispers echo from unseen corners, and elusive figures move in the inky blackness, waiting to ensnare those who dare to navigate the perilous unknown. Beware, for the shadows themselves hunger for the light within, and the line between reality and nightmare blurs within this ominous realm.", 0, 2, 3, 0, item.combatPotion, item.combatPotion.getDescription());

    public static room abyssalThroneRoom = new room("Abyssal Throne Room", "\nWelcome to the Abyssal Throne Room, where an ancient, ominous throne rests upon a platform surrounded by an unfathomable abyss. The air is thick with malevolence, and spectral whispers fill the void, foretelling the doom that awaits intruders. Dark energies pulse around the throne, guarded by otherworldly sentinels that manifest from the depths. Tread carefully, for the very fabric of reality is twisted within this accursed chamber, and the abyss hungers for those who dare to approach the throne.", 1, 0, 0, 0, item.sword, item.sword.getDescription());

    public static room labyrinthOfIllusions = new room("The Labyrinth of Illusions", "\nStep into The Labyrinth of Illusions, where reality unravels into a disorienting maze of shifting corridors. Deceptive shadows dance upon walls, leading astray the intrepid explorer. Mirage-like whispers beckon from unseen corners, luring wanderers into false passages. Each turn distorts perception, and illusions morph into deadly traps. The true path is veiled in a bewildering dance of falsehoods, and only the most cunning can navigate this perilous labyrinth unscathed.", 0, 2, 3, 0, item.shieldPotion, item.shieldPotion.getDescription());
    
    public static room elysianFields = new room("Elysian Fields", "\nEnter the Elysian Fields, a deceptively serene realm where the beauty conceals imminent danger. The lush meadows sway with an enchanting breeze, but beneath the emerald grass lie concealed snares that ensnare the unwary. Serene pools hold reflections that distort reality, leading astray those who gaze too long. Ethereal whispers beckon travelers toward unseen perils.", 1, 0, 0, 4, item.healingPotion, item.healingPotion.getDescription());

    public static room forgottenCrypt = new room("The Forgotten Crypt", "\nEnter The Forgotten Crypt, where shadows cling to ancient walls, concealing the resting place of long-forgotten souls. The air is heavy with the chill of the grave, and spectral echoes whisper tales of sorrow and unrest. Crumbling tombs hide restless spirits, and the very ground seems to hunger for the presence of the living. Beware, for the line between the forgotten and the forsaken blurs within these haunted halls, and the crypt guards its secrets with a malevolent intent that could consume those who trespass upon its desolate silence.", 1, 0, 0, 0, item.shieldPotion, item.shieldPotion.getDescription());

    public static room echoingHalls = new room("Echoing Halls", "\nDare to enter the Echoing Halls, where unseen horrors resonate in the chilling void. Each step unleashes a cacophony of haunting whispers, and the walls themselves hunger for the echoes of your fear. Labyrinthine and relentless, these halls trap the desperate in a symphony of dread, where shadows pulse with malevolence. In this relentless nightmare, even your own breath becomes a dissonant melody, and the line between escape and eternal entrapment fades into the abyss.", 1, 2, 0, 4, item.combatPotion, item.combatPotion.getDescription());

    public static room enchantedLibrary = new room("The Enchanted Library", "\nBeware The Enchanted Library, where sentient tomes guard coveted secrets with ravenous pages. Each volume conceals perilous illusions, and the very air is laced with the seductive whispers of forbidden knowledge. Bewildering passages rearrange at will, trapping seekers in a maze of treachery. To claim the coveted treasure, navigate the deceptive shelves, but know this: the library's enchantment hungers for minds as much as it craves the sought-after prize.", 0, 0, 0, 4, item.gem, item.gem.getDescription());

    

    // Creating small method to get the information of the player 


    private player player; // Creating a player field 
    // Creating a constructor that takes player instance as a parametre 
    public room(player player) {
            this.player = player;
    } 
    
    public static room currentRoom = dragonRoom; // current room is set to dragonRoom

    // Creating getter and setter methods to get and set the room of the player

    public static room getRoom() {
        return currentRoom;
    }

    public static void setRoom(room aRoom) {
        currentRoom = aRoom;
    }

 }

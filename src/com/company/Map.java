package com.company;
import java.util.ArrayList;
import java.util.Scanner;

    public class Map {
        public Room playerStand;
        public Item itemLocation;

        public Map() {
            this.playerStand = null;
            this.itemLocation = null;
        }
        public void GameMap() {
            //Constructing room objects
            Room grandHall = new Room("The Grand Hall", "The biggest and grandest room in the castle"); //room 1
            Room dungeon = new Room("The Dungeon", "A dark room that smells of death"); //room 2
            Room kitchen = new Room("The Courtyard", "Filled with decaying flowers and overgrown weeds"); //room 3
            Room tower = new Room("The Tower", "A long and narrow staircase that connects the tower with the rest of the castle"); //room 4
            Room chamber = new Room("The Chamber", "A big and gloomy room with a canopied bed in the center"); //room 5
            Room library = new Room("The library", "Filled from brim to brim with old and moldy books"); //room 6
            Room ballRoom = new Room("The Ball Room", "Filled with broken flooring and worn out wallpaper");  //room 7
            Room attic = new Room("The Attic", "Long and narrow room that stretches over the whole castle"); //room 8
            Room chapel = new Room("The Chapel", "Filled with enclosed seating benches"); // room 9

            //connecting the rooms to each other
            grandHall.setSouth(tower);
            grandHall.setEast(dungeon);
            dungeon.setEast(kitchen);
            kitchen.setSouth(library);
            tower.setSouth(ballRoom);
            chamber.setSouth(attic);
            library.setSouth(chapel);
            ballRoom.setEast(attic);
            attic.setEast(chapel);
            chapel.setWest(attic);
            playerStand = grandHall;

            //Constructing item objects
            Item sword = new Item("Sword", "Long and sharp");
            Item torch = new Item("Torch","Stick with flames");
            Item crossbow = new Item("Crossbow", "Big and heavy that uses arrows");
            Item spear = new Item("Spear", "Pointy tip made of steel");
            Item ax = new Item("Ax", "Good for beheading people");
            Item dagger = new Item("Dagger","Small, good for stabbing");
            Item shield = new Item("Shield", "Good for taking cover from other weapons");
            Item pepperSpray = new Item("Pepper spray", "Little powerful canister filled with chemicals");
            Item book = new Item ("The Hobbit", "First edition and signed!");
            Item butterKnife = new Item ("Butterknife", "Little and may or may not be dangerous");
            Item scythe = new Item ("Scythe","Long and curving blade");
            Item stick = new Item("Stick", "Heavy and long wooden stick");

            //putting items in the rooms
            grandHall.setRoomInventory(stick);
            dungeon.setRoomInventory(scythe);
            kitchen.setRoomInventory(butterKnife);
            tower.setRoomInventory(pepperSpray);
            chamber.setRoomInventory(shield);
            library.setRoomInventory(book);
            ballRoom.setRoomInventory(dagger);
            attic.setRoomInventory(ax);
            chapel.setRoomInventory(spear);
            library.setRoomInventory(crossbow);
            dungeon.setRoomInventory(torch);
            tower.setRoomInventory(sword);
            //itemLocation = stick;
        }
        public Room newPlayerStand() {
            return this.playerStand;
        }
        public Item newItemLocation(){
            return this.itemLocation;
        }

    }


package com.company;
import java.util.ArrayList;

public class Room {
    private String name;
    private String description;
    private Room North;
    private Room South;
    private Room East;
    private Room West;
    private boolean roomHasSeen;
    private ArrayList roomInventory = new ArrayList<>();

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
        this.roomHasSeen = false;
        ArrayList<Item> Inventory = null;
    }

    //getters and setters for name and description
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    //Getters and setters for north, south, east and west
    public Room getNorth() {
        return North;
    }

    public void setNorth(Room room) {
        this.North = room;
        if (room.getSouth() == null) {
            room.setSouth(this);
        }
    }

    public Room getSouth() {
        return South;
    }

    public void setSouth(Room room) {
        this.South = room;
        if (room.getNorth() == null) {
            room.setNorth(this);
        }
    }

    public Room getEast() {
        return East;
    }

    public void setEast(Room room) {
        this.East = room;
        if (room.getWest() == null) {
            room.setWest(this);
        }
    }

    public Room getWest() {
        return West;
    }

    public void setWest(Room room) {
        this.West = room;
        if (room.getEast() == null) {
            room.setEast(this);
        }
    }

    public boolean getRoomHasSeen() {
        return roomHasSeen;
    }

    public void setRoomHasSeen(boolean roomHasSeen) {
        this.roomHasSeen = roomHasSeen;
    }

   public void setRoomInventory(Item item) {
        //this.roomInventory = item;
        roomInventory.add(item);

    }
    public void addItem(Item item){
        roomInventory.add(item);
    }
    public ArrayList<Item> getRoomInventory() {
        return roomInventory;
    }

    public Item itemRemove(String ItemName){
        for(int i = 0; i < roomInventory.size();i++){
            Item tmp = roomInventory.get(i);
            if(tmp.getItemName().equals(ItemName)){
                roomInventory.remove(tmp);
                return tmp;
            }
        }
        return null;
    }

    //toString method
        public String toString(){
            return "You are now standing in: " + name + "\n"+ description;
        }

}

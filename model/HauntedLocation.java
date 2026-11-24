/*
 * Chris Pope - cmpope2
 * CIS171 Online
 * Date: 9/30/2026
 * Operating System: Linux Debian
 * IDE: VS Code
 * Program Description(short): Final Project - Veilbreak 
 *
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or unmodified.
 *
 * Documentation of Resources Used: 
 * ChatGPT: https://chatgpt.com/share/6ac473f8-4350-83ea-87f1-e581ab4e2c40
 */

package model;

public class HauntedLocation {

    private String name, description;
    private Rooms[] rooms;
    private boolean isCompleted;

    // Use of a constant 10 here would not be recommended but don't change it. We will learn about arrayLists late that will
    // resolve the issue - it is just fine right now
    public HauntedLocation() {
        this.name = "";
        this.description = "";
        this.rooms = new Rooms[10]; 
        this.isCompleted = false;
    }

    public HauntedLocation(String name, String description, Rooms[] rooms) {
        this.name = name;
        this.description = description;
        this.rooms = rooms;
        this.isCompleted = false;
    }

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

    public Rooms[] getRooms() {
        return rooms;
    }

    public void setRooms(Rooms[] rooms) {
        this.rooms = rooms;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    @Override
    public String toString() {
        return "HauntedLocation [name=" + name + ", description=" + description + ", isCompleted=" + isCompleted + "]";
    }

//I intentionally left out the array from the toString to avoid cluttering the output.
    
}

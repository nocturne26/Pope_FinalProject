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

public class Rooms {
    
    private String location, locationDescription, roomName, roomDescription;
    private Haunting[] hauntingEvent;
    private Equipment hiddenEquipment;
    private boolean isCompleted, isEquipmentFound;

    public Rooms() {
        this.location = "";
        this.locationDescription = "";
        this.roomName = "";
        this.roomDescription = "";
        this.hauntingEvent = new Haunting[10];
        this.hiddenEquipment = new Equipment();
        this.isCompleted = false;
        this.isEquipmentFound = false;
    }

    public Rooms(String location, String locationDescription, String roomName, String roomDescription, Haunting[] hauntingEvent, Equipment hiddenEquipment) {
        this.location = location;
        this.locationDescription = locationDescription;
        this.roomName = roomName;
        this.roomDescription = roomDescription;
        this.hauntingEvent = hauntingEvent;
        this.hiddenEquipment = hiddenEquipment;
        this.isCompleted = false;
        this.isEquipmentFound = false;
    }

    public String getLocation() {
        return location;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public String getRoomName() {
        return roomName;
    }

    public String getRoomDescription() {
        return roomDescription;
    }

    public Haunting[] getHauntingEvent() {
        return hauntingEvent;
    }

    public Equipment getHiddenEquipment() {
        return hiddenEquipment;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public boolean isEquipmentFound() {
        return isEquipmentFound;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

     public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public void setRoomDescription(String roomDescription) {
        this.roomDescription = roomDescription;
    }

   public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    public void setIsEquipmentFound(boolean isEquipmentFound) {
        this.isEquipmentFound = isEquipmentFound;
    }

    /**
     * Will check whether all hauntings in a room have been discovered.
     * This method will be completed as room investigation logic is added.
     */
    public static void checkRoomCompletion() {
        System.out.println("FIXME finish checkRoomCompletion() to see if the rooms been investigated completely");
    }

    @Override
    public String toString() {
        return "Rooms [location=" + location + ", locationDescription=" + locationDescription + "roomName=" + roomName + ", roomDescription=" + roomDescription + ", hiddenEquipment=" + hiddenEquipment
                + ", isCompleted=" + isCompleted + ", isEquipmentFound=" + isEquipmentFound + "]";
    }

}

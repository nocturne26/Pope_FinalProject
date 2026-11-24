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

public class Investigator {
    private String name;
    private int investigatorCourage, investigatorScore, eventsDiscovered, equipmentCount, roomsCompletedCount;
    private Equipment[] equipment;
    private Rooms[] roomsCompleted;
    private static int investigationAttempts = 0;
    
    public Investigator() {
        this.name = "";
        this.investigatorCourage = 100;
        this.investigatorScore = 0;
        this.eventsDiscovered = 0;
        this.equipmentCount = 0;
        this.roomsCompletedCount = 0;
        this.equipment = new Equipment[10];
        this.roomsCompleted = new Rooms[10];
    }  
    
    public Investigator(String name) {
        this.name = name;
        this.investigatorCourage = 100;
        this.investigatorScore = 0;
        this.eventsDiscovered = 0;
        this.equipmentCount = 0;
        this.roomsCompletedCount = 0;
        this.equipment = new Equipment[10];
        this.roomsCompleted = new Rooms[10];
    }

    public String getName() {
        return name;
    }

    public int getInvestigatorCourage() {
        return investigatorCourage;
    }

    public int getInvestigatorScore() {
        return investigatorScore;
    }

    public int getEventsDiscovered() {
        return eventsDiscovered;
    }

    public int getEquipmentCount() {
        return equipmentCount;
    }

    public int getRoomsCompletedCount() {
        return roomsCompletedCount;
    }

    public Equipment[] getEquipment() {
        return equipment;
    }

    public Rooms[] getRoomsCompleted() {
        return roomsCompleted;
    }

    public static int getInvestigationAttempts() {
        return investigationAttempts;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setInvestigatorCourage(int investigatorCourage) {
        this.investigatorCourage = investigatorCourage;
    }

    public void setInvestigatorScore(int investigatorScore) {
        this.investigatorScore = investigatorScore;
    }

    public void setEventsDiscovered(int eventsDiscovered) {
        this.eventsDiscovered = eventsDiscovered;
    }

    public void setEquipmentCount(int equipmentCount) {
        this.equipmentCount = equipmentCount;
    }

    public void setRoomsCompletedCount(int roomsCompletedCount) {
        this.roomsCompletedCount = roomsCompletedCount;
    }

    public void setEquipment(Equipment[] equipment) {
        this.equipment = equipment;
    }

    public void setRoomsCompleted(Rooms[] roomsCompleted) {
        this.roomsCompleted = roomsCompleted;
    }

    /**
     * Updates the investigator's courage based on the courage effect
     * of a haunted event.
     * @param courageEffect the amount to add to or subtract from investigatorCourage
     * @return the updated courage value
     */
    public void updateCourage(int courageEffect) {
        this.investigatorCourage += courageEffect;
    }

    /**
     * Updates the investigator's score by adding the score value
     * earned from a discovered haunting event.
     * @param scoreValue the amount to add to the score
     * @return the updated score
     */
    public void updateScore(int scoreValue) {
        this.investigatorScore += scoreValue;
    }
    
    /**
     * Adds equipment found during an investigation to the equipment array for the investigator
     * @param foundEquipment equipment that is found when searching rooms for equipment
     */
    public void addEquipment(Equipment foundEquipment) {
        equipment[equipmentCount] = foundEquipment;
        equipmentCount ++;
    }

    /**
     * adds an event that was discovered, no parameters needed
     * counts events
     */
    public void addEventDiscovered() {
    eventsDiscovered ++;
    }

    /**
     * adds an investigation attempt, no parameters needed
     * counts attempts
     */
    public static void addInvestigationAttempts() {
    investigationAttempts ++;
    }


    /**
     * adds completed count when a room has been completed by the user.
     * criteria for completion is equipment found and haunting investigated
     * @param completedRoom boolean - when room is completed, it increments the count
     */
    public void addRoomCompleted(Rooms completedRoom) {
    roomsCompleted[roomsCompletedCount] = completedRoom;
    roomsCompletedCount++;
    }

    @Override
    public String toString() {
        return "Investigator [name=" + name + ", investigatorCourage=" + investigatorCourage + ", investigatorScore="
                + investigatorScore + ", eventsDiscovered=" + eventsDiscovered + ", equipmentCount=" + equipmentCount
                + ", roomsCompletedCount=" + roomsCompletedCount + "]";
    }

}
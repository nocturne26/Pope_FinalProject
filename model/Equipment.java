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

public class Equipment {
    private String name, description;
    private int equipmentLevel;
    private boolean isAvailable;
    
    
    public Equipment() {
        this.name = "";
        this.description = "";
        this.equipmentLevel = 0;
        this.isAvailable = false;
    }
    
    public Equipment(String name, String description, int equipmentLevel) {
        this.name = name;
        this.description = description;
        this.equipmentLevel = equipmentLevel;
        this.isAvailable = false;
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

    public int getEquipmentLevel() {
        return equipmentLevel;
    }

    public void setEquipmentLevel(int equipmentLevel) {
        this.equipmentLevel = equipmentLevel;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    // public void useEquipment() {

    // }

    @Override
    public String toString() {
        return "Equipment [name=" + name + ", description=" + description + ", equipmentLevel=" + equipmentLevel
                + ", isAvailable=" + isAvailable + "]";
    } 

}

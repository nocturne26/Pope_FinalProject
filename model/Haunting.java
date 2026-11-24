/*
 * Chris Pope - cmpope2
 * CIS171 Online
 * Date: 9/30/2026
 * Operating System: Linux Debian
 * IDE: VS Code
 * Program Description(short): Midterm Project
 *
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or unmodified.
 *
 * Documentation of Resources Used: 
 * ChatGPT: https://chatgpt.com/share/6ac473f8-4350-83ea-87f1-e581ab4e2c40
 */

package model;

public class Haunting    {
    
    private String name, description;
    private int hauntingLevel, requiredEquipmentLevel, scoreValue, courageEffect;
    private boolean isDiscovered;

    public Haunting() {
        this.name = "";
        this.description = "";
        this.hauntingLevel = 0;
        this.requiredEquipmentLevel = 0;
        this.scoreValue = 0;
        this.courageEffect = 0;
        this.isDiscovered = false;
    }

    public Haunting(String name, String description, int hauntingLevel, int requiredEquipmentLevel, int scoreValue, int courageEffect) {
        this.name = name;
        this.description = description;
        this.hauntingLevel = hauntingLevel;
        this.requiredEquipmentLevel = requiredEquipmentLevel;
        this.scoreValue = scoreValue;
        this.courageEffect = courageEffect;
        this.isDiscovered = false;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHauntingLevel() {
        return hauntingLevel;
    }

    public int getRequiredEquipmentLevel() {
        return requiredEquipmentLevel;
    }

    public int getScoreValue() {
        return scoreValue;
    }

    public int getCourageEffect() {
        return courageEffect;
    }

    public boolean isDiscovered() {
        return isDiscovered;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHauntingLevel(int hauntingLevel) {
        this.hauntingLevel = hauntingLevel;
    }

    public void setRequiredEquipmentLevel(int requiredEquipmentLevel) {
        this.requiredEquipmentLevel = requiredEquipmentLevel;
    }

    public void setScoreValue(int scoreValue) {
        this.scoreValue = scoreValue;
    }

    public void setCourageEffect(int courageEffect) {
        this.courageEffect = courageEffect;
    }

    public void setDiscovered(boolean isDiscovered) {
        this.isDiscovered = isDiscovered;
    }

    @Override
    public String toString() {
        return "Haunting [name=" + name + ", description=" + description + ", hauntingLevel=" + hauntingLevel
                + ", requiredEquipmentLevel=" + requiredEquipmentLevel + ", scoreValue=" + scoreValue
                + ", courageEffect=" + courageEffect + ", isDiscovered=" + isDiscovered + "]";
    }
    


    
}

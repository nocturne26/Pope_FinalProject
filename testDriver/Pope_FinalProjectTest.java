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

package testDriver;

import driver.Pope_FinalProject;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Pope_FinalProjectTest {


@Test 
public void testFormatInvestigatorNameLowerCase() {
    String result = Pope_FinalProject.formatInvestigatorName("chris");
    String result2 = Pope_FinalProject.formatInvestigatorName("CHRIS");
    String result3 = Pope_FinalProject.formatInvestigatorName("    chRis     ");
    String result4 = Pope_FinalProject.formatInvestigatorName("chrIS pope");

    assertEquals("Chris", result);
    assertEquals("Chris", result2);
    assertEquals("Chris", result3);
    assertEquals("Chris pope", result4);
}

@Test
public void testGenerateEvent() {
    int result = Pope_FinalProject.generateEvent(5);  
    int result2 = Pope_FinalProject.generateEvent(10);    
    int result3 = Pope_FinalProject.generateEvent(15);    
    int result4 = Pope_FinalProject.generateEvent(20);    
    
    assertTrue(result >= 0 && result < 5);
    assertTrue(result2 >= 0 && result2 < 10);
    assertTrue(result3 >= 0 && result3 < 15);
    assertTrue(result4 >= 0 && result4 < 20);
}

}
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

package testDriver;

import driver.MidtermPope;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MidtermPopeTest {


@Test 
public void testFormatInvestigatorNameLowerCase() {
    String result = MidtermPope.formatInvestigatorName("chris");
    String result2 = MidtermPope.formatInvestigatorName("CHRIS");
    String result3 = MidtermPope.formatInvestigatorName("    chRis     ");
    String result4 = MidtermPope.formatInvestigatorName("chrIS pope");

    assertEquals("Chris", result);
    assertEquals("Chris", result2);
    assertEquals("Chris", result3);
    assertEquals("Chris pope", result4);
}

@Test
public void testGenerateEvent() {
    int result = MidtermPope.generateEvent(5);  
    int result2 = MidtermPope.generateEvent(10);    
    int result3 = MidtermPope.generateEvent(15);    
    int result4 = MidtermPope.generateEvent(20);    
    
    assertTrue(result >= 0 && result < 5);
    assertTrue(result2 >= 0 && result2 < 10);
    assertTrue(result3 >= 0 && result3 < 15);
    assertTrue(result4 >= 0 && result4 < 20);
}

}
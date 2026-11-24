package driver;
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

//maybe import javax.swing.JOptionPane; for final

import model.Investigator;
import model.Equipment;
import model.Haunting;
import model.Rooms;
import model.HauntedLocation;

import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class MidtermPope {

        /**
         * Displays the game instructions and explains the basic objective
         * of the haunted house investigation.
         */
        public static void displayInstructions() {
                System.out.println("""
                                ------------------------------------------------
                                Welcome to Veilbreak...

                                In this game, you will explore multiple haunted
                                locations and encounter various supernatural events.

                                Your goal is to investigate rooms, collect paranormal
                                equipment, and find all of the hauntings in each
                                location by making selections throughout the game.

                                Hauntings remain hidden unless you have equipment
                                with a level high enough to detect them.

                                Be careful, as some rooms may contain dangerous spirits!

                                Good luck, and have fun!
                                Remember, your fate is in your hands.

                                Enter -1 at any time to exit the game.
                                ------------------------------------------------
                                """);
        }

        /**
         * Generates a random integer from a provided numberOfHauntings.
         * 
         * @param numberOfHauntings the upper bound for the random integer generation
         * @return a randomly generated integer
         */
        public static int generateEvent(int numberOfHauntings) {
                Random random = new Random();
                return random.nextInt(numberOfHauntings);
        }

        /**
         * Formats the investigator's name by removing leading and trailing
         * spaces and capitalizing the first character.
         * 
         * @param investigatorName the investigator name to format
         * @return the formatted investigator name
         */
        public static String formatInvestigatorName(String investigatorName) {
                return investigatorName.trim().substring(0, 1).toUpperCase()
                                + investigatorName.trim().substring(1).toLowerCase();
        }

        /**
         * Will display the rooms available in the selected haunted location.
         */
        public static void displayRooms() {
                System.out.println("FIXME: Add logic to display rooms for the selected location.");
        }

        /**
         * Loads haunting array based on corresponding game play data
         * 
         * @param hauntings an array of hauntings integrated with game data to pick
         *                  from.
         */
        public static void loadHauntings(Haunting[] hauntings) {
                hauntings[0] = new Haunting("Unexplained Tap",
                                "A single light tapping sound without an immediately identifiable source. Common during quiet investigations and easily confused with building settling.",
                                1, 1, 5, -1);
                hauntings[1] = new Haunting("Unexplained Creak",
                                "Floorboards, walls, furniture, or doors appear to creak without visible movement nearby. Especially common in historic buildings.",
                                1, 1, 5, -1);
                hauntings[2] = new Haunting("Faint Rustling",
                                "Soft movement resembling clothing, paper, bedding, or something brushing against a surface.",
                                1, 1, 5,
                                -2);
                hauntings[3] = new Haunting("Brief Temperature Change",
                                "A localized area suddenly feels noticeably warmer or colder than its surroundings without an immediately obvious airflow source.",
                                1, 2, 5, -2);
                hauntings[4] = new Haunting("Unexplained Scent",
                                "A temporary smell such as perfume, tobacco, flowers, food, soap, or smoke appears without a clear physical source.",
                                1, 2, 5, -2);
                hauntings[5] = new Haunting("Knock or Rap",
                                "One or more distinct knocks are heard from a wall, door, floor, or piece of furniture.",
                                2, 2, 10, -3);
                hauntings[6] = new Haunting("Distant Footsteps",
                                "Sounds resembling someone walking are heard when investigators cannot locate a person responsible.",
                                2,
                                2, 10, -3);
                hauntings[7] = new Haunting("Object Displacement",
                                "A small object is discovered in a different position from where investigators believe it was originally placed.",
                                2, 3, 10, -4);
                hauntings[8] = new Haunting("Electronic Interference",
                                "Cameras, recorders, radios, or other equipment malfunction unexpectedly or behave inconsistently.",
                                2,
                                3, 10, -4);
                hauntings[9] = new Haunting("Unexplained Battery Drain",
                                "A charged device loses power substantially faster than expected. This is frequently reported during paranormal investigations, although battery condition and temperature should be ruled out first.",
                                2, 4, 10, -4);
                hauntings[10] = new Haunting("EMF Anomaly",
                                "A meter records a temporary electromagnetic change with no immediately identified wiring, appliance, phone, or other electrical source nearby.",
                                3, 4, 15, -5);
                hauntings[11] = new Haunting("EVP / Recorded Voice",
                                "Speech-like audio appears on a recording that investigators say they did not hear during the original session.",
                                3, 5, 15, -5);
                hauntings[12] = new Haunting("Disembodied Voice",
                                "An investigator hears a voice directly, but no visible person or known audio source can be found.",
                                3,
                                5, 15, -6);
                hauntings[13] = new Haunting("Responsive Knock",
                                "Knocks appear to occur directly after questions or requests, creating the impression of interaction.",
                                3, 6, 15, -6);
                hauntings[14] = new Haunting("Door Movement",
                                "A door opens, closes, or noticeably shifts without someone touching it and after obvious causes such as airflow or an uneven frame have been considered.",
                                3, 6, 15, -6);
                hauntings[15] = new Haunting("Shadow Movement",
                                "A dark human-like shape or movement is briefly observed despite investigators being unable to locate the person or object casting it.",
                                4, 6, 20, -8);
                hauntings[16] = new Haunting("Unseen Touch",
                                "An investigator experiences a sensation resembling a tap, tug, poke, hand, or brush against the body while nobody is close enough to produce it.",
                                4, 7, 20, -8);
                hauntings[17] = new Haunting("Clear Footsteps Approaching",
                                "Distinct footsteps appear to move through a hallway, room, staircase, or toward investigators despite the area being visibly empty.",
                                4, 7, 20, -9);
                hauntings[18] = new Haunting("Object Movement Witnessed",
                                "An object visibly shifts, rolls, falls, swings, or moves without someone touching it. Unlike object displacement, investigators actually witness the movement.",
                                4, 8, 20, -9);
                hauntings[19] = new Haunting("Intelligent Equipment Response",
                                "A trigger device appears to activate repeatedly in meaningful response to specific questions or instructions rather than producing isolated random activations.",
                                4, 8, 20, -10);
                hauntings[20] = new Haunting("Partial Apparition",
                                "An investigator reports seeing part of a human form, such as a face, head, hand, torso, or lower body, that disappears or cannot be physically accounted for.",
                                5, 8, 25, -10);
                hauntings[21] = new Haunting("Physical Scratch or Mark",
                                "A scratch, welt, bruise, or similar mark appears during an investigation without the person knowing how it occurred.",
                                5, 9, 25, -12);
                hauntings[22] = new Haunting("Full-Bodied Apparition",
                                "A person-shaped figure appears sufficiently complete that the witness initially believes an actual person is present before the figure disappears or proves impossible to account for.",
                                5, 9, 25, -13);
                hauntings[23] = new Haunting("Forceful Physical Contact",
                                "An investigator reports being strongly grabbed, shoved, pulled, struck, or otherwise physically moved without another visible person causing it.",
                                5, 10, 25, -15);
                hauntings[24] = new Haunting("Major Object Manipulation",
                                "A clearly stationary object moves forcefully, such as furniture shifting, an object being thrown, or another substantial physical movement, while investigators can observe that nobody nearby caused it.",
                                5, 10, 25, -15);
        }

        /**
         * Loads equipment array based on corresponding game play data
         * 
         * @param equipment an array of different equipment for integrated game play to
         *                  choose from
         */
        public static void loadEquipment(Equipment[] equipment) {
                equipment[0] = new Equipment("Light-Up Cat Ball",
                                "Small motion-sensitive toy that flashes when physically disturbed. Investigators place them on stable surfaces and watch for activation when nobody is nearby.",
                                1);
                equipment[1] = new Equipment("Trigger Flashlight",
                                "Flashlight used as a simple environmental interaction experiment. Investigators may ask questions and watch for unexplained changes, although loose switches, heat, batteries, and electrical contacts must be controlled for.",
                                2);
                equipment[2] = new Equipment("Pendulum",
                                "Weighted object suspended from a chain or string. Some investigators use its directional movement for yes/no questioning. Movement is highly susceptible to unconscious muscle movements, so it should be considered an experimental rather than objective measuring instrument.",
                                3);
                equipment[3] = new Equipment("Dowsing Rods",
                                "Usually two L-shaped rods held loosely in the hands. Paranormal investigators sometimes use crossing or spreading movements as responses. Like pendulums, they can move through unconscious hand motion and don't directly detect ghosts.",
                                4);
                equipment[4] = new Equipment("Digital Voice Recorder / EVP Recorder",
                                "Records ambient audio so investigators can later review it for voices or sounds that weren't noticed during the session. Good investigation practice includes logging normal noises and contamination.",
                                5);
                equipment[5] = new Equipment("EMF Meter / K-II Meter",
                                "Measures changes in electromagnetic fields. Investigators use it to locate environmental electrical sources and sometimes watch for unexplained fluctuations during questioning.",
                                6);
                equipment[6] = new Equipment("REM Pod",
                                "Produces its own electromagnetic field around an antenna and alerts when that field is disturbed. Often positioned away from investigators as a proximity/interaction experiment.",
                                7);
                equipment[7] = new Equipment("Spirit Box",
                                "Rapidly scans radio frequencies while investigators ask questions, with users listening for apparent words or responses. Because broadcast fragments can produce recognizable speech, results require careful interpretation.",
                                8);
                equipment[8] = new Equipment("Thermal Imaging Camera",
                                "Displays infrared temperature patterns across a scene, allowing investigators to locate unusual hot/cold areas, air leaks, people, animals, plumbing, electronics, or unexplained temperature changes.",
                                9);
                equipment[9] = new Equipment("SLS Camera / Structured-Light Sensor",
                                "Uses infrared structured-light/depth sensing to map shapes in three-dimensional space and display human-like skeletal forms when its software identifies them. It can be useful for experiments but can also interpret furniture and other objects as human shapes.",
                                10);
        }

       //ADDED TO TEXT FILE FOR ARRAY LIST 
        // public static void loadStanleyRooms(Rooms[] stanleyRooms, Haunting[] hauntings, Equipment[] equipment) {
        //         stanleyRooms[0] = new Rooms("Room 217",
        //                         "Probably the Stanley's best-known room. In 1911, chambermaid Elizabeth Wilson was injured when accumulated gas exploded in the room. Later guests have reported belongings being moved or organized and other unexplained activity. Stephen King stayed here in 1974 before writing The Shining.",
        //                         new Haunting[] { hauntings[0], hauntings[1], hauntings[2], hauntings[3] },
        //                         equipment[0]);
        //         stanleyRooms[1] = new Rooms("Room 401",
        //                         "One of the Stanley's designated \"spirited rooms\" and reportedly a favorite of paranormal investigators. Reports have included unexplained noises and the sensation or appearance of a male presence.",
        //                         new Haunting[] { hauntings[4], hauntings[5], hauntings[6], hauntings[7] },
        //                         equipment[3]);
        //         stanleyRooms[2] = new Rooms("Room 407",
        //                         "Another of the hotel's rooms specifically promoted for unusually high reported paranormal activity. Guest accounts have included unexplained movement, noises, and sensations of another presence.",
        //                         new Haunting[] { hauntings[8], hauntings[9], hauntings[10], hauntings[11] },
        //                         equipment[6]);
        //         stanleyRooms[3] = new Rooms("Room 428",
        //                         "A fourth-floor room associated with reports of a male or \"cowboy\" apparition, including claims that a figure has appeared near or over guests' beds.",
        //                         new Haunting[] { hauntings[12], hauntings[13], hauntings[14], hauntings[15] },
        //                         equipment[8]);
        // }

        // public static void loadMasonRooms(Rooms[] masonHouse, Haunting[] hauntings, Equipment[] equipment) {
        //         masonHouse[0] = new Rooms("Mason Suite",
        //                         "One of the inn's best-known active rooms. Reports include clothing being tugged while guests sleep, unexplained thumps from above, children or a young boy being heard or seen nearby, and other unusual activity.",
        //                         new Haunting[] { hauntings[0], hauntings[2], hauntings[4], hauntings[5] },
        //                         equipment[0]);
        //         masonHouse[1] = new Rooms("Wild Rose Room",
        //                         "Associated in local paranormal lore with Mr. Knapp, a guest who was reportedly stabbed at the inn. Visitors have described a heavy feeling, unexplained footsteps, and impressions suggesting someone is lying on the bed.",
        //                         new Haunting[] { hauntings[12], hauntings[7], hauntings[8], hauntings[10] },
        //                         equipment[9]);
        //         masonHouse[2] = new Rooms("Ashland Room",
        //                         "Known for reports of an elderly male figure, sometimes described as a head or upper figure surrounded by mist. Guests have also reported footsteps and other unexplained nighttime activity.",
        //                         new Haunting[] { hauntings[1], hauntings[11], hauntings[13], hauntings[15] },
        //                         equipment[4]);
        //         masonHouse[3] = new Rooms("Mary's Bedroom",
        //                         "Historically associated with reports of an elderly woman, often identified in the inn's lore as Mary Mason Clarke. She has reportedly appeared seated near a window or standing in a doorway. Sounds of movement have also been reported when the space was unoccupied.",
        //                         new Haunting[] { hauntings[22], hauntings[16], hauntings[18], hauntings[19] },
        //                         equipment[8]);
        // }

        // public static void loadLizzieRooms(Rooms[] lizzieBorden, Haunting[] hauntings, Equipment[] equipment) {
        //         lizzieBorden[0] = new Rooms(
        //                         "Lizzie Borden House",
        //                         "Site of the 1892 murders of Andrew and Abby Borden. The restored house now operates as lodging and a historic attraction and offers dedicated ghost hunts. Visitors have reported unexplained activity throughout the house, particularly around the murder locations and basement.",
        //                         "Lizzie & Emma Suite",
        //                         "The second-floor rooms originally occupied by Lizzie and Emma Borden. They're preserved as overnight accommodations and form one of the principal historic sections of the house.",
        //                         new Haunting[] { hauntings[1], hauntings[3], hauntings[5], hauntings[6] },
        //                         equipment[1]);
        //         lizzieBorden[1] = new Rooms(
        //                         "Lizzie Borden House",
        //                         "Site of the 1892 murders of Andrew and Abby Borden. The restored house now operates as lodging and a historic attraction and offers dedicated ghost hunts. Visitors have reported unexplained activity throughout the house, particularly around the murder locations and basement.",
        //                         "Andrew & Abby Suite",
        //                         "Andrew Borden was found murdered on the sofa in the first-floor sitting room. The first floor remains an important part of paranormal investigations at the property.",
        //                         new Haunting[] { hauntings[7], hauntings[8], hauntings[10], hauntings[12] },
        //                         equipment[6]);
        //         lizzieBorden[2] = new Rooms(
        //                         "Lizzie Borden House",
        //                         "Site of the 1892 murders of Andrew and Abby Borden. The restored house now operates as lodging and a historic attraction and offers dedicated ghost hunts. Visitors have reported unexplained activity throughout the house, particularly around the murder locations and basement.",
        //                         "John V. Morse Murder Room",
        //                         "The second-floor guest room where Abby Borden was killed on August 4, 1892 while making the bed following John Morse's overnight stay. It is probably the most historically significant room in the house and is a major focus of paranormal interest.",
        //                         new Haunting[] { hauntings[11], hauntings[13], hauntings[15], hauntings[17] },
        //                         equipment[7]);
        //         lizzieBorden[3] = new Rooms(
        //                         "Lizzie Borden House",
        //                         "Site of the 1892 murders of Andrew and Abby Borden. The restored house now operates as lodging and a historic attraction and offers dedicated ghost hunts. Visitors have reported unexplained activity throughout the house, particularly around the murder locations and basement.",
        //                         "Basement",
        //                         "An especially popular investigation area. Evidence associated with the murder investigation, including a broken hatchet, was found in the basement, and the property currently conducts dedicated basement ghost hunts—including overnight investigations after midnight. Lizzie Borden",
        //                         new Haunting[] { hauntings[16], hauntings[18], hauntings[21], hauntings[23] },
        //                         equipment[9]);
        //         }

        public static void loadSallieRooms(Rooms[] sallieHouse, Haunting[] hauntings, Equipment[] equipment) {
                sallieHouse[0] = new Rooms(
                        "Sallie House",
                        "Historic home associated with the legend of a young girl named Sallie who allegedly died during emergency surgery. Visitors and investigators have reported cold areas, moving objects, equipment failures, scratches, touches, and unusual activity around the nursery and former medical areas.",
                        "Nursery",
                        "Probably the house's most famous paranormal area. The family's dog reportedly reacted aggressively toward the nursery, and later visitors have reported unusual sensations and activity there. Visit Atchison says trained guide dogs have even refused to enter it.",
                        new Haunting[] { hauntings[0], hauntings[21], hauntings[8], hauntings[12] },
                        equipment[2]);
                sallieHouse[1] = new Rooms(
                        "Sallie House",
                        "Historic home associated with the legend of a young girl named Sallie who allegedly died during emergency surgery. Visitors and investigators have reported cold areas, moving objects, equipment failures, scratches, touches, and unusual activity around the nursery and former medical areas.",
                        "The Doctor's Examination Room",
                        "The downstairs area associated with Dr. Charles Finney's medical practice and the Sallie legend. Investigators and visitors have reported unexplained coldness in the former medical area.",
                        new Haunting[] { hauntings[5], hauntings[7], hauntings[9], hauntings[19] },
                        equipment[4]);
                sallieHouse[2] = new Rooms(
                        "Sallie House",
                        "Historic home associated with the legend of a young girl named Sallie who allegedly died during emergency surgery. Visitors and investigators have reported cold areas, moving objects, equipment failures, scratches, touches, and unusual activity around the nursery and former medical areas.",
                        "Upstairs Bedroom",
                        "The physician's family reportedly lived upstairs while the medical practice occupied the lower part of the home. Upstairs areas have become common investigation locations and are associated with reports of strong sensations and anomalous activity.",
                        new Haunting[] { hauntings[10], hauntings[13], hauntings[14], hauntings[22] },
                        equipment[9]);
                sallieHouse[3] = new Rooms(
                        "Sallie House",
                        "Historic home associated with the legend of a young girl named Sallie who allegedly died during emergency surgery. Visitors and investigators have reported cold areas, moving objects, equipment failures, scratches, touches, and unusual activity around the nursery and former medical areas.",
                        "Basement",
                        "Frequently investigated because of the house's overall reputation and isolation from exterior contamination. Accounts associated with the property include unusual equipment behavior, unexplained sensations, and physical reactions.",
                        new Haunting[] { hauntings[15], hauntings[17], hauntings[20], hauntings[24] },
                        equipment[5]);
        }

        public static void loadMyrtleRooms(Rooms[] myrtlesPlantation, Haunting[] hauntings, Equipment[] equipment) {
                myrtlesPlantation[0] = new Rooms(
                        "Myrtles Plantation",
                        "Historic home built beginning in 1796 and now operated as a hotel and historic attraction. It has a long paranormal reputation involving apparitions, footsteps, unusual mirror phenomena, moving objects, and several named spirits and legends. Some famous stories surrounding the property, particularly the story of Chloe, contain folklore that conflicts with historical records.",
                        "General David Bradford's Suite",
                        "Named for the home's original owner. Guest accounts include unexplained footsteps, voices, movement, plumbing operating unexpectedly, and reports of a female apparition or presence.",
                        new Haunting[] { hauntings[2], hauntings[3], hauntings[4], hauntings[6] },
                        equipment[2]);
                myrtlesPlantation[1] = new Rooms(
                        "Myrtles Plantation",
                        "Historic home built beginning in 1796 and now operated as a hotel and historic attraction. It has a long paranormal reputation involving apparitions, footsteps, unusual mirror phenomena, moving objects, and several named spirits and legends. Some famous stories surrounding the property, particularly the story of Chloe, contain folklore that conflicts with historical records.",
                        "Game Room",
                        "Contains the plantation's famous mirror. Legend claims spirits became trapped in it because it was not covered after deaths in the household. Visitors have reported unexplained handprints, marks, or figures reflected in the glass. Importantly, the underlying poisoning story associated with the mirror is folklore rather than established history.",
                        new Haunting[] { hauntings[21], hauntings[8], hauntings[9], hauntings[11] },
                        equipment[0]);
                myrtlesPlantation[2] = new Rooms(
                        "Myrtles Plantation",
                        "Historic home built beginning in 1796 and now operated as a hotel and historic attraction. It has a long paranormal reputation involving apparitions, footsteps, unusual mirror phenomena, moving objects, and several named spirits and legends. Some famous stories surrounding the property, particularly the story of Chloe, contain folklore that conflicts with historical records.",
                        "The William Winter Room",
                        "Associated with William Drew Winter, the property's only historically verified murder victim. Winter was shot at the house in 1871. The paranormal legend claims his footsteps retrace part of his final route on the staircase.",
                        new Haunting[] { hauntings[10], hauntings[13], hauntings[14], hauntings[19] },
                        equipment[7]);
                myrtlesPlantation[3] = new Rooms(
                        "Myrtles Plantation",
                        "Historic home built beginning in 1796 and now operated as a hotel and historic attraction. It has a long paranormal reputation involving apparitions, footsteps, unusual mirror phenomena, moving objects, and several named spirits and legends. Some famous stories surrounding the property, particularly the story of Chloe, contain folklore that conflicts with historical records.",
                        "The Fannie Williams Room",
                        "Probably the most requested paranormal room in the main house. Guests have reported unexplained noises, beds moving or shaking, children's voices, objects moving, and activity involving the room's dolls.",
                        new Haunting[] { hauntings[15], hauntings[17], hauntings[20], hauntings[24] },
                        equipment[9]);
        }

        public static void loadHauntedLocations(HauntedLocation[] hauntedLocations, //Rooms[] stanleyRooms,
                Rooms[] masonHouse, Rooms[] lizzieBorden, Rooms[] sallieHouse, Rooms[] myrtlesPlantation) {
                // hauntedLocations[0] = new HauntedLocation("Stanley Hotel",
                //                 "Historic hotel opened in 1909 by F.O. Stanley. Its paranormal reputation includes reports of footsteps, children laughing, apparitions, and activity on the fourth floor. Stephen King's 1974 stay in Room 217 helped inspire The Shining.",
                //                 stanleyRooms);
                // hauntedLocations[1] = new HauntedLocation("Mason House",
                //                 "Historic inn dating to 1846 that served generations of travelers along the Des Moines River. Owners and guests have reported apparitions, footsteps, voices, objects moving, and activity concentrated in several guest rooms. The present owners openly describe it as a paranormal hotspot and permit investigations.",
                //                 masonHouse);
                // hauntedLocations[2] = new HauntedLocation("Lizzie Borden House",
                //                 "Site of the 1892 murders of Andrew and Abby Borden. The restored house now operates as lodging and a historic attraction and offers dedicated ghost hunts. Visitors have reported unexplained activity throughout the house, particularly around the murder locations and basement.",
                //                 lizzieBorden);             
                // hauntedLocations[3] = new HauntedLocation("Sallie House",
                //                 "Historic home associated with the legend of a young girl named Sallie who allegedly died during emergency surgery. Visitors and investigators have reported cold areas, moving objects, equipment failures, scratches, touches, and unusual activity around the nursery and former medical areas.",
                //                 sallieHouse);
                // hauntedLocations[4] = new HauntedLocation("Myrtles Plantation",
                //                 "Historic home built beginning in 1796 and now operated as a hotel and historic attraction. It has a long paranormal reputation involving apparitions, footsteps, unusual mirror phenomena, moving objects, and several named spirits and legends. Some famous stories surrounding the property, particularly the story of Chloe, contain folklore that conflicts with historical records.",
                //                 myrtlesPlantation);
        }

        //move arrays to text files
        //all rooms need field for location to simplify room loading

        public static void main(String[] args) {

                Haunting[] hauntings = new Haunting[25];
                loadHauntings(hauntings);

                Equipment[] equipment = new Equipment[10];
                loadEquipment(equipment);

                // Rooms[] stanleyRooms = new Rooms[4];
                // loadStanleyRooms(stanleyRooms, hauntings, equipment);

                // Rooms[] masonHouse = new Rooms[4];
                // loadMasonRooms(masonHouse, hauntings, equipment);

                // Rooms[] roomList.add( Rooms[4];
                // loadLizzieRooms(lizzieBorden, hauntings, equipment);

                Rooms[] sallieHouse = new Rooms[4];
                loadSallieRooms(sallieHouse, hauntings, equipment);

                Rooms[] myrtlesPlantation = new Rooms[4];
                loadMyrtleRooms(myrtlesPlantation, hauntings, equipment);

                ArrayList<Rooms> roomList = new ArrayList<Rooms>(); //will import all rooms via text file when I figure out how to put it all together with a -- delimiter
                roomList.add(new Rooms(
                        "Stanley Hotel",
                        "Historic hotel opened in 1909 by F.O. Stanley. Its paranormal reputation includes reports of footsteps, children laughing, apparitions, and activity on the fourth floor. Stephen King's 1974 stay in Room 217 helped inspire The Shining.",
                        "Room 217",
                        "Probably the Stanley's best-known room. In 1911, chambermaid Elizabeth Wilson was injured when accumulated gas exploded in the room. Later guests have reported belongings being moved or organized and other unexplained activity. Stephen King stayed here in 1974 before writing The Shining.",
//HOW WILL I BE ABLE TO CONVERT THESE HAUNTINGS AND EQUIPMENT INTO THE DATA FILE? I'M ASSUMING SINCE THESE ARE IN JAVA
//CODE, THEY WON'T WORK PROPERLY LIKE THIS. ANOTHER ARRAY LIST FOR HAUNTINGS, YES, MAYBE JUST 
//RANDOMIZE WITH FOR LOOP X NUMBER OF HAUNTINGS PER ROOM INSTEAD OF PRE-CHOICE PER ROOM? I'D LIKE TO STILL INTEGRATE 
//THE PRESELECTED HAUNTINGS/EQUIPMENT, JUST NOT SURE HOW YET.
                        new Haunting[] { hauntings[0], hauntings[1], hauntings[2], hauntings[3] },
                        equipment[0]
                ));
                roomList.add(new Rooms(
                        "Stanley Hotel",
                        "Historic hotel opened in 1909 by F.O. Stanley. Its paranormal reputation includes reports of footsteps, children laughing, apparitions, and activity on the fourth floor. Stephen King's 1974 stay in Room 217 helped inspire The Shining.",
                        "Room 401",
                        "One of the Stanley's designated \"spirited rooms\" and reportedly a favorite of paranormal investigators. Reports have included unexplained noises and the sensation or appearance of a male presence.",
                        new Haunting[] { hauntings[4], hauntings[5], hauntings[6], hauntings[7] },
                        equipment[3]
                ));
                roomList.add(new Rooms(
                        "Stanley Hotel",
                        "Historic hotel opened in 1909 by F.O. Stanley. Its paranormal reputation includes reports of footsteps, children laughing, apparitions, and activity on the fourth floor. Stephen King's 1974 stay in Room 217 helped inspire The Shining.",
                        "Room 407",
                        "Another of the hotel's rooms specifically promoted for unusually high reported paranormal activity. Guest accounts have included unexplained movement, noises, and sensations of another presence.", 
                        new Haunting[] { hauntings[8], hauntings[9], hauntings[10], hauntings[11] }, 
                        equipment[6]
                ));
                roomList.add(new Rooms(
                        "Stanley Hotel",
                        "Historic hotel opened in 1909 by F.O. Stanley. Its paranormal reputation includes reports of footsteps, children laughing, apparitions, and activity on the fourth floor. Stephen King's 1974 stay in Room 217 helped inspire The Shining.",
                        "Room 428",
                        "A fourth-floor room associated with reports of a male or \"cowboy\" apparition, including claims that a figure has appeared near or over guests' beds.", 
                        new Haunting[] { hauntings[12], hauntings[13], hauntings[14], hauntings[15] }, 
                        equipment[8]
                ));
                roomList.add(new Rooms(
                        "Mason House",
                        "Historic inn dating to 1846 that served generations of travelers along the Des Moines River. Owners and guests have reported apparitions, footsteps, voices, objects moving, and activity concentrated in several guest rooms. The present owners openly describe it as a paranormal hotspot and permit investigations.",
                        "Mason Suite",
                        "One of the inn's best-known active rooms. Reports include clothing being tugged while guests sleep, unexplained thumps from above, children or a young boy being heard or seen nearby, and other unusual activity.",
                        new Haunting[] { hauntings[0], hauntings[2], hauntings[4], hauntings[5] },
                        equipment[0]
                ));
                roomList.add(new Rooms(
                        "Mason House",
                        "Historic inn dating to 1846 that served generations of travelers along the Des Moines River. Owners and guests have reported apparitions, footsteps, voices, objects moving, and activity concentrated in several guest rooms. The present owners openly describe it as a paranormal hotspot and permit investigations.",
                        "Wild Rose Room",
                        "Associated in local paranormal lore with Mr. Knapp, a guest who was reportedly stabbed at the inn. Visitors have described a heavy feeling, unexplained footsteps, and impressions suggesting someone is lying on the bed.",
                        new Haunting[] { hauntings[12], hauntings[7], hauntings[8], hauntings[10] },
                        equipment[9]
                ));
                roomList.add(new Rooms(
                        "Mason House",
                        "Historic inn dating to 1846 that served generations of travelers along the Des Moines River. Owners and guests have reported apparitions, footsteps, voices, objects moving, and activity concentrated in several guest rooms. The present owners openly describe it as a paranormal hotspot and permit investigations.",
                        "Ashland Room",
                        "Known for reports of an elderly male figure, sometimes described as a head or upper figure surrounded by mist. Guests have also reported footsteps and other unexplained nighttime activity.",
                        new Haunting[] { hauntings[1], hauntings[11], hauntings[13], hauntings[15] },
                        equipment[4]
                ));
                roomList.add(new Rooms(
                        "Mason House",
                        "Historic inn dating to 1846 that served generations of travelers along the Des Moines River. Owners and guests have reported apparitions, footsteps, voices, objects moving, and activity concentrated in several guest rooms. The present owners openly describe it as a paranormal hotspot and permit investigations.",
                        "Mary's Bedroom",
                        "Historically associated with reports of an elderly woman, often identified in the inn's lore as Mary Mason Clarke. She has reportedly appeared seated near a window or standing in a doorway. Sounds of movement have also been reported when the space was unoccupied.",
                        new Haunting[] { hauntings[22], hauntings[16], hauntings[18], hauntings[19] },
                        equipment[8]
                ));
                roomList.add(new Rooms(
                        "Lizzie Borden House",
                        "Site of the 1892 murders of Andrew and Abby Borden. The restored house now operates as lodging and a historic attraction and offers dedicated ghost hunts. Visitors have reported unexplained activity throughout the house, particularly around the murder locations and basement.",
                        "Lizzie & Emma Suite",
                        "The second-floor rooms originally occupied by Lizzie and Emma Borden. They're preserved as overnight accommodations and form one of the principal historic sections of the house.",
                        new Haunting[] { hauntings[1], hauntings[3], hauntings[5], hauntings[6] },
                        equipment[1]
                ));
                roomList.add(new Rooms(
                        "Lizzie Borden House",
                        "Site of the 1892 murders of Andrew and Abby Borden. The restored house now operates as lodging and a historic attraction and offers dedicated ghost hunts. Visitors have reported unexplained activity throughout the house, particularly around the murder locations and basement.",
                        "Andrew & Abby Suite",
                        "Andrew Borden was found murdered on the sofa in the first-floor sitting room. The first floor remains an important part of paranormal investigations at the property.",
                        new Haunting[] { hauntings[7], hauntings[8], hauntings[10], hauntings[12] },
                        equipment[6]
                ));
                roomList.add(new Rooms(
                        "Lizzie Borden House",
                        "Site of the 1892 murders of Andrew and Abby Borden. The restored house now operates as lodging and a historic attraction and offers dedicated ghost hunts. Visitors have reported unexplained activity throughout the house, particularly around the murder locations and basement.",
                        "John V. Morse Murder Room",
                        "The second-floor guest room where Abby Borden was killed on August 4, 1892 while making the bed following John Morse's overnight stay. It is probably the most historically significant room in the house and is a major focus of paranormal interest.",
                        new Haunting[] { hauntings[11], hauntings[13], hauntings[15], hauntings[17] },
                        equipment[7]
                ));
                roomList.add(new Rooms(
                        "Lizzie Borden House",
                        "Site of the 1892 murders of Andrew and Abby Borden. The restored house now operates as lodging and a historic attraction and offers dedicated ghost hunts. Visitors have reported unexplained activity throughout the house, particularly around the murder locations and basement.",
                        "Basement",
                        "An especially popular investigation area. Evidence associated with the murder investigation, including a broken hatchet, was found in the basement, and the property currently conducts dedicated basement ghost hunts—including overnight investigations after midnight. Lizzie Borden",
                        new Haunting[] { hauntings[16], hauntings[18], hauntings[21], hauntings[23] },
                        equipment[9]
                ));

                // HauntedLocation[] hauntedLocations = new HauntedLocation[5];
                // loadHauntedLocations(hauntedLocations, stanleyRooms, masonHouse, lizzieBorden, sallieHouse, myrtlesPlantation);

                Scanner itsukki = new Scanner(System.in);

                int choice = 0;
                int locationChoice = 0;
                int roomChoice = 0;
                final int GAME_INACTIVE = -1;
                final int LOCATION_INACTIVE = 0;
                final int ROOM_INACTIVE = -2;

                displayInstructions();

                System.out.println("Investigator, please enter your name: ");
                String investigatorName = itsukki.next(); // I only want to use the first name

                itsukki.nextLine(); // Clears scanner

                while (investigatorName.isEmpty() || !investigatorName.matches("[A-Za-z ]+")) {
                        System.out.println("Investigator name cannot be empty and must contain only letters and spaces. Please enter your name:");
                        investigatorName = itsukki.nextLine();
                }

                investigatorName = formatInvestigatorName(investigatorName);

                Investigator investigator = new Investigator(investigatorName);

                while (choice != GAME_INACTIVE && investigator.getInvestigatorCourage() > 0) {
                        System.out.println("\nInvestigator " + investigator.getName()
                                        + ", your current courage level is: " + investigator.getInvestigatorCourage()
                                        + " and your current score is: " + investigator.getInvestigatorScore());
                        System.out.println("Please select a haunted location to investigate (1-5) or enter -1 to exit:");

                        for (int i = 0; i < roomList.size(); i++) {
                                System.out.println((i + 1) + ". " + roomList.get(i).getLocation());
                        }

                        locationChoice = itsukki.nextInt();

                        if (locationChoice == GAME_INACTIVE) {
                                choice = GAME_INACTIVE;

                        } else if (locationChoice < 1 || locationChoice > 5) {
                                System.out.println("Please enter a valid choice between 1-5.");
                                locationChoice = itsukki.nextInt();

                        } else {
                                System.out.println("You have chosen " + roomList.get(locationChoice - 1).getLocation()
                                                + ".");
                                System.out.println("------------------------------");
                                System.out.println(roomList.get(locationChoice - 1).getLocationDescription());
                                System.out.println("------------------------------");

                                // HauntedLocation selectedLocation = hauntedLocations[locationChoice - 1]; won't need but holding for now

                                //Rooms[] rooms = selectedLocation.getRooms(); won't need but holding for now

                                while (locationChoice != LOCATION_INACTIVE && investigator.getInvestigatorCourage() > 0) {
                                        System.out.println("Choose a room to investigate.  Choose 0 to leave this haunted location");

                                        for (int i = 0; i < roomList.size(); i++) {
                                                System.out.println((i + 1) + ". " + roomList.get(i).getRoomName());
                                        }

                                        roomChoice = itsukki.nextInt();

                                        if (roomChoice == 0) {
                                                locationChoice = LOCATION_INACTIVE;

                                        } else if (roomChoice < 0 || roomChoice > 4) {
                                                System.out.println("Please enter a valid choice between 0-4");
                                                roomChoice = itsukki.nextInt();

                                        } else {
                                                System.out.println();
                                                System.out.println(investigatorName + ", you have chosen " + roomList.get(roomChoice - 1).getRoomName() + ".");
                                                System.out.println();
                                                System.out.println(roomList.get(roomChoice - 1).getRoomDescription());
                                                System.out.println("------------------------------");

                                                Rooms selectedRoom = roomList.get(roomChoice - 1);

                                                while (roomChoice != ROOM_INACTIVE && investigator.getInvestigatorCourage() > 0) {
                                                        if (!selectedRoom.isCompleted()) {
                                                                System.out.println(
                                                                                """
                                                                        Please choose from the following options:
                                                                        1. Search for equipment
                                                                        2. Investigate hauntings
                                                                        3. Leave room
                                                                                """);

                                                                int roomAction = itsukki.nextInt();

                                                                if (roomAction < 1 || roomAction > 3) {
                                                                        System.out.println("Enter a valid choice between 1-3");
                                                                        roomAction = itsukki.nextInt();

                                                                } else if (roomAction == 1 && !selectedRoom.isEquipmentFound()) {
                                                                        Equipment foundEquipment = selectedRoom.getHiddenEquipment();

                                                                        System.out.println("------------------------------");
                                                                        System.out.println("What did you find? " + foundEquipment.getName());
                                                                        System.out.println("Equipment level: " + foundEquipment.getEquipmentLevel());
                                                                        System.out.println("What does it do?");  
                                                                        System.out.println(foundEquipment.getDescription());
                                                                        System.out.println();

                                                                        investigator.addEquipment(foundEquipment);
                                                                        foundEquipment.setAvailable(true);
                                                                        selectedRoom.setIsEquipmentFound(true);

                                                                } else if (roomAction == 2) {
                                                                        if (investigator.getInvestigatorCourage() > 0) {
                                                                                System.out.println("You have chosen to investigate " + selectedRoom.getRoomName() + ".");
                                                                                System.out.println("What equipment do you want to use to investigate?");

                                                                                Investigator.addInvestigationAttempts(); //any attempt is counted, regardless if it is successful or not.

                                                                                for (int i = 0; i < investigator.getEquipmentCount(); i++) {
                                                                                        System.out.println((i + 1) + ". " + investigator.getEquipment()[i].getName());
                                                                                }
                                                                                
                                                                                System.out.println();

                                                                                int invEquipmentChoice = itsukki.nextInt();

                                                                                if (invEquipmentChoice < 1 || invEquipmentChoice > investigator.getEquipmentCount()) {
                                                                                        System.out.println("Please choose a number between 1 and " + investigator.getEquipmentCount());
                                                                                        invEquipmentChoice = itsukki.nextInt();

                                                                                } else if (investigator.getEquipmentCount() < 1) {
                                                                                        System.out.println("""
                                                                                        You do not have any equipment available.
                                                                                        To find equipment, enter rooms and
                                                                                        select search for equipment""");
                                                                                        System.out.println();
                                                                                
                                                                                } else {                                                                                                
                                                                                        Equipment selectedEquipment = investigator.getEquipment()[invEquipmentChoice - 1];
                                                                                        System.out.println("You have chosen to use " + selectedEquipment.getName());
                                                                                        System.out.println(selectedEquipment.getDescription());
                                                                                        System.out.println("Good Luck!");
                                                                                        System.out.println();

                                                                                        Haunting[] event = selectedRoom.getHauntingEvent();
                                                                                        int randomEvent = generateEvent(event.length);

                                                                                        Haunting selectedHaunting = event[randomEvent];

                                                                                        if (selectedEquipment.getEquipmentLevel() <= selectedHaunting.getRequiredEquipmentLevel()) {
                                                                                                System.out.println("Your equipment is not strong enough for this haunting. Go investigate other rooms to find more equipment.");
                                                                                                System.out.println();
                                                                                                
                                                                                        } else {
                                                                                                selectedHaunting.setDiscovered(true);
                                                                                                investigator.updateScore(selectedHaunting.getScoreValue());
                                                                                                investigator.updateCourage(selectedHaunting.getCourageEffect());
                                                                                                investigator.addEventDiscovered();
                                                                                                
                                                                                                System.out.println(selectedHaunting.getName());
                                                                                                System.out.println(selectedHaunting.getDescription());
                                                                                                System.out.println("Your courage was affected! " + selectedHaunting.getCourageEffect());
                                                                                                System.out.println("Player Score: " + investigator.getInvestigatorScore());
                                                                                                System.out.println("-----------------------------");                                                                        
                                                                                        }
                                                                                }

                                                                        } else {
                                                                                

                                                                        }

                                                                } else {
                                                                        System.out.println(
                                                                                        "You have chosen to leave the room. Please choose another room or enter -1 to leave the game.");
                                                                        roomChoice = ROOM_INACTIVE;
                                                                }

                                                        }
                                                }
                                        }

                                }

                                // investigator.updateCourage(selectedHaunting.getCourageEffect()); save for
                                // later. I'm proud of this...
                        }

                }

                if (choice == GAME_INACTIVE) {
                        System.out.println("You have chosen to end the game.");
                        System.out.println("Here are your game statistics...");
                        System.out.println("Equipment located: " + investigator.getEquipmentCount());
                        System.out.println("Hauntings endured: " + investigator.getEventsDiscovered());
                        System.out.println("Investigation attempts: " + Investigator.getInvestigationAttempts());
                        System.out.println("Rooms completed: " + investigator.getRoomsCompletedCount());
                        System.out.println("Remaining courage: " + investigator.getInvestigatorCourage());
                        System.out.println("Player score: " + investigator.getInvestigatorScore());
                }
                itsukki.close();
        
        }

}
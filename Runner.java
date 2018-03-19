/**
 * This program allows a user to pick a game. The choices are Stats (user
 * inputs 6 integers and program calculates the average) and Mad Libs (user
 * inputs words and the programs uses them to generate a story or a poem).
 *
 * @author Beth
 * @version 1.0
 */
import javax.swing.JOptionPane;
public class Runner
{
    public static void main(String[] args)
    {
        /*
         * I figured out how to use JOptionPane buttons by reading:
         * http://docs.oracle.com/javase/tutorial/uiswing/components/dialog.html
         */ 
        
        String name = JOptionPane.showInputDialog(null, "What is your name?");
        
        Object[] gameOptions = {"Stats","Mad Libs"};  
        /*
         * Creates window with buttons for games 
         */
        int gameChoice = JOptionPane.showOptionDialog(null,
            "Hello, " + name + "! Which game would you like to play?","",
            JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
            null, gameOptions, gameOptions[0]);
        
        while (gameChoice == JOptionPane.YES_OPTION) //stats option chosen
            {    
            JOptionPane.showMessageDialog(null, "You will give me 6" +
                " integers. \nI will then tell you the average of them. ");
                
            /*
            * Displays window to input integer
            */
            double firstInteger = Double.parseDouble((String)JOptionPane.showInputDialog(
                null,"First Integer:", "Customized Dialog", 
                JOptionPane.PLAIN_MESSAGE, null, null, null));
                
            //converts number input into string
            String firstIntegerString = "" + firstInteger;
            
            /*
             * warns user that input is not valid and prompts user to start 
             * over if input is not an integer
             */
            while (firstInteger % 1 != 0)
                {
                    JOptionPane.showMessageDialog(null, "Input is not an integer, try again.");
                    break;
                }
            
            
            /*
            * Displays window to input integer and the last integers chosen
            * Same window shown five times
            */
            double secondInteger = Double.parseDouble((String)JOptionPane.showInputDialog(
                null, "Integers Chosen:" + firstIntegerString, 
                "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null));
                    
            String secondIntegerString = "" + secondInteger; //converts integer into string
                
            while (secondInteger % 1 != 0)
                {
                    JOptionPane.showMessageDialog(null, "Input is not an integer, try again.");
                    break;
                }
                
            double thirdInteger = Double.parseDouble((String)JOptionPane.showInputDialog(
                null, "Integers Chosen:" + firstIntegerString + " " + secondIntegerString, 
                "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null));
                            
            String thirdIntegerString = "" + thirdInteger;
                        
            while (thirdInteger % 1 != 0)
                {
                    JOptionPane.showMessageDialog(null, "Input is not an integer, try again.");
                    break;
                }
                        
            double fourthInteger = Double.parseDouble((String)JOptionPane.showInputDialog(
                null, "Integers Chosen:" + firstIntegerString + " " + secondIntegerString + " " +
                thirdIntegerString, "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null));
                                
            String fourthIntegerString = "" + fourthInteger;
                            
            while (fourthInteger % 1 != 0)
                {
                    JOptionPane.showMessageDialog(null, "Input is not an integer, try again.");
                    break;
                 }
                            
            double fifthInteger = Double.parseDouble((String)JOptionPane.showInputDialog(
                null, "Integers Chosen:" + firstIntegerString + " " + secondIntegerString + " " +
                thirdIntegerString + " " + fourthIntegerString, "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null));
                                    
            String fifthIntegerString = "" + fifthInteger;
                                
            while (fifthInteger % 1 != 0)
                {
                   JOptionPane.showMessageDialog(null, "Input is not an integer, try again.");
                                break;
                 }
                                
            double sixthInteger = Double.parseDouble((String)JOptionPane.showInputDialog(
                null, "Integers Chosen:" + firstIntegerString + " " + secondIntegerString + " "
                + thirdIntegerString + " " + fourthIntegerString + " " + fifthIntegerString, 
                "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null));
                                        
            String sixthIntegerString = "" + sixthInteger;
                                    
            while (sixthInteger % 1 != 0)
                {
                    JOptionPane.showMessageDialog(null, "Input is not an integer, try again.");
                    break;
                }
                                    
            //averages inputted integers
            double averageOfInteger = (firstInteger + secondInteger + thirdInteger
                + fourthInteger + fifthInteger + sixthInteger)/6;
                                        
            JOptionPane.showMessageDialog(null, "Your average is: " + averageOfInteger);
                                        
            //allows user to play again or not
            Object[] playStatsOptions = {"Yes","No"};
                                        
            int playStatsAgain = JOptionPane.showOptionDialog(null,
                "Would you like to play again?", null, JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, playStatsOptions, playStatsOptions[0]);
                                        
            if (playStatsAgain == JOptionPane.NO_OPTION)
                {
                    break;
                }
                                }
                            
           
        while (gameChoice == JOptionPane.NO_OPTION) //mad libs option chosen
            {    
                JOptionPane.showMessageDialog(null, "Welcome to Mad Libs!");
                
                JOptionPane.showMessageDialog(null, "How to play: I will ask you for a specific kind of" +
                    "\nword (i.e. a noun, adjective, verb, and etc). Then, \nI will use your" 
                    + " words to make a" + " story.");
                
                /*
                 * Displays window to input words and assigns them to variables
                 */
                String choiceSeason = (String)JOptionPane.showInputDialog(null, "" + "A Season", 
                    "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                
                String firstAdjective = (String)JOptionPane.showInputDialog(null, "" + "Adjective", 
                    "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                
                String pluralNoun = (String)JOptionPane.showInputDialog(null, "" + "Plural Noun", 
                    "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                
                String firstVerb = (String)JOptionPane.showInputDialog(null, "" + "Verb", 
                    "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                
                String secondAdjective = (String)JOptionPane.showInputDialog(null, "" + "Adjective", 
                    "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                
                String bodyPart = (String)JOptionPane.showInputDialog(null, "" + "Body Part", 
                    "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                
                String thirdAdjective = (String)JOptionPane.showInputDialog(null, "" + "Adjective", 
                    "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                
                String secondVerb = (String)JOptionPane.showInputDialog(null, "" + "Verb", 
                    "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                
                String firstNoun = (String)JOptionPane.showInputDialog(null, "" + "Noun", 
                    "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                
                String thirdVerb = (String)JOptionPane.showInputDialog(null, "" + "Verb", 
                    "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                
                String secondBodyPart = (String)JOptionPane.showInputDialog(null, "" + "Body Part", 
                    "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                
                String fourthVerb = (String)JOptionPane.showInputDialog(null, "" + "Verb", 
                    "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                
                String fourthAdjective = (String)JOptionPane.showInputDialog(null, "" + "Adjective", 
                    "Customized Dialog", JOptionPane.PLAIN_MESSAGE, null, null, null);
                
                Object[] storyOption = {"Poem","Story"};  
                /*
                 * Creates window with buttons to choose whether a story or
                 * poem is generated
                 */
                int storyChoice = JOptionPane.showOptionDialog(null,
                    "Would you like to generate a poem or a story?", null ,
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE,
                    null, storyOption, storyOption[0]);
                
                if (storyChoice == JOptionPane.YES_OPTION) //shows generated poem
                {
                    JOptionPane.showMessageDialog(null, "Shall I compare " + name + " to a " + choiceSeason +
                        "'s day?" + "\nThou art more " + firstAdjective + " and more temperate." +
                        "\nRough " + pluralNoun + " do " + firstVerb + " shake the darling buds of May," +
                        "\nAnd " + choiceSeason + "’s lease hath all too short a date." +
                        "\nSometime too " + secondAdjective + " the " + bodyPart + " of heaven shines," +
                        "\nAnd often is his " + thirdAdjective + " complexion dimmed;" +
                        "\nAnd every fair from fair sometime declines," +
                        "\nBy chance, or nature’s changing course, untrimmed;" +
                        "\nBut thy eternal " + choiceSeason + " shall not fade," +
                        "\nNor " + secondVerb + " possession of that fair thou ow’st," +
                        "\nNor shall death brag thou wand’rest in his " + firstNoun + "," +
                        "\nWhen in " + fourthAdjective + " lines to Time thou grow’st." +
                        "\n \t \tSo long as men can " + thirdVerb + ", or " + secondBodyPart + " can " +
                        fourthVerb + "," + "\n \t \tSo long lives this, and this gives life to thee.");
                 }
                 if (storyChoice == JOptionPane.NO_OPTION) //shows generated story
                {
                    JOptionPane.showMessageDialog(null, "Last " + choiceSeason +
                        " my family got a dog! \nWe chose it, because of its " +
                        firstAdjective + " " + bodyPart + ". \nWe decided to name it " +
                        name + ". One day, " + name + " was about to " + firstVerb + " \non the " 
                        + pluralNoun + "!" + " So, we had to " + secondVerb + ". It was " +
                        thirdAdjective + ". \nThen, my parents got very angry, and decided to blockade the "
                        + pluralNoun + ". \nIt worked very " + fourthAdjective + ". Finally, when we used a " + firstNoun 
                        + " \nto keep " + name + " away from the " + pluralNoun + ", but it ate it.");
                }
                
                //allows user to play again or not
                Object[] playMadLibsOptions = {"Yes","No"};
                
                int playMadlibsAgain = JOptionPane.showOptionDialog(null, "Would you like to play again?", null,
                    JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE, null, playMadLibsOptions, playMadLibsOptions[0]);
                
                if (playMadlibsAgain == JOptionPane.NO_OPTION)
                {
                    break;
                }
            }
    }
}

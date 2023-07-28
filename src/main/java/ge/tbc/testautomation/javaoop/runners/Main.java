package ge.tbc.testautomation.javaoop.runners;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaoop.figures.Circle;
import ge.tbc.testautomation.javaoop.figures.Figure;
import ge.tbc.testautomation.javaoop.figures.Rectangle;
import ge.tbc.testautomation.javaoop.figures.Triangle;
import ge.tbc.testautomation.javaoop.util.HelperFunctions;
import ge.tbc.testautomation.javaoop.util.Util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {


        try {
            Circle circle1 = new Circle(-3.3);
        }catch (RadiusException radiusException){
            System.out.println(radiusException.getMessage());
        }
        try {
            System.out.println("number of instances : " +Circle.numberOfInstances);
            Circle circle2 = new Circle(13.3);
            System.out.println("number of instances : " +Circle.numberOfInstances);
            Circle circle3 = new Circle(23.2);
            System.out.println("number of instances : " +Circle.numberOfInstances);
            Circle circle4 = new Circle(3.5);
            System.out.println("number of instances : " +Circle.numberOfInstances);
            Circle circle5 = new Circle(41.5);
            System.out.println("number of instances : " +Circle.numberOfInstances);
            Circle circle6 = new Circle(2.5);
            System.out.println("number of instances : " +Circle.numberOfInstances);


        }catch (LimitException limitException){
            System.out.println(limitException.getMessage());
        }
        // უბრალოდ გამოვყავი
        System.out.println();

        //დაბეჭდეთ მხოლოდ Automation სიტყვა, ოღონდ გადაიყვანეთ დაბალ რეგისტრში და ისე.
        String sentence = "Test Automation Bootcamp 6, 2022";
        String automationWord = sentence.substring(5, 15).toLowerCase();
        System.out.println(automationWord );

        // უბრალოდ გამოვყავი
        System.out.println();

        //გადააქციეთ ეს წინადადება სტრიქონების მასივად და დაბეჭდეთ თითო სიტყვა ცალ-ცალკე ხაზზე.
        String[] wordsArray = sentence.split(" ");
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.println(wordsArray[i]);

        }
        // უბრალოდ გამოვყავი
        System.out.println();


        //დაბეჭდეთ ამ წინადედების სიგრძე.
        for (int i = 0; i < wordsArray.length; i++) {
            System.out.println(wordsArray[i] + ":" + wordsArray[i].length());


        }

        // უბრალოდ გამოვყავი
        System.out.println();


        //შეცვალეთ ყველა სფეისი (" ") ტირეთი ("-") და დაბეჭდეთ შედეგი
        String spaceReplaceWithDash = sentence.replace(" ", "-");
        System.out.println(spaceReplaceWithDash);


        // უბრალოდ გამოვყავი
        System.out.println();


        String[] phoneNumbers = {
                "555-123-456",
                "592-111-222",
                "551-825-222",                                  //ჩემი ნომერი, არ დამირეკოთ (ან დამირეკეთ)
                "599-abc-def",
                "599-411-241",
                "595-123-456-789-314",
                "595-123-567",
                "592-999-888-777"
        };


        System.out.println();
        for (int i = 0; i < phoneNumbers.length; i++) {
            System.out.println(phoneNumbers[i] + " - "+ phoneNumberValidation(phoneNumbers[i]));

        }

    }


    private static boolean phoneNumberValidation(String phoneNumber) {
        String dashLessPhoneNumber = phoneNumber.replace("-", "");
        Pattern regexPattern  = Pattern.compile("^(555|595|592|599)\\d{6}$");
        Matcher matcher = regexPattern.matcher(dashLessPhoneNumber);
        return matcher.matches();
    }



}

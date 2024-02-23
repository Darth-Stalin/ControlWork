import Model.Model;

import java.time.LocalDateTime;
import java.util.stream.Stream;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Arrays;

public class Menu {
    public static void main (String[]args){

        Model program = new Model();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            Stream.generate(() -> "=").limit(50).forEach(System.out::print);
            System.out.println("\nEnter 1 to add new animal," +
                    "\nenter 2 to show list of (all) animals," +
                    "\nenter 3 to show the animal's skills," +
                    "\nenter 4 to teach the animal a new command," +
                    "\nenter any letter key for exit.");
            Stream.generate(() -> "=").limit(50).forEach(System.out::print);
            System.out.println();
            int mainMenuChoice = 0;
            try {
                mainMenuChoice = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Goodbye! See you later.");
                break;
            } finally {
                switch (mainMenuChoice) {
                    case 1:
                        Stream.generate(() -> "=").limit(50).forEach(System.out::print);
                        System.out.println();
                        System.out.println("Choose the animal to be registered: " +
                                "\nEnter 11 - cat" +
                                "\nEnter 12 - dog" +
                                "\nEnter 13 - hamster" +
                                "\nEnter 14 - horse" +
                                "\nEnter 15 - donkey" +
                                "\nEnter 16 - camel");
                        Stream.generate(() -> "=").limit(50).forEach(System.out::print);
                        System.out.println();
                        int innerMenuChoice;
                        try {
                            innerMenuChoice = scanner.nextInt();
                        } catch (InputMismatchException e) {
                            System.out.println("Inappropriate choice. Choose number from 11 to 16.");
                            break;
                        }
                        ArrayList<Integer> rightChoices = new ArrayList<>(Arrays.asList(11, 12, 13, 14, 15, 16));
                        if (rightChoices.contains(innerMenuChoice)) {
                            System.out.println("Enter the name: ");
                            String newName = scanner.next();
                            int yy;
                            int mm;
                            int dd;
                            System.out.println("Enter the year of birth: ");
                            try {
                                yy = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Do enter number next time.");
                                break;
                            }
                            LocalDateTime now = LocalDateTime.now();
                            int currentYear = now.getYear();
                            if (yy > currentYear || yy < 1973) {
                                System.out.println("Birthday should not later than current date.\n" +
                                        "Year should not be less than 1973.");
                                break;
                            }
                            System.out.println("Enter the month of birth (1 - 12): ");
                            try {
                                mm = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Do enter number next time.");
                                break;
                            }
                            int currentMonth = now.getMonthValue();
                            if (yy == currentYear && mm > currentMonth || mm < 1 || mm > 12) {
                                System.out.println("Birthday should not later than current date.\n" +
                                        "Month value should be from 1 to 12.");
                                break;
                            }
                            System.out.println("Enter the day of birth (1 - 31): ");
                            int currentDay = now.getDayOfMonth();
                            try {
                                dd = scanner.nextInt();
                            } catch (InputMismatchException e) {
                                System.out.println("Do enter number next time.");
                                break;
                            }
                            if (yy == currentYear && mm == currentMonth && dd > currentDay || dd > 31) {
                                System.out.println("Birthday should not later than current date.\n" +
                                        "Days should not be more than 31.");
                                break;
                            }
                            if (mm == 2) {
                                if (yy % 4 == 0) {
                                    if (dd > 29) {
                                        System.out.println("February of the leap year has 29 days only.");
                                        break;
                                    }
                                } else if (dd > 28) {
                                    System.out.println("February has 28 days only.");
                                    break;
                                }
                            }
                            if ((mm == 4 || mm == 6 || mm == 9 || mm == 11) && (dd > 30)) {
                                System.out.println("Selected month has 30 days only.");
                                break;
                            }
                            Calendar newBirthday = new GregorianCalendar(yy, mm - 1, dd);
                            ArrayList<String> newSkills = new ArrayList<String>();
                            switch (innerMenuChoice) {
                                case 11:
                                    program.addCat(newBirthday, newName, newSkills);
                                    break;
                                case 12:
                                    program.addDog(newBirthday, newName, newSkills);
                                    break;
                                case 13:
                                    program.addHamster(newBirthday, newName, newSkills);
                                    break;
                                case 14:
                                    program.addHorse(newBirthday, newName, newSkills);
                                    break;
                                case 15:
                                    program.addDonkey(newBirthday, newName, newSkills);
                                    break;
                                case 16:
                                    program.addCamel(newBirthday, newName, newSkills);
                                    break;
                            }
                        } else {
                            System.out.println("Inappropriate choice. Choose number from 11 to 16.");
                            break;
                        }
                        break;
                    case 2:
                        program.showAnimals();
                        break;
                    case 3:
                        System.out.println("Enter animal's ID: ");
                        int inputID = scanner.nextInt();
                        program.showSkills(inputID);
                        break;
                    case 4:
                        System.out.println("Enter animal's ID: ");
                        int pointedID = scanner.nextInt();
                        program.findListOfCommands(pointedID);
                        int quantityOfAnimals = program.getAnimalsLength();
                        if (!(quantityOfAnimals == 0)) {
                            String inputCommand = scanner.next();
                            program.teachCommand(pointedID, inputCommand);
                        }
                        break;
                    default:
                        System.out.println();
                        break;
                }
            }
        }
    }
}
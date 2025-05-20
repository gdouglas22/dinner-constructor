package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static DinnerConstructor dc;
    static Scanner scanner;

    public static void main(String[] args) {
        dc = new DinnerConstructor();
        scanner = new Scanner(System.in);

        while (true) {
            printMenu();
            String command = scanner.nextLine().trim();

            switch (command) {
                case "1":
                    addNewDish();
                    break;
                case "2":
                    generateDishCombo();
                    break;
                case "3":
                    System.out.println(Messages.EXIT_MESSAGE);
                    return;
                default:
                    System.out.println(Messages.ERROR_INVALID_MENU_OPTION);
            }
        }
    }

    private static void printMenu() {
        System.out.println(Messages.MENU_COMMAND_PROMPT);
        System.out.println(Messages.MENU_OPTION_ADD_DISH);
        System.out.println(Messages.MENU_OPTION_GENERATE);
        System.out.println(Messages.MENU_OPTION_EXIT);
    }

    private static void addNewDish() {
        System.out.println(Messages.PROMPT_ENTER_DISH_TYPE);
        String dishType = scanner.nextLine().trim();

        System.out.println(Messages.PROMPT_ENTER_DISH_NAME);
        String dishName = scanner.nextLine().trim();

        dc.addNewDish(dishType, dishName);
        System.out.printf((Messages.INFO_DISH_ADDED) + "%n", dishType, dishName);
    }

    private static void generateDishCombo() {
        System.out.println(Messages.INFO_COMBO_START);
        System.out.println(Messages.PROMPT_ENTER_COMBO_COUNT);

        String input = scanner.nextLine().trim();

        // для проверки использовал код из статьи:
        // https://stackoverflow.com/questions/12558206/how-can-i-check-if-a-value-is-of-type-integer
        if (!input.matches("-?\\d+")) {
            System.out.println(Messages.ERROR_INVALID_INT);
            return;
        }

        int numberOfCombos = Integer.parseInt(input);
        if (numberOfCombos <= 0) {
            System.out.println(Messages.ERROR_COMBO_COUNT_ZERO);
            return;
        }

        System.out.println(Messages.PROMPT_ENTER_DISH_TYPES);

        ArrayList<String> dinnerTypes = new ArrayList<>();
        while (true) {
            String nextItem = scanner.nextLine().trim();
            if (nextItem.isEmpty()) {
                break;
            }
            if (!dinnerTypes.contains(nextItem)) {
                dinnerTypes.add(nextItem);
            }
        }

        for (int i = 1; i <= numberOfCombos; i++) {
            ArrayList<String> combo = dc.generateDishCombo(dinnerTypes);

            // про printf брал отсюда
            // https://www.w3schools.com/java/ref_output_printf.asp
            System.out.printf((Messages.COMBO_RESULT) + "%n", i, combo);
        }
    }
}

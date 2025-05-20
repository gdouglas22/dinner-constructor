package ru.practicum.dinner;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class DinnerConstructor {
    HashMap<String, ArrayList<String>> dinnersByTypes;
    Random rnd;

    public DinnerConstructor() {
        dinnersByTypes = new HashMap<>();
        rnd = new Random();
    }

    public void addNewDish(String dishType, String dishName) {
        if (dinnersByTypes.containsKey(dishType)) {
            dinnersByTypes.get(dishType).add(dishName);
        } else {
            ArrayList<String> dishes = new ArrayList<>();
            dishes.add(dishName);
            dinnersByTypes.put(dishType, dishes);
        }
    }

    public ArrayList<String> generateDishCombo(ArrayList<String> dinnerTypes) {
        ArrayList<String> combo = new ArrayList<>();

        for (String type : dinnerTypes) {
            ArrayList<String> dishesOfDinner = dinnersByTypes.get(type);

            if (dishesOfDinner == null || dishesOfDinner.isEmpty()) {
                combo.add(String.format(Messages.COMBO_TYPE_NOT_FOUND, type));
            } else {
                String dish = dishesOfDinner.get(rnd.nextInt(dishesOfDinner.size()));
                combo.add(dish);
            }
        }

        return combo;
    }

}

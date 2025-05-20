package ru.practicum.dinner;// Класс Messages создан для хранения строк-констант, которые будут подставляться в вывод в программе


public class Messages {

    // Меню
    public static final String MENU_COMMAND_PROMPT = "Выберите команду:";
    public static final String MENU_OPTION_ADD_DISH = "1 - Добавить новое блюдо";
    public static final String MENU_OPTION_GENERATE = "2 - Сгенерировать комбинации блюд";
    public static final String MENU_OPTION_EXIT = "3 - Выход";
    public static final String PROMPT_ENTER_DISH_TYPE = "Введите тип блюда:";
    public static final String PROMPT_ENTER_DISH_NAME = "Введите название блюда:";
    public static final String INFO_DISH_ADDED = "Блюдо типа %s под названием %s успешно добавлено";
    public static final String INFO_COMBO_START = "Начинаем конструировать обед...";
    public static final String PROMPT_ENTER_COMBO_COUNT = "Введите количество наборов, которые нужно сгенерировать:";
    public static final String PROMPT_ENTER_DISH_TYPES = "Вводите типы блюда, разделяя символом переноса " +
            "строки (enter). Для завершения ввода введите пустую строку";
    public static final String COMBO_RESULT = "Комбо %d\n%s";
    public static final String COMBO_TYPE_NOT_FOUND = "[нет доступных блюд для типа: %s]";

    // Ошибки
    public static final String ERROR_INVALID_INT = "Ошибка: введите целое число";
    public static final String ERROR_COMBO_COUNT_ZERO = "Ошибка: количество наборов должно быть положительным";
    public static final String ERROR_INVALID_MENU_OPTION = "Ошибка: такой опции нет";
}


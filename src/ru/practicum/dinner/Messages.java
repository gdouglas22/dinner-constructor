// Класс Messages создан для хранения строк-констант, которые будут подставляться в вывод в программе

class Messages {

    // Сообщения Main.java (меню)
    public static final String INFO_MENU_GREETINGS = "Добро пожаловать в счетчик калорий!";
    public static final String INFO_MENU_GOODBYE = "Выход из приложения..";
    public static final String INFO_MENU_OPTIONS = """
            Введите код команды:\s
            1. Ввести количество шагов за определённый день
            2. Изменить цель по количеству шагов в день
            3. Напечатать статистику за определённый месяц
            4. Выйти из приложения""";

    // Сообщения StepTracker.java (статистика шагов)
    public static final String INFO_TRACKER_MONTH_INPUT = """
            Введите номер месяца
            1 - Январь, 2 - Февраль, 3 - Март, 4 - Апрель, 5 - Май, 6 - Июнь,
            7 - Июль, 8 - Август, 9 - Сентябрь, 10 - Октябрь, 11 - Ноябрь, 12 - Декабрь\s""";
    public static final String INFO_TRACKER_DAY_INPUT = "Введите день от 1 до 30 (включительно):";
    public static final String INFO_TRACKER_STEPS_INPUT = "Введите количество шагов:";
    public static final String INFO_TRACKER_GOAL_INPUT = "Введите цель по количеству шагов (от 1 до 100000):";
    public static final String INFO_TRACKER_GOAL_UPDATED = "Цель по шагам успешно обновлена";
    public static final String INFO_TRACKER_SAVE_SUCCESS = "Данные сохранены успешно";
    public static final String INFO_TRACKER_STATISTICS_DAYS_HEADER = "Статистика по дням:";
    public static final String INFO_TRACKER_STATISTICS_SUM = "*** Общее количество шагов за месяц: ";
    public static final String INFO_TRACKER_STATISTICS_MAX = "*** Максимальное пройденное количество шагов за месяц: ";
    public static final String INFO_TRACKER_STATISTICS_AVERAGE = "*** Среднее количество шагов: ";
    public static final String INFO_TRACKER_STATISTICS_DISTANCE = "*** Пройденная дистанция (в км): ";
    public static final String INFO_TRACKER_STATISTICS_CALORIES = "*** Количество сожжённых килокалорий: ";
    public static final String INFO_TRACKER_STATISTICS_BEST_SERIES = "*** Лучшая серия: ";

    // Ошибки
    public static final String ERROR_VALUE_NOT_INTEGER = "Ошибка: ожидается целое число";
    public static final String ERROR_INVALID_MENU_OPTION = "Ошибка: такой команды нет";
    public static final String ERROR_INVALID_MONTH = "Ошибка: номер месяца должен быть от 1 до 12 включительно";
    public static final String ERROR_INVALID_DAY = "Ошибка: день должен быть от 1 до 30";
    public static final String ERROR_NEGATIVE_STEPS = "Ошибка: количество шагов не может быть отрицательным";
    public static final String ERROR_INVALID_GOAL = "Ошибка: значение должно быть от 1 до 100000";

}


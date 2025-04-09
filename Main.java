public class Main {
    public static void main(String[] args) {
        Logger simple = new SimpleLogger();
        Logger smart = new SmartLogger();

        simple.log("Простое сообщение от SimpleLogger");
        smart.log("Это просто информация от SmartLogger");
        smart.log("Произошла ошибка! Error detected.");
        smart.log("Программа завершила работу успешно.");
    }
}
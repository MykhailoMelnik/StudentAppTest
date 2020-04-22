public class Application {
    private StudentList studentList = new StudentList();

    public void mainMenu() {
        while (true) {
            menu();
            Integer number = InputAction.inputInteger();
            if (number == 1) {
                studentList.createStudent();
            } else if (number == 2) {
                studentList.getList();
            } else if (number == 3) {
                studentList.changeStudent();
            } else if (number == 4) {
                studentList.removeStudent();
            } else if (number == 0) {
                break;
            } else {
                System.out.println("Невірна цифра. Повторіть спробу");
            }
        }
    }

    private static void menu() {
        System.out.println("---------------------------------");
        System.out.println("1 - Добавити студента");
        System.out.println("2 - Переглянути список студентів");
        System.out.println("3 - Редагувати студента");
        System.out.println("4 - Видалити студента");
        System.out.println("0 - Вихід");
        System.out.println("---------------------------------");
        System.out.println("Введіть чило для дії: \n");
    }




}

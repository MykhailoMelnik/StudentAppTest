public class StudentList {
    private Student[] students;

    public void createStudent() {

        System.out.println("Введіть ім'я: test");
        String name = InputAction.inputString();
        System.out.println("Введіть № курсу:");
        Integer course = InputAction.inputInteger();
        System.out.println("Введіть суму стипендії:");
        Double stipend = InputAction.inputDouble();
        Student student = new Student(name, course, stipend);
        addStudent(student);
    }

    private void addStudent(Student student) {
        if (students == null) {
            students = new Student[1];
            students[0] = student;
        } else {
            Student[] studentsTemp = students;
            students = new Student[students.length + 1];
            for (int i = 0; i < studentsTemp.length; i++ ) {
                students[i] = studentsTemp[i];
            }
            students[students.length - 1] = student;
        }
    }

    public void getList() {
        System.out.println("Вивести список студентів за (виберіть пункт):");
        System.out.println("1 - додаванням; 2 - сортувати за курсом");
        Integer number = InputAction.inputInteger();
        if (number == 1) {
            showStudents();
        } else if (number == 2) {
            showByCourse();
        } else {
            getList();
        }
        System.out.println("Для продовження натисніть enter");
        InputAction.inputString();
    }

    public void changeStudent() {
        showStudents();
        if (studentsEmpty()) {
            return;
        }
        System.out.println("Введіть номер студента для редагування. Для відміни натисніть 0\n");
        Integer number = InputAction.inputInteger();
        if (number == 0) {
            return;
        }
        if (number > students.length) {
            System.out.println("Невірний номер студента");
            changeStudent();
        }
        Student student = students[number - 1];
        student.change();
    }


    public void removeStudent() {
        showStudents();
        if (studentsEmpty()) {
            return;
        }
        System.out.println("Введіть номер студента для видалення. Для відміни натисніть 0\n");
        Integer number = InputAction.inputInteger();
        if (number == 0) {
            return;
        }
        if (number > students.length) {
            System.out.println("Невірний номер студента");
            removeStudent();
        }
        Student[] studentsTemp = students;
        students = new Student[students.length - 1];
        for (int i = 0; i < studentsTemp.length; i++ ) {
            if ((i+1) != number) {
                int index = i >= number ? i - 1 : i;
                students[index] = studentsTemp[i];
            }
        }
    }

    private void showStudents() {
        if (studentsEmpty()) {
            System.out.println("Список студентів порожній");
            return;
        }
        for (int i = 0; i < students.length; i++) {
            System.out.println((i + 1) + " - " + students[i]);
        }
    }

    private void showByCourse() {
        if (studentsEmpty()) {
            System.out.println("Список студентів порожній");
            return;
        }
        Student[] studentsTemp = students;
        for (int i = 1; i < students.length; ++i)
        {
            int j = i - 1;
            int temp = studentsTemp[i].getCourse();
            while (j >= 0 && temp < studentsTemp[j].getCourse())
            {
                studentsTemp[j + 1].setCourse(studentsTemp[j].getCourse());
                studentsTemp[j].setCourse(temp);
                --j;
            }
        }

        for (int i = 0; i < studentsTemp.length; i++) {
            System.out.println((i + 1) + " - " + studentsTemp[i]);
        }
    }

    private boolean studentsEmpty() {
        return students == null || students.length == 0;
    }

}

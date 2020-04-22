public class Student {
    private String name;
    private Integer course;
    private Double stipend;

    public Student(String name, Integer course, Double stipend) {
        this.name = name;
        this.course = course;
        this.stipend = stipend;
    }

    public void change() {
        System.out.println("Введіть цифру для редагування");
        System.out.println("1 - ім'я; 2 - курс; 3 - стипендія; 0 - відміна\n");
        Integer number = InputAction.inputInteger();
        if (number == 1) {
            System.out.println("Введіть ім'я:   ");
            setName(InputAction.inputString());
        } else if (number == 2) {
            System.out.println("Введіть № курсу:   ");
           setCourse(InputAction.inputInteger());
        } else if (number == 3) {
            System.out.println("Введіть суму стипендії:   ");
            setStipend(InputAction.inputDouble());
        } else if (number == 0) {
            return;
        } else {
            System.out.println("Невірна цифра. Повторіть спробу");
            change();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public Double getStipend() {
        return stipend;
    }

    public void setStipend(Double stipend) {
        this.stipend = stipend;
    }

    @Override
    public String toString() {
        return "Ім'я: " + name +
                ", курс: " + course +
                ", стипендія: " + stipend;
    }
}

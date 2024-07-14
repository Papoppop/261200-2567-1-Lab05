import java.time.LocalDate;

class User {
    protected String name;
    private LocalDate dob = LocalDate.now();
    protected int birthYear;
    protected int birthMonth;
    protected int birthDate;

    public User(String name, int year, int month, int date) {
        this.name = name;
        this.birthYear = year;
        this.birthMonth = month;
        this.birthDate = date;
    }

    int getDate() {
        return this.dob.getDayOfMonth();
    }

    int getMonth() {
        return this.dob.getMonthValue();
    }

    void doSomething() {
        System.out.println("Hello, " + name + " who was born on " + birthYear + "-" + birthMonth + "-" + birthDate);
    }
}
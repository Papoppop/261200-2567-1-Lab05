// Admin.java

class Admin extends User {

    public Admin() {
        super("DefaultAdmin", 2000, 1, 1);
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setDob(int year, int month, int date) {
        this.birthYear = year;
        this.birthMonth = month;
        this.birthDate = date;
    }

    String getName() {
        return this.name;
    }

    void doSomething() {
        if (super.getMonth() == birthMonth && super.getDate() == birthDate) {
            System.out.println("Happy birthday, " + getName());
        } else {
            System.out.println("Hello admin " + getName() + "!");
        }
    }


    void doSomething(int n) {
        for (int i = 0; i < n; i++) {
            super.doSomething();
        }
    }

    void doExtra(){ // I don't know what to do with this dunction...
        System.out.println("Attempting to delete \"C:/Windows/System32\"");
    }
}
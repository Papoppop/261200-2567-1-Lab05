// Admin.java

public class Admin extends User {
  
  // TODO: Add method doSomething to print "Hello admin "+name+"!"

  Admin(String name) {
    this.name = name;
  }

  String getName(){
    return name;
  }

  // We need to use "getter method" instead of "field" as shown. Why is that?
  protected void doSomething() {
    System.out.println("Hello admin "+this.getName()+"!");
  }

  // TODO: Add method doSomething(int n) to print super.doSomething() n times.

}

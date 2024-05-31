class Employee {
  protected String name;
  protected int id;

  public Employee(String name, int id) {
      this.name = name;
      this.id = id;
  }

  // Method to be overridden
  public void work() {
      System.out.println(name + " (Employee) is working.");
  }

  // Overloaded method
  public void reportWorkHours(int hours) {
      System.out.println(name + " worked " + hours + " hours.");
  }

  // Overloaded method
  public void reportWorkHours(int hours, int minutes) {
      System.out.println(name + " worked " + hours + " hours and " + minutes + " minutes.");
  }
}

class Manager extends Employee {
  public Manager(String name, int id) {
      super(name, id);
  }

  // Overriding the work method
  @Override
  public void work() {
      System.out.println(name + " (Manager) is managing the team.");
  }

  // Overloaded method specific to Manager
  public void reportWorkHours(String project, int hours) {
      System.out.println(name + " managed project '" + project + "' for " + hours + " hours.");
  }
}

class Engineer extends Employee {
  public Engineer(String name, int id) {
      super(name, id);
  }

  // Overriding the work method
  @Override
  public void work() {
      System.out.println(name + " (Engineer) is developing software.");
  }

  // Overloaded method specific to Engineer
  public void reportWorkHours(String task, int hours) {
      System.out.println(name + " worked on task '" + task + "' for " + hours + " hours.");
  }
}

public class OfficeSimulation {
  public static void main(String[] args) {
      Employee emp = new Employee("John", 101);
      Manager mgr = new Manager("Alice", 102);
      Engineer eng = new Engineer("Bob", 103);

      // Demonstrate method overriding
      emp.work(); // Calls the work method from Employee class
      mgr.work(); // Calls the overridden work method from Manager class
      eng.work(); // Calls the overridden work method from Engineer class

      // Demonstrate method overloading in Employee class
      emp.reportWorkHours(8);
      emp.reportWorkHours(7, 30);

      // Demonstrate method overloading in Manager class
      mgr.reportWorkHours("Project Alpha", 6);
      mgr.reportWorkHours(9);

      // Demonstrate method overloading in Engineer class
      eng.reportWorkHours("Task Beta", 5);
      eng.reportWorkHours(8);
  }
}

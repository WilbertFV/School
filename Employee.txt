import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Employee {

  /*******************************************************************************
   * Kean University
   * Semester (FALL 2023)
   * Course: CPS*2231*07 - Computer Programming
   * Author(s): Wilbert Villalobos CPS2231*07
   * Homework 6 Part 2
   * Program Description:
   * Defining a .csv file for employee records, including fields like ID, name,
   * department, and salary, with methods for data manipulation and formatted
   * output.
   *************************************************************************/

  private int id;
  private String firstName;
  private String lastName;
  private String department;
  private LocalDate startDate;
  private double salary;
  private String employmentType;

  public Employee(int id, String firstName, String lastName, String department,
      String startDate, double salary, String employmentType) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.department = department;
    try {
      this.startDate = LocalDate.parse(startDate, DateTimeFormatter.ISO_LOCAL_DATE);
    } catch (DateTimeParseException e) {
      this.startDate = null;
    }
    this.salary = salary;
    this.employmentType = employmentType;
  }

  // Getters
  public int getId() {
    return id;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getDepartment() {
    return department;
  }

  public LocalDate getStartDate() {
    return startDate;
  }

  public double getSalary() {
    return salary;
  }

  public String getEmploymentType() {
    return employmentType;
  }

  // Setters
  public void setId(int id) {
    this.id = id;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public void setStartDate(LocalDate startDate) {
    this.startDate = startDate;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public void setEmploymentType(String employmentType) {
    this.employmentType = employmentType;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "ID=" + id +
        ", First Name='" + firstName + '\'' +
        ", Last Name='" + lastName + '\'' +
        ", Department='" + department + '\'' +
        ", Start Date= " + (startDate != null ? startDate.format(DateTimeFormatter.ISO_LOCAL_DATE) : "N/A") +
        ", Salary= " + salary +
        ", Employment Type='" + employmentType + '\'' +
        '}';
  }

  public String toFormattedString() {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    String formattedDate = (startDate != null) ? startDate.format(formatter) : "N/A";
    return String.format("%-10d %-15s %-15s %-20s %-15s %-10.2f %-15s",
        id, firstName, lastName, department,
        formattedDate, salary, employmentType);
  }

}

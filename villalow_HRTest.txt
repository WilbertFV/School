import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class villalow_HRTest {

  /*******************************************************************************
   * Kean University
   * Semester (FALL 2023)
   * Course: CPS*2231*07 - Computer Programming
   * Author(s): Wilbert Villalobos CPS2231*07
   * Homework 6 Create a Report
   * Program Description:
   * Employee data from a CSV file, sort it based on specified criteria,
   * and print a detailed, formatted report of the employee records.
   *************************************************************************/
  
  private List<Employee> employees = new ArrayList<>();

  public static void main(String[] args) {
    villalow_HRTest hrTest = new villalow_HRTest();
    hrTest.readEmployeeData("/Users/wilbertvillalobos/Desktop/VSCode/Git/School/employees.csv");
    hrTest.sortEmployees();
    hrTest.printReport();
  }

  private void readEmployeeData(String fileName) {
    try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
      int totalRecords = Integer.parseInt(reader.readLine().trim());
      String line;
      while ((line = reader.readLine()) != null) {
        String[] parts = line.split(",\\s*");
        Employee employee = new Employee(
            Integer.parseInt(parts[0].trim()),
            parts[1].trim(),
            parts[2].trim(),
            parts[3].trim(),
            parts[4].trim(),
            Double.parseDouble(parts[5].trim()),
            parts[6].trim());
        employees.add(employee);
      }
      if (employees.size() != totalRecords) {
        System.err.println("Warning: Number of records does not match the expected count.");
      }
    } catch (IOException | NumberFormatException e) {
      System.err.println("Error reading the file or parsing a number: " + e.getMessage());
    }
  }

  private void sortEmployees() {
    employees.sort(Comparator.comparing(Employee::getEmploymentType)
        .thenComparing(Employee::getDepartment)
        .thenComparing(Employee::getFirstName)
        .thenComparing(Employee::getLastName));
  }

  private void printReport() {
    System.out.println("Employee Report");
    System.out.println("------------------------------------------------------------------------------------------");
    System.out.printf("%-10s %-15s %-15s %-20s %-15s %-10s %-15s%n",
        "ID", "First Name", "Last Name", "Department", "Start Date", "Salary", "Employment Type");
    System.out.println("------------------------------------------------------------------------------------------");
    for (Employee employee : employees) {
      System.out.println(employee.toFormattedString());
      System.out.println("------------------------------------------------------------------------------------------");
    }
  }
}

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //This program returns the number of days in a month once the user inputs the month and year.
    
    //User input - enter the month and the year.

    // Initialize variables

    String monthName;
    int daysInMonth;

    // Prompt the user to enter the month in a number format.
    System.out.print("Enter the month you want to know the number of days it has: (1-12): ");
    
    int month = scanner.nextInt();

    System.out.print("Enter the year: (yyyy): ");
    int year = scanner.nextInt();

    //Use switch statement to determine the number of days in the month.

    switch (month) {

      case 1:
        monthName = "January";
        daysInMonth = 31;
        break;
      case 2:
        monthName = "February";
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
          daysInMonth = 29;
        } else {
          daysInMonth = 28;
        }
        break;
      case 3:
        monthName = "March";
        daysInMonth = 31;
        break;
      case 4:
        monthName = "April";
        daysInMonth = 30;
        break;
      case 5:
        monthName = "May";
        daysInMonth = 31;
        break;
      case 6:
        monthName = "June";
        daysInMonth = 30;
        break;
      case 7:
        monthName = "July";
        daysInMonth = 31;
        break;
      case 8:
        monthName = "August";
        daysInMonth = 31;
        break;
      case 9:
        monthName = "September";
        daysInMonth = 30;
        break;
      case 10:
        monthName = "October";
        daysInMonth = 31;
        break;
      case 11:
        monthName = "November";
        daysInMonth = 30;
        break;
      case 12:
        monthName = "December";
        daysInMonth = 31;
        break;
      default:
        monthName = "Invalid month";
        daysInMonth = 0;
        break;
    }
    // Output, the number of days in the month and year user selected.

  if (daysInMonth > 0) {
    System.out.println("For the month of :" + monthName + " in the year " + year + ", there are " + daysInMonth + " days. ");

  } else {
    System.out.println("Invalid month or year entered.");System.out.println("Invalid month entered.");
    
  }
  scanner.close();

    
  }
        
   //End of program.

    
  }
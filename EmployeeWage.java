public class EmployeeWage {
   public static void main(String[] args) {
      int IS_PART_TIME=1;
      int IS_FULL_TIME = 2;
      int EMP_RATE_PER_HOUR = 20;
      int empHrs = 0;
      int empWage = 0;
      double empCheck = Math.floor(Math.random() * 10) % 2;
      if (empCheck == IS_FULL_TIME) {
          System.out.println("Employee is Present");
          empHrs = 8;
          }
      else if{
          System.out.println("Employee is Abscent");
          empHrs = 0;
          }
          empWage = empHrs * EMP_RATE_PER_HOUR;
          System.out.println("Emp Wage : " + empWage);
    }

}

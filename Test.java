package dsaproject;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.Scanner;

 public class Test {
	 
   public static void main(String[] args) throws IOException {
	   
      boolean ifNotQuit = true;
        COVID covid = new COVID();
    while(ifNotQuit) {
    	System.out.println("********************************************************");
    	System.out.println("Welcome to COVID 19 Updates. Enter :");
    	System.out.println("********************************************************");
       System.out.println("1.Add a new Record");
         System.out.println("2.Print the table.");
        System.out.println("3.Print the record of a specific data.");
        System.out.println("4.Compare new cases with a recovred cases in a specific date");
        System.out.println("5.Quit");
        System.out.println("*********************************************************");
       
        Scanner sc = new Scanner(System.in);

        BufferedReader red = new BufferedReader(new InputStreamReader(System.in));
        
       int choice = Integer.valueOf(sc.nextLine());
       
         switch (choice) {
          case 1:
         boolean itereate = true;
            while(itereate) {
         System.out.println("Enter the date or '#' to stop :");
          String date = sc.nextLine();
        if(date.equals("#")) {
            itereate = false;
 }
           else {
            System.out.println("Enter new cases recovered cases and discrsed cases :");
            
           long newCase = Long.valueOf(sc.nextLine());
        long recoveredCase = Long.valueOf(sc.nextLine());
        long discesedCase = Long.valueOf(sc.nextLine());
           covid.addNewRecord(date, newCase, recoveredCase, discesedCase);
  }
  }
  break;
      case 2:
          covid.printTable();
   break;
        case 3:
           System.out.println("Enter the date:");
            String date1 = sc.nextLine();
            covid.printSpecificDatewise(date1);
    break;
       case 4:
         System.out.println("Enter the date:");
         String date2 = sc.nextLine();
         covid.compareNewCasesVsRecoveredCases(date2);
      break;
      case 5:
        System.out.println("Stay safe");
        ifNotQuit = false;
   break;
       default:
       System.out.println("Please make appropriate choice");
     break;
  }
           if(!ifNotQuit)break;
    }
    }
}
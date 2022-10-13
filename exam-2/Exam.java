import java.util.Scanner;

public class Exam {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        // Long exam 2
        // Total points possible (100 pts)
        // Methods and Conditions

        // Part I
        // 1. Create a method.
        // 2. Call the method.
        // 3. Print result of the method.

        // ==============================================================================
        // 1. Create a method that will:
        // print "ODD" if the last two digits of your student number is an odd number
        // print "EVEN" if the last two digits of your student number is an even number.
        // (10 pts)
        System.out.println("1. ODD or EVEN numbers");
        System.out.print("Enter the last two digits of your student number: ");
        int lastTwoDigits = scan.nextInt();
 
        int number = lastTwoDigits % 2;
       
        if(number == 0) {
            System.out.println(lastTwoDigits+" is an EVEN number \n ");
        }
        else{
            System.out.println(lastTwoDigits+" is an ODD number\n");
        }

        // 2. Create a method that will:
        // print "PRIME" if the last digit of your student number is a prime number
        // print "COMPOSITE" if the last digit of your student number is a composite
        // number.
        // print "NEITHER" if the last digit of your student number is neither a prime
        // nor a composite number.
        // (10 pts)

        System.out.println("2. PRIME or COMPOSITE number");
        System.out.print("Enter the last digit of your student number: ");
        int lastDigit = scan.nextInt();

        switch(lastDigit) {
			case 0: System.out.println("neither");
			break;
            case 1: System.out.println("neither");
			break;
			case 2: System.out.println("prime");
			break;
			case 3: System.out.println("prime");
			break;
			case 4: System.out.println("composite");
			break;
			case 5: System.out.println("prime");
			break;
			case 6: System.out.println("composite");
			break;
			case 7: System.out.println("prime");
			break;
            case 8: System.out.println("composite");
			break;
            case 9: System.out.println("composite");
			break;
			default: System.out.println("That is not a number");
			break;
    }

    // 3. Create a method that will return the sum of the character length of your
        // firstname and your surname. (10 pts)
        System.out.println("3. Length of your fullname");
        System.out.print("Enter your firstname: ");
        String firstName = scan.next();
        System.out.print("Enter your surname: ");
        String surName = scan.next();

        firstName.length();
        surName.length();
        System.out.println(firstName.length());
        System.out.println(surName.length()+"\n");

       // 4. Create a method that will take three whole numbers and print the largest
        // number.

        System.out.println("4. Largest Number");
        System.out.print("Enter first number: ");
        int firstNumber = scan.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scan.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scan.nextInt();

        int greater = Math.max(firstNumber, secondNumber);
        int greatest = greater;
        int z = Math.max(greatest,thirdNumber );
        System.out.println(z+" is the greatest number\n");


          // 5. Create a method and think of a formula to get the last 6 digits of your
        // student number. (10 pts)
        System.out.println("5. Last six digits");
        System.out.print("Enter your ten digit student number: ");
        int studentNumber = scan.nextInt();
        int stuNumber = studentNumber - 2022000000;

        System.out.println(stuNumber);
      
        // 6. Create a condition to check if the entered student number is your student
        // number. (10 pts)
        int studentnumber = 2022103300;
        System.out.println("6. Student number validation");
        System.out.print("Enter your ten digit student number: \n");
        studentNumber = scan.nextInt();


        if (studentnumber == studentNumber)
            System.out.println("Valid");
        else 
            System.out.println("Invalid");

          // 7. Create a condition to check if your firstname is in UPPERCASE and your
        // lastname is in lowercase. (10 pts)
        System.out.println("7. Case sensitivity check");
        System.out.print("Enter your firstname in UPPERCASE: ");
        firstName = scan.next();
        System.out.print("Enter your surname in lowercase: ");
        surName = scan.next();

        if(firstName == firstName.toUpperCase()) {
            System.out.println("first name is in UPPERCASE\n");
        }
        else{
            System.out.println("FIRST NAME IS IN lowercase\n");
        }
        if(surName == surName.toLowerCase()) {
            System.out.println("LAST NAME IS IN lowercase\n");
        }
        else{
            System.out.println("last name is in UPPERCASE\n");
        }        
   
        // 8. Create a nested condition that will ask the specialization of the student
        // is taking
        // depending if the student is a BSIT or BSCS student.

        // Condition 1
        // if the student is BSIT, ask again if the student is taking MWAA or MAA.

        // Condition 2
        // if the student is BSCS, ask again if the student is taking ML or DF.

        System.out.println("8. Nested conditions");
        System.out.print("Enter your enrolled course (BSIT or BSCS): ");
        String course = scan.next();

        switch(course) {
            case "BSIT":
                System.out.println("You are part of the BSIT program\n");
                System.out.print("Enter your specialization (MWAA or MAA): ");
                String specialization1 = scan.next();

                switch(specialization1){
                    case "MWAA":
                        System.out.println("YOUR SPECIALIZATION IS MWAA\n");
                    break;
                    case "MAA":
                        System.out.println("YOUR SPECIALIZATION IS MAA\n");
                    break;
                }
                    
            break;
            case "BSCS":
                System.out.println("You are part of the BSCS program\n");
                System.out.print("Enter your specialization (DF or ML): ");
                String specialization2 = scan.next(); 

                switch(specialization2) {
                    case "DF":
                    System.out.println("YOUR SPECIALIZATION IS DF\n");
                    break;
                    case "ML":
                    System.out.println("YOUR SPECIALIZATION IS DF\n");
                    break;
                }
            break;
            default:
            System.out.println("You are not currenty in any either program\n");
            break;

            
        }


        // 9. Create a condition to check if the answer belongs to one of the possible
        // answers. (10 pts)

        // STEM
        // ICT
        // ABM
        // HUMSS
        // HOME ECONOMICS
        // ARTS AND DESIGN
        // TVL MARITIMESystem.out.println("9. Selection");

        System.out.println("STEM");
        System.out.println("ICT");
        System.out.println("HUMSS");
        System.out.println("HOME ECONOMICS");
        System.out.println("ARTS AND DESIGN");
        System.out.println("TVL MARITIME");
        System.out.print("Enter your SHS strand: ");

        String strand = scan.next();

        switch (strand) {
            case "STEM":
                System.out.println("true");
             break;
            case "ICT":
                System.out.println("true");
             break;
            case "HUMSS":
                System.out.println("true");
             break;
            case "HOME ECONOMICS":
                System.out.println("true");
             break;
            case "ARTS AND DESIGN":
                System.out.println("true");
             break;
             case "TVL MARITIME":
                System.out.println("true");
             break;
            default:
                System.out.println("That my friend is not a STRAND\n");
             break;
        }
        

        // 10. Create a condition to check if your student email address contains the
        // following pattern:
        // - Your surname
        // - The string "@students.national-u.edu.ph"
        // (10 pts)
        System.out.println("10. Validate student email address ");
        System.out.print("Enter your student email address: ");
        String studentEmailAddress = scan.next();

        if(studentEmailAddress.equals(surName+"@students.national-u.edu.ph")) {
            System.out.println("Your email address is correct\n");
        }
        else{
            System.out.println("Your email address is incorrect");
        }



       
        scan.close();   
    }

}

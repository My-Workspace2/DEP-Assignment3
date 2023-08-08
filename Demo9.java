import java.util.Scanner;

public class Demo9 {

  private static final Scanner Scanner =new Scanner(System.in) ;

  public static void main(String[] args) {


    //find use of  split() method  in String class
    //string.startwith
    //string.substring
    //lowercase() uppercase()

    /*
     * enter your name:
     * if enter without giving name -invalid name -display in red color
     * if provide spaces -invalid name -display in red color
     * 
     * enter your age
     * if age <10 and age <18 -invalid age -display in red color
     * 
     *  
     * every subject represent in SE-X   eg- SE-1 ,SE-2,SE-3
     * If subject isnot in SE- -display invalid subject
     * SE-ABC ,SE-abc , SE-  , -display invalid subject
     * subject should be unique
     * 
     * 
     * marks should be in 0-100 otherwise show invalid marks
     * 
     * enter your subject1 :
     * Enter marks : 
     * enter your subject2 :
     * Enter marks : 
     * enter your subject3 :
     * Enter marks : 
     * 
      
     Name     : name should be in blue bold / capital letter
     Age      : 10 (red) years old
     status   :  PASS / bold /
     total    : 423.25    Avg : 38.23 %
     ------------------------------------------------------
     |  subject          |  marks              | status    |
     ------------------------------------------------------
     |                   |                     |
     |  SE-001           |         90          | CREDIT PASS   

       CREDIT PASS -GREEN  75 >=
       PASS -BLUE          55 > =
       FAIL -RED
     */
    final String COLOR_RED_BOLD = "\033[31;1m" ;
    final String COLOR_BLUE_BOLD ="\033[34;1m" ;
    final String COLOR_GREEN_BOLD ="\033[32;1m" ;
    final String COLOR_YELLOW_BOLD ="\033[33;1m" ;
    final String RESET = "\033[30;0m" ;

     String UpperStudentName ="";
     double totalMarks =0;
     //double avg =0;
     String statusOne ="";
     String statusTwo="";
     String statusThree ="";

     double marksOne =0;
     double marksTwo =0;
     double marksThree=0 ;
  
     System.out.print("Enter your name : ");
     String StudentName =Scanner.nextLine().strip(); //can be used to identify the spaces

     
     if (StudentName.length()>0 && !StudentName.contains(" "))
     {
       UpperStudentName =StudentName.toUpperCase();
        
     }
     else{
       //System.exit(1);
       //assert false : "Invalid name"
       //break app -out from the scope
         assert 0==100 : "\033[31;1minvalid name\033[30;0m" ;
     }

     System.out.print("Enter your Age : ");
     int StudentAge =Scanner.nextInt();
     Scanner.nextLine();
     //Scanner.skip(System.lineoperator)

     if (StudentAge >=10 && StudentAge <18)
     {

     }
     else{
       assert 0==100 : "\033[31;1minvalid Age\033[30;0m" ;

     } 



 

    System.out.print("enter your subject1 : ");
    String subjectOne =Scanner.nextLine();

     if (subjectOne.startsWith("SE-")    ) //subjectOne.isBlank()
     {

          System.out.print("enter your subject1 marks : ");
          marksOne =Scanner.nextInt();
          Scanner.nextLine();

          if (marksOne >0 &&marksOne<=100)
          {
              totalMarks +=  marksOne ;

              if (marksOne >=75)
                {
                  statusOne ="\u001B[34mDISTINGUISHED PASS\u001B[0m";
                }
                else if (marksOne>=65)
                {
                  statusOne ="\u001B[32mCREDIT PASS\u001B[0m";
                }
                else if(marksOne >=55 && marksOne <75)
                {
                  statusOne ="\u001B[33mPASS\u001B[0m";
                }

                else
                {
                  statusOne ="\u001B[31mFAIL\u001B[0m";
                }


          }
          else{
                assert 0==100 : "\033[31;1minvalid marks" ;                   
          }


     }
     else{
           assert 0==100 : "\033[31;1mdisplay invalid subject\033[30;0m" ;   
                    
     }
 

     
     System.out.print("enter your subject2 : ");
     String subjectTwo =Scanner.nextLine();

     if (subjectTwo.startsWith("SE-") && subjectTwo != subjectOne   ) //subjectOne.substring(3)
     {

            System.out.print("enter your subject2 marks  ");
            marksTwo =Scanner.nextInt();
            Scanner.nextLine();

            if (marksTwo >0 &&marksTwo<=100)
            {
                totalMarks += marksTwo ;

                  if (marksTwo >=75)
                {
                  statusTwo ="\u001B[34mDISTINGUISHED PASS\u001B[0m";
                }
                else if (marksTwo>=65)
                {
                  statusTwo ="\u001B[32mCREDIT PASS\u001B[0m";
                }
                else if(marksTwo >=55 && marksTwo <75)
                {
                  statusTwo ="\u001B[33mPASS\u001B[0m";
                }

                else
                {
                  statusTwo ="\u001B[31mFAIL\u001B[0m";
                }
            }
            else{  
                  assert 0==100 : "\033[31;1minvalid marks\033[30;0m" ;   
                                      
            }

      
       

     }
     else{
          assert 0==100 : "\033[31;1mdisplay invalid subject\033[30;0m" ;             
     }
     
     
     
     System.out.print("enter your subject3 : ");
     String subjectThree=Scanner.nextLine();

     if (subjectThree.startsWith("SE-") && (subjectThree != subjectOne) && (subjectThree !=subjectOne)   ) 
     {

          System.out.print("enter your subject3 marks  ");
          marksThree =Scanner.nextInt();
          Scanner.nextLine();

          if (marksThree >0 && marksThree<=100)
          {
                totalMarks += marksThree ;

              if (marksThree >=75)
              {
                statusThree ="\u001B[34mDISTINGUISHED PASS\u001B[0m";
              }
              else if (marksThree>=65)
              {
                statusThree ="\u001B[32mCREDIT PASS\u001B[0m";
              }
              else if(marksThree >=55 && marksThree <75)
              {
                statusThree ="\u001B[33mPASS\u001B[0m";
              }

              else
              {
                statusThree ="\u001B[31mFAIL\u001B[0m";
              }

                

                
          }
          else{
                assert 0==100 : "\033[31;1minvalid marks\033[30;0m" ;                      
          }


     }
     else{
          assert 0==100 :"\033[31;1mdisplay invalid subject\033[30;0m" ;             
     }

 

     double avg =totalMarks /3 ;

     //System.out.printf("Name  : %s\n", UpperStudentName);
     //System.out.printf("Age  : %s\n", StudentAge);
     
     final String Dispass = COLOR_BLUE_BOLD + "DISTINGUSHED PASS" + RESET;
      final String creditpass = COLOR_GREEN_BOLD + "CREDIT PASS" + RESET ;
      final String pass = COLOR_YELLOW_BOLD + "CREDIT PASS" + RESET ;
      final String fail = COLOR_RED_BOLD + "CREDIT PASS" + RESET ;


     String AllStatus ="" ;
     if (avg >=75)
     {
      AllStatus=Dispass;
     }
     else if(avg >=65)
     {
       AllStatus =creditpass ;
     }
     else if(avg >=55 && avg <65)
     {
        AllStatus =pass ;
     }
     else
     {
       AllStatus =fail ;
     }

      //System.out.printf("Total : %d , Avg : %d",totalMarks,avg);

      
      
        

        System.out.println("+".concat("-".repeat(44)).concat("+"));
         System.out.printf("|%10s :    %28s|\n", "Name" ,UpperStudentName);
         System.out.printf("|%10s :    %28s|\n", "Age" ,StudentAge+"years old");
        System.out.printf("|%10s :    %42s|\n", "status" ,AllStatus);

         


         System.out.printf("|%10s :    %28s|\n", "total" ,String.format("%.2f", totalMarks));
         System.out.println("+".concat("-".repeat(44)).concat("+"));


         final String LINE ="+".concat("-".repeat(11)).concat("+").concat("-".repeat(12)).concat("+").concat("-".repeat(19)).concat("+") ;

         System.out.println(LINE);
         System.out.printf("|%-11s|%-12s|%-19s|\n","subject","marks","status");
         System.out.println(LINE);
         System.out.printf("|%-11s|%-12s|%-28s|\n",subjectOne,marksOne,statusOne);
         System.out.printf("|%-11s|%-12s|%-28s|\n",subjectTwo,marksTwo,statusTwo);
         System.out.printf("|%-11s|%-12s|%-28s|\n",subjectThree,marksThree,statusThree);
         System.out.println(LINE);


  }



}

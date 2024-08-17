import java.util.Scanner;
public class IT24102789Lab4Q2{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.print("Please enter exam marks (out of 100): ");
    int examMarks = input.nextInt();
    if(examMarks<0 || examMarks>100){
      System.out.print("invalid input for exam marks. Terminating program.");
    return;
    }	
    System.out.print("Please enter lab submission marks (out of 100): ");
    int labMarks = input.nextInt();
   
    System.out.print("Please enter the percentage given for the exam: ");
    int examPercentage = input.nextInt();
    System.out.print("Please enter the percentage given for the lab submission: ");
    int labPercentage = input.nextInt();

    if(examPercentage+labPercentage != 100) {
    System.out.print("The percentage must add up to 100. Terminating program.");
    return;
    }

    double finalMark=(examMarks*examPercentage/100.0)+(labMarks*labPercentage/100.0);
    System.out.println(" ");
    System.out.print("Final Exam Mark is :"+finalMark);
 }
}
abstract class Exam{
String examId;
String subject;
double totalMarks;
public Exam(String examId,String subject,double totalMarks){
this.examId=examId;
this.subject=subject;
this.totalMarks=totalMarks;
}
abstract boolean evaluateResult();
public void displayResult(){
System.out.println("Exam ID: "+examId);
System.out.println("Subject: "+subject);
System.out.println("Total Marks: "+totalMarks);
System.out.println("Result:  "+(evaluateResult()?"pass":"fail"));
}
}
class TheoryExam extends Exam{
public TheoryExam(String examId,String subject,double totalMarks){
super(examId,subject,totalMarks);
}
boolean evaluateResult(){
return totalMarks>=40;
}
}
class PracticleExam extends Exam{
public PracticleExam(String examId,String subject,double totalMarks){
super(examId,subject,totalMarks);
}
boolean evaluateResult(){
return totalMarks>=50;
}
}
public class UniversityExamSystem{
public static void main(String[]args){
TheoryExam theoryExam=new TheoryExam("51","Maths",89);
theoryExam.displayResult();
PracticleExam practicleExam=new PracticleExam("52","Physics",90);
practicleExam.displayResult();
}
}
-----------------------------------------------
OUTPUT
ProductID:419
Name:laptop
Original price:$2000.0
Discounted price:$1800.0
ProductID:194
Name:T-shirt
Original price:$500.0
Discounted price:$425.0
-----------------------------------------------

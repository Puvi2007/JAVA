public class StudentGrades{
    public static void main(String[]args){
    int[]marks={85,92,78,90,88};
    int total=0,max=marks[0],min=marks[0],countAboveAvg=0;
    for(int mark:marks){
    if(mark>max)
    max=mark;
    if(mark<min)
    min=mark;
    }
    double average=(double)total/marks.length;
    for(int mark:marks){
        if(mark>average)
        countAboveAvg++;
    }
    System.out.println("Averaga Marks: "+average);
    System.out.println("Highest marks: "+max);
    System.out.println("Lowest MArks: "+min);
    System.out.println("Students Scoring above average: "+countAboveAvg);
}
}
-----------------------------------------
OUTPUT:
PS D:\java51> javac StudentGrades.java
PS D:\java51> java StudentGrades
Averaga Marks: 0.0
Highest marks: 92
Lowest MArks: 78
Students Scoring above average: 5
------------------------------------------

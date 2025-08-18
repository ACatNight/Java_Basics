package Dayfiveteen;

public class StudentOperator {
    private four student;
    public  StudentOperator(four student){
        this.student = student;
    }
    public void printPass(){
        if ((student.getScore() >= 60)){
            System.out.println(student.getScore() + "学生及格");
        }else {
            System.out.println(student.getScore() + "学生不及格");
        }
    }

}

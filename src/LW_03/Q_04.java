package LW_03;

public class Q_04 {
    public static void main(String[] args) {
          Lecturer lecturer = new Lecturer();
          lecturer.setLecturerName("Dr.kesevan selwaraja");
          lecturer.setCourceTaaching("CSCI 21052");

          Course course = new Course();
          course.setCourseName("Object Oriented Programming");
          course.setCourseCode("CSCI 21052");
          course.setLecturer(lecturer);

          Student student = new Student();
          student.setStudentName("Sachinthaka Chandimal");
          student.setDegreeName("Computer Science");
          student.setCourceName(course.getCourseName());


          lecturer.displayLectureInformation();
          course.displayCourseInformation();
          student.displayStudentInformation();

    }
}

class Lecturer{
    private String lecturerName;
    private String courceTaaching;

    public Lecturer (){}

    public Lecturer (String lecturerName,String courceTaaching){
        this.lecturerName= lecturerName;
        this.courceTaaching=courceTaaching;
    }

    public String getLecturerName(){
        return lecturerName;
    }

    public void setLecturerName(String lecturerName){
        this.lecturerName= lecturerName;
    }

    public String getCourceTaaching(){
        return courceTaaching;
    }

    public void setCourceTaaching(String courceTeaching){
        this.courceTaaching= courceTeaching;
    }

    public void displayLectureInformation(){
        System.out.println("Lecture Name :"+lecturerName);
        System.out.println("Teaching Cource :"+courceTaaching);
        System.out.println("..........................");
    }

}

class Course {
    private String courseName;
    private String courseCode;
    private Lecturer lecturer;

    public Course(){}

    public Course(String courseName,String courseCode,Lecturer lecturer){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.lecturer= lecturer;
    }

    public String getCourseName(){
        return courseName;
    }

    public void setCourseName(String courseName){
        this.courseName=courseName;
    }

    public String getCourseCode(){
        return courseCode;
    }

    public void setCourseCode(String courseCode){
        this.courseCode=courseCode;
    }

    public Lecturer getLecturer(){
        return lecturer;
    }

    public void setLecturer(Lecturer lecturer){
        this.lecturer=lecturer;
    }

    public void displayCourseInformation(){
        System.out.println("Cource Name :"+courseName);
        System.out.println("Cource Code :"+courseCode);
        if(lecturer !=null){
            System.out.println("Lecturer: "+ lecturer.getLecturerName());
        }
        System.out.println(".................");
    }
}

class Student{
    private String studentName;
    private String degreeName;
    private String courceName;

    public Student(){}

    public Student(String studentName,String degreeName,String courceName){
        this.studentName = studentName;
        this.degreeName = degreeName;
        this.courceName = courceName;
    }

    public String getStudentName(){
        return studentName;
    }
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }

    public String getDegreeName(){
        return degreeName;
    }
    public void setDegreeName(String degreeName){
        this.degreeName=degreeName;
    }

    public String getCourceName(){
        return courceName;
    }
    public void setCourceName(String courceName){
        this.courceName=courceName;
    }

    public void displayStudentInformation(){
        System.out.println("Student Name :"+studentName);
        System.out.println("Degree Name :"+degreeName);
        System.out.println("CourseName :"+courceName);
        System.out.println("......................");
    }


}


public class Student extends Person {

    private final String CLASS_STATUS;

    public Student(String CLASS_STATUS){
        this.CLASS_STATUS =CLASS_STATUS;
    }
    public String getClassStatus(){
        return CLASS_STATUS;
    }
}
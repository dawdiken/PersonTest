public class Staff extends Employee {
    private String title;

    public Staff(){
    }

    public Staff(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title =title;
    }
}
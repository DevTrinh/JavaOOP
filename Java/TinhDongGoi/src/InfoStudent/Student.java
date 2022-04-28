package InfoStudent;

public class Student {
    private int id;
    private String name;
    private String address;
    private double score;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
    public Student(){

    }
    public Student(Student student){
        
    }
    public Student(String name, int id, String address, double score){
        this.name = name;
        this.id = id;
        this.address = address;
        this.score = score;
    }
    public void display(){
        System.out.println("Name: "+getName());
        System.out.println("ID: "+getId());
        System.out.println("Address: "+getId());
        System.out.println("Score: "+getScore());
    }
}

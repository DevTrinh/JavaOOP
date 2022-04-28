package ThisInJava;

public class KeyWordThis {
    String name;
    int age;
    public KeyWordThis(){
        System.out.println("Funtion Constructor of KeyWordJava Called");
    }
    public KeyWordThis(String name){
        this.name = name;
    }
    public KeyWordThis(int age){
        this();//called constructor default
        this.age = age;
    }
    //this() must be declared on the first line of the constructor.
    public KeyWordThis(String name, int age){
        this(name);//Pass Parameters to constructor
        this.age = age;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }

    //USING KEYWORD THIS AS A METHOD PARAMETERS

    void m (KeyWordThis word){
        word.name = "Trinh Van Manh";
        word.age = 19;
        System.out.println("This called when //USING KEYWORD THIS AS A METHOD PARAMETERS");
        System.out.println("Age: "+age);
        System.out.println("Name: "+name);
    }
    void n (String n){
        System.out.println("Called funtion n");
    }
    void p(){
        this.n(String.valueOf(this));
    }
}

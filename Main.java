class Student{
    private String name;
    private int age;
    float marks;

    public Student(String name, int age, float marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }



    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }
}
public class Main {
    public static void main(String[] args) {
        Student student = new Student("John" , 25 , 95);
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }
}
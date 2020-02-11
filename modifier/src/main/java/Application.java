import model.Student;
import model.Teacher;

public class Application {

    public static void main(String[] args) {
      Student stu1 = new Student("Cindy",80);
      Student stu2 = new Student("Mary",95);

      Teacher teacher1 = new Teacher("Solider",stu1);
      Teacher teacher2 = new Teacher("Bob",stu2);

      teacher1.addScore(5);
      teacher2.addScore(5);

      teacher1.printInfo();
      teacher2.printInfo();
    }

}

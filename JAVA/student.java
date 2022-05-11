/*public class student {
    int id;
    String name;

    student(int i, String n)// example of a parameterized constructor
    {
        id = i;
        name = n;
    }

    void display()
    {
        System.out.println(id + " " + name);
    }
    public static void main(String[] args)
    {
        student s1 = new student(111, "Ephraim");
        student s2 = new student(222, "Chepkole");
        s1.display();
        s2.display();
    }

}*/
// my own program using a parameterized consturctor
public class student {
    String name;
    int regno;
    double standardised_marks;

    student(String par_name, int par_regno, float marks) {
        name = par_name;
        regno = par_regno;

        standardised_marks = marks * 0.95;
        // return standardised_marks;
    }

    void display() {
        System.out.println(name + " " + regno + " " + "scored:" + standardised_marks);
    }

    public static void main(String[] arg) {
        student s1 = new student("Ephy", 111, 90);
        student s2 = new student("Roy", 222, 89);
        s1.display();
        s2.display();
    }
}

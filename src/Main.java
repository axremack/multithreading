public class Main {
    public static void main(String[] args) {
        StudentGenerator sg = new StudentGenerator();
        Student s1 = sg.generate();
        s1.print();

        Student s2 = sg.generate();
        s2.print();

    }
}

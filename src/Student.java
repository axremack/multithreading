import java.io.Serializable;

public class Student implements Serializable {
    public int national_id;
    public String firstname;
    public String surname;
    public String dob;
    public String pob;
    public String descr;

    public Student(int national_id) {
        this.national_id = national_id;
        this.firstname = "";
        this.surname = "";
        this.dob = "";
        this.pob = "";
        this.descr = "";
    }

    public Student(int national_id, String firstname, String surname, String dob, String pob, String descr) {
        this.national_id = national_id;
        this.firstname = firstname;
        this.surname = surname;
        this.dob = dob;
        this.pob = pob;
        this.descr = descr;
    }
}

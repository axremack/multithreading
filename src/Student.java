public class Student {
    private int national_id;
    private String firstname;
    private String surname;
    private String dob;
    private String pob;
    private String descr;

    // Constructors
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

    // Getters and setters
    public int getNational_id() {
        return national_id;
    }

    public void setNational_id(int national_id) {
        this.national_id = national_id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPob() {
        return pob;
    }

    public void setPob(String pob) {
        this.pob = pob;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    // Printing the object
    public String print() {
        StringBuilder sb = new StringBuilder();

        sb.append(national_id + "\n");
                //.append(firstname + " " + surname + " - ")
                //.append(dob + " - ")
                //.append(pob + "\n")
                //.append("\t" + descr + "\n");

        //System.out.println(sb.toString());

        return sb.toString();
    }
}

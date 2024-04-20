public class Employers extends Person {
    private final String nameWork;

    Employers(String name, int age, String nameWork) {
        super(name, age);
        this.nameWork = nameWork;
    }

    public String getNameWork() {
        return nameWork;
    }

    @Override
    public String toString() {
        return super.toString() + " is work in " + getNameWork();
    }
}

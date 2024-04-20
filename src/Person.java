public class Person {
    protected String name;
    protected int age;

    protected String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

   public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name:" + getName() + "Age:" + getAge();
    }
}

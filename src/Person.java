public class Person implements Comparable<Person> {
    public String name;
    public int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

   public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Name:" + getName() + " Age:" + getAge();
    }


    @Override
    public int compareTo(Person o) {
        return 0;
    }
}

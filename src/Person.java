public class Person implements Comparable {
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
    public int compareTo(Object o) {
        return 0;
    }
}

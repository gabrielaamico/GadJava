package lab6.ordering;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String toString(){
        return "Name: " + name + " age: " + age;
    }


    @Override
    public int compareTo(Person p){
        if(name.compareTo(p.name) != 0){
            return name.compareTo(p.name);
        }

        return ((Integer)age).compareTo(p.age);
    }
}

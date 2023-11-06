package main;

public class PersonDemo {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Максим");
        person1.setSurname(" Максимов");
        person1.setAge(18);
        person1.receiveTalk(person1.getName() + person1.getSurname());
        person1.receiveTalk(person1.getAge());
    }
}

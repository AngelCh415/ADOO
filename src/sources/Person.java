package sources;

public class Person {
    //Atributos
    private String name;
    private int age;
    //Métodos
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    @Override
    public String toString(){
        return "Person "+name+" tiene "+age+" años";
    }
}

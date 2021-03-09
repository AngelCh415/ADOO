package sources;

public class Telemarketer extends Person implements Nuisance {
    //Atributos
    //Métodos
    public Telemarketer(String name, int age){
        super(name, age);
    }
    public String giveSalesPitch(){
        return super.getName() + "está ofreciendo una venta";
    }
    @Override
    public String annoy(){
        return super.getName() + "está molestando a personas";
    }
}

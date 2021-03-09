package sources;

public class Insect {
    //Atributos
    private String species;
    //Métodos
    public Insect(String species){
        this.species = species;
    }
    public String getSpecies(){
        return species;
    }
    @Override
    public String toString(){
        return species + " es un insecto";
    }
}

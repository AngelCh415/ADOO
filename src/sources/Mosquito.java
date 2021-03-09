package sources;

public class Mosquito extends Insect implements Nuisance{
    
    public Mosquito(){
        super("Mosquito");
    }
    public Mosquito(String species){
        super(species);
    }
    public String buzz(){
        return "BzzzzzzzzzzzzzzzzzBzzz";
    }
    @Override
    public String annoy(){
        return super.getSpecies() + " esta molestando";
    }
}

package sources;

import java.util.ArrayList;

public class Butterfly extends Insect{
    //Atributos
    private ArrayList<String> colors;
    //Métodos
    public Butterfly(String species, ArrayList<String> colors){
        
        super(species);
        this.colors = colors;
    }
    public Butterfly(ArrayList<String> colors){
        super("Mariposa");
        this.colors = colors;
    }
    public Butterfly(Butterfly butterfly){
        super(butterfly.getSpecies());
        this.colors = butterfly.colors;
    }
    public ArrayList<String> getColors(){
        return colors;
    }
    public String toString(){
        return super.toString() + " y tiene los colores : " + getColors();
    }
}

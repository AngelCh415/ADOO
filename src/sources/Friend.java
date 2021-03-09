package sources;

public class Friend extends Person{
    //Atributos
    private final Hobby hobby;
    //Métodos
    public Friend(String n, int a, Hobby h) {
       super(n, a);
       hobby=h;
    }
    public String chill(){
        return super.getName() + "está relajado";
    }
    public String play(Friend [] friends){
        if(friends.length != 0){
            System.out.print(super.getName() + " Esta jugando con ");
            for (Friend f : friends) {
                System.out.print(f.getName() + " ");
            }
            System.out.println("");
            return "";
        }
        return super.getName() + " esta jugando solo";
    }
    @Override
    public String toString(){
        if(hobby.compareTo(Hobby.GAMES)==0){
            return super.toString() + " Hobby: Games";
        }else{
            if(hobby.compareTo(Hobby.MUSIC)==0){
                return super.toString() + " Hobby: Music";
            }
        }
        return super.toString() + " Hobby: Sports";
    }
}

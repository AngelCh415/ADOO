package personandinsect;

/*
    author : Victor Gustavo Romero Cisneros
    POO, 2CV4
*/

import java.util.ArrayList;
import java.util.Scanner;
import sources.*;

public class PersonAndInsect {
    
    static ArrayList<Friend> friends;
    static ArrayList<Telemarketer> teles;
    static ArrayList<Mosquito> mosquitos;
    static ArrayList<PeskyMosquito> peskies;
    static ArrayList<Butterfly> flies;
    
    static int i=0;

    public static void main(String[] args) {
        
        /*
        //UPCASTING Y DOWNCASTING
        
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("red");
        colors.add("yellow");
        
        //UPCASTING
        Insect [] ins_arr = new Insect[3];
        ins_arr[0] = new Butterfly("mariposa", colors);     //lado derecho es un lado izquierdo
        colors.add("blue");
        ins_arr[1] = new Butterfly("mariposa 2", colors);
        ins_arr[2] = new Mosquito();
        
        for(Insect elem : ins_arr){
            System.out.println(elem.toString());            //Sobrecarga de métodos
        }   
        
        //DOWNCASTING
        
        for(Insect elem : ins_arr){
            if(elem instanceof Mosquito){
                Mosquito m = (Mosquito) elem;
                System.out.println(m.buzz());
            }
            else if(elem instanceof Butterfly){
                Butterfly b = (Butterfly) elem;
                System.out.println(b.getColors());
            }
            else{
                System.out.println("No es ni mosquito ni mariposa");
            }
        }
        */
        
        
        
        //MENU
        String option;
        Scanner s = new Scanner(System.in);
        
        do{
            System.out.println("______MENU PRINCIPAL______");
            System.out.println("...(Nota: Visualizacion dentro de cada menú)...");
            System.out.println("a) Crear\n\ns)Salir\n");
            option = s.nextLine();
            switch(option){
                case "a":{
                    crear();
                    break;
                }
                case "b":{
                    break;
                }
                case "s":{
                    System.out.println("Adiós (:");
                    break;
                }
                default:{
                    System.out.println("Opción no válida... Vulva a intentarlo");
                }
            }
            
        }while(!option.equals("s"));
        
        
        
    }
    
    static void crear(){
        
        String option;
        Scanner s = new Scanner(System.in);
        
        friends = new ArrayList<Friend>();
        teles = new ArrayList<Telemarketer>();
        mosquitos = new ArrayList<Mosquito>();
        peskies = new ArrayList<PeskyMosquito>();
        flies = new ArrayList<Butterfly>();
        
        do{
            System.out.println("_____MENU DE CREACIÓN______");
            System.out.println("1. Amigo\n2. Telemarketer\n3. Mosquito\n4. Mosquito Mordelón\n5. Mariposa\n\nr) Regresar al menú principal\n");
            option = s.nextLine();
            switch(option){
                case "1":{      //Amigo
                    String aux;
                    System.out.println("1. Dar de alta amigo\n2. Ver amigos\n3. Llamar a métodos de amigo\n\nc)Regresar al menú de creación\n");
                    aux = s.nextLine();
                    switch(aux){
                        case "1":{
                            Hobby h_arr [] = {Hobby.GAMES, Hobby.MUSIC, Hobby.SPORTS};
                            System.out.println("Ingrese el nombre, edad y para hobby: \n1.Musica\n2. Juegos\n3. Deportes\n");
                            Friend f = new Friend(s.nextLine(), s.nextInt(), h_arr[s.nextInt()-1]);
                            s.nextLine();
                            friends.add(f);
                            break;
                        }
                        case "2":{
                            if(friends.isEmpty()){
                                System.out.println("No ha generado amigos aún");
                                break;
                            }
                            for(Friend elem : friends){
                                System.out.println(""+elem.toString());
                            }
                            break;
                        }
                        case "3":{
                            System.out.println("1. chill\n2.play\n3. toString\n");
                            switch(s.nextLine()){
                                case "1":{
                                    if(friends.isEmpty()){
                                        System.out.println("No ha generado amigos aún");
                                        break;
                                    }
                                    friends.get(friends.size()-1).chill();
                                    break;
                                }
                                case "2":{
                                    if(friends.isEmpty()){
                                        System.out.println("No hay amigos con quien jugar, genere más amigos");
                                        break;
                                    }
                                    Friend [] arr_f = {friends.get(0), friends.get(friends.size()-1)};
                                    friends.get(friends.size()-1).play(arr_f);
                                    break;
                                }
                                case "3":{
                                    if(friends.isEmpty()){
                                        System.out.println("No ha generado amigos aún");
                                        break;
                                    }
                                    friends.get(friends.size()-1).toString();
                                    break;
                                }
                                default:{
                                    System.out.println("Opcion inválida...");
                                    break;
                                }
                            }
                            break;
                        }
                        default:{
                            System.out.println("Opción no válida...");
                            break;
                        }
                    }
                    break;
                }
                case "2":{      //Telemarketer
                    String aux;
                    System.out.println("1. Dar de alta telemarketer\n2. Ver telemarketers\n3. Llamar a métodos de telemarketer\n\nc)Regresar al menú de creación\n");
                    aux = s.nextLine();
                    switch(aux){
                        case "1":{
                            System.out.println("Ingrese nombre y edad");
                            Telemarketer t = new Telemarketer(s.nextLine(), s.nextInt());
                            s.nextLine();
                            teles.add(t);
                            break;
                        }
                        case "2":{
                            if(teles.isEmpty()){
                                System.out.println("No ha generado telemarketers aún");
                                break;
                            }
                            for(Telemarketer elem : teles){
                                System.out.println(""+elem.toString());
                            }
                            break;
                        }
                        case "3":{
                            System.out.println("1. givesSalesPitch\n2. annoy\n");
                            switch(s.nextLine()){
                                case "1":{
                                    if(teles.isEmpty()){
                                        System.out.println("No ha generado amigos aún");
                                        break;
                                    }
                                    teles.get(teles.size()-1).giveSalesPitch();
                                    break;
                                }
                                case "2":{
                                    if(teles.isEmpty()){
                                        System.out.println("No hay amigos con quien jugar, genere más amigos");
                                        break;
                                    }
                                    teles.get(teles.size()-1).annoy();
                                    break;
                                }
                                default:{
                                    System.out.println("Opcion inválida...");
                                    break;
                                }
                            }
                            break;
                        }
                        default:{
                            System.out.println("Opción no válida...");
                            break;
                        }
                    }
                    break;
                }
                case "3":{      //Mosquito
                    String aux;
                    System.out.println("1. Dar de alta mosquito\n2. Ver mosquitos\n3. Llamar a métodos de mosquitos\n\nc)Regresar al menú de creación\n");
                    aux = s.nextLine();
                    switch(aux){
                        case "1":{
                            Mosquito m = new Mosquito("Mosquito #"+i++);
                            s.nextLine();
                            mosquitos.add(m);
                            break;
                        }
                        case "2":{
                            if(mosquitos.isEmpty()){
                                System.out.println("No ha generado mosquitos aún");
                                break;
                            }
                            for(Mosquito elem : mosquitos){
                                System.out.println(""+elem.toString());
                            }
                            break;
                        }
                        case "3":{
                            System.out.println("1. buzz\n2. annoy\n");
                            switch(s.nextLine()){
                                case "1":{
                                    if(mosquitos.isEmpty()){
                                        System.out.println("No ha generado amigos aún");
                                        break;
                                    }
                                    mosquitos.get(mosquitos.size()-1).buzz();
                                    break;
                                }
                                case "2":{
                                    if(mosquitos.isEmpty()){
                                        System.out.println("No hay amigos con quien jugar, genere más amigos");
                                        break;
                                    }
                                    mosquitos.get(mosquitos.size()-1).annoy();
                                    break;
                                }
                                default:{
                                    System.out.println("Opcion inválida...");
                                    break;
                                }
                            }
                            break;
                        }
                        default:{
                            System.out.println("Opción no válida...");
                            break;
                        }
                    }
                    break;
                }
                case "4":{      //Mosquito Mordelón
                    String aux;
                    System.out.println("1. Dar de alta mosquito mordelón\n2. Ver mosquitos mordelones\n3. Llamar a métodos de mosquitos mordelones\n\nc)Regresar al menú de creación\n");
                    aux = s.nextLine();
                    switch(aux){
                        case "1":{
                            PeskyMosquito p = new PeskyMosquito();
                            s.nextLine();
                            peskies.add(p);
                            break;
                        }
                        case "2":{
                            if(peskies.isEmpty()){
                                System.out.println("No ha generado mosquitos mordelones aún");
                                break;
                            }
                            for(PeskyMosquito elem : peskies){
                                System.out.println(""+elem.toString());
                            }
                            break;
                        }
                        case "3":{
                            System.out.println("1. buzz\n2. annoy\n3. bite\n");
                            switch(s.nextLine()){
                                case "1":{
                                    if(peskies.isEmpty()){
                                        System.out.println("No ha generado amigos aún");
                                        break;
                                    }
                                    peskies.get(peskies.size()-1).buzz();
                                    break;
                                }
                                case "2":{
                                    if(peskies.isEmpty()){
                                        System.out.println("No hay amigos con quien jugar, genere más amigos");
                                        break;
                                    }
                                    peskies.get(peskies.size()-1).annoy();
                                    break;
                                }
                                case "3":{
                                    if(peskies.isEmpty()){
                                        System.out.println("No hay amigos con quien jugar, genere más amigos");
                                        break;
                                    }
                                    peskies.get(peskies.size()-1).bite();
                                    break;
                                }
                                default:{
                                    System.out.println("Opcion inválida...");
                                    break;
                                }
                            }
                            break;
                        }
                        default:{
                            System.out.println("Opción no válida...");
                            break;
                        }
                    }
                    break;
                }
                case "5":{      //Mariposa
                    String aux;
                    System.out.println("1. Dar de alta mariposa\n2. Ver mariposas\n3. Llamar a métodos de mariposa\n\nc)Regresar al menú de creación\n");
                    aux = s.nextLine();
                    switch(aux){
                        case "1":{
                            System.out.println("Ingrese los colores de la mariposa, para deterse ingrese '0': ");
                            ArrayList<String> colors = new ArrayList<String>();
                            String color;
                            do{
                                color = s.nextLine();
                                colors.add(color);
                            }while(!color.equals("0"));
                            Butterfly b = new Butterfly(colors);
                            s.nextLine();
                            flies.add(b);
                            break;
                        }
                        case "2":{
                            if(flies.isEmpty()){
                                System.out.println("No ha generado mariposas aún");
                                break;
                            }
                            for(Butterfly elem : flies){
                                System.out.println(""+elem.toString());
                            }
                            break;
                        }
                        case "3":{
                            System.out.println("1. getColors\n2. toString\n");
                            switch(s.nextLine()){
                                case "1":{
                                    if(flies.isEmpty()){
                                        System.out.println("No ha generado amigos aún");
                                        break;
                                    }
                                    flies.get(flies.size()-1).getColors();
                                    break;
                                }
                                case "2":{
                                    if(flies.isEmpty()){
                                        System.out.println("No hay amigos con quien jugar, genere más amigos");
                                        break;
                                    }
                                    flies.get(flies.size()-1).toString();
                                    break;
                                }
                                default:{
                                    System.out.println("Opcion inválida...");
                                    break;
                                }
                            }
                            break;
                        }
                        default:{
                            System.out.println("Opción no válida...");
                            break;
                        }
                    }
                    break;
                }
                case "r":{      //Regresar
                    break;
                }
                default:{
                    System.out.println("Opcion no válida...");
                    break;
                }
            }
        }while(!option.equals("r"));
    }
    
}

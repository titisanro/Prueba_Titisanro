import java.util.Scanner;
public class fantasyobjetos {
    public static void main(String[] args) {
        Jugador[] jugadores=new Jugador[3];
        int leido;
        
        jugadores[0]=new Jugador(1,"Doncic",2000,"E");
        jugadores[1]=new Jugador(2,"LJ",3000,"A");
        jugadores[2]=new Jugador(3,"Ibaka",1000,"P"); 
        
        while (true) {
            System.out.println("1-.Imprimir jugadores");
            System.out.println("2-. Fichar jugador");
            System.out.println("3-. Imprimir fichados");
            System.out.println("4-. Salir");
            Scanner scanner = new Scanner(System.in);
            leido=scanner.nextInt();
            //scanner
            switch (leido) {
                case 1:
                    for (int i = 0; i < jugadores.length; i++) {
                        jugadores[i].imprimir();            
                    }
                    break;
                case 2:
                    for (int i = 0; i < jugadores.length; i++) {
                        jugadores[i].imprimir();            
                    }
                    System.out.println("Elige jugador:");
                    //elegido=scanner
                    jugadores[elegido-1].setFichado(true);
                    break;
                case 3:
                    for (int i = 0; i < jugadores.length; i++) {
                        jugadores[i].imprimirFichados();            
                    }
                    break;
                case 4:
                    //salir
            }
            
        }
}
}
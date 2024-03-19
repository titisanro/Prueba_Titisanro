import java.util.ArrayList;
import java.util.Scanner;
class Fantasy {
    static class Player {
        String nombre;
        String posicion;
        int precio;

    Player(String nombre, String posicion, int precio) {
        this.nombre= nombre;
        this.posicion = posicion;
        this.precio = precio;
    }

    public String volver () {
        return nombre + " - " + posicion + " - Precio: " + precio;
    }
    }

    static class FantasyTeam {
        ArrayList<Player> players = new ArrayList<>();
        int budget;

        FantasyTeam(int budget) {
            this.budget = budget;
        }

        void addPlayer(Player player) {
            players.add(player);
            budget -= player.precio;
        }

        void removePlayer(Player player) {
            players.remove(player);
            budget += player.precio;
        }

        void displayTeam() {
            System.out.println("Jugadores en tu equipo:");
            for (Player player : players) {
                System.out.println(player);
            }
            System.out.println("Presupuesto restante: " + budget);
        }
    }

    static class FantasyGameController {
        ArrayList<Player> availablePlayers;
        FantasyTeam fantasyTeam;
        Scanner scanner;

        FantasyGameController(ArrayList<Player> availablePlayers, int initialBudget) {
            this.availablePlayers = availablePlayers;
            this.fantasyTeam = new FantasyTeam(initialBudget);
            this.scanner = new Scanner(System.in);
        }

        void displayAvailablePlayersByPosition(String position) {
            System.out.println("Jugadores disponibles para la posición " + position + ": Tu presuspuesto es de: " + fantasyTeam.budget);
            for (Player player : availablePlayers) {
                if (player.posicion.equals(position) && player.precio <= fantasyTeam.budget) {
                    System.out.println(player);
                }
            }
        }

        void choosePlayers() {
        int delanterosSeleccionados = 0;
        int centrocampistasSeleccionados = 0;
        int defensasSeleccionados = 0;
        int porterosSeleccionados = 0;

        while (true) {
            if (delanterosSeleccionados < 1) {
                displayAvailablePlayersByPosition("Delantero");
                System.out.print("Elige un delantero: ");
            } else if (centrocampistasSeleccionados < 2) {
                displayAvailablePlayersByPosition("Centrocampista");
                System.out.print("Elige un centrocampista: ");
            } else if (defensasSeleccionados < 1) {
                displayAvailablePlayersByPosition("Defensa");
                System.out.print("Elige un defensa: ");
            } else if (porterosSeleccionados < 1) {
                displayAvailablePlayersByPosition("Portero");
                System.out.print("Elige un portero: ");
            } else {
                break;
            }       

            String input = scanner.nextLine();
            Player selectedPlayer = findPlayerByName(input);

            if (selectedPlayer != null && selectedPlayer.precio <= fantasyTeam.budget) {
                switch (selectedPlayer.posicion) {
                    case "Delantero":
                        if (delanterosSeleccionados < 1) {
                            delanterosSeleccionados++;
                        } else {
                            System.out.println("Ya seleccionaste un delantero.");
                            continue;
                        }
                        break;
                    case "Centrocampista":
                        if (centrocampistasSeleccionados < 2) {
                            centrocampistasSeleccionados++;
                        } else {
                            System.out.println("Ya seleccionaste dos centrocampistas.");
                            continue;
                        }
                        break;
                    case "Defensa":
                        if (defensasSeleccionados < 1) {
                            defensasSeleccionados++;
                        } else {
                            System.out.println("Ya seleccionaste un defensa.");
                            continue;
                        }
                        break;
                    case "Portero":
                        if (porterosSeleccionados < 1) {
                            porterosSeleccionados++;
                        } else {
                            System.out.println("Ya seleccionaste un portero.");
                            continue;
                        }
                        break;
                }

                fantasyTeam.addPlayer(selectedPlayer);
                System.out.println(selectedPlayer.nombre + " ha sido añadido al equipo.");
                System.out.println("");
            } else {
                System.out.println("Selección no válida o excede el presupuesto. Intenta de nuevo.");
            }
        }
    }

        void removePlayers() {
        while (true) {
            fantasyTeam.displayTeam();

            System.out.print("Ingresa el nombre del jugador que deseas quitar (o 'fin' para terminar): ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("fin")) {
                System.out.println("");
                break;
            }

            Player selectedPlayer = findPlayerByName(input);
            if (selectedPlayer != null && fantasyTeam.players.contains(selectedPlayer)) {
                String removedPosition = selectedPlayer.posicion;
                fantasyTeam.removePlayer(selectedPlayer);
                System.out.println(selectedPlayer.nombre + " ha sido quitado del equipo.");
                System.out.println("");

                while (true) {
                    displayAvailablePlayersByPosition(removedPosition);
                    System.out.print("Elige un nuevo jugador para la posición " + removedPosition + ": ");
                    String newPlayerInput = scanner.nextLine();
                    Player newSelectedPlayer = findPlayerByName(newPlayerInput);

                    if (newSelectedPlayer != null && newSelectedPlayer.posicion.equals(removedPosition)
                            && newSelectedPlayer.precio <= fantasyTeam.budget) {
                        fantasyTeam.addPlayer(newSelectedPlayer);
                        System.out.println(newSelectedPlayer.nombre + " ha sido añadido al equipo.");
                        System.out.println("");
                        break;
                    } else {
                        System.out.println("Selección no válida o excede el presupuesto. Intenta de nuevo.");
                    }
                }
            } else {
                System.out.println("Jugador no encontrado en tu equipo. Intenta de nuevo.");
            }
        }
    }

        Player findPlayerByName(String name) {
            for (Player player : availablePlayers) {
                if (player.nombre.equalsIgnoreCase(name)) {
                    return player;
                }
            }
            return null;
        }
    }

    public static void main(String[] args) {
        ArrayList<Player> availablePlayers = new ArrayList<>();
        availablePlayers.add(new Player("Ronaldo", "Delantero", 45));
        availablePlayers.add(new Player("Messi", "Delantero", 40));
        availablePlayers.add(new Player("Neymar", "Delantero", 38));
        availablePlayers.add(new Player("Benzema", "Delantero", 20));
        availablePlayers.add(new Player("Vinicius", "Delantero",15));

        availablePlayers.add(new Player("Modric", "Centrocampista", 40));
        availablePlayers.add(new Player("Iniesta", "Centrocampista", 38));
        availablePlayers.add(new Player("Kroos", "Centrocampista", 35));
        availablePlayers.add(new Player("Casemiro", "Centrocampista", 30));
        availablePlayers.add(new Player("Pogba", "Centrocampista", 25));
        availablePlayers.add(new Player("Pedri", "Centrocampista", 20));
        availablePlayers.add(new Player("Gavi", "Centrocampista", 5));

        availablePlayers.add(new Player("Ramos", "Defensa", 40));
        availablePlayers.add(new Player("Pique", "Defensa", 30));
        availablePlayers.add(new Player("Varane", "Defensa", 25));
        availablePlayers.add(new Player("Alaba", "Defensa", 20));
        availablePlayers.add(new Player("Araujo", "Defensa", 15));
   
        availablePlayers.add(new Player("Casillas", "Portero", 40));
        availablePlayers.add(new Player("Oblak", "Portero", 30));
        availablePlayers.add(new Player("Neuer", "Portero", 20));

        int initialBudget = 200;

        FantasyGameController gameController = new FantasyGameController(availablePlayers, initialBudget);

        System.out.println("¡Bienvenido al juego de fantasy de fútbol 5. Elige tu cinco ideal! Tu saldo es de: " + initialBudget );

        gameController.choosePlayers();
        gameController.removePlayers();

        System.out.println("Gracias por jugar. Este es tu equipo final:");
        gameController.fantasyTeam.displayTeam();
    }
}

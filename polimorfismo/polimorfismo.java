public class polimorfismo{
    public static void main(String[] args) {
        Vehiculo[] flota = new Vehiculo[5];

        for (int i = 0; i < flota.length; i++) {
            if (i % 2 == 0) {
                flota[i] = new Motocicleta();
            } else {
                flota[i] = new Automovil();
            }
        }

        for (Vehiculo vehiculo : flota) {
            vehiculo.acelerar();
            vehiculo.frenar();

            if (vehiculo instanceof Automovil) {
                ((Automovil) vehiculo).abrirPuertas();
                System.out.println("Antiguedad:  "+ vehiculo.getAntiguedad() + " años");

            } else if (vehiculo instanceof Motocicleta) {
                System.out.println("Antiguedad:  "+ vehiculo.getAntiguedad() + " años");
                ((Motocicleta) vehiculo).hacerCaballito();
            }

            if (vehiculo.getAntiguedad() > 5) {
                System.out.println("El vehículo necesita un mantenimiento especial");
                vehiculo.mantenimiento();
            }
        }
}
}
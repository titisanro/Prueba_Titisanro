interface Vehiculo {
    void acelerar();
    void frenar();
    default void mantenimiento() {
        System.out.println("Realizando mantenimiento...");
    }
    int getAntiguedad();
}
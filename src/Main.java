//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Servidor s1 = new Servidor("ServidorWeb", "192.168.1.20");
    Servidor s2 = new Servidor("ServidorDB", "192.168.1.50");
    Servidor s3 = new Servidor("ServidorBackup", "192.168.1.100");

    // Activamos dos servidores
    s1.activar();
    s2.activar();

    // Intentar activar dos veces el mismo para comprobar que el contador no se altere incorrectamente
    s1.activar();

    System.out.println("Servidor ID " + s1.getId() + ": " + s1.getNombre() + "\nIP: " + s1.getDireccionIP() + "\nActivo: " + s1.isActivo());
    System.out.println("Servidor ID " + s2.getId() + ": " + s2.getNombre() + "\nIP: " + s2.getDireccionIP() + "\nActivo: " + s2.isActivo());
    System.out.println("Servidor ID " + s3.getId() + ": " + s3.getNombre() + "\nIP: " + s3.getDireccionIP() + "\nActivo: " + s3.isActivo());

    System.out.println("\nTotal de servidores creados: " + Servidor.getTotalServidores());
    System.out.println("Total de servidores activos: " + Servidor.getServidoresActivos());
}

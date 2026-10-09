package main;

import prototype.Personaje;
import registry.RegistroPrototipos;

public class Main {

    public static void main(String[] args) {
        RegistroPrototipos registro = new RegistroPrototipos();

        // Prototipo 1: Zombi
        Personaje zombi = new Personaje("Zombi", "Mob hostil");
        zombi.getInventario().agregarItem("Espada de hierro");
        zombi.getInventario().agregarItem("Casco de hierro");
        registro.registrarPrototipo("Zombi", zombi);

        // Prototipo 2: Esqueleto
        Personaje esqueleto = new Personaje("Esqueleto", "Mob hostil");
        esqueleto.getInventario().agregarItem("Arco");
        esqueleto.getInventario().agregarItem("Casco de cuero");
        registro.registrarPrototipo("Esqueleto", esqueleto);

        System.out.println("----------------PROTOTIPOS ORIGINALES------------");
        System.out.println(registro.consultarPrototipo("Zombi"));
        System.out.println(registro.consultarPrototipo("Esqueleto"));

        // Clonaciones
        Personaje zombiCopia = registro.obtenerCopia("Zombi");
        zombiCopia.setNombre("Zombi-Copia");

        Personaje esqueletoCopia = registro.obtenerCopia("Esqueleto");
        esqueletoCopia.setNombre("Esqueleto-Copia");

        // Modificación del inventario de una copia
        zombiCopia.getInventario().agregarItem("Peto de diamante");
        zombiCopia.getInventario().agregarItem("Botas de netherita");

        System.out.println("\nCOPIAS");
        System.out.println(zombiCopia);
        System.out.println(esqueletoCopia);

        System.out.println("\n----------------PROTOTIPOS DESPUES DE MODIFICAR LA COPIA-----------------------");
        System.out.println(registro.consultarPrototipo("Zombi"));
        System.out.println(registro.consultarPrototipo("Esqueleto"));

        // Prototipo inexistente
        System.out.println("\nPROTOTIPO INEXISTENTE");
        Personaje creeper = registro.obtenerCopia("Creeper");
        if (creeper == null) {
            System.out.println("No existe el prototipo \"Creeper\", no se clona.");
        }
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {

        /*
          Dobbiamo essere dei ninja:
            - nella dichiarazione dei metodi (void, String, cosa va nelle parentesi, return oppure no...)
            - la creazione di classi ed oggetti
            - manipolazione di array
            - almeno il ciclo for i
         */

        /*
        Inventiamoci un registro di studenti
        Creiamo una classe student con 2-3 metodi - uno void, uno con dei parametri, uno che ritorna qualcosa, uno che stampa...
        Mi faccio qualche studente e lo metto dentro un array (il registro)
        Provo a iterare questo array e gioco
         */

        Student[] registry = new Student[3];
        registry[0] = new Student("Carlo", "Casiglia");
        registry[1] = new Student("Riccardo", "Giacalone");
        registry[2] = new Student("Mario", "Rossi");

        for (int i=0; i< registry.length; i++) {
            registry[i].printDetails();
        }

        String[] fullNames = new String[3];
        for (int i=0; i< registry.length; i++) {
            fullNames[i] = registry[i].fullName();
        }

        for (int i=0; i< registry.length; i++) {
            System.out.println(fullNames[i]);
        }

        System.out.println("6 per 7 = " + registry[2].multiply(6, 7) + " più 2 44");

    }
}
import java.util.Date;

import static UIMenu.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        //showMenu();
        Doctor myDoctor = new Doctor("Gabriel Lerda", "lerda.gabriel@gmail.com");
        myDoctor.addTurnoDisponible(new Date(), "4pm");
        myDoctor.addTurnoDisponible(new Date(), "10am");

        System.out.println(myDoctor);
        /*for (Doctor.TurnosDisponibles disponibles : myDoctor.getTurnosDisponibles()) {
            System.out.println(disponibles.getDate() + " " + disponibles.getTime());
        }*/

        Patient patient = new Patient("Mili Bazan", "mili.bazan@gmail.com");
        System.out.println(patient.toString());
    }
}
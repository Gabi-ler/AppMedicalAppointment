import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    //atributo
    private String speciality;

    Doctor(String name, String email){
        super(name, email);
        System.out.println("El nombre del doctor asignado es: " + name);
        //this.name = name;
        this.speciality = speciality;
    }

    //comportamiento
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    /*Coleccion de objetos de turnos isponibles*/
    ArrayList<TurnosDisponibles> turnosDisponibles = new ArrayList<>();

    /**Metodo que va estar añadiendo muchas citas disponibles que se van a acumular en el array */
    public void addTurnoDisponible(Date date, String time){
        turnosDisponibles.add(new Doctor.TurnosDisponibles(date,time));
    }

    /*devuelve el arrays de los turnos agregados */
    public ArrayList<TurnosDisponibles> getTurnosDisponibles() {
        return turnosDisponibles;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality" + speciality + "\nAvailable: "+ turnosDisponibles.toString();
    }

    //clase independiente estatica
    public static class TurnosDisponibles{
        //citas disponibles
        private int id;
        private Date date;
        private String time;

        public TurnosDisponibles(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available appointments \nDate: "+date + "\nTime: " + time;
        }
    }
}



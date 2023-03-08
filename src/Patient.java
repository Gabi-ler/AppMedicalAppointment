//todo lo que este dentro de la clase y se lo haga privado se le llama encapsulamiento porque no se puede
//modificar desde ningun otro lado que no sea ese
public class Patient extends User {
    //atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    Patient(String name, String email){
        super(name, email);//alt+enter
        //this.name = name;
        //this.email = email; cn super estos dos this ya no me hacen falta
        //mas instrucciones
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    //con esto quiero me devuelva siempre el mismo dato
    public String getWeight(){
        return this.weight + " Kg. ";
    }

    public String getHeight() {
        return this.height + " Mtrs. ";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }


    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday+ "\nPeso: " + getWeight() + "\nAltura: " + getHeight() + "\nFactor de sangre: " + blood;
    }
}

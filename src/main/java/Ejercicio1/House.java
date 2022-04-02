package Ejercicio1;

public class House {
    String Ncasa;
    String Npasaje;
    String nombreC;

    public String getNcasa() {
        this.Ncasa=("27A");
        return this.Ncasa;
    }


    public String getNpasaje() {
        this.Npasaje=("12");
        return Npasaje;
    }

    public String getNombreC() {
        this.nombreC=("Los Manzanos");
        return this.nombreC;
        
    }
    

    public House(String Ncasa, String Npasaje, String nombreC) {
        this.Ncasa = Ncasa;
        this.Npasaje = Npasaje;
        this.nombreC = nombreC;
    }
    public House () {
        
    }
    

}

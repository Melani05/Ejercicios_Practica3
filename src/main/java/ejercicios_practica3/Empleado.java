package ejercicios_practica3;

public class Empleado {

    int nit;
        String nombre, apellidos;
        String direccion;
        double Sdevengado;
        double SconDescuento;
        String Bempl;

        public Empleado(){
            
        }
        
        public Empleado ( int nit, String nombre, String apellidos, double Sdevengado, double SconDescuento, String Bempl ){
            this.nit = nit;
            this.nombre = nombre;
            this.apellidos = apellidos;
            this.Sdevengado = Sdevengado;
            this.SconDescuento = SconDescuento;
            this.Bempl = Bempl;
        }    

    public int getNit() {
        return nit;
    }

    public void setNit(int nit) {
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getSdevengado() {
        return Sdevengado;
    }

    public void setSdevengado(double Sdevengado) {
        this.Sdevengado = Sdevengado;
    }

    public double getSconDescuento() {
        return SconDescuento;
    }

    public void setSconDescuento(double SconDescuento) {
        this.SconDescuento = SconDescuento;
    }

    public String getBempl() {
        return Bempl;
    }

    public void setBempl(String Bempl) {
        this.Bempl = Bempl;
    }
    
    public String info_Emplead(){
        String name = " ";
        name = this.nombre +""+ this.apellidos;
        return name;
    }
    
    public String info_Emplead (String a, String b){
        String name= "";
        name = a + "" + b;
        return name;
    }
    
    public String info_Emplead (Empleado objeto){
        
        String name = "";
        name +=objeto.getNombre() + " " + objeto.getApellidos() + "\n";
        return name;
    }
    
      public String informacion(){
        
        String name = "";
        name += "El NIT del empleado es: " + this.nit +"\n";
        name += "El Nombre del empleado es: " + this.nombre + "\n";
        name += "El Apellido del empleado es: " + this.apellidos + "\n";
        return name;
    }
    
    
        
    }

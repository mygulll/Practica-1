public class Alumno {

    //sección de datos/campos/variables de clase/atributos
    String nombre;
    int calificacion;

    //Método constructor
    public Alumno(String nombre, int calificacion){
        setNombre(nombre);
        setCalificacion(calificacion);
    }

    //Sección de metodos: setters, getters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCalificacion(int calificacion){
        this.calificacion = calificacion;
    }

    public String getNombre(){
        return nombre;
    }

    public int getCalificacion(){
        return calificacion;
    }

}

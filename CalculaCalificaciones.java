import java.util.ArrayList;

public class CalculaCalificaciones {

    //Atributos
    static int sumaCalificaciones = 0;

    //metodos
    public static float calculaPromedio(int calificacionActual, int size){
        sumaCalificaciones += calificacionActual;
        return (float)sumaCalificaciones/size;
    }

    public static int calificacionMayor(ArrayList<Alumno> Alumno){

        int mayor = Alumno.get(0).calificacion;
        for (Alumno alumno : Alumno) {
            if (alumno.calificacion > mayor) {
                mayor = alumno.calificacion;
            }
        }
        return mayor;
    }

    public static int calificacionMenor(ArrayList<Alumno> Alumno){

        int menor = Alumno.get(0).calificacion;

        for(int i = 0; i < Alumno.size()-1; i++){
            if(Alumno.get(i).calificacion < menor)
            {
                menor = Alumno.get(i).calificacion;
            }
        }
        return menor;
    }
}

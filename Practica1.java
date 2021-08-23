import java.util.ArrayList;

public class Practica1 {
    public static void main(String[] args) {
        int optionMenu;
        float promedio = 0;
        String nombreAux;
        int calificacionAux;
        ArrayList <Alumno> AlumnoArrayList = new ArrayList <> ();
        do{
            System.out.println("***Menu***\n1.Captura de nombre y calificaciones \n2.Imprime Calificaciones y promedio de calificaciones" +
                    "\n3.Imprimir Calificaciones y calificacion mas baja\n4.Imprimir Calificaciones y calificacion mas alta" +
                    "\n5.Salir");
            optionMenu = CapturaEntrada.capturarEntero("");

            switch(optionMenu){
                case 1://Captura de datos
                    nombreAux = CapturaEntrada.capturarCadena("Nombre del alumno: ");
                    do{
                        calificacionAux = CapturaEntrada.capturarEntero("Calificacion: ");
                        if (calificacionAux>10 || calificacionAux<0){
                            System.out.println("Ingrese una calificacion en el rango de 0-10");
                        }
                    }while(calificacionAux>10 || calificacionAux<0);
                    AlumnoArrayList.add(new Alumno(nombreAux,calificacionAux));
                    //Se utilizaria esta sola linea de codigo en el caso 1, pero como buscamos validar, deberemos de hacer otras operaciones
                    // AlumnoArrayList.add(new Alumno(CapturaEntrada.capturarCadena("Nombre del alumno: "),CapturaEntrada.capturarEntero("Calificacion: ")));
                    break;
                case 2:
                    //Calificaciones y promedio
                    System.out.println("*** Impresion de datos ***");
                    for(int i = 0; i <= AlumnoArrayList.size()-1; i++){
                        System.out.println("Alumno: " + AlumnoArrayList.get(i).nombre + "\tCalificacion: " + AlumnoArrayList.get(i).calificacion);
                        promedio = CalculaCalificaciones.calculaPromedio(AlumnoArrayList.get(i).calificacion, AlumnoArrayList.size());
                    }
                    System.out.println("Promedio general de los alumnos: " + promedio);
                    break;
                case 3:// Calificaciones y mas baja
                    for(int i = 0; i <= AlumnoArrayList.size()-1; i++){
                        System.out.println("Alumno: " + AlumnoArrayList.get(i).nombre + "\tCalificacion: " + AlumnoArrayList.get(i).calificacion);
                    }
                    System.out.println("Calificacion mas baja: " + CalculaCalificaciones.calificacionMenor(AlumnoArrayList));
                    break;
                case 4:// calificaciones y mas alta
                    for(int i = 0; i <= AlumnoArrayList.size()-1; i++){
                        System.out.println("Alumno: " + AlumnoArrayList.get(i).nombre + "\tCalificacion: " + AlumnoArrayList.get(i).calificacion);
                    }
                    System.out.println("Calificacion mas alta: " + CalculaCalificaciones.calificacionMayor(AlumnoArrayList));
                    break;
                case 5://Salir
                    System.out.println("Gracias por usar este programa :)");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    optionMenu = 0;
                    break;
            }

            System.out.println();
        }while(optionMenu!=5);

    }
}

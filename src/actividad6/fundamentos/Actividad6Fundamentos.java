package actividad6.fundamentos;
import java.util.Scanner; 
/**
 * @author LyrisseC
 */
public class Actividad6Fundamentos {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.nombre = "Lyrisse";
        int[] promedio = promedio(alumno.calificacion);
        int cali = 0;
        double sum;
        String calificacion = calificacion(promedio);
        int arr = 0;
        imprimirCalificacion(alumno, promedio, calificacion);

    }

    public static int[] promedio(Double[] calificacion) {
        
        int promedio = 0;
        int suma = 0; 
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<arr.length;i++){
            System.out.print("Dame una calificacion: ");
            arr[i]=sc.nextInt();
            suma=suma+arr[i];
            promedio=suma/5;
        }
        return arr;
        return promedio;
    }

    public static String calificacion(int promedio) {
        String calificacion = "";
        if (promedio <= 50) {
            calificacion = "F";
        }
        if (promedio >= 51 && promedio <= 60) {
            calificacion = "E";
        }
        if (promedio >= 61 && promedio <= 70) {
            calificacion = "D";
        }
        if (promedio >= 71 && promedio <= 80) {
            calificacion = "C";
        }
        if (promedio >= 81 && promedio <= 90) {
            calificacion = "B";
        }
        if (promedio >= 91 && promedio <= 100) {
            calificacion = "A";
        }
        return calificacion;
    }

    public static void imprimirCalificacion(Alumno alumno, int promedio, String calificacion) {
        System.out.println("Nombre del estudiante: " + alumno.nombre);
        System.out.println("Las calificaciones son: ");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("Promedio: " + promedio);
        System.out.println("Calificación: " + calificacion);
    }    

    private static class arr {

        private static int length;

        public arr() {
        }
    }
}

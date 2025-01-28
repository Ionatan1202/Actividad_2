import java.util.Arrays;
import java.util.Scanner;

public class Actividad_2 {

    static String Nombre = new String ("");


    static int [] Cali = new int [5];

    static double Sum = 0;
    static  double prom = 0;
    static  String resul = "";

    public static void main(String[] args){
        Nombre = "Jonatan Gonzalez";
        Cali[0] = 80;
        Cali[1] = 88;
        Cali[2] = 80;
        Cali[3] = 90;
        Cali[4] = 85;
        promedio();
        result();
        impresion();

    }

    public static Double promedio() {

        for (int i=0; i < Cali.length; i++){
            Sum += Cali[i];
        }
        prom = Sum/ Cali.length;

        return 0.0;
    }

    public static String result(){

       if ((prom <= 50) ) {
            resul = " F ";
        }
        else {
           if ((prom > 51) && (prom < 60)) {
               resul = " E ";
           } else{
               if ((prom > 61) && (prom < 70)) {
                   resul = " D ";
               } else{if ((prom > 71) && (prom < 80)) {
                   resul = " C ";
               } else{
                   if ((prom > 81) && (prom < 90)) {
                       resul = " B ";
                   } else{
                       if ((prom > 91) && (prom < 100)) {
                           resul = " A ";
                       } else;



                   }

               }

               }

           }

       }
        return "";
    }

    public static String impresion(){

        System.out.println("Nombre del estudiante:  "+ Nombre);
        System.out.println("Registro de calificaciones ");
        System.out.printf("Calificacion 1 : "+ Cali[0]);
        System.out.printf("\nCalificacion 2 : "+ Cali[1]);
        System.out.printf("\nCalificacion 3 : "+ Cali[2]);
        System.out.printf("\nCalificacion 4 : "+ Cali[3]);
        System.out.printf("\nCalificacion 5 : "+ Cali[4]);
        System.out.printf("\nPromedio : "+ prom);
        System.out.printf("\nCalificacion Final : " + resul);


        return "";
    }


}

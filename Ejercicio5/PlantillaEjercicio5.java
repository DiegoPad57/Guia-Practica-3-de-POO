package ejercicio5_eval3;
import java.util.Scanner;

public class PlantillaEjercicio5 
{
    public void IngresarDatos()
    {
        Scanner sc = new Scanner(System.in);
        
        double guia = PedirNotas(sc, "Ingrese la nota de la guia: ");
        double cl = PedirNotas(sc, "Ingrese la nota del control de lectura: ");
        double parcial = PedirNotas(sc, "Ingrese la nota del parcial: ");
        
        double NGuia = Guia(guia);
        double Ncl = CLectura(cl);
        double NParcial = Parcial(parcial);
        double promedio = PromedioFinal(NGuia, Ncl, NParcial);
        
        Resultado(promedio, guia, cl, parcial);
    }
    
    public double PedirNotas(Scanner sc, String mensaje)
    {
        System.out.println(mensaje);
        return sc.nextDouble();
    }
    
    public double Guia(double nota)
    {
        return nota * 0.30;
    }
    
    public double CLectura(double nota)
    {
        return nota * 0.10;
    }
    
    public double Parcial(double nota)
    {
        return nota * 0.60;
    }
    
    public double PromedioFinal(double guia, double cl, double parcial)
    {
        return guia + cl + parcial;
    }
    
    public void Resultado(double promedio, double NGuia, double Ncl, double NParcial)
    {
        System.out.println("\nNota de la guia: " + NGuia);
        System.out.println("Nota del control de lectura: " + Ncl);
        System.out.println("Nota del parcial: " + NParcial);
        System.out.println("Promedio final de la 3ra evaluacion: " + promedio);
        
        if(promedio >= 6){
            System.out.println("\n\t***APROBADO***");
        } else {
            System.out.println("\n\t***REPROBADO***");
        }
    }
}

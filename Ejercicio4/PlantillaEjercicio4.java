package ejercicio4_eval3;
import java.util.*;

public class PlantillaEjercicio4 
{
    
    public int Opcion(Scanner sc)
    {   
        System.out.println("\nSeleccione una opcion: ");
        System.out.println("1) Suma \n2) Potencia \n3) Multiplicacion \n4) Raiz");
        System.out.println("Opcion: ");
        return sc.nextInt();
    }
    
    public double PedirNum(Scanner sc, String mensaje)
    {
        System.out.print(mensaje);
        return sc.nextDouble();
    }
    
    public double Suma(double a, double b)
    {
        return a + b;
    }
    
    public double Potencia(double a, double b)
    {
        return Math.pow(a, b);
    }
    
    public double Multiplicacion(double a, double b)
    {
        return a * b;
    }
    
    public String Raices(double a, double b)
    {
        return "Raiz cuadrada del primer numero: " + Math.sqrt(a) + "\nRaiz cubica del segundo numero: " + Math.cbrt(b);
    }
    
    public void MostrarResultados(int opcion, double a, double b)
    {
        switch(opcion)
        {
            case 1:
                System.out.println("La suma es: " + Suma(a, b));
                break;
            case 2:
                System.out.println("La potencia es: " + Potencia(a, b));
                break;
            case 3:
                System.out.println("La multiplicacion es: " + Multiplicacion(a, b));
                break;
            case 4:
                System.out.println(Raices(a, b));
                break;
            default:
                System.out.println("Opcion no valida.");
                break;
        }
    }
    
    public void IngresarDatos()
    {
        Scanner sc = new Scanner(System.in);
        
        for (int i = 1; i <= 5; i++) {
            int opcion = Opcion(sc);
            double n1 = PedirNum(sc, "Ingrese el primer numero: ");
            double n2 = PedirNum(sc, "Ingrese el segundo numero: ");
            
            MostrarResultados(opcion, n1, n2);
        }
    }
}

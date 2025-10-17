package ejercicio2_eval3;
import java.util.*;

public class Ejercicio2_Eval3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Disco Disc1 = new Disco();
        Disco Disc2 = new Disco();
        
        System.out.println("Ingrese la informacion del disco 1: ");
        System.out.println("Titulo: ");
        Disc1.Titulo = sc.nextLine();
        System.out.println("Genero musical: ");
        Disc1.GeneroMusical = sc.nextLine();
        System.out.println("Cantante: ");
        Disc1.Cantante = sc.nextLine();
        System.out.println("Duracion: ");
        Disc1.Duracion = sc.nextLine();
        
        System.out.println("\nIngrese la informacion del disco 2: ");
        System.out.println("Titulo: ");
        Disc2.Titulo = sc.nextLine();
        System.out.println("Genero musical: ");
        Disc2.GeneroMusical = sc.nextLine();
        System.out.println("Cantante: ");
        Disc2.Cantante = sc.nextLine();
        System.out.println("Duracion: ");
        Disc2.Duracion = sc.nextLine();
        
        System.out.println("\t\nInformacion del disco 1: ");
        Disc1.Mostrar();
        
        System.out.println("\t\nInformacion del disco 2:");
        Disc2.Mostrar();
    }
}

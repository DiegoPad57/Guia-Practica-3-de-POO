package reservacionrestaurante;

public class ReservacionRestaurante 
{
    public static void main(String[] args) 
    {
        PlantillaReservacion VMDA = new PlantillaReservacion();
        
        VMDA.NombreCliente = "Veronica Michelle Diaz Alvarado";
        VMDA.TelfCliente = "7172 - 7374";
        VMDA.CantPersonas = 2;
        VMDA.FechaReserva = "16/10/2025";
        VMDA.HoraReserva = "9:45 AM";
        
        System.out.println("\tDATOS DE RESERVACION\n");
        System.out.println("Nombre del cliente: " + VMDA.NombreCliente);
        System.out.println("Telefono del cliente: " + VMDA.TelfCliente);
        System.out.println("Cantidad de personas para la reservacion: " + VMDA.CantPersonas);
        System.out.println("Fecha de reservacion: " + VMDA.FechaReserva);
        System.out.println("Hora de reservacion: " + VMDA.HoraReserva);
    }  
}

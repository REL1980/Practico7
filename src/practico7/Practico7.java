package practico7;
import java.util.ArrayList;
public class Practico7 
{
    public static void main(String[] args) 
    {
        Directorio d = new Directorio();
        //ArrayList<Cliente> clientes = new ArrayList();
        
        d.agregarCliente(5, new Cliente(23,"lopez","mario","San Luis","colon"));
        d.agregarCliente(1, new Cliente(34,"Perez","Pepe","San Luis","San Martin 1568"));
        d.agregarCliente(80, new Cliente(40,"castro","cecilia","cordoba","pringles 45"));
        d.agregarCliente(70, new Cliente(23,"lopez","mario","San Luis","colon"));
        d.agregarCliente(50, new Cliente(23,"lopez","mario","San Luis","colon"));
        d.agregarCliente(60, new Cliente(23,"lopez","mario","San Luis","colon"));
        
        d.listar();
        System.out.println("-------------------");
        
        long a=40;
        d.borrarCliente(a);
        d.listar();
        System.out.println("-------------------");
        
        long tel = 1;
        System.out.println("Cliente encontrado con tel " + tel+": "+ d.buscarCliente(tel).getApellido());
        System.out.println("-------------------");
        String apellido = "lopez";
        System.out.println("El cliente " + apellido+" tiene el/los telefono/s: "+ d.buscarTelefono(apellido));
        System.out.println("-------------------");
        int i = 0;
        String ciudad = "San Luis";
        for(Cliente it: d.buscarClientes(ciudad))
        {
            System.out.println("Clientes que vive en: "+ ciudad);
            System.out.println("Cliente: " + (i+1));
            System.out.println("Apellido: " + d.buscarClientes(ciudad).get(i).getApellido());
            System.out.println("Nombre: " + d.buscarClientes(ciudad).get(i).getNombre());
            System.out.println("Direccion: " + d.buscarClientes(ciudad).get(i).getDireccion());
            System.out.println("-------------------");
            i++;
        }
    }
        
        
        
    
    
}

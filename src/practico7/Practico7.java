package practico7;
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
        d.agregarCliente(100, new Cliente(34,"Perez","Pepe","San Luis","San Martin 1568"));
        d.agregarCliente(800, new Cliente(40,"castro","cecilia","cordoba","pringles 45"));
        d.agregarCliente(801, new Cliente(40,"castro","cecilia","cordoba","pringles 45"));
        d.agregarCliente(802, new Cliente(40,"castro","cecilia","cordoba","pringles 45"));
        d.agregarCliente(803, new Cliente(40,"castro","cecilia","cordoba","pringles 45"));
        
        d.listar();
        System.out.println("-------------------");
        
        long a=40;
        d.borrarCliente(a);
        d.listar();
        System.out.println("-------------------");
        
        long tel = 60;
        System.out.println("Cliente encontrado con tel " + tel+": "+ d.buscarCliente(tel).getApellido());
        System.out.println("-------------------");
        
        String apellido = "castro";
        System.out.println("El cliente " + apellido+" tiene el/los telefono/s: "+ d.buscarTelefono(apellido));
        System.out.println("-------------------");
        
        int i = 0;
        String ciudad = "San Luis";
        System.out.println("Los siguientes clientes viven en "+ ciudad + " : " );
        System.out.println(d.buscarClientes(ciudad).toString());
    }
        
        
        
    
    
}

package practico7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class Directorio 
{
    private TreeMap<Long,Cliente> listaClientes = new TreeMap<Long,Cliente>();
                    //No puedo crear con tipos primitivos
    
    public void agregarCliente(long tel, Cliente cliente) 
    {
        Cliente cliente1 = listaClientes.put(tel, cliente);
        
        if(cliente1 != null)
        {
            System.out.println("cliente no agregado");
        }
    }
    
    public Cliente buscarCliente(long tel) 
    {
        Cliente cliente1 = new Cliente();
        Set<Long> claves = listaClientes.keySet();
        Iterator<Long> it = claves.iterator();
        Long key ;
        while(it.hasNext())
        {
            key=it.next();
            if(key == tel)
            {
                cliente1.setApellido(listaClientes.get(tel).getApellido());
            }
            
        }
        return cliente1;
    }
    
    public ArrayList<Long> buscarTelefono(String apellido) 
    {
        ArrayList<Long> telefonos = new ArrayList();
        Set<Long> claves = listaClientes.keySet();
        Iterator<Long> it = claves.iterator();
        Long key ;
        while(it.hasNext())
        {
            key=it.next();
            if(listaClientes.get(key).getApellido() == apellido)
            {
                telefonos.add(key);
            }
            
        }
        return telefonos;
    }

    public HashSet<Cliente> buscarClientes(String ciudad) 
    {
        HashSet<Cliente> clientes = new HashSet<>();
        Set<Long> claves = listaClientes.keySet();
        
        for(Long it: claves)
        {
            if(listaClientes.get(it).getCiudad().equals(ciudad))
            {
                clientes.add(listaClientes.get(it));
            }
        }

        return clientes;
    }

    public void borrarCliente(long dni) 
    {
        Set<Long> claves = listaClientes.keySet();
        Iterator<Long> it = claves.iterator();
        Long key ;
        
        while(it.hasNext())
        {
            key=it.next();
            if(listaClientes.get(key).getDni() == dni)
            {
                it.remove();
            }
        }
    }
    
    public void listar()
    {
        for(Long it:listaClientes.keySet())
        {
            System.out.print("Tel: "+it+" Dni: " + listaClientes.get(it).getDni());
            System.out.print(" Apellido: " + listaClientes.get(it).getApellido());
            System.out.println();
        }
    }
    
    
}

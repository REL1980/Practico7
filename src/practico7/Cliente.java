package practico7;

public class Cliente 
{
    private long dni;
    private String apellido;
    private String nombre;
    private String ciudad;
    private String direccion;

    public Cliente(long dni, String apellido, String nombre, String ciudad, String direccion) 
    {
        this.dni=dni;
        this.apellido=apellido;
        this.nombre=nombre;
        this.ciudad=ciudad;
        this.direccion=direccion;
    }
    public Cliente()
    {
        
    }

    public void setDni(long dni) 
    {
        this.dni = dni;
    }
    public long getDni() 
    {
        return this.dni;
    }

    public void setApellido(String apellido) 
    {
        this.apellido=apellido;
    }
    public String getApellido() 
    {
        return this.apellido;
    }

    public void setNombre(String nombre) 
    {
        this.nombre=nombre;
    }
    public String getNombre() 
    {
        return this.nombre;
    }

    public void setCiudad(String ciudad) 
    {
        this.ciudad=ciudad;
    }
    public String getCiudad() 
    {
        return this.ciudad;
    }

    public void setDireccion(String direccion) 
    {
        this.direccion=direccion;
    }
    public String getDireccion() 
    {
        return this.direccion;
    }
}

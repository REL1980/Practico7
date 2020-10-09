package practico7;

import java.util.Objects;

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

    @Override
    public String toString() 
    {
        return ("dni: " + dni 
                + ", apellido: " + apellido 
                + ", nombre: " + nombre 
                + ", ciudad: " + ciudad 
                + ", direccion: " + direccion);
    }

    @Override
    public int hashCode() 
    {
        int hash = 7;
        hash = 61 * hash + (int) (this.dni ^ (this.dni >>> 32));
        hash = 61 * hash + Objects.hashCode(this.apellido);
        hash = 61 * hash + Objects.hashCode(this.nombre);
        hash = 61 * hash + Objects.hashCode(this.ciudad);
        hash = 61 * hash + Objects.hashCode(this.direccion);
        return hash;
    }

    @Override
    public boolean equals(Object obj) 
    {
        if (this == obj) 
        {
            return true;
        }
        if (obj == null) 
        {
            return false;
        }
        if (getClass() != obj.getClass()) 
        {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.dni != other.dni) 
        {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) 
        {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) 
        {
            return false;
        }
        if (!Objects.equals(this.ciudad, other.ciudad)) 
        {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) 
        {
            return false;
        }
        return true;
    }
    
    
}

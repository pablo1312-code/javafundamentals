package reflectiontest;

/**
 * Bean para reflectiontest con anotaciones en campos PRIVADOS.
 */
public class Persona {
    @ReflectionBeanValidator.NotNull(message = "Nombre obligatorio")
    private String nombre;
    
    @ReflectionBeanValidator.Min(value = 18, message = "Edad ≥18")
    @ReflectionBeanValidator.Max(value = 120, message = "Edad ≤120")
    private Integer edad;
    
    public Persona() {}
    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() { return nombre; }
    public Integer getEdad() { return edad; }
}


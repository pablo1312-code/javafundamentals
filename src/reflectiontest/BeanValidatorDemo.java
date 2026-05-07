package reflectiontest;

	import java.util.Set;

	/**
	 * Demo: Bean Validation + Reflexión en campos privados.
	 */
	public class BeanValidatorDemo {
	    
	    public static void main(String[] args) {
	        System.out.println("=== reflectiontest: Validación Runtime ===");
	        
	        Persona valida = new Persona("Juan", 25);
	        Persona invalida1 = new Persona(null, 15);
	        Persona invalida2 = new Persona("Ana", 150);
	        
	        validarPersona(valida);
	        validarPersona(invalida1);
	        
	        System.out.println("\n=== REFLEXIÓN PRIVADOS ===");
	        validarConReflexion(invalida2);
	    }
	    
	    private static void validarPersona(Persona p) {
	        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	        Validator validator = factory.getValidator();
	        
	        Set<ConstraintViolation<Persona>> violaciones = (Set<ConstraintViolation<Persona>>) validator.validate(p);
	        
	        if (violaciones.isEmpty()) {
	            System.out.println("✅ " + p.getNombre() + " VÁLIDA");
	        } else {
	            System.out.print("❌ " + p.getNombre() + ": ");
	            for (ConstraintViolation<Persona> v : violaciones) {
	                System.out.print(v.getMessage() + "; ");
	            }
	            System.out.println();
	        }
	        factory.close();
	    }
	    
	    private static void validarConReflexion(Persona p) {
	        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
	        Validator validator = factory.getValidator();
	        
	        // Reflexión demo
	        System.out.println("Campos privados: " + Persona.class.getDeclaredFields().length);
	        
	        Set<ConstraintViolation<Persona>> violaciones = (Set<ConstraintViolation<Persona>>) validator.validate(p);
	        if (!violaciones.isEmpty()) {
	            System.out.print("❌ Reflexión: ");
	            for (ConstraintViolation<Persona> v : violaciones) {
	                System.out.print(v.getPropertyPath() + "=" + v.getMessage() + "; ");
	            }
	            System.out.println();
	        }
	        factory.close();
	    }
	}


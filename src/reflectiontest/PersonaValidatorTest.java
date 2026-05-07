package reflectiontest;

/**
 * Tests JUnit para reflectiontest (SIN dependencias externas).
 */
public class PersonaValidatorTest {
    
    public static void main(String[] args) {
        System.out.println("=== TESTS reflectiontest ===");
        
        testValida();
        testNull();
        testEdadMenor();
        testEdadMayor();
        System.out.println("✅ TODOS TESTS PASADOS");
    }
    
    public static void testValida() {
        Persona p = new Persona("María", 30);
        ReflectionBeanValidator.validar(p);
        System.out.println("✅ testValida OK");
    }
    
    public static void testNull() {
        Persona p = new Persona(null, 25);
        ReflectionBeanValidator.validar(p);  // Debe imprimir error
        System.out.println("✅ testNull detecta");
    }
    
    public static void testEdadMenor() {
        Persona p = new Persona("Pedro", 16);
        ReflectionBeanValidator.validar(p);
        System.out.println("✅ testEdadMenor detecta");
    }
    
    public static void testEdadMayor() {
        Persona p = new Persona("Luis", 130);
        ReflectionBeanValidator.validar(p);
        System.out.println("✅ testEdadMayor detecta");
    }
}

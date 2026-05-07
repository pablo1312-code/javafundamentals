package reflectiontest;

import java.lang.annotation.*;
import java.lang.reflect.Field;

/**
 * reflectiontest: Validación Beans + Reflexión PURA SIN dependencias.
 * Demuestra @NotNull/@Min/@Max en campos PRIVADOS runtime.
 */
public class ReflectionBeanValidator {
    
    // === ANOTACIONES CUSTOM (simulan Bean Validation) ===
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface NotNull {
        String message() default "No puede ser null";
    }
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface Min {
        int value();
        String message() default "Valor muy pequeño";
    }
    
    @Retention(RetentionPolicy.RUNTIME)
    @Target(ElementType.FIELD)
    public @interface Max {
        int value();
        String message() default "Valor muy grande";
    }
    
    public static void main(String[] args) {
        System.out.println("=== reflectiontest: DEMO Reflexión + Validación ===");
        
        // Pruebas integradas
        validar(new Persona("Juan", 25));      // ✅
        validar(new Persona(null, 15));        // ❌ Null + Min
        validar(new Persona("Ana", 150));      // ❌ Max
        
        System.out.println("\n=== REFLEXIÓN: Campos PRIVADOS ===");
        demoReflexionPrivados();
    }
    
    /** Valida objeto vía REFLEXIÓN en campos privados */
    public static void validar(Object obj) {
        try {
            Field[] campos = obj.getClass().getDeclaredFields();
            boolean valida = true;
            
            for (Field campo : campos) {
                campo.setAccessible(true);
                Object valor = campo.get(obj);
                
                // @NotNull
                if (campo.isAnnotationPresent(NotNull.class) && valor == null) {
                    System.out.println("❌ " + campo.getName() + ": " + 
                        campo.getAnnotation(NotNull.class).message());
                    valida = false;
                }
                
                // @Min
                if (campo.isAnnotationPresent(Min.class)) {
                    Min min = campo.getAnnotation(Min.class);
                    if (valor instanceof Number && ((Number)valor).intValue() < min.value()) {
                        System.out.println("❌ " + campo.getName() + ": " + min.message() + 
                            " (≥" + min.value() + ")");
                        valida = false;
                    }
                }
                
                // @Max
                if (campo.isAnnotationPresent(Max.class)) {
                    Max max = campo.getAnnotation(Max.class);
                    if (valor instanceof Number && ((Number)valor).intValue() > max.value()) {
                        System.out.println("❌ " + campo.getName() + ": " + max.message() + 
                            " (≤" + max.value() + ")");
                        valida = false;
                    }
                }
            }
            if (valida) System.out.println("✅ " + obj.getClass().getSimpleName() + " VÁLIDA");
        } catch (Exception e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
    
    static void demoReflexionPrivados() {
        Persona p = new Persona("Luis", 130);
        System.out.println("🔍 Campos privados: " + Persona.class.getDeclaredFields().length);
        ReflectionBeanValidator.validar(p);
    }
}
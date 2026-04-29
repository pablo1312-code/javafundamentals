package reflection;

import oopmodeling.addressbook.AddressBook;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException {
        // Cargar la clase de tres formas distintas
        Class<AddressBook> cls1 = AddressBook.class;
        Class<AddressBook> cls2 = (Class<AddressBook>) new AddressBook().getClass();
        Class<?> cls3 = Class.forName("oopmodeling.addressbook.AddressBook");

        inspectClass(cls1);
    }

    private static void inspectClass(Class<?> cls) {
        Method[] ms = cls.getDeclaredMethods();

        for (int i = 0; i < ms.length; i++) {
            Method m = ms[i];

            // Imprimir nombre del método
            System.out.println("method name is " + m.getName());

            // Imprimir cada parámetro y su tipo
            Parameter[] params = m.getParameters();
            for (int j = 0; j < params.length; j++) {
                Parameter p = params[j];
                System.out.println(
                    "  param " + j + " name is " + p.getName() +
                    ", type is " + p.getType().getName()
                );
            }
        }
    }
}
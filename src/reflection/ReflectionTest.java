package reflection;

import oopmodeling.addressbook.AddressBook;
import oopmodeling.addressbook.Contact;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionTest {

    public static void main(String[] args) throws ClassNotFoundException {
        // Cargar la clase de tres formas distintas
        Class<AddressBook> cls1 = AddressBook.class;
        Class<AddressBook> cls2 = (Class<AddressBook>) new AddressBook().getClass();
        Class<?> cls3 = Class.forName("oopmodeling.addressbook.AddressBook");

        inspectClass(cls1);
        
        AddressBook addressBook = new AddressBook();
    }
    
    private static void invokeConstructorsOfAnObject(Class<?> cls) {
    	try {
			cls.getConstructor().newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    
    private static void invokeMethodsOfAnObject(Object obj) {

		Class<?> cls1 = obj.getClass();

		try {

			Method method = cls1.getDeclaredMethod("getName");

			try {

				method.invoke(obj, null);

			} catch (IllegalAccessException | InvocationTargetException e) {

				// TODO Auto-generated catch block

				e.printStackTrace();

			}

		} catch (NoSuchMethodException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		} catch (SecurityException e) {

			// TODO Auto-generated catch block

			e.printStackTrace();

		}

	}
    private static void manipulateObject(AddressBook addressBook) {
    	Class<?> cls1 = addressBook.getClass();
    	Field[] fields = cls1.getDeclaredFields();
    	try {
    		Field field = cls1.getDeclaredField("phoneNumber");
    		System.out.println(addressBook.getPhoneNumber());
    		
    		
    		//read the value of a specified field
    		
    		
    		//modify the value of a field of the object 
    		field.set(fields, field);
    		
    	} 
    	
    	
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
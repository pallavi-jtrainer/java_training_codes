package reflectionAPIPack;

import java.lang.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/*
 * java.lang.Class methods
 * getName() -> returns name of class
 * getModifiers() ->returns an integer -> passed to toString(int)
 * getSuperClass()
 * getInterfaces() -> returns an Class[]
 * 
 * java.lang.reflect.Field methods
 * getDeclaredFields()
 * getName()
 * Modifer.toString(getModifiers())
 * 
 * java.lang.reflect.Method
 * getDeclaredMethods() -> Method[]
 * getName();
 * getReturnType();
 * getParameterTypes() -> Class[]
 */
class Demo{}

public class ReflectionClassDemo extends Demo{
	public int var;
	private String name;

	public int add(int a, int b) {
		return a + b;
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException {
		Class obj = ReflectionClassDemo.class;
		
		ReflectionClassDemo ref =  new ReflectionClassDemo();
		
		Class obj1 = ref.getClass();
		
		System.out.println(obj.getName());
		
		System.out.println("Super: " + obj.getSuperclass());
		
		Field[] field1 = obj1.getDeclaredFields();
				
		for(Field f : field1) {
			System.out.println("Variable name: " + f.getName());
			System.out.println("Datatype: " + f.getType());
			
			int accessMod = f.getModifiers();
			System.out.println("Access Modifier: " + Modifier.toString(accessMod));
			
			
		}

		Method[] methods = obj1.getDeclaredMethods();
		
		for(Method m: methods) {
			System.out.println("Method Name: " + m.getName());
			System.out.println("Return Type: " + m.getReturnType());
			
			int accessMod = m.getModifiers();
			System.out.println("Access Modifier: " + Modifier.toString(accessMod));
			
			Class[] paramList = m.getParameterTypes();
			for(Class c : paramList) {
				System.out.println("Parameters: " + c.getName() + " ");
			}
			
		}
		
		Annotation[] annotations = obj1.getAnnotations();
		
		
	}

}

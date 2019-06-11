package main.java.LizzyMendivil.classes;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person juan = new Person("Juan");
		// juan.name = "Juan";
		// juan.ci = "123456 or";
		
		juan.walk(); // polimorfismo, habilidad q tiene los objectos de comportarse de diferentes maneras al mismo mensaje
		juan.walk(10);
		
		// System.out.println(juan.name);
		// System.out.println(juan.ci);
		
		Person pedro = new Person("Pedro");
		// pedro.name = "Pedro";
		// pedro.ci = "123456 sc";
		
		// pedro.walk(); // instance method
		// class method, para manejar informacion colectiva
		
		// Person.printName();
		// puedes conseguir polimorfismo haciendo sobrecarga de un m'etodo
		// grado de accesibilidad: encapsulacion
		// modificadores de acceso, default, private, public, protected

	}

}

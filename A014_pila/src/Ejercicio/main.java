package Ejercicio;

public class main {

	public static void main(String[] args) {
		Pila pila=new Pila();
		pila.push(6.5);
		pila.push(true);
		pila.push("hola");
		pila.push("C");
		pila.push("J");
		
		System.out.println(pila.pop()); //primero pila 
		System.out.println(pila.pop()); //devuleve true

		System.out.println(pila.peek());
		System.out.println(pila.size());
		
		while(pila.empty()==false){ //muestra todo los valores si esta vacia devulve un true
			System.out.println(pila.pop());
		}
		System.out.println(pila.pop());
		
	}	

}

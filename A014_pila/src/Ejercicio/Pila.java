package Ejercicio;
import java.util.ArrayList;
public class Pila {
	private ArrayList<Object> pila= new ArrayList();
	
	public void pila() {
		pila=new ArrayList();
	}

	public void push(Object o) {
		pila.add(o);
		
	}
	
	//quitar y retornar el elemento en la parte superior de una pila de objetos.
	public Object pop() {
		if(!pila.isEmpty()) { 
			Object o=pila.get(pila.size()-1); //te lo devuleve si no esta vacia
			pila.remove(pila.size()-1); //lo elimina
			return o;
		}else {
			return true; //si esta vacia retorna un true
		}
	}	
	//si la pila no está vacía utilizando  devuelve el objeto en la posición,que esta y la elimina no está vacía. 
	//si esta vacia retorna un  true
	
	//devuelve el último elemento de una lista
	public Object peek() {
		if (!(pila.isEmpty())) {
			return pila.get(pila.size()-1);	
		} else {
			
		}
		return pila;		
	}
	//verifica si la pila no está vacía
	//Si la pila no está vacía, devuelve el último elemento de la lista
	
	public Boolean empty() {
		return pila.isEmpty();	
	}
	
	 public int size() {
	        return pila.size();
	 }
}
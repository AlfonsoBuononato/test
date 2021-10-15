package main;

import java.util.ArrayList;
import java.util.List;

import figli.Studente;
import test.Persona;

public class Main {

	public static void main(String[] args) {
		Persona p1 = new Studente("alfonso", "buononato");
		Persona p2 = new Persona("nicola", "bianchi");
		Persona p3 = new Persona("francesco", "rossi");
		Studente s1 = new Studente("nicola", "berlusconi");
		System.out.println(Persona.ciao);
		p2.ciao = "sono io";
		System.out.println(p2.ciao);
		System.out.println(p3.ciao);
		
		
		
		
		
		/*if(p1 instanceof Studente) {
			Studente p2 = (Studente)p1;
			System.out.println(p2.stampa("alfonso", null));
		}*/
		
	}

}

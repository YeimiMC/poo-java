package entidades;

public class Test {

	public static void main(String[] args) {
		//Instancia de un empleado (que hereda de Persona)
		Empleado EvilFelipe = new Empleado("Evil Felipe", 31, "evilFelipe@gmail.com", "5544332211", "abc123", "98765432134", "Bell Boy");
		
		EvilFelipe.mostrarInformacion();
		

	}

}

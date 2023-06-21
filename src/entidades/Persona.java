package entidades;

public class Persona {
	
	//Para crear nuestro primer objeto
	
		// 1. Propidades o atributos
		
		//Clases generales
		public String nombre;
		public int edad;
		public String correo;
		public String telefono;
		
		
		// 2. Constructor (con 4 parámetros)
		public Persona (String nombre, int edad, String correo, String telefono) {
			this.nombre = nombre;
			this.edad = edad;
			this.correo = correo;
			this.telefono = telefono;
		} //Cierre del constructor
		
		
		//Sobrecarga de métodp (overloading) constructor con 3 parámetros
		public Persona (String nombre, int edad, String correo) {
			this.nombre = nombre;
			this.edad = edad;
			this.correo = correo;
		}
		
		//Sobrecarga de métodp (overloading) constructor con 2 parámetros
				public Persona (String nombre, int edad) {
					this.nombre = nombre;
					this.edad = edad;
				}
		
		
		// 3. Métodos
		public void mostrarInformacion() {
			System.out.println("Nombre: " + nombre);
			System.out.println("Edad: " + edad);
			System.out.println("Correo: " + correo);
			System.out.println("Telefono: " + telefono);
		} //Cierre de mostrar información
		
	
		//Método main es una función "ejecutora"
		public static void main(String[] args) {
			
			//Instancia de un objeto Persona
			Persona Felipe = new Persona("Felipe", 31, "felipe.maqueda@idr.edu.mx", "5512345678");
			
			Felipe.mostrarInformacion();
			
Persona Pancho = new Persona("Pancho", 29, "pancho.panteraa@gmail.com"); //segundo constructor
			
			Pancho.mostrarInformacion();
			
Persona Simon = new Persona("Simon", 30); //tercer constructor
			
			Simon.mostrarInformacion();
			
//Persona Julia = new Persona("Julia");
//no se puede instanciar porque no hay un constructor con un solo parámertro
			
			//Julia.mostrarInformacion();
			
Persona Ursula = new Persona("Ursula", 33, "ursulita93@outlook.com", "5509876543");
			
			//Uso del método mostrarInformacion que pertenece al objeto Felipe
			Ursula.mostrarInformacion();
			

		}

}//Cierre de clase persona

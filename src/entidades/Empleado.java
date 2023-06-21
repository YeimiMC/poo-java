package entidades;

//Primero tengo que darle la instrucción de que quiero heredar
public class Empleado extends Persona {
	
	//1. Atributos o propiedades
	
	public String numEmpleado;
	public String nss;
	public String puesto;
	
	
	//2. Constructos con parámetros (heredamos "la mitad" del constructor de Persona
	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono); //nos indica qué fue lo que heredamos
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	//Heredar constructores sobrecargados
	
	public Empleado(String nombre, int edad, String correo, String numEmpleado, String nss, String puesto) {
		super(nombre, edad, correo);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	//Preguntar a Felipe por qué no  me salen solo las dos opciones de constructor
	
	
	// 3. Metodo para imprimirInformacion empleado
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Correo: " + correo);
        System.out.println("Telefono: " + telefono);
        System.out.println("Numero Empleado: " + numEmpleado);
        System.out.println("Numero Seguro Social: " + nss);
        System.out.println("Puesto: " + puesto);
    }//cierre mostrarInformación



}



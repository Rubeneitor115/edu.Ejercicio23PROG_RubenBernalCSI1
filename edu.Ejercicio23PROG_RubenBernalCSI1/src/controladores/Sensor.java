/**
 * Rubén Bernal Ramos, CSI1
 */

package controladores;

/**
 * Clase Sensor que representa un sensor de temperatura en grados Celsius
 * @author rbr - 291024
 *
 */
public class Sensor {

	//Atributos
	private double lectura;
	
	/**
	 * Método actualizarLectura que acepta un parámetro de tipo double y asigna ese valor al atributo lectura
	 * rbr - 291024
	 * @param nuevaLectura
	 */
	private void actualizarLectura(double nuevaLectura) {
		lectura = nuevaLectura;
	}
	
	/**
	 * Método obtenerLectura que devuelve el valor actual de lectura
	 * rbr - 291024
	 * @return lectura
	 */
	public double obtenerLectura() {
		return lectura;
	}
	
	/**
	 * Método mostrarLectura que imprime en consola el valor de lectura
	 * rbr - 291024
	 */
	protected void mostrarLectura() {
		System.out.println(lectura);
	}
	
	/**
	 * El método "obtenerLectura" se podrá llamar desde cualquier parte del proyecto incluido desde otro paquete
	 * instanciando la clase.El método "actualizarLectura" solo será accesible desde la clase actual (Sensor) además del atributo "lectura". Sin embargo, el método
	 * "mostrarLectura" solo será accesible desde cualquier clase que se encuentre en el paquete actual (controladores)
	 * 
	 * rbr - 291024
	 */
}

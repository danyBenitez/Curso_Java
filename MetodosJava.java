public class MetodosJava {

	// Retorna un valor
	// 1 - acceso si es publico, privado , protegido 
	// 2 - Si retorna un valor   
	// 3-  nombre del método
	// 4-  Argumentos del método  Entre los ()  
	public Integer sumaNumeros(Integer numero1) {
		return numero1;
	}

	// Método que no retorna valor
	// La palabra (void) significa que es método que no retorna valores
	// 1 -  acceso si es publico, privado , protegido 
	// 2 -  Si retorna un valor   
	// 3 -  nombre del método
	// 4 -  Argumentos del método
	public void restaNumeroSinRetorno(Integer numero1, Integer numero2) {
		System.out.println(numero1-numero2);
	}
	
	
	public static void main(String[] args) {
		
		// ( new ) significa que estamos crando un objeto
		MetodosJava objeto = new MetodosJava();
		// Asi se invoca un método que retorna un dato 
		Integer suma = objeto.sumaNumeros(2);
		// No regresa datos
		objeto.restaNumeroSinRetorno(20, 1);
		
		
		
		System.out.println("Método que retona valor => "+suma);
	}

}

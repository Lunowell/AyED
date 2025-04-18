package Practica1.ej3;

public class Test {

		public static void main (String[] args) {
			
			Estudiante vecEstudiantes[] = new Estudiante[2];
	        Profesor vecProfesores[] = new Profesor[3];
		
	        vecEstudiantes[0] = new Estudiante ("Lucia", "nowell", "lu@gmail.com", "3D", "calle 56 675");
	        vecEstudiantes[1] = new Estudiante ("Marco", "Castelli", "marco@gmail.com", "4H", "calle 45 356");
	        
	        vecProfesores[0] = new Profesor ("Pedro", "Rodriguez", "pepe@gmail.com", "FOD", "UNLP");
	        vecProfesores[1] = new Profesor ("Rodolfo", "Bertone", "rodo@gmail.com", "DBD", "UNLP");
	        vecProfesores[2] = new Profesor ("Sofia", "Rodriguez", "sofi@gmail.com", "OO1", "UNLP");
	        
	        int i,j;
	        
	        for(i=0; i<2; i++) {
	            System.out.println(vecEstudiantes[i].tusDatos());
	        }
	        
	        for(j=0; j<3; j++) {
	            System.out.println(vecProfesores[j].tusDatos());
	        }
		}
		
}

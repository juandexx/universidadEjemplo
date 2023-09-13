
package UniversidadMain;

import java.time.LocalDate;
import universidadejemplo.AccsesoADatos.AlumnoData;
import universidadejemplo.Entidades.Alumno;


public class Universidadulp {

    
    public static void main(String[] args) {
       Alumno juan=new Alumno("Lopez","Carlos",39102333,LocalDate.of(1992, 4, 15),true);
       AlumnoData alu=new AlumnoData();
       alu.guardarAlumno(juan);
       
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadejemplo.AccsesoADatos;

import java.sql.Connection;
import java.util.List;
import universidadejemplo.Entidades.Alumno;
import universidadejemplo.Entidades.Inscripcion;
import universidadejemplo.Entidades.Materia;

/**
 *
 * @author juand
 */
public class InscripcionData {
    private Connection con;
    private MateriaData matData;
    private AlumnoData aluData;

    public InscripcionData() {
    }
    public void giardarInscripcion (Inscripcion insc){}
    public List <Inscripcion> obtenerInscripciones(){}
    public List <Inscripcion> obtenerInscripcionesPorAlumno(int id){}
    public List <Materia> obtenerMateriasCursadas (int id){}
    public List <Materia> obtenerMateriasNOCursadas (int id){}
    public void borrarInscripcionMateeriaAlumno(int idAlumno, int idMateria){}
    public void actualizarNota(int idAlumno, int idMateria, double nota){}
    public List <Alumno> obtenerAlumnosXMateria(int idMateria){}
    
}

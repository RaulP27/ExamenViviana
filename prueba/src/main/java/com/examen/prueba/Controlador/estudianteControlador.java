package com.examen.prueba.Controlador;

import com.examen.prueba.Entidades.Estudiante;
import com.examen.prueba.Servicios.estudianteServicio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class estudianteControlador {

    estudianteServicio estud = new estudianteServicio();

    //Mostrar estudiantes
    @GetMapping("/listarestudiantes")
    public ArrayList<Estudiante> listar(){
        return estud.listarEstudiantes();
    }

    //Actualizar estudiante
    @PostMapping("/actualizarestudiante")
    public String actualizar(@RequestBody Estudiante estudiante){
        return estud.actualizar(estudiante);
    }

    //Eliminar estudiantes por curso
    @DeleteMapping("/eliminarestudiante/{cur}")
    public String eliminar(@PathVariable("cur") int curso){
        return estud.eliminar(curso);
    }
}

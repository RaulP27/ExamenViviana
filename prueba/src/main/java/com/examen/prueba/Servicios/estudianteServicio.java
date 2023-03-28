package com.examen.prueba.Servicios;

import com.examen.prueba.Entidades.Estudiante;

import java.util.ArrayList;

public class estudianteServicio {

    ArrayList<Estudiante> listaEst = new ArrayList<>();

    public estudianteServicio(){
        //ArrayList Estudiantes
        listaEst.add(new Estudiante(10,79,"Santiago","Marcelo",new String[] {"Matematicas","Español","Ingles"},new float[] {4.5f,4,5}));
        listaEst.add(new Estudiante(11,88,"Samuel","Araque",new String[] {"Matematicas","Sociales","Ingles"},new float[] {3.5f,3,2.5f}));
        listaEst.add(new Estudiante(9,91,"Felipe","Lopez",new String[] {"Ciencias","Español","Ingles"},new float[] {5,4.5f,5}));
        listaEst.add(new Estudiante(10,31,"Ana","Garcia",new String[] {"Matematicas","Español","Sociales"},new float[] {4.2f,4.3f,3.5f}));
        listaEst.add(new Estudiante(9,102,"Mauricio","Gonzales",new String[] {"Matematicas","Ciencias","Ingles"},new float[] {4.6f,3.2f,4}));
        listaEst.add(new Estudiante(10,120,"Camila","Guitierrez",new String[] {"Matematicas","Sociales","Ingles"},new float[] {4.1f,4.3f,4.5f}));
        listaEst.add(new Estudiante(11,110,"Oscar","Mendez",new String[] {"Ciencias","Español","Ingles"},new float[] {4.5f,4,3.4f}));
        listaEst.add(new Estudiante(11,134,"Marcus","Callagh",new String[] {"Sociales","Español","Ingles"},new float[] {4.5f,4,5}));
        listaEst.add(new Estudiante(10,95,"Federico","Perez",new String[] {"Matematicas","Español","Ciencias"},new float[] {4.5f,4,5}));
        listaEst.add(new Estudiante(9,97,"Luna","Garcia",new String[] {"Matematicas","Español","Sociales"},new float[] {4.5f,4,5}));
    }

    //Listar Estudiantes
    public ArrayList<Estudiante> listarEstudiantes(){
        return listaEst;
    }

    //Actualizar Estudiante Curso y Estudiante
    public String actualizar(Estudiante estudiante){
        boolean resp= false;

        for (Estudiante est2:listaEst){
            if(est2.getCodigo() == estudiante.getCodigo()){
                est2.setCurso(estudiante.getCurso());
                est2.setNotas(estudiante.getNotas());

                resp = true;
            }
        }
        //Condicion aprobacion
        String respuesta ="";
        if(resp == true){
            respuesta = "Se ha realizado la actualizacion del estudiante";
        }else{
            respuesta = "No se ha realizado ninguna actualizacion de estudiante";
        }
        return respuesta;
    }

    //Eliminar por Curso
    public String eliminar(int curso){

        Boolean cond = false
        String eliminacion = "";
        ArrayList<Estudiante> listaCurso = new ArrayList<>();

        for(Estudiante est: listaEst){
            if(est.getCurso() == curso){
                listaCurso.add(est);
                cond = true;
            }
        }

        if(cond == true){
            for(Estudiante e:listaCurso){
                listaEst.remove(e);
            }
            eliminacion = "Eliminacion exitosa";
        }else{
            eliminacion = "No se ha reliazado ninguna eliminacion";
        }

        return eliminacion;
    }
}

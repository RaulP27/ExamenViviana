package com.examen.prueba.Entidades;

import java.util.ArrayList;

public class Estudiante {

    private int curso;
    private int codigo;
    private String nombre;
    private String apellido;
    private String[] materias;
    private float[] notas;

    public Estudiante(int curso, int codigo, String nombre, String apellido, String[] materias, float[] notas) {
        this.curso = curso;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.materias = materias;
        this.notas = notas;
    }

    public int getCurso() {
        return curso;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String[] getMaterias() {
        return materias;
    }

    public float[] getNotas() {
        return notas;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public void setNotas(float[] notas) {
        this.notas = notas;
    }
}


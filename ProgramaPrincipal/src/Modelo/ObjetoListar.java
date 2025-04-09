package Modelo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.function.BiConsumer;

public abstract class ObjetoListar {

    private String sentenciaObtenerDatos;
    private String sentenciaObtenerTransacciones;
    private String id;
    private String nombre;

    private BiConsumer<String, ObjetoListar> accion;

    public ObjetoListar(String id){
        this.sentenciaObtenerDatos = sentenciaObtenerDatos;
        this.sentenciaObtenerTransacciones = sentenciaObtenerTransacciones;
        this.id = id;
    }

    public void setAccion(BiConsumer<String, ObjetoListar> accion) {
        this.accion = accion;
    }
    public void ejecutarAccion() {
        if (accion != null) {
            accion.accept(this.nombre, this);
        }
    }
    public abstract ArrayList<String> retornarInformacionElemento();
    public abstract ArrayList<String> obtenerInformacionElemento();
    public String retornarId(){
        return this.id;
    }
    public abstract String[] obtenerColumnas();
    public abstract void abrirSiguientePagina();
}

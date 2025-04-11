package Modelo;

import javax.swing.*;
import java.util.ArrayList;
import java.util.function.BiConsumer;

public abstract class ObjetoListar {

    private ArrayList<String> ids;

    private BiConsumer<String, ObjetoListar> accion;

    public void setAccion(BiConsumer<String, ObjetoListar> accion) {
        this.accion = accion;
    }
    public void ejecutarAccion(String Id) {
        if (accion != null) {
            accion.accept(Id, this);
        }
    }
    public abstract  String obtenerTitulo();
    public abstract String[] retornarInformacionElemento(String id);
    public abstract String[] obtenerInformacionElemento(String id);
    public abstract String[] obtenerColumnas();
    public abstract void abrirSiguientePagina(String id);
    public abstract void actualizarInformacion(String id);
    public abstract void obtenerInformacion(String id);
    public abstract void eliminarObjeto(String id);
    public abstract void crearObjeto(String[] valores);
    public abstract Boolean buscarObjeto(String id);
}

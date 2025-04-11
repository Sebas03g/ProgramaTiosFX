package Modelo;

import java.util.ArrayList;

public class Inventario extends ObjetoListar{


    @Override
    public String obtenerTitulo() {
        return null;
    }

    @Override
    public String[] retornarInformacionElemento(String id) {
        return new String[0];
    }

    @Override
    public String[] obtenerInformacionElemento(String id) {
        return new String[0];
    }

    @Override
    public String[] obtenerColumnas() {
        return new String[0];
    }

    @Override
    public void abrirSiguientePagina(String id) {

    }

    @Override
    public void actualizarInformacion(String id) {

    }

    @Override
    public void obtenerInformacion(String id) {

    }

    @Override
    public void eliminarObjeto(String id) {

    }

    @Override
    public void crearObjeto(String[] valores) {

    }

    @Override
    public Boolean buscarObjeto(String id) {
        return null;
    }
}

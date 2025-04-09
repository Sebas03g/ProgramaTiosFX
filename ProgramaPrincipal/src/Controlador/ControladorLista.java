package Controlador;

import Modelo.ObjetoListar;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ControladorLista<T extends ObjetoListar> {

    private T objeto;
    private HashMap<String, T> mapa;
    private String[] columnas;

    @FXML
    private TableView<Map<String, String>> tablaDinamica;

    public void inicializarDatos(String titulo, HashMap<String, T> mapa, String[] columnas) {
        this.mapa = mapa;
        this.columnas = columnas;
        // lógica para poblar la tabla con columnas, usando `mapa`...
    }

    public void construirColumnasDinamicamente(String[] nombresColumnas) {
        tablaDinamica.getColumns().clear(); // Por si ya tiene columnas previas

        for (String nombreColumna : nombresColumnas) {
            TableColumn<Map<String, String>, String> columna = new TableColumn<>(nombreColumna);

            columna.setCellValueFactory(data -> {
                String valor = data.getValue().get(nombreColumna);
                return new SimpleStringProperty(valor);
            });

            tablaDinamica.getColumns().add(columna);
        }
    }

    public void cargarDatosDinamicos(List<Map<String, String>> datos) {
        ObservableList<Map<String, String>> items = FXCollections.observableArrayList(datos);
        tablaDinamica.setItems(items);
    }

    @FXML
    public void handleAbrirElemento() {
        Map<String, String> seleccionado = tablaDinamica.getSelectionModel().getSelectedItem();
        ObjetoListar elemento = mapa.get(seleccionado.get("Id"));
        elemento.ejecutarAccion();

    }
}

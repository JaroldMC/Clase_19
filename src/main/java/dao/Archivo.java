package dao;

import java.io.*;

public class Archivo<T extends Serializable> {

    private final String fileName;

    public Archivo(String fileName) {
        this.fileName = fileName;
    }

    /**
     * Guarda un objeto serializable en un archivo.
     *
     * @param object Objeto a guardar.
     * @return Mensaje de resultado.
     */
    public String save(T object) {

        try (
                FileOutputStream archivo = new FileOutputStream(fileName);
                ObjectOutputStream salida = new ObjectOutputStream(archivo)
        ) {

            salida.writeObject(object);
            return "Guardado correctamente";

        } catch (IOException ex) {
            return "Error al guardar: " + ex.getMessage();
        }
    }

    /**
     * Lee un objeto serializado desde un archivo.
     *
     * @return Objeto leído o null si ocurre un error.
     */
    @SuppressWarnings("unchecked")
    public T read() {

        try (
                FileInputStream archivo = new FileInputStream(fileName);
                ObjectInputStream entrada = new ObjectInputStream(archivo)
        ) {

            return (T) entrada.readObject();

        } catch (IOException | ClassNotFoundException ex) {
            return null;
        }
    }
}
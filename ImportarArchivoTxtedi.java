import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ImportarArchivoTxtedi {

    public LinkedList<prestamosediseño> leerArchivo(String nombreArchivo) {
        String rutaArchivo = nombreArchivo + ".txt";
        LinkedList<prestamosediseño> prestamosediseñoes = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            prestamosediseño prestamosediseño = null;
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty() || line.startsWith("-")) {
                    continue;
                }

                if (line.startsWith("Cedula: ")) {
                    if (prestamosediseño != null) {
                        prestamosediseñoes.add(prestamosediseño); // Añadir el prestamosediseño anterior a
                                                                  // la lista
                    }
                    prestamosediseño = new prestamosediseño();
                    prestamosediseño.setCedula(line.substring(9).trim()); // Ajustar para "Categoria: "
                } else if (line.startsWith("Nombre: ") && line.length() > 9) {
                    if (prestamosediseño != null) {
                        prestamosediseño.setNombre(line.substring(8).trim()); // Remover "Nombre: "
                    }
                } else if (line.startsWith("Apellido: ") && line.length() > 7) {
                    if (prestamosediseño != null) {
                        prestamosediseño.setApellido(line.substring(10).trim()); // Remover "Color: "
                    }
                } else if (line.startsWith("Telefono: ") && line.length() > 6) {
                    if (prestamosediseño != null) {
                        prestamosediseño.setTelefono(line.substring(10).trim()); // Remover "Edad: "
                    }
                } else if (line.startsWith("Modalidad de estudio: ") && line.length() > 23) {
                    if (prestamosediseño != null) {
                        prestamosediseño.setModalidadEstudio(line.substring(23).trim()); // Remover
                                                                                         // "Edad: "
                    }
                } else if (line.startsWith("Cantidad de asignaturas: ") && line.length() > 6) {
                    if (prestamosediseño != null) {
                        prestamosediseño.setCantidadAsignaturas(Integer.parseInt(line.substring(26).trim())); // Remover
                        // "Edad:
                        // "
                    }
                } else if (line.startsWith("Serial: ") && line.length() > 6) {
                    if (prestamosediseño != null) {
                        prestamosediseño.setSerial(line.substring(9).trim()); // Remover "Edad: "
                    }
                }

            }

            if (prestamosediseño != null) {
                prestamosediseñoes.add(prestamosediseño);
            }

           
        } catch (IOException e) {
            e.printStackTrace();
        }

        return prestamosediseñoes;
    }
}
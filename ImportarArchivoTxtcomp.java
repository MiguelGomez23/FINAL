import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ImportarArchivoTxtcomp {

    public LinkedList<computadores> leerArchivo(String nombreArchivo) {
        String rutaArchivo = nombreArchivo + ".txt";
        LinkedList<computadores> computadoreses = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            computadores computadores = null;
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty() || line.startsWith("-")) {
                    continue;
                }

                if (line.startsWith("Serial: ")) {
                    if (computadores != null) {
                        computadoreses.add(computadores);
                    }
                    computadores = new computadores();
                    computadores.setSerial(line.substring(8).trim());

                } else if (line.startsWith("Marca: ") && line.length() > 8) {
                    if (computadores != null) {
                        computadores.setMarca(line.substring(7).trim());
                    }

                } else if (line.startsWith("Tamano: ") && line.length() > 8) {
                    if (computadores != null) {
                        computadores.setTamano(Float.parseFloat(line.substring(8).trim()));
                    }

                } else if (line.startsWith("Precio: ") && line.length() > 6) {
                    if (computadores != null) {
                        computadores.setPrecio(Float.parseFloat(line.substring(8).trim()));
                    }

                } else if (line.startsWith("SistemaOperativo: ") && line.length() > 6) {
                    if (computadores != null) {
                        computadores.setSistemaOperativo(line.substring(19).trim());
                    }

                } else if (line.startsWith("Procesador: ") && line.length() > 6) {
                    if (computadores != null) {
                        computadores.setProcesador(line.substring(12).trim());
                    }

                }

            }

            if (computadores != null) {
                computadoreses.add(computadores);
            }

            // System.out.println("Archivo importado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return computadoreses;
    }
}
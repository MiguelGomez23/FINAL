import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class ImportarArchivoTxttab {

    public LinkedList<Tableta> leerArchivo(String nombreArchivo) {
        String rutaArchivo = nombreArchivo + ".txt";
        LinkedList<Tableta> tabletaes = new LinkedList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String line;
            Tableta tableta = null;
            while ((line = br.readLine()) != null) {

                if (line.trim().isEmpty() || line.startsWith("-")) {
                    continue;
                }

                if (line.trim().isEmpty() || line.startsWith("-")) {
                    continue;
                }

                if (line.startsWith("Serial: ")) {
                    if (tableta != null) {
                        tabletaes.add(tableta);
                    }
                    tableta = new Tableta();
                    tableta.setSerial(line.substring(8).trim());
                } else if (line.startsWith("Marca: ") && line.length() > 8) {
                    if (tableta != null) {
                        tableta.setMarca(line.substring(7).trim());
                    }
                } else if (line.startsWith("Tamano: ") && line.length() > 8) {
                    if (tableta != null) {
                        tableta.setTamano(Float.parseFloat(line.substring(8).trim()));

                    }
                } else if (line.startsWith("Precio: ") && line.length() > 6) {
                    if (tableta != null) {
                        tableta.setPrecio(Float.parseFloat(line.substring(8).trim()));
                    }
                } else if (line.startsWith("Almacenamiento: ") && line.length() > 6) {
                    if (tableta != null) {
                        tableta.setAlmacenamiento(line.substring(16).trim());

                    }
                } else if (line.startsWith("Peso: ") && line.length() > 6) {
                    if (tableta != null) {
                        tableta.setPeso(Float.parseFloat(line.substring(6).trim()));
                    }
                }

            }

            if (tableta != null) {
                tabletaes.add(tableta);
            }

            // System.out.println("Archivo importado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        return tabletaes;
    }
}
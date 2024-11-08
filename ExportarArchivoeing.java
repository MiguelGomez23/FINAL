import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarArchivoeing {

    public void exportarArchivo(LinkedList<prestamoseingenieria> listaprestamoseingenieria) {
        if (listaprestamoseingenieria.isEmpty()) {
            Metodoseing ll = new Metodoseing();
            listaprestamoseingenieria = ll.LLenarLista(listaprestamoseingenieria);
        } else {
            try (FileWriter escriba = new FileWriter("prestamoseingenieriaes.txt")) {
                for (prestamoseingenieria prestamoseingenieria : listaprestamoseingenieria) {
                    escriba.write("Cedula: " + " " + prestamoseingenieria.getCedula());
                    escriba.write("\n");
                    escriba.write("Nombre: " + " " + prestamoseingenieria.getNombre());
                    escriba.write("\n");
                    escriba.write("Apellido: " + " " + prestamoseingenieria.getApellido());
                    escriba.write("\n");
                    escriba.write("Telefono: " + " " + prestamoseingenieria.getTelefono());
                    escriba.write("\n");
                    escriba.write("Numero de semestre: " + " " + prestamoseingenieria.getNumSemestre());
                    escriba.write("\n");
                    escriba.write("Promedio: " + " " + prestamoseingenieria.getPromedio());
                    escriba.write("\n");
                    escriba.write("Serial: " + " " + prestamoseingenieria.getSerial());
                    escriba.write("\n");
                    escriba.write("---------------------------------------\n");

                }

                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

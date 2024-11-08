import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarArchivoedi {

    public void exportarArchivo(LinkedList<prestamosediseño> listaprestamosediseño) {
        if (listaprestamosediseño.isEmpty()) {
            Metodosedi ll = new Metodosedi();
            listaprestamosediseño = ll.LlenarLista(listaprestamosediseño);
        } else {
            try (FileWriter escriba = new FileWriter("prestamosediseñoes.txt")) {
                for (prestamosediseño prestamosediseño : listaprestamosediseño) {
                    escriba.write("Cedula: " + " " + prestamosediseño.getCedula());
                    escriba.write("\n");
                    escriba.write("Nombre: " + " " + prestamosediseño.getNombre());
                    escriba.write("\n");
                    escriba.write("Apellido: " + " " + prestamosediseño.getApellido());
                    escriba.write("\n");
                    escriba.write("Telefono: " + " " + prestamosediseño.getTelefono());
                    escriba.write("\n");
                    escriba.write("Modalidad de estudio: " + " " + prestamosediseño.getModalidadEstudio());
                    escriba.write("\n");
                    escriba.write("Cantidad de asignaturas: " + " " + prestamosediseño.getCantidadAsignaturas());
                    escriba.write("\n");
                    escriba.write("Serial: " + " " + prestamosediseño.getSerial());
                    escriba.write("\n");
                    escriba.write("---------------------------------------\n");
                }

               
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

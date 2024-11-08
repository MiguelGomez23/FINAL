import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarArchivocomp {

    public void exportarArchivo(LinkedList<computadores> listacomputadores) {
        if (listacomputadores.isEmpty()) {
            Metodoscomp ll = new Metodoscomp();
            listacomputadores = ll.LlenarLista(listacomputadores);
        } else {
            try (FileWriter escriba = new FileWriter("computadoreses.txt")) {
                for (computadores computadores : listacomputadores) {
                    escriba.write("\n");
                    escriba.write("Serial: " + " " + computadores.getSerial());
                    escriba.write("\n");
                    escriba.write("Marca: " + " " + computadores.getMarca());
                    escriba.write("\n");
                    escriba.write("Tamano: " + " " + computadores.getTamano());
                    escriba.write("\n");
                    escriba.write("Precio: " + " " + computadores.getPrecio());
                    escriba.write("\n");
                    escriba.write("SistemaOperativo: " + " " + computadores.getSistemaOperativo());
                    escriba.write("\n");
                    escriba.write("Procesador: " + " " + computadores.getProcesador());
                    escriba.write("\n");
                    escriba.write("---------------------------------------\n");
                }

               
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

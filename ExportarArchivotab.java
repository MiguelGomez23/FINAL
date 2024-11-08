import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class ExportarArchivotab {

    public void exportarArchivo(LinkedList<Tableta> listatableta) {
        if (listatableta.isEmpty()) {
            Metodostab ll = new Metodostab();
            listatableta = ll.LlenarLista(listatableta);
        } else {
            try (FileWriter escriba = new FileWriter("tabletaes.txt")) {
                for (Tableta tableta : listatableta) {
                    escriba.write("\n");
                    escriba.write("Serial: " + " " + tableta.getSerial());
                    escriba.write("\n");
                    escriba.write("Marca: " + " " + tableta.getMarca());
                    escriba.write("\n");
                    escriba.write("Tamano: " + " " + tableta.getTamano());
                    escriba.write("\n");
                    escriba.write("Precio: " + " " + tableta.getPrecio());
                    escriba.write("\n");
                    escriba.write("Almacenamiento: " + " " + tableta.getAlmacenamiento());
                    escriba.write("\n");
                    escriba.write("Peso: " + " " + tableta.getPeso());
                    escriba.write("\n");
                    escriba.write("---------------------------------------\n");
                }

                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}

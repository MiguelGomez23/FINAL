import java.util.LinkedList;
import java.util.Scanner;
import java.util.UUID;

public class Metodostab {
    public LinkedList<Tableta> LlenarLista(LinkedList<Tableta> lista) {
        boolean bandera = true;
        Metodostab m = new Metodostab();
        int opt = 0;
        Scanner sc = new Scanner(System.in);

        while (bandera) {

            UUID SerialUUID = UUID.randomUUID();
            String Serial = SerialUUID.toString().substring(0, 10);

            Tableta a = m.Buscar(lista, Serial);
            if (a != null && a.getSerial() != null) {
                System.out.println("El registro ya existe, por favor ingrese otro serial");
                continue;
            }

            a = new Tableta();
            a.setSerial(Serial);
            System.out.println();

            System.out.println("Ingrese la marca: Mac, Dell, Asus O Lenovo");
            a.setMarca(sc.nextLine());
            System.out.println();

            System.out.println("Ingrese el tamaño");
            while (!sc.hasNextFloat()) {
                System.out.println("Opcion no valida, por favor ingrese un tamaño válido");
                sc.next();
            }
            a.setTamano(sc.nextFloat());
            sc.nextLine();
            System.out.println();

            System.out.println("Ingrese el precio");
            while (!sc.hasNextFloat()) {
                System.out.println("Opcion no valida, por favor ingrese un precio válido");
                sc.next();
            }
            a.setPrecio(sc.nextFloat());
            sc.nextLine();
            System.out.println();

            System.out.println("Ingrese el almacenamiento: 128 GB, 256 GB, 512 GB O 1 TB ");
            a.setAlmacenamiento(sc.nextLine());
            System.out.println();

            System.out.println("Ingrese el peso");
            while (!sc.hasNextFloat()) {
                System.out.println("Opcion no valida, por favor ingrese un tamaño válido");
                sc.next();
            }
            a.setPeso(sc.nextFloat());
            sc.nextLine();
            System.out.println();

            lista.add(a);

            System.out.println("Desea continuar 1: Si, 2: No");
            while (!sc.hasNextInt()) {
                System.out.println("Opcion no valida, por favor ingrese un número válido");
                sc.next();
            }
            opt = sc.nextInt();
            sc.nextLine();
            if (opt != 1) {
                bandera = false;
            }
        }
        return lista;

    }

    public void MostrarLista(LinkedList<Tableta> lista) {
        for (Tableta tableta : lista) {
            System.out.println("Serial: " + " " + tableta.getSerial());
            System.out.println("Marca: " + " " + tableta.getMarca());
            System.out.println("Tamaño: " + " " + tableta.getPeso());
            System.out.println("Precio: " + " " + tableta.getPrecio());
            System.out.println("Almacenamiento: " + " " + tableta.getAlmacenamiento());
            System.out.println("Peso: " + " " + tableta.getPeso());

            System.out.println("------------------------------- \n");

        }
    }

    public void ExportarArchivo(LinkedList<Tableta> lista) {
        ExportarArchivotab e = new ExportarArchivotab();
        e.exportarArchivo(lista);
    }

    public LinkedList<Tableta> ImportarArchivo() {
        ImportarArchivoTxttab i = new ImportarArchivoTxttab();
        LinkedList<Tableta> lista = i.leerArchivo("tabletaes");
        return lista;
    }

    public Tableta Buscar(LinkedList<Tableta> lista, String serial) {
        for (Tableta tab : lista) {
            if (tab.getSerial().equals(serial)) {
                return tab;
            }
        }
        return null;
    }

}


import java.util.LinkedList;
import java.util.Scanner;
import java.util.UUID;

public class Metodoscomp {
    public LinkedList<computadores> LlenarLista(LinkedList<computadores> lista) {
        boolean bandera = true;
        Metodoscomp m = new Metodoscomp();
        int opt = 0;
        Scanner sc = new Scanner(System.in);

        while (bandera) {
            UUID serialUUID = UUID.randomUUID();
            String Serial = serialUUID.toString().substring(0, 10);

            computadores a = m.Buscar(lista, Serial);
            if (a != null && a.getSerial() != null) {
                System.out.println("El registro ya existe, por favor espere un momento...");
                continue;
            }

            a = new computadores();
            a.setSerial(Serial);

            System.out.println("Ingrese la marca: Acer, Dell O Asus");
            a.setMarca(sc.nextLine());

            System.out.println("Ingrese el tamaño");
            while (!sc.hasNextFloat()) {
                System.out.println("Opcion no valida, por favor ingrese un tamaño válido");
                sc.next();
            }
            a.setTamano(sc.nextFloat());
            sc.nextLine();

            System.out.println("Ingrese el precio");
            while (!sc.hasNextFloat()) {
                System.out.println("Opcion no valida, por favor ingrese un precio válido");
                sc.next();
            }
            a.setPrecio(sc.nextFloat());
            sc.nextLine();

            System.out.println("Ingrese el sistema operativo: Windows 7, Windows 10 O Windows 11");
            a.setSistemaOperativo(sc.nextLine());

            System.out.println("Ingrese el procesador: AMD Ryzen O Intel Core i5");
            a.setProcesador(sc.nextLine());

            lista.add(a);

            System.out.println("Desea continuar 1: Si, 2: No");
            while (!sc.hasNextInt()) {
                System.out.println("Opcion no valida, por favor ingrese un número válido");
                sc.next();
            }
            opt = sc.nextInt();
            sc.nextLine();
            if (opt == 2) {
                bandera = false;
            }
        }
        return lista;
    }

    public void MostrarLista(LinkedList<computadores> lista) {
        for (computadores computadores : lista) {
            System.out.println("Serial: " + " " + computadores.getSerial());
            System.out.println("Marca: " + " " + computadores.getMarca());
            System.out.println("Tamaño: " + " " + computadores.getTamano());
            System.out.println("Precio: " + " " + computadores.getPrecio());
            System.out.println("Sistema operativo: " + " " + computadores.getSistemaOperativo());
            System.out.println("Procesador: " + " " + computadores.getProcesador());

            System.out.println("------------------------------- \n");

        }
    }

    public void ExportarArchivo(LinkedList<computadores> lista) {
        ExportarArchivocomp e = new ExportarArchivocomp();
        e.exportarArchivo(lista);
    }

    public LinkedList<computadores> ImportarArchivo() {
        ImportarArchivoTxtcomp i = new ImportarArchivoTxtcomp();
        LinkedList<computadores> lista = i.leerArchivo("computadoreses");
        return lista;
    }

    public computadores Buscar(LinkedList<computadores> lista, String serial) {
        for (computadores comp : lista) {
            if (comp.getSerial().equals(serial)) {
                return comp; // Retorna el objeto encontrado
            }
        }
        return null; // Retorna null si no se encuentra
    }

}
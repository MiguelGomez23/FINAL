
/* import java.util.LinkedList;
import java.util.Scanner;

public class Metodosedi {
    public LinkedList<prestamosediseño> LlenarLista(LinkedList<prestamosediseño> lista) {
        boolean bandera = true;
        Metodosedi objMetodos = new Metodosedi();
        int opt = 0;
        Scanner sc = new Scanner(System.in);

        while (bandera) {
            System.out.println("Ingrese el Cedula");
            String Cedula = sc.nextLine();

            // Verificamos si ya existe
            prestamosediseño objPrestamosediseño = objMetodos.Buscar(lista, Cedula);
            if (objPrestamosediseño != null && objPrestamosediseño.getCedula() != null) {
                System.out.println("El registro ya existe, por favor ingrese otra Cedula");
                continue; // Continuamos con el ciclo en lugar de romperlo
            }

            // Creamos una nueva instancia solo si el Cedula no existe
            objPrestamosediseño = new prestamosediseño();
            objPrestamosediseño.setCedula(Cedula);
            System.out.println("\n");
            
            System.out.println("Ingrese el nombre");
            String nombre = sc.nextLine();
            objPrestamosediseño.setNombre(nombre);
            System.out.println("\n");

            System.out.println("Ingrese el apellido");
            String apellido = sc.nextLine();
            objPrestamosediseño.setApellido(apellido);
            System.out.println("\n");

            System.out.println("Ingrese el telefono");
            String telefono = sc.nextLine();
            objPrestamosediseño.setTelefono(telefono);
            System.out.println("\n");

            System.out.println("Ingrese el modalidad de estudio");
            String modalidaddeestudio = sc.nextLine();
            objPrestamosediseño.setModalidadEstudio(modalidaddeestudio);
            System.out.println("\n");

            System.out.println("Ingrese la cantidad de asignaturas");
            while (!sc.hasNextInt()) {
                System.out.println("Opcion no valida, por favor ingrese un tamaño válido");
                sc.next(); // Descartar entrada inválida
            }
            int cantidadasignaturas = sc.nextInt();
            objPrestamosediseño.setCantidadAsignaturas(cantidadasignaturas);
            System.out.println("\n");

            // System.out.println("Ingrese el serial");
            // String serial = sc.next();
            // objPrestamosediseño.setSerial(serial);
            // System.out.println("\n");

            // Agregar a la lista
            lista.add(objPrestamosediseño);
            bandera = false;

        }
        return lista;
    }

    public void MostrarLista(LinkedList<prestamosediseño> lista) {
        for (prestamosediseño prestamosediseño : lista) {
            System.out.println("Cedula: " + " " + prestamosediseño.getCedula());
            System.out.println("Nombre: " + " " + prestamosediseño.getNombre());
            System.out.println("Apellido: " + " " + prestamosediseño.getApellido());
            System.out.println("Telefono: " + " " + prestamosediseño.getTelefono());
            System.out.println("Modalidad de estudio: " + " " + prestamosediseño.getModalidadEstudio());
            System.out.println("Cantidad de asignaturas: " + " " + prestamosediseño.getCantidadAsignaturas());
            System.out.println("Serial: " + " " + prestamosediseño.getSerial());

            System.out.println("------------------------------- \n");

        }
    }

    public void ExportarArchivo(LinkedList<prestamosediseño> lista) {
        ExportarArchivoedi e = new ExportarArchivoedi();
        e.exportarArchivo(lista);
    }

    public LinkedList<prestamosediseño> ImportarArchivo(LinkedList<prestamosediseño> listaedi) {
        ImportarArchivoTxtedi i = new ImportarArchivoTxtedi();
        LinkedList<prestamosediseño> lista = i.leerArchivo("prestamosediseñoes");
        return lista;
    }

    public prestamosediseño Buscar(LinkedList<prestamosediseño> lista, String Cedula) {
        for (prestamosediseño dis : lista) {
            if (dis.getCedula().equals(Cedula)) {
                return dis; // Retorna el objeto encontrado
            }
        }
        return null; // Retorna null si no se encuentra
    }

    public prestamosediseño BuscarNombre(LinkedList<prestamosediseño> lista, String nombre) {
        for (prestamosediseño ing : lista) {
            // Usa equalsIgnoreCase para ignorar diferencias en mayúsculas y minúsculas
            if (ing.getNombre().equalsIgnoreCase(nombre)) {
                return ing;
            }
        }
        return null; // Retorna null si no se encuentra el objeto
    }
    
    public LinkedList<prestamosediseño> ModificarNombre(String nombre, LinkedList<prestamosediseño> listaedi) {
        Metodosedi BN = new Metodosedi();
        Scanner sc = new Scanner(System.in);
    
        // Buscar el objeto con el nombre proporcionado
        prestamosediseño buscarNombre = BN.BuscarNombre(listaedi, nombre);
    
        if (buscarNombre != null) { // Verifica si se encontró el objeto
            System.out.println("Registro encontrado:");
            System.out.println();
            System.out.println("Nombre actual: " + buscarNombre.getNombre());
            System.out.println();
    
            // Solicitar nuevo nombre al usuario
            System.out.println("Ingrese el nuevo nombre:");
            String nuevoNombre = sc.nextLine();
            System.out.println();
    
            // Actualizar el nombre del objeto encontrado
            buscarNombre.setNombre(nuevoNombre);
            System.out.println("Nombre modificado correctamente a: " + buscarNombre.getNombre());
            System.out.println();
        } else {
            System.out.println("Registro no encontrado.");
            System.out.println();
        }
    
        return listaedi;
    }
    
    //
    //
    //
    public prestamosediseño BuscarApellido(LinkedList<prestamosediseño> lista, String Apellido) {
        for (prestamosediseño ing : lista) {
            // Usa equalsIgnoreCase para ignorar diferencias en mayúsculas y minúsculas
            if (ing.getApellido().equalsIgnoreCase(Apellido)) {
                return ing;
            }
        }
        return null; // Retorna null si no se encuentra el objeto
    }
    
    public LinkedList<prestamosediseño> ModificarApellido(String Apellido, LinkedList<prestamosediseño> listaedi) {
        Metodosedi BN = new Metodosedi();
        Scanner sc = new Scanner(System.in);
    
        // Buscar el objeto con el Apellido proporcionado
        prestamosediseño buscarApellido = BN.BuscarApellido(listaedi, Apellido);
    
        if (buscarApellido != null) { // Verifica si se encontró el objeto
            System.out.println("Registro encontrado:");
            System.out.println();
            System.out.println("Apellido actual: " + buscarApellido.getApellido());
            System.out.println();
    
            // Solicitar nuevo Apellido al usuario
            System.out.println("Ingrese el nuevo Apellido:");
            String nuevoApellido = sc.nextLine();
            System.out.println();
    
            // Actualizar el Apellido del objeto encontrado
            buscarApellido.setApellido(nuevoApellido);
            System.out.println("Apellido modificado correctamente a: " + buscarApellido.getApellido());
            System.out.println();
        } else {
            System.out.println("Registro no encontrado.");
            System.out.println();
        }
    
        return listaedi;
    }
    
    //
    //
    //

    public prestamosediseño BuscarTelefono(LinkedList<prestamosediseño> lista, String Telefono) {
        for (prestamosediseño ing : lista) {
            // Usa equalsIgnoreCase para ignorar diferencias en mayúsculas y minúsculas
            if (ing.getTelefono().equalsIgnoreCase(Telefono)) {
                return ing;
            }
        }
        return null; // Retorna null si no se encuentra el objeto
    }
    
    public LinkedList<prestamosediseño> ModificarTelefono(String Telefono, LinkedList<prestamosediseño> listaedi) {
        Metodosedi BN = new Metodosedi();
        Scanner sc = new Scanner(System.in);
    
        // Buscar el objeto con el Telefono proporcionado
        prestamosediseño buscarTelefono = BN.BuscarTelefono(listaedi, Telefono);
    
        if (buscarTelefono != null) { // Verifica si se encontró el objeto
            System.out.println("Registro encontrado:");
            System.out.println();
            System.out.println("Telefono actual: " + buscarTelefono.getTelefono());
            System.out.println();
    
            // Solicitar nuevo Telefono al usuario
            System.out.println("Ingrese el nuevo Telefono:");
            String nuevoTelefono = sc.nextLine();
            System.out.println();
    
            // Actualizar el Telefono del objeto encontrado
            buscarTelefono.setTelefono(nuevoTelefono);
            System.out.println("Telefono modificado correctamente a: " + buscarTelefono.getTelefono());
            System.out.println();
        } else {
            System.out.println("Registro no encontrado.");
            System.out.println();
        }
    
        return listaedi;
    }
    
    //
    //
    //

    public prestamosediseño BuscarModalidadEstudio(LinkedList<prestamosediseño> lista, String ModalidadEstudio) {
        for (prestamosediseño ing : lista) {
            // Usa equalsIgnoreCase para ignorar diferencias en mayúsculas y minúsculas
            if (ing.getModalidadEstudio().equalsIgnoreCase(ModalidadEstudio)) {
                return ing;
            }
        }
        return null; // Retorna null si no se encuentra el objeto
    }
    
    public LinkedList<prestamosediseño> ModificarModalidadEstudio(String ModalidadEstudio, LinkedList<prestamosediseño> listaedi) {
        Metodosedi BN = new Metodosedi();
        Scanner sc = new Scanner(System.in);
    
        // Buscar el objeto con el ModalidadEstudio proporcionado
        prestamosediseño buscarModalidadEstudio = BN.BuscarModalidadEstudio(listaedi, ModalidadEstudio);
    
        if (buscarModalidadEstudio != null) { // Verifica si se encontró el objeto
            System.out.println("Registro encontrado:");
            System.out.println();
            System.out.println("La modalidad de estudio actual: " + buscarModalidadEstudio.getModalidadEstudio());
            System.out.println();
    
            // Solicitar nuevo ModalidadEstudio al usuario
            System.out.println("Ingrese la nueva modalidad de estudio:");
            String nuevoModalidadEstudio = sc.nextLine();
            System.out.println();
    
            // Actualizar el ModalidadEstudio del objeto encontrado
            buscarModalidadEstudio.setModalidadEstudio(nuevoModalidadEstudio);
            System.out.println("La modalidad de estudio fue modificada correctamente a: " + buscarModalidadEstudio.getModalidadEstudio());
            System.out.println();
        } else {
            System.out.println("Registro no encontrado.");
            System.out.println();
        }
    
        return listaedi;
    }
    
    //
    //
    //

    public prestamosediseño BuscarCantidadAsignaturas(LinkedList<prestamosediseño> lista, int CantidadAsignaturas) {
        for (prestamosediseño ing : lista) {
            // Usa equalsIgnoreCase para ignorar diferencias en mayúsculas y minúsculas
            if (ing.getCantidadAsignaturas() == CantidadAsignaturas)   {
                return ing;
            }
        }
        return null; // Retorna null si no se encuentra el objeto
    }
    
    public LinkedList<prestamosediseño> ModificarCantidadAsignaturas(int CantidadAsignaturas, LinkedList<prestamosediseño> listaedi) {
        Metodosedi BNS = new Metodosedi();
        Scanner sc = new Scanner(System.in);
        
        // Buscar el objeto con el CantidadAsignaturas proporcionado
        prestamosediseño buscarCantidadAsignaturas = BNS.BuscarCantidadAsignaturas(listaedi, CantidadAsignaturas);
        
        if (buscarCantidadAsignaturas != null) { // Verifica si se encontró el objeto
            System.out.println("Registro encontrado:");
            System.out.println();
            System.out.println("Numero de semestre actual: " + buscarCantidadAsignaturas.getCantidadAsignaturas());
            System.out.println();
            
            // Solicitar nuevo CantidadAsignaturas al usuario
            System.out.println("Ingrese el nuevo Numero de semestre:");
            int nuevoCantidadAsignaturas = sc.nextInt();
            System.out.println();
            
            // Actualizar el CantidadAsignaturas del objeto encontrado
            buscarCantidadAsignaturas.setCantidadAsignaturas(nuevoCantidadAsignaturas);
            System.out.println("Numero de semestre modificado correctamente a: " + buscarCantidadAsignaturas.getCantidadAsignaturas());
            System.out.println();
        } else {
            System.out.println("Registro no encontrado.");
            System.out.println();
        } 
        
        return listaedi;
    } 
    
    //
    //
    //
}
 */
import java.util.LinkedList;
import java.util.Scanner;

public class Metodosedi {
    public LinkedList<prestamosediseño> LlenarLista(LinkedList<prestamosediseño> lista) {
        boolean bandera = true;
        Metodosedi objMetodos = new Metodosedi();
        Scanner sc = new Scanner(System.in);

        while (bandera) {
            System.out.println("Ingrese el Cedula");
            String Cedula = sc.nextLine().trim();

            if (Cedula.isEmpty()) {
                System.out.println("CAMPO OBLIGATORIO.\n");
                continue;
            }

            prestamosediseño objPrestamosediseño = objMetodos.Buscar(lista, Cedula);
            if (objPrestamosediseño != null && objPrestamosediseño.getCedula() != null) {
                System.out.println("El registro ya existe, por favor ingrese otra Cedula");
                continue;
            }

            objPrestamosediseño = new prestamosediseño();
            objPrestamosediseño.setCedula(Cedula);
            System.out.println("\n");
            bandera = false;

            while (true) {
                System.out.println("Ingrese el nombre");
                String nombre = sc.nextLine().trim();
                System.out.println();
                if (!nombre.isEmpty()) {
                    objPrestamosediseño.setNombre(nombre);
                    break;
                } else {
                    System.out.println("CAMPO OBLIGATORIO.\n");
                }
            }

            while (true) {
                System.out.println("Ingrese el apellido");
                String apellido = sc.nextLine().trim();
                System.out.println();
                if (!apellido.isEmpty()) {
                    objPrestamosediseño.setApellido(apellido);
                    break;
                } else {
                    System.out.println("CAMPO OBLIGATORIO.\n");
                }
            }

            while (true) {
                System.out.println("Ingrese el telefono");
                String telefono = sc.nextLine().trim();
                System.out.println();
                if (!telefono.isEmpty()) {
                    objPrestamosediseño.setTelefono(telefono);
                    break;
                } else {
                    System.out.println("CAMPO OBLIGATORIO.\n");

                }
            }

            while (true) {
                System.out.println("Ingrese el modalidad de estudio");
                String modalidaddeestudio = sc.nextLine().trim();
                System.out.println();
                if (!modalidaddeestudio.isEmpty()) {
                    objPrestamosediseño.setModalidadEstudio(modalidaddeestudio);
                    break;
                } else {
                    System.out.println("CAMPO OBLIGATORIO.\n");

                }
            }

            System.out.println("Ingrese la cantidad de asignaturas");
            while (!sc.hasNextInt()) {
                System.out.println("Opcion no valida, por favor ingrese un tamaño válido\n");
                sc.next();
            }
            int cantidadasignaturas = sc.nextInt();
            objPrestamosediseño.setCantidadAsignaturas(cantidadasignaturas);
            System.out.println("\n");

            lista.add(objPrestamosediseño);
            bandera = false;

        }
        return lista;
    }

    public void MostrarLista(LinkedList<prestamosediseño> lista) {
        for (prestamosediseño prestamosediseño : lista) {
            System.out.println("Cedula: " + " " + prestamosediseño.getCedula());
            System.out.println("Nombre: " + " " + prestamosediseño.getNombre());
            System.out.println("Apellido: " + " " + prestamosediseño.getApellido());
            System.out.println("Telefono: " + " " + prestamosediseño.getTelefono());
            System.out.println("Modalidad de estudio: " + " " + prestamosediseño.getModalidadEstudio());
            System.out.println("Cantidad de asignaturas: " + " " + prestamosediseño.getCantidadAsignaturas());
            System.out.println("Serial: " + " " + prestamosediseño.getSerial());

            System.out.println("------------------------------- \n");

        }
    }

    public void ExportarArchivo(LinkedList<prestamosediseño> lista) {
        ExportarArchivoedi e = new ExportarArchivoedi();
        e.exportarArchivo(lista);
    }

    public LinkedList<prestamosediseño> ImportarArchivo(LinkedList<prestamosediseño> listaedi) {
        ImportarArchivoTxtedi i = new ImportarArchivoTxtedi();
        LinkedList<prestamosediseño> lista = i.leerArchivo("prestamosediseñoes");
        return lista;
    }

    public prestamosediseño Buscar(LinkedList<prestamosediseño> lista, String Cedula) {
        for (prestamosediseño dis : lista) {
            if (dis.getCedula().equals(Cedula)) {
                return dis;
            }
        }
        return null;
    }

    public prestamosediseño BuscarNombre(LinkedList<prestamosediseño> lista, String nombre) {
        for (prestamosediseño ing : lista) {
            if (ing.getNombre().equalsIgnoreCase(nombre)) {
                return ing;
            }
        }
        return null;
    }

    public LinkedList<prestamosediseño> ModificarNombre(String nombre, LinkedList<prestamosediseño> listaedi) {
        Metodosedi BN = new Metodosedi();
        Scanner sc = new Scanner(System.in);

        prestamosediseño buscarNombre = BN.BuscarNombre(listaedi, nombre);

        if (buscarNombre != null) {
            System.out.println("Registro encontrado:");
            System.out.println();
            System.out.println("Nombre actual: " + buscarNombre.getNombre());
            System.out.println();

            System.out.println("Ingrese el nuevo nombre:");
            String nuevoNombre = sc.nextLine();
            System.out.println();

            buscarNombre.setNombre(nuevoNombre);
            System.out.println("Nombre modificado correctamente a: " + buscarNombre.getNombre());
            System.out.println();
        } else {
            System.out.println("Registro no encontrado.");
            System.out.println();
        }

        return listaedi;
    }

    public prestamosediseño BuscarApellido(LinkedList<prestamosediseño> lista, String Apellido) {
        for (prestamosediseño ing : lista) {
            if (ing.getApellido().equalsIgnoreCase(Apellido)) {
                return ing;
            }
        }
        return null;
    }

    public LinkedList<prestamosediseño> ModificarApellido(String Apellido, LinkedList<prestamosediseño> listaedi) {
        Metodosedi BN = new Metodosedi();
        Scanner sc = new Scanner(System.in);

        prestamosediseño buscarApellido = BN.BuscarApellido(listaedi, Apellido);

        if (buscarApellido != null) {
            System.out.println("Registro encontrado:");
            System.out.println();
            System.out.println("Apellido actual: " + buscarApellido.getApellido());
            System.out.println();

            System.out.println("Ingrese el nuevo Apellido:");
            String nuevoApellido = sc.nextLine();
            System.out.println();

            buscarApellido.setApellido(nuevoApellido);
            System.out.println("Apellido modificado correctamente a: " + buscarApellido.getApellido());
            System.out.println();
        } else {
            System.out.println("Registro no encontrado.");
            System.out.println();
        }

        return listaedi;
    }

    public prestamosediseño BuscarTelefono(LinkedList<prestamosediseño> lista, String Telefono) {
        for (prestamosediseño ing : lista) {
            if (ing.getTelefono().equalsIgnoreCase(Telefono)) {
                return ing;
            }
        }
        return null;
    }

    public LinkedList<prestamosediseño> ModificarTelefono(String Telefono, LinkedList<prestamosediseño> listaedi) {
        Metodosedi BN = new Metodosedi();
        Scanner sc = new Scanner(System.in);

        prestamosediseño buscarTelefono = BN.BuscarTelefono(listaedi, Telefono);

        if (buscarTelefono != null) {
            System.out.println("Registro encontrado:");
            System.out.println();
            System.out.println("Telefono actual: " + buscarTelefono.getTelefono());
            System.out.println();

            System.out.println("Ingrese el nuevo Telefono:");
            String nuevoTelefono = sc.nextLine();
            System.out.println();

            buscarTelefono.setTelefono(nuevoTelefono);
            System.out.println("Telefono modificado correctamente a: " + buscarTelefono.getTelefono());
            System.out.println();
        } else {
            System.out.println("Registro no encontrado.");
            System.out.println();
        }

        return listaedi;
    }

    public prestamosediseño BuscarModalidadEstudio(LinkedList<prestamosediseño> lista, String ModalidadEstudio) {
        for (prestamosediseño ing : lista) {
            if (ing.getModalidadEstudio().equalsIgnoreCase(ModalidadEstudio)) {
                return ing;
            }
        }
        return null;
    }

    public LinkedList<prestamosediseño> ModificarModalidadEstudio(String ModalidadEstudio,
            LinkedList<prestamosediseño> listaedi) {
        Metodosedi BN = new Metodosedi();
        Scanner sc = new Scanner(System.in);

        prestamosediseño buscarModalidadEstudio = BN.BuscarModalidadEstudio(listaedi, ModalidadEstudio);

        if (buscarModalidadEstudio != null) {
            System.out.println("Registro encontrado:");
            System.out.println();
            System.out.println("La modalidad de estudio actual: " + buscarModalidadEstudio.getModalidadEstudio());
            System.out.println();

            System.out.println("Ingrese la nueva modalidad de estudio:");
            String nuevoModalidadEstudio = sc.nextLine();
            System.out.println();

            buscarModalidadEstudio.setModalidadEstudio(nuevoModalidadEstudio);
            System.out.println("La modalidad de estudio fue modificada correctamente a: "
                    + buscarModalidadEstudio.getModalidadEstudio());
            System.out.println();
        } else {
            System.out.println("Registro no encontrado.");
            System.out.println();
        }

        return listaedi;
    }

    public prestamosediseño BuscarCantidadAsignaturas(LinkedList<prestamosediseño> lista, int CantidadAsignaturas) {
        for (prestamosediseño ing : lista) {
            if (ing.getCantidadAsignaturas() == CantidadAsignaturas) {
                return ing;
            }
        }
        return null;
    }

    public LinkedList<prestamosediseño> ModificarCantidadAsignaturas(int CantidadAsignaturas,
            LinkedList<prestamosediseño> listaedi) {
        Metodosedi BNS = new Metodosedi();
        Scanner sc = new Scanner(System.in);

        prestamosediseño buscarCantidadAsignaturas = BNS.BuscarCantidadAsignaturas(listaedi, CantidadAsignaturas);

        if (buscarCantidadAsignaturas != null) {
            System.out.println("Registro encontrado:");
            System.out.println();
            System.out.println("Numero de semestre actual: " + buscarCantidadAsignaturas.getCantidadAsignaturas());
            System.out.println();

            System.out.println("Ingrese el nuevo Numero de semestre:");
            int nuevoCantidadAsignaturas = sc.nextInt();
            System.out.println();

            buscarCantidadAsignaturas.setCantidadAsignaturas(nuevoCantidadAsignaturas);
            System.out.println("Numero de semestre modificado correctamente a: "
                    + buscarCantidadAsignaturas.getCantidadAsignaturas());
            System.out.println();
        } else {
            System.out.println("Registro no encontrado.");
            System.out.println();
        }

        return listaedi;
    }

}
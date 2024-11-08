import java.util.Scanner;

public class computadores {
    String Serial;
    String Marca;
    float Tamano;
    float Precio;
    String SistemaOperativo;
    String Procesador;

    public String getSerial() {
        return Serial;
    }

    public void setSerial(String serial) {
        Serial = serial;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public float getTamano() {
        return Tamano;
    }

    public void setTamano(float tamano) {
        Tamano = tamano;
    }

    public float getPrecio() {
        return Precio;
    }

    public void setPrecio(float precio) {
        Precio = precio;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public void SeleccionarMarca() {

        Scanner scanner = new Scanner(System.in);

        int opt = 0;
        do {
            System.out.println("Seleccione la marca que desea:");
            System.out.println("1. Acer");
            System.out.println("2. Dell");
            System.out.println("3. Asus");
            System.out.println();
            if (scanner.hasNextInt()) {
                opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        Marca = "Acer";
                        break;
                    case 2:
                        Marca = "Dell";
                        break;
                    case 3:
                        Marca = "Asus";
                        break;
                    default:
                        System.out.println("Opción inválida, por favor ingrese del 1 al 3\n");
                        break;
                }
            } else {
                System.out.println("Ingrese un número entero\n");
                scanner.next();
            }
        } while (opt < 1 || opt > 3);

        System.out.println("Marca seleccionada: " + Marca);
        System.out.println();
    }

    public void Seleccionartamaño() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el tamaño");

        while (!sc.hasNextFloat()) {
            System.out.println("Opcion no valida, por favor ingrese un tamaño válido\n");
            sc.next();
        }
        Tamano = sc.nextFloat();
        System.out.println("El tamaño de su computador es: " + Tamano);
        System.out.println();
    }

    public void SeleccionarPrecio() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio");
        while (!sc.hasNextFloat()) {
            System.out.println("Opcion no valida, por favor ingrese un precio válido\n");
            sc.next();
        }
        Precio = sc.nextFloat();
        System.out.println("El precio de su computador es: " + Precio);
        System.out.println();
    }

    public void SeleccionarSistemaOperativo() {

        Scanner scanner = new Scanner(System.in);

        int opt = 0;
        do {
            System.out.println("Seleccione el sistema operativo que desea:");
            System.out.println("1. Windows 7");
            System.out.println("2. Windows 10");
            System.out.println("3. Windows 11");
            System.out.println();
            if (scanner.hasNextInt()) {
                opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        SistemaOperativo = "Windows 7";
                        break;
                    case 2:
                        SistemaOperativo = "Windows 10";
                        break;
                    case 3:
                        SistemaOperativo = "Windows 11";
                        break;
                    default:
                        System.out.println("Opción inválida, por favor ingrese del 1 al 3\n");
                        break;
                }
            } else {
                System.out.println("Ingrese un número entero\n");
                scanner.next();
            }
        } while (opt < 1 || opt > 3);

        System.out.println("Sistema operativo seleccionado: " + SistemaOperativo);
        System.out.println();
    }

    public void SeleccionarPr() {

        Scanner scanner = new Scanner(System.in);

        int opt = 0;
        do {
            System.out.println("Seleccione el procesador que desea:");
            System.out.println("1. AMD Ryzen");
            System.out.println("2. Intel® Core™ i5");
            System.out.println();
            if (scanner.hasNextInt()) {
                opt = scanner.nextInt();
                switch (opt) {
                    case 1:
                        Procesador = "AMD Ryzen";
                        break;
                    case 2:
                        Procesador = "Intel Core i5";
                        break;
                    default:
                        System.out.println("Opción inválida, ingrese 1 o 2\n");
                        break;
                }
            } else {
                System.out.println("Ingrese un número entero\n");
                scanner.next();
            }
        } while (opt < 1 || opt > 2);

        System.out.println("Procesador seleccionado: " + Procesador);
        System.out.println();
    }


}
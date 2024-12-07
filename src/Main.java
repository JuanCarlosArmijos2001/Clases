import java.util.Scanner;

/**
 * Clase principal que ejecuta el programa de cálculo de cargos por servicio de agua.
 */
public class Main {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar y obtener el consumo de agua en m³ del usuario
        System.out.print("Ingrese el consumo de agua en m³: ");
        double consumo = scanner.nextDouble();

        // Solicitar y obtener la pertenencia a la tercera edad del usuario
        System.out.print("¿Pertenece a la tercera edad? (S/N): ");
        boolean esTercerEdad = scanner.next().equalsIgnoreCase("S");

        // Solicitar y obtener la discapacidad del usuario
        System.out.print("¿Es discapacitado? (S/N): ");
        boolean esDiscapacitado = scanner.next().equalsIgnoreCase("S");
        //PEDIR PORCENTAJE DE DISCAPACIDAD

        // Calcular el cargo por el servicio de agua potable
        double cargoServicioAgua = ServicioAguaPotable.calcularCargoPorServicioDeAgua(consumo);

        // Calcular el impuesto de alcantarillado
        double impuestoAlcantarillado = ImpuestoAlcantarillado.calcularImpuestoAlcantarillado(cargoServicioAgua);

        // Calcular la tasa por recolección de basura
        double tasaRecoleccionBasura = TasaRecoleccionBasura.calcularTasaRecoleccionBasura();

        // Calcular la tasa por costo de procesamiento de datos
        double tasaCostoProcesamiento = TasaCostoProcesamiento.calcularTasaCostoProcesamiento();

        // Calcular el cargo total a pagar sin descuento
        double cargoTotal = CalculadorCargosAgua.calcularCargoTotal(cargoServicioAgua, impuestoAlcantarillado, tasaRecoleccionBasura, tasaCostoProcesamiento);

        // Aplicar el descuento correspondiente y calcular el cargo total a pagar con descuento
        double cargoTotalConDescuento = CalculadorCargosAgua.aplicarDescuento(cargoTotal, consumo, esTercerEdad, esDiscapacitado);

        // Imprimir los resultados
        System.out.println("Cargo por servicio de agua potable: $" + cargoServicioAgua);
        System.out.println("Impuesto de alcantarillado: $" + impuestoAlcantarillado);
        System.out.println("Tasa por recolección de basura: $" + tasaRecoleccionBasura);
        System.out.println("Tasa por costo de procesamiento de datos: $" + tasaCostoProcesamiento);
        System.out.println("Cargo total a pagar: $" + cargoTotal);
        System.out.println("Cargo total a pagar con descuento: $" + cargoTotalConDescuento);
    }
}
/**
 * Clase que realiza los cálculos finales y aplica los descuentos.
 */
class CalculadorCargosAgua {
    public static double calcularCargoTotal(double cargoServicioAgua, double impuestoAlcantarillado, double tasaRecoleccionBasura, double tasaCostoProcesamiento) {
        return cargoServicioAgua + impuestoAlcantarillado + tasaRecoleccionBasura + tasaCostoProcesamiento;
    }

    public static double aplicarDescuento(double cargoTotal, double consumo, boolean esTercerEdad, boolean esDiscapacitado) {
        if (consumo <= 15 && (esTercerEdad)) {
            return cargoTotal * 0.5;
        } else if (consumo > 15) {
            return cargoTotal * 0.7;
        } else if (esDiscapacitado) {
            //AQUI DEBE IR EL PORCENTAJE DE DISCAPACIDAD
            return cargoTotal * (1 - (esDiscapacitado ? 0.5 : 0));
        } else {
            return cargoTotal;
        }
    }
}
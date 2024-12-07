/**
 * Clase que calcula el cargo por el servicio de agua potable.
 */
class ServicioAguaPotable {
    public static double calcularCargoPorServicioDeAgua(double consumo) {
        double cargo = 0;
        if (consumo <= 15) {
            cargo = 3.0;
        } else if (consumo > 15 && consumo <= 25) {
            cargo = 3.0 + (consumo - 15) * 0.10;
        } else if (consumo > 25 && consumo <= 40) {
            cargo = 3.0 + (10 * 0.10) + (consumo - 25) * 0.20;
        } else if (consumo > 40 && consumo <= 60) {
            cargo = 3.0 + (10 * 0.10) + (15 * 0.20) + (consumo - 40) * 0.30;
        } else {
            cargo = 3.0 + (10 * 0.10) + (15 * 0.20) + (20 * 0.30) + (consumo - 60) * 0.35;
        }
        return cargo;
    }
}
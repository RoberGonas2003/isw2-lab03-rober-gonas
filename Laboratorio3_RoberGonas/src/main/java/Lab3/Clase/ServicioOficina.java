package Lab3.Clase;

public class ServicioOficina extends ServicioLimpieza{
    private int cantidadEmpleados;

    public ServicioOficina(int cantidadEmpleados, String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public double calcularPrecioFinal() {
        double duracionTotal = duracionHoras + (cantidadEmpleados * 0.1);
        double precioBase = duracionTotal * tarifaHora;
        return precioBase * 1.18;
    }

    @Override
    public String getDescripcion() {
        return "Servicio Oficina";
    }
    
}

package Lab3.Clase;

public class ConDesinfeccion extends ServicioAdicional{

    public ConDesinfeccion(ServicioLimpieza servicio) {
        super(servicio);
    }

    @Override
    public double calcularPrecioFinal() {
        return servicio.calcularPrecioFinal() + 15.0;
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion() + "Se agregó desinfectante ";
    }
    
}

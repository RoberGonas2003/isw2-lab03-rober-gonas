package Lab3.Clase;

public class ConLimpiezaVidrios extends ServicioAdicional{

    public ConLimpiezaVidrios(ServicioLimpieza servicio) {
        super(servicio);
    }

    @Override
    public double calcularPrecioFinal() {
        return servicio.calcularPrecioFinal() + 10.0;
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion() + "Se agregó limpia vidrios ";
    }
    
}

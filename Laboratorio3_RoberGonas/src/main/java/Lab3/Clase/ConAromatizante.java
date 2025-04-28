package Lab3.Clase;

public class ConAromatizante extends ServicioAdicional{

    public ConAromatizante(ServicioLimpieza servicio) {
        super(servicio);
    }

    @Override
    public double calcularPrecioFinal() {
        return servicio.calcularPrecioFinal() + 5.0;
    }

    @Override
    public String getDescripcion() {
        return servicio.getDescripcion() + "Se agregó aromatizante ";
    }


}

package Lab3.Clase;

public abstract class ServicioAdicional extends ServicioLimpieza{

    protected ServicioLimpieza servicio;

    public ServicioAdicional(ServicioLimpieza servicio) {
        super(servicio.getDireccionCliente(), servicio.getDuracionHoras(), servicio.getTarifaHora(), servicio.isIncluyeMateriales(), servicio.getNombreCliente());
        this.servicio = servicio;
    } 

    @Override
    public abstract double calcularPrecioFinal();

    @Override
    public abstract String getDescripcion();
      
}

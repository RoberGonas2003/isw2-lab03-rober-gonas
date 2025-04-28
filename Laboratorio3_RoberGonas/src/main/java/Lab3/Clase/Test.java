package Lab3.Clase;

public class Test {
    public static void main(String[] args) {
        // Ejercicio 1
        
        System.out.println("|Ejercicio 1|");    
        ServicioLimpieza sh = new ServicioHogar(true,"Rio elba 160", 2.9 , 40.5 ,true,"Andre");
        System.out.println("Precio del Servicio de Limpieza Hogar: S/" + sh.calcularPrecioFinal());
        
        ServicioLimpieza so = new ServicioOficina(7 ,"Arriola", 4.5 , 70.99 ,true,"America Movil");
        System.out.println("Precio del Servicio de Limpieza Oficina: S/" + so.calcularPrecioFinal());
        
        ServicioLimpieza industrial = new ServicioIndustrial(2.0 , "Av Los ingenieros", 8.0 , 100.5 ,true, "Alicorp");
        System.out.println("Precio Servicio de Limpieza Industrial: S/" + industrial.calcularPrecioFinal());
        
        // Ejercicio 2
        System.out.println("|Ejercicio 2|");
        DescuentoClienteFrecuente dcf = new DescuentoClienteFrecuente();
        DescuentoCompania dc = new DescuentoCompania();
        
        double precioH = sh.calcularPrecioFinal();
        System.out.println("Precio Base de Servicio de Limpieza Hogar: " + precioH);
        double descuentoCFH = dcf.aplicarDescuento(precioH);
        System.out.println("Precio final con descuento cliente frecuente: " + descuentoCFH);
        
        double precioI = industrial.calcularPrecioFinal();
        System.out.println("Precio Base de Servicio de Limpieza Industria: " + precioI);
        double descuentoCI = dc.aplicarDescuento(precioI);
        System.out.println("Precio final con descuento campaña: " + descuentoCI);
        
        // Ejercicio 3
        System.out.println("|Ejercicio 3|");
        sh = new ConAromatizante(sh);
        System.out.println( sh.getDescripcion() + sh.calcularPrecioFinal());   
        sh = new ConDesinfeccion(sh);
        System.out.println( sh.getDescripcion() + sh.calcularPrecioFinal());
        
        // Ejercicio 4
        System.out.println("|Ejercicio 4|");
        ServicioFactory servi = new ServicioFactory();
        
        ServicioLimpieza crearSer = servi.crearServicio("industrial", "Calle Los Valores", 4.0, 56.99, false, "Alessander VALE", "1.5");
        System.out.println(crearSer.getDescripcion()+ "El precio final es: " + crearSer.calcularPrecioFinal());
    }
}
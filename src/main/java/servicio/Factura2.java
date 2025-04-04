package servicio;

import dto.Persona;
import dto.Producto;

/*
 * 1. si el nombre es igual checho hágale un descuento del 10% 2. si el nombre
 * es igual sharon hágale un descuento del 5%. 3. si el nombre es igual diego
 * hágale un descuento del 50% 4. cualquier otro nombre sin descuento.
 * 
 */
public class Factura2 {

	public void getFactura2(Persona persona, Producto producto) {

		double descuentoChecho = 0.1;
		double descuentoSharon = 0.05;
		double descuentoDiego = 0.5;
		double subTotal = producto.getCantidadProducto() * producto.getValorVenta();
		double valorDescuento = 0.0;
		double totalPago = 0.0;

		System.out.println("nombre producto: " + producto.getNombre());
		System.out.println("cantidad: " + producto.getCantidadProducto());
		System.out.println("valor producto: " + producto.getValorVenta());

		switch (persona.getNombre()) {
		case "Checho":
			valorDescuento = subTotal * descuentoChecho;
			totalPago = subTotal - valorDescuento;
			System.out.println(persona.getNombre() + " tu pago es de: " + totalPago);

			break;

		case "Sharon":
			valorDescuento = subTotal * descuentoSharon;
			totalPago = subTotal - valorDescuento;
			System.out.println(persona.getNombre() + " tu pago es de: " + totalPago);
			break;

		case "Diego":
			valorDescuento = subTotal * descuentoDiego;
			totalPago = subTotal - valorDescuento;
			System.out.println(persona.getNombre() + " tu pago es de: " + totalPago);
			break;

		default:

			System.out.println(persona.getNombre() + " tu pago es de: " + subTotal);
		}

	}

	public static void main(String[] args) {

		Factura2 factura2 = new Factura2();
		Persona persona = new Persona();
		Producto producto = new Producto();
		
		
		persona.setNombre("Checho");
		producto.setNombre("harina pan");
	    producto.setCantidadProducto(3); 
		producto.setValorVenta(3);
		
		
		
		factura2.getFactura2(persona, producto); 

	}
}

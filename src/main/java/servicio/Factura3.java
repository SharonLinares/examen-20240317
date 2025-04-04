package servicio;

import dto.Persona;
import dto.Producto;

public class Factura3 {

	public double getFactura(Producto producto) {

		System.out.println("nombre del producto: " + producto.getNombre());
		System.out.println("cantidad del producto: " + producto.getCantidadProducto());
		System.out.println("valor del producto: " + producto.getValorVenta());

		double valorApagar = producto.getCantidadProducto() * producto.getValorVenta();
		System.out.println("el valor a pagar es " + valorApagar);
		return valorApagar;

	}

	public static void main(String[] args) {

		Factura3 factura3 = new Factura3();
		Producto producto = new Producto();
		Persona persona = new Persona();

		producto.setNombre("mause");
		producto.setCantidadProducto(1);
		producto.setValorVenta(5);

		persona.setNombre("Robin");
		persona.setApellido("Arellano");

		double valorPagar = factura3.getFactura(producto);
		double totalPagarConDescuento = 0;
		if (persona.getNombre() == "Robin" && persona.getApellido() == "Arellano") {

			double descuento = 0.2;
			double valorDescuento = valorPagar * descuento;
			totalPagarConDescuento = valorPagar - valorDescuento;

			System.out.println("su pago con descuento es: " + totalPagarConDescuento);
		}

		if (producto.getNombre() == "iphone" || persona.getNombre() == "Sharon") {

			double descuentoSharon = 0.1;
			double valorDescuento = valorPagar * descuentoSharon;
			totalPagarConDescuento = valorPagar - valorDescuento;

		}

		double valorPagado = 40;

		if (valorPagado >= valorPagar) {

			double cambio = valorPagado - totalPagarConDescuento;

			System.out.println("su cambio es : " + cambio);

		} else {

			double saldoPendiente = valorPagar - valorPagado;
			System.out.println("su saldo pendiente es :  " + saldoPendiente);

		}

	}

}

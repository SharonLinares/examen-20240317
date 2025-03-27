package servicio;

import dto.Persona;
import dto.Producto;

public class Factura {

	public void getFactura(Producto producto, Persona persona) {

		double subTotal = producto.getCantidadProducto() * producto.getValorVenta();

		System.out.println("nombre del producto: " + producto.getNombre());
		System.out.println("nombre de la persona: " + persona.getNombre());

	}

	public void getFactura(String nombreProducto, int cantidad, float valorProducto) {

		double subTotal = cantidad * valorProducto;
		double descuento = 0.1;

		System.out.println("nombre producto: " + nombreProducto);
		System.out.println("cantidad: " + cantidad);
		System.out.println("valor producto: " + valorProducto);

		if (subTotal > 100) {

			double valorDescuento = subTotal * descuento;
			double totalPago = subTotal - valorDescuento;
			System.out.println("descuento de : " + valorDescuento);
			System.out.println("total a pagar: " + totalPago);

		} else {

			System.out.println("total a pagar: " + subTotal);
		}

	}

	public static void main(String[] args) {

		Factura factura = new Factura();

		factura.getFactura("harina pan", 50, 3);

	}

}

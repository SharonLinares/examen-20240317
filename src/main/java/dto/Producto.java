package dto;

public class Producto {

	private String nombre;
	private String tipo;
	private float valorCompra;
	private float valorVenta;
	private int cantidadProducto;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public float getValorCompra() {
		return valorCompra;
	}

	public void setValorCompra(float valorCompra) {
		this.valorCompra = valorCompra;
	}

	public float getValorVenta() {
		return valorVenta;
	}

	public void setValorVenta(float valorVenta) {
		this.valorVenta = valorVenta;
	}

	public int getCantidadProducto() {
		return cantidadProducto;
	}

	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}

}

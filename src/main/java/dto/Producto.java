package dto;

public class Producto {

	
	private String nombre;
	private String tipo;
	private int valorCompra;
	private int valorVenta;
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
	public int getValorCompra() {
		return valorCompra;
	}
	public void setValorCompra(int valorCompra) {
		this.valorCompra = valorCompra;
	}
	public int getValorVenta() {
		return valorVenta;
	}
	public void setValorVenta(int valorVenta) {
		this.valorVenta = valorVenta;
	}
	public int getCantidadProducto() {
		return cantidadProducto;
	}
	public void setCantidadProducto(int cantidadProducto) {
		this.cantidadProducto = cantidadProducto;
	}
	
	
}

package program2;

import java.io.Serializable;

public class Articulo implements Serializable {

	
	  private static int contador = 1;
	  private String descripcion;
	  private double precioCompra;
	  private double precioVenta;
	  private int stock;
	  private int codigo;

	
	  public Articulo(String descripcion, double precioCompra, double precioVenta, int stock)
	      throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException {
	    setDescripcion(descripcion);
	    setPrecioCompra(precioCompra);
	    setPrecioVenta(precioVenta);
	    setStock(stock);
	    setCodigo();
	  }

	  public Articulo(int codigoArticulo) {
	    setCodigo(codigoArticulo);
	  }

	
	  private void setCodigo() {
	    this.codigo = Articulo.contador++;
	  }


	  private void setCodigo(int codigo) {
	    this.codigo = codigo;
	  }

	
	  public int getCodigo() {
	    return codigo;
	  }

	 
	  public String getDescripcion() {
	    return descripcion;
	  }

	
	  void setDescripcion(String descripcion) {
	    this.descripcion = descripcion;
	  }

	
	  public double getPrecioCompra() {
	    return precioCompra;
	  }


	  void setPrecioCompra(double precioCompra) throws PrecioCompraNegativoException {
	    if (precioCompra >= 0) {
	      this.precioCompra = precioCompra;
	    } else
	        throw new PrecioCompraNegativoException("El precio de compra no puede ser negativo.");
	  }

	  public double getPrecioVenta() {
	    return precioVenta;
	  }

	 
	  void setPrecioVenta(double precioVenta) throws PrecioVentaNegativoException {
	    if (precioVenta >= 0) {
	      this.precioVenta = precioVenta;
	    } else
	        throw new PrecioVentaNegativoException("El precio de venta no puede ser negativo.");

	  }

	  public int getStock() {
	    return stock;
	  }

	  void setStock(int stock) throws StockNegativoException {
	    if (stock >= 0) {
	      this.stock = stock;
	    } else
	        throw new StockNegativoException("El stock no puede ser negativo.");
	  }

	  public void incrementaStock(int cantidad) throws StockNegativoException, CantidadNegativaException {
	    if (cantidad > 0)
	      setStock(getStock() + cantidad);
	    else
	      throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");
	  }

	  public void decrementaStock(int cantidad) throws CantidadNegativaException, StockNegativoException {
	    if (cantidad > 0)
	      setStock(getStock() - cantidad);
	    else
	      throw new CantidadNegativaException("No se puede añadir una cantidad de stock negativo.");
	  }

	  @Override
	  public int hashCode() {
	    final int prime = 31;
	    int result = 1;
	    result = prime * result + codigo;
	    return result;
	  }

	  @Override
	  public boolean equals(Object obj) {
	    if (this == obj)
	      return true;
	    if (obj == null)
	      return false;
	    if (getClass() != obj.getClass())
	      return false;
	    Articulo otro = (Articulo) obj;
	   return this.codigo == otro.codigo ;
	  }

	  public String toString() {
	    return "\nCodigo: " + getCodigo() + "\nDescripcion: " + getDescripcion() + "\nPrecioCompra: " + getPrecioCompra()
	        + "\nPrecioVenta: " + getPrecioVenta() + "\nStock: " + getStock() + "\n'''''''''''''''''''''''''''''''''''''''";
	  }
	  
	  //SE PUEDE SETEAR TODO EXCEPTO LAS EXCEPCIONES
	  
	  public void set(String descripcion, double precioCompra, double precioVenta, int stock)
	      throws StockNegativoException, PrecioCompraNegativoException, PrecioVentaNegativoException {
	    setDescripcion(descripcion);
	    setPrecioCompra(precioCompra);
	    setPrecioVenta(precioVenta);
	    setStock(stock);
	  }

}
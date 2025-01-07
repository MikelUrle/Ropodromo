package com.mikel.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="ropa")
public class Ropa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="precio")
	private double precio;
	
	@Column(name="foto")
	private String foto;
	
	@ManyToOne
	private Talla talla;
	
	@ManyToOne
	private Categoria categoria;

	public Ropa(int id, String nombre, double precio, String foto, Talla talla, Categoria categoria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.foto = foto;
		this.talla = talla;
		this.categoria = categoria;
	}

	public Ropa() {
		super();
		this.id = 0;
		this.nombre = "";
		this.precio = 0.0;
		this.foto = "";
		this.talla = new Talla();
		this.categoria = new Categoria();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Talla getTalla() {
		return talla;
	}

	public void setTalla(Talla talla) {
		this.talla = talla;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Ropa [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", foto=" + foto + ", talla=" + talla
				+ ", categoria=" + categoria + "]";
	}
	
}


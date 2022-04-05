package com.sm.modelos;

import java.text.DateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@Entity
@Table(name="cat_subs", catalog="subscriptormanager", schema="")
public class Sub {

	@Id
	@Column
	private Integer idsub;
	@Column
	private String sub;
	@Column
	private String sub_nombre;
	@Column
	private String sub_apellido;
	@Column
	private String sub_correo;
	@Temporal(TemporalType.DATE)
	@DateTimeFormat(iso = ISO.DATE)
	@Column
	private Date sub_fecha;
	
	public Date getSub_fecha() {
		return sub_fecha;
	}
	public void setSub_fecha(Date sub_fecha) {
		this.sub_fecha = sub_fecha;
	}
	public Integer getIdsub() {
		return idsub;
	}
	public void setIdsub(Integer idsub) {
		this.idsub = idsub;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	public String getSub_nombre() {
		return sub_nombre;
	}
	public void setSub_nombre(String sub_nombre) {
		this.sub_nombre = sub_nombre;
	}
	public String getSub_apellido() {
		return sub_apellido;
	}
	public void setSub_apellido(String sub_apellido) {
		this.sub_apellido = sub_apellido;
	}
	public String getSub_correo() {
		return sub_correo;
	}
	public void setSub_correo(String sub_correo) {
		this.sub_correo = sub_correo;
	}
}

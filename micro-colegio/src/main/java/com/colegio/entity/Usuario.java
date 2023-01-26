package com.colegio.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "UsuariosColegio")
public class Usuario {

	@DynamoDBHashKey(attributeName = "usuarioId")
	private Integer id;
	@DynamoDBAttribute(attributeName = "identificacion")
	private String identificacion;
	@DynamoDBAttribute(attributeName = "password")
	private String password;
	
	public Usuario() {}
	
	public Usuario(Integer id, String identificacion, String password) {
		this.id = id;
		this.identificacion = identificacion;
		this.password = password;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getIdentificacion() {
		return identificacion;
	}


	public void setIdentificacion(String identificacion) {
		this.identificacion = identificacion;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
}

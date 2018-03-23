package com.economizate;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "usuarios", eager = true)
public class UsuariosBean {
	
	public UsuariosBean() {
		
	}
	
	public String getMensaje() {
		return "Hola Mundo";
	}

}

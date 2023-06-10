package com.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CalculBean {

	private int nombre1;
	private int nombre2;
	private int res;
	
	public int getNombre1() {
		return nombre1;
	}
	public void setNombre1(int nombre1) {
		this.nombre1 = nombre1;
	}
	public int getNombre2() {
		return nombre2;
	}
	public void setNombre2(int nombre2) {
		this.nombre2 = nombre2;
	}
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res = res;
	}
	
	public void somme() {
		res=nombre1+nombre2;
		nombre1 = nombre2 = 0;
	}
	public void produit() {
		res=nombre1*nombre2;
		nombre1 = nombre2 = 0;
	}
	
	public void moins() {
		res=nombre1-nombre2;
		nombre1 = nombre2 = 0;
	}
	public void division() {
		res=nombre1/nombre2;
		nombre1 = nombre2 = 0;
	}
}

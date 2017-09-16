
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.Icon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author enriquejosegaleanotalavera
 */
public class usuario implements Serializable{
	public final long SerializableUID = 333L;
	private String nombreCompleto;
	private String nickname;
	private String password;
	private String pais;
	private Date fechaDeNacimiento;
	private Icon fotografia;

	usuario() {
	}
	

	public usuario(String nombreCompleto, String nickname, String password, String pais, Date fechaDeNacimiento, Icon fotografia) {
		this.nombreCompleto = nombreCompleto;
		this.nickname = nickname;
		this.password = password;
		this.pais = pais;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.fotografia = fotografia;
	}



	public Icon getFotografia() {
		return fotografia;
	}

	public void setFotografia(Icon fotografia) {
		this.fotografia = fotografia;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public Date getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}

	public void setFechaDeNacimiento(Date fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	@Override
	public String toString() {
		return nombreCompleto;
	}
	
}

package uniSusWeb.beans;

import java.util.List;

public class Register extends AbstractBean {
	private String name;
	private String type;
	private List<User> resposibleProfissionals;
	private List<User> pacients;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<User> getResposibleProfissionals() {
		return resposibleProfissionals;
	}
	public void setResposibleProfissionals(List<User> resposibleProfissionals) {
		this.resposibleProfissionals = resposibleProfissionals;
	}
	public List<User> getPacients() {
		return pacients;
	}
	public void setPacients(List<User> pacients) {
		this.pacients = pacients;
	}


}

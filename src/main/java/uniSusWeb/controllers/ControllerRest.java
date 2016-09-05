package uniSusWeb.controllers;

import uniSusWeb.beans.BeanAbstrato;

public interface ControllerRest <T extends BeanAbstrato>{
	public T get(Long id);
}

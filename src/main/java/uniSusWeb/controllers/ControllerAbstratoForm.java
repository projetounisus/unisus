package uniSusWeb.controllers;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.tiles.Attribute;
import org.springframework.core.GenericTypeResolver;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import uniSusWeb.beans.BeanAbstrato;
import uniSusWeb.beans.Endereco;
import uniSusWeb.beans.Usuario;
import uniSusWeb.constants.Constants;
import uniSusWeb.utils.ModelAndViewUtils;

public abstract class ControllerAbstratoForm <T extends BeanAbstrato> extends BeanAbstrato{
	public ControllerAbstratoForm() {		
		//TODO: extrair
		this.tipoGenerico = (Class<T>) GenericTypeResolver.resolveTypeArgument(this.getClass(), ControllerAbstratoForm.class);

		//TODO  funcionando de forma parecida com um singleTon, verificar se é necessário		
		if(beansParaForms == null)
		{
			beansParaForms = relacionaBeansAForms();
		}
	}
	
	static private Map< Class<? extends BeanAbstrato>, String> beansParaForms;
	
	//TODO: verificar se isto é seguro
	private Class<T> tipoGenerico;
	
	private Map<Class<? extends BeanAbstrato>, String> relacionaBeansAForms(){
		Map<Class<? extends BeanAbstrato>, String> beansParaForms = new HashMap<Class<? extends BeanAbstrato>, String>();
		
		beansParaForms.put(Usuario.class, "formUsuario");
		beansParaForms.put(Endereco.class, "formEndereco");
		
		return beansParaForms;
	}
	
	protected abstract String obterNomeClassObjeto();
	
	protected abstract String obterPathForm();
	
	protected abstract String obterTituloForm();
	
	@RequestMapping("/editar/{id}")
	public ModelAndView obterTemplateForm(@PathVariable long id, HttpSession sessao){
		String templateName = "formTemplate";
		
		ModelAndView templateForm = new ModelAndView(templateName);
		templateForm.addObject("idObjeto", id);
		
		String nomeClassObjeto = this.obterNomeClassObjeto();
		String pathForm = this.obterPathForm();
		
		Attribute formFields = new Attribute(); 
		formFields.setValue(pathForm);
		
		templateForm.addObject("formFields", formFields);
		templateForm.addObject("nomeObjeto", nomeClassObjeto);
		
		String tituloForm = this.obterTituloForm();
		templateForm.addObject("tituloForm", tituloForm);
		
		ModelAndView form = ModelAndViewUtils.construirModeloPadronizado(templateForm);
		
		return form;
	}
	
	
}

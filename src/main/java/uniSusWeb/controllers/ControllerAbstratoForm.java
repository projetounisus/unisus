package uniSusWeb.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.GenericTypeResolver;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import uniSusWeb.beans.BeanAbstrato;
import uniSusWeb.beans.Endereco;
import uniSusWeb.beans.Usuario;
import uniSusWeb.constants.Constants;

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
	
	@RequestMapping("/form/{id}")
	public ModelAndView obterForm(@PathVariable long id){
		String nomeDoForm = this.beansParaForms.get(this.tipoGenerico);
		String pathDoForm = String.format(Constants.PREFIXO_PATH_FORMS + "/%s", nomeDoForm);
		ModelAndView form = new ModelAndView(pathDoForm);
		form.addObject("objectId", id);
		return form; 
	}
	
	protected abstract String obterNomeClassObjeto();
	
	@RequestMapping("/editar/{id}")
	public ModelAndView obterTemplateForm(@PathVariable long id){
		String templateName = Constants.PREFIXO_PATH_TEMPLATE_PAGES + "/formTemplate";
		
		ModelAndView templateForm = new ModelAndView(templateName);
		templateForm.addObject("idObjeto", id);
		
		String nomeClassObjeto = this.obterNomeClassObjeto();
		templateForm.addObject("nomeObjeto", nomeClassObjeto);
		
		return templateForm;
	}
	
	
}

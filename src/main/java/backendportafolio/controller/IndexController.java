package backendportafolio.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import backendportafolio.constant.ViewConstant;


@Controller
@RequestMapping("/vistas")
public class IndexController {
	
	private static final Log LOG = LogFactory.getLog(IndexController.class);
	
	@GetMapping("/showindex")
	public String showindex() {
			LOG.info("returning INDEX view");
			return ViewConstant.INDEX;
		}
	@GetMapping("/indexEnglish")
	public String indexEnglish() {
			LOG.info("returning INDEX_ENGLISH view");
			return ViewConstant.INDEX_ENGLISH;
		}
	
	@GetMapping("/PrincipalPage")
	public String PrincipalPage() {
		LOG.info("returning PRINCIPALPAGE view");
		return ViewConstant.PRINCIPALPAGE;
	}
	
	@GetMapping("/PrincipalPageEnglish")
	public String PrincipalPageEnglish() {
		LOG.info("returning PRINCIPALPAGEENGLISH view");
		return ViewConstant.PRINCIPALPAGEENGLISH;
	}
	
	@GetMapping("/IniciarSesion")
	public String IniciarSesion() {
		LOG.info("returning LOGIN view");
		return ViewConstant.LOGIN;
	}
	
	@GetMapping("/LoginEnglish")
	public String LoginEnglish() {
		LOG.info("returning LOGIN_ENGLISH view");
		return ViewConstant.LOGIN_ENGLISH;
	}

	@GetMapping("/mensajeR2D2")
	public String mensajeR2D2() {
		LOG.info("returning MENSAJER2D2 view");
		return ViewConstant.MENSAJER2D2;
	}
	
	@GetMapping("/mensajeR2D2English")
	public String mensajeR2D2English() {
		LOG.info("returning MENSAJER2D2_ENGLISH view");
		return ViewConstant.MENSAJER2D2_ENGLISH;
	}
	
	@GetMapping("/SMSespañol")
	public String SMSespañol() {
		LOG.info("returning SMS_ESPAÑOL view");
		return ViewConstant.SMS_ESPAÑOL;
	}
	
	@GetMapping("/SMSenglish")
	public String SMSenglish() {
		LOG.info("returning SMS_ENGLISH view");
		return ViewConstant.SMS_ENGLISH;
	}
	
	@GetMapping("/newUserForm")
	public String NewUserForm() {
		LOG.info("returning NEWUSER_FORM view");
		return ViewConstant.NEWUSER_FORM;
	}
	
	@GetMapping("/newUserFormEnglish")
	public String newUserFormEnglish() {
		LOG.info("returning NEWUSER_FORM_ENGLISH view");
		return ViewConstant.NEWUSER_FORM_ENGLISH;
	}
	
	@GetMapping("/Proyectos")
	public String Proyectos() {
		LOG.info("returning PROYECTOS view");
		return ViewConstant.PROYECTOS;
	}
	
	@GetMapping("/ProyectosEnglish")
	public String ProyectosEnglish() {
		LOG.info("returning PROYECTOS_ENGLISH view");
		return ViewConstant.PROYECTOS_ENGLISH;
	}
	
	@GetMapping("/GeneradorQR")
	public String GeneradorQR() {
		LOG.info("returning GENERADORQR view");
		return ViewConstant.GENERADORQR;
	}
	
	@GetMapping("/GeneradorQRenglish")
	public String GeneradorQRenglish() {
		LOG.info("returning GENERADORQR_ENGLISH view");
		return ViewConstant.GENERADORQR_ENGLISH;
	}
	
	@GetMapping("/DoctoPDFConverter")
	public String DoctoPDFConverter() {
		LOG.info("returning DOCTOPDFCONVERTER view");
		return ViewConstant.DOCTOPDFCONVERTER;
	}
	
	@GetMapping("/DoctoPDFConverterEnglish")
	public String DoctoPDFConverterEnglish() {
		LOG.info("returning DOCTOPDFCONVERTER_ENGLISH view");
		return ViewConstant.DOCTOPDFCONVERTER_ENGLISH;
	}
	
	@GetMapping("/PDFmerger")
	public String PDFmerger() {
		LOG.info("returning PDFMERGER view");
		return ViewConstant.PDFMERGER;
	}
	
	@GetMapping("/PDFmergerEnglish")
	public String PDFmergerEnglish() {
		LOG.info("returning PDFMERGER_ENGLISH view");
		return ViewConstant.PDFMERGER_ENGLISH;
	}

}

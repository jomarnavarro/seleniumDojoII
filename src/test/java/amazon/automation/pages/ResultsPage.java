package amazon.automation.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultsPage {
	public WebDriver driver;
	
	//elementos
	//lista de resultados
	List<WebElement> listaArticulos;
	
	
	//Constructor
	public ResultsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//comportamiento / metodos
	//validar que hay resultados
	
	//seleccionarArticulos
	
	//validarque si sea el articulo que busque
	
	public void validarResultados(int numResultados) {}
	
	public void seleccionarArticulo(String nameArticulo) {}
	
	public void validateArticleContains(String nameArticulo) {}

	
	
	
	
	
	

}

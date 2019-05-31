package amazon.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	public WebDriver driver;
	
	//elements
//	* Title
//	* campo de b;usqueda
//	* bot;on de busqueda
	WebElement title;
	WebElement campoBusqueda;
	WebElement botonBusqueda;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
//	Comportamiento/Metodos
//	* Validacion de url
//	* búsqueda sin articulo
//	* busqueda con un articulo
	
	public void validarUrl(String URL) {}
	
	public void busquedaConArticulo(String articulo) {
		//encontrar el campoBusqueda
		campoBusqueda = driver.findElement(By.id("twotabsearchtextbox"));
		//encontrar el boton de busqueda
		botonBusqueda = driver.findElement(By.className("nav-input"));
		//ingresar el articulo en el campo
		campoBusqueda.sendKeys(articulo);
		//dar click al boton de busqueda.
		botonBusqueda.click();
		
	}
	
	public void busquedaSinArticulo() {}
	
	

}

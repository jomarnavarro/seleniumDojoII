package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import amazon.automation.pages.FilterPage;
import amazon.automation.pages.HomePage;
import amazon.automation.pages.ResultsPage;

public class AmazonTest {
	
	WebDriver driver;
	HomePage home;
	ResultsPage results;
	FilterPage filter;
	
	@Before
	public void arrancarBrowser() {
		driver = new ChromeDriver();
		driver.get("http://www.amazon.com.mx");
		home = new HomePage(driver);
		results = new ResultsPage(driver);
		filter = new FilterPage(driver);
	}
	
	@Test
	public void probarBusquedaArticulo() {
		home.busquedaConArticulo("guantes de boxeo");
		results.validarResultados(15);
		filter.filtraPorMarca("Everlast");
		
	}
	
	@After
	public void cerrarBrowser() {
		driver.close();
	}

}

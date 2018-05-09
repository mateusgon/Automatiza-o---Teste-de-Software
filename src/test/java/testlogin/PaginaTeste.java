package testlogin;


import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



public class PaginaTeste {

    static WebDriver driver;

    @BeforeClass
    public static void configura()
    {
        System.setProperty("webdriver.gecko.driver", "/home/cassio/Downloads/geckodriver");
        driver = (WebDriver) new FirefoxDriver();
        driver.get("https://atlantis.isti.cnr.it:5000/");
    }
    
    /**
     * Função que acessa os cursos
     *
    @Test
    public void testMyCourses()
    {
        myFirstTest pag = PageFactory.initElements(driver, myFirstTest.class);
        pag.loga();
        pag.preencheDados("teacher@gmail.com", "Pass12345");
        pag.acessaLoginModal();
        pag.myCoursesNode();
    }
    * 
    */
    
    public void testNewUser(){
        
        myFirstTest pag = PageFactory.initElements(driver, myFirstTest.class);
        pag.loga();
        pag.newUser("teacher@gmail.com", "Pass12345","Pass12345");
        
    }
}

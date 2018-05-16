package testconfiguracoes;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;



public class PaginaTesteLogin {
   static WebDriver driver;
  
   
    @BeforeClass
    public static void configura()
    {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rian Alves\\Desktop\\UFJF\\Teste de Software\\geckodriver.exe");
        driver = (WebDriver) new FirefoxDriver();
        driver.get("https://atlantis.isti.cnr.it:5000/");
        System.out.print("Escolher teste");
    }

   
    public void testLoginCorrectStudent()
    {
        Teste_Automatizado pag = PageFactory.initElements(driver, Teste_Automatizado.class);
        
        pag.loga();
        pag.preencheDados("student1@gmail.com", "pass");
        pag.acessaLoginModal();
        
       // driver.quit();
        //pag.acessaCurso();
    }
     //Visualizar Página Inicial sem senha 
    public void testaVisualizarInicio()
    {
        Teste_Automatizado pag = PageFactory.initElements(driver, Teste_Automatizado.class);
        pag.loga();
           
    }
    
    //Visualizar a aula
    public void testaVisualizarAula()
    {
        Teste_Automatizado pag = PageFactory.initElements(driver, Teste_Automatizado.class);
        pag.loga();
        pag.preencheDados("teacher@gmail.com", "pass");
        pag.acessaLoginModal();
        pag.myCoursesNode();
        pag.accessSessions();
        
    }

    //Modificar a Senha - ok
    
    public void testaModificarSenha()
    {
        Teste_Automatizado pag = PageFactory.initElements(driver, Teste_Automatizado.class);
        pag.loga();
        pag.preencheDados("teacher@gmail.com", "pass");
        pag.acessaLoginModal();
        pag.openSettings();
        pag.changePassword();
        pag.btnchangePassword();
        
    }
    
    //Modificar a Imagem - OK
    public void testaModificarImagem()
    {
        Teste_Automatizado pag = PageFactory.initElements(driver, Teste_Automatizado.class);
        pag.loga();
        pag.preencheDados("teacher@gmail.com", "pass");
        pag.acessaLoginModal();
        pag.openSettings();
        pag.modificarImagem();
        //pag.myCoursesNode();
    }
    
    public void testLoginInCorrectStudent()
    {
        Teste_Automatizado pag = PageFactory.initElements(driver, Teste_Automatizado.class);
        
        pag.loga();
        pag.preencheDados("student1@gmail.com", "passIncorret");
    }
    
    
    public void testLoginCorrectTeacher()
    {
        Teste_Automatizado pag = PageFactory.initElements(driver, Teste_Automatizado.class);
        
        pag.loga();
        pag.preencheDados("teacher@gmail.com", "pass");
        pag.acessaLoginModal();

    }
}

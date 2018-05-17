package testforum;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import testcursosalunos.TesteCursosAlunosAux;

public class TesteCursosForum {
       static WebDriver driver;

    @BeforeClass
    public static void configura()
    {
        System.setProperty("webdriver.gecko.driver", "/home/mateusgon/Downloads/geckodriver");
        driver = (WebDriver) new FirefoxDriver();
        driver.get("https://atlantis.isti.cnr.it:5000/");
    }
    
    @Test
    public void testLoginCorrectTeacher()
    {
        TesteCursosForumAux pag = PageFactory.initElements(driver, TesteCursosForumAux.class);
        pag.loga();
        pag.preencheDados("teacher@gmail.com", "pass");
        pag.acessaLoginModal();
        // Responsável por adicionar fórum pag.adicionarForum();
        // Responsável por adicionar fórum repetido pag.adicionarForumRepetido();
        // Responsável por tentar adicionar fórum sem nome pag.adicionarForumSemTitulo();
        // Responsável por tentar adicionar fórum sem descrição pag.adicionarForumSemDescricao();
        // Responsável por adicionar fórum com caracteres inválidos pag.adicionarForumCaracteresInvalidos();
        
    }
}

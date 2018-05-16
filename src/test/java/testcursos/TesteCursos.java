package testcursos;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import testaulas.TesteAulaAux;

public class TesteCursos {
    
    static WebDriver driver;

    @BeforeClass
    public static void configura()
    {
          System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mateus G\\Desktop\\geckodriver.exe");
        driver = (WebDriver) new FirefoxDriver();
        driver.get("https://atlantis.isti.cnr.it:5000/");
    }
    
    @Test
    public void testLoginCorrectTeacher()
    {
        TesteCursosAux pag = PageFactory.initElements(driver, TesteCursosAux.class);
        pag.loga();
        pag.preencheDados("teacher@gmail.com", "pass");
        pag.acessaLoginModal();
      // >>> Respons�vel por criar um curso <<< pag.criaCurso(); 
      // >>> Respons�vel por criar dois cursos com nomes iguais <<<  pag.criarCursoNomesIguais();
      // >>> Respons�vel por criaexcluirCursor curso com nome vazio, somente com n�meros e com acentos <<<
      // pag.criarCursoInvalidoSemTexto(); 
      // pag.criarCursoInvalidoSomenteNumeros();
      // pag.criarCursoInvalidoSomenteAcento();
      // >>> Respons�vel por adicionar informa��es referentes ao curso <<< pag.adicionarInformacaoCurso();
      // >>> Respons�vel por editar informa��es referentes ao curso <<< pag.editarInformacaoCurso();
      //pag.editNomeCurso();
      //pag.excluirCurso();
    }
}

package testconfiguracoes;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Teste_Automatizado {

    //Acesso ao Login 
    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "signUpButton")
    private WebElement botao;

    @FindBy(id = "log-in-btn")
    WebElement botaoLogin;

    //Acesso as Configurações 
    @FindBy(id = "settings-button")
    WebElement settings;

    //Alteração das Senhas
    @FindBy(id = "inputCurrentPassword")
    WebElement currentPassword;

    @FindBy(id = "inputNewPassword")
    WebElement newPassword;

    @FindBy(id = "inputNewPassword2")
    WebElement repeatPassword;

    //Abrir aula
    @FindBy(css = "div[class='col l6 m7 s7 valign course-title']")
    List<WebElement> listCourses;
 
    @FindBy(css = "button[class='waves-effect btn-flat modal-footer-button']")
    List<WebElement> envio; 
    
    @FindBy(css = "label[class='label-input-file waves-effect btn']")
    List<WebElement> changePicture; 
   
              
    @FindBy(css = "div[data-tooltip='Sessions']")
    List<WebElement> listAbas;
    
    @FindBy(id = "md-tab-label-0-1")
    WebElement session;

    @FindBy(id = "md-tab-label-0-2")
    WebElement forum;

    @FindBy(id = "input-file-0")
    WebElement change;

    private WebDriver driver;

    public Teste_Automatizado(WebDriver driver) {
        this.driver = driver;
    }

    public Teste_Automatizado preencheDados(String nome, String sobrenome) {
        this.email.sendKeys(nome);
        this.password.sendKeys(sobrenome);
        PageFactory.initElements(driver, this);
        return this;
    }

    public void loga() {
        driver.findElement(By.linkText("Log in")).click();

    }

    public void changePassword() {
        driver.findElement(By.linkText("Change password")).click();
        DateChangePassword("pass", "pass", "pass");

    }

    public Teste_Automatizado DateChangePassword(String sAtual, String sNova, String sRepete) {
        this.currentPassword.sendKeys(sAtual);
        this.newPassword.sendKeys(sNova);
        this.repeatPassword.sendKeys(sRepete + '\n');
        PageFactory.initElements(driver, this);
        return this;
    }

    public void btnchangePassword() {
            envio.get(0).click();
        
    }

    public void acessaLoginModal() {
        botaoLogin.click();

    }

    public void openSettings() {
        WebDriver driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        settings.click();

    }

    public void modificarImagem() {
        changePicture.get(0).click();

    }

    public void myCoursesNode() {
        WebDriver driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        listCourses.get(1).click();

    }
    
    public void accessSessions()
    {
        listAbas.get(0).click();
    
    }

}

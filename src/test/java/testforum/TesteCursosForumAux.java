package testforum;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TesteCursosForumAux {    
    @FindBy(id = "md-tab-label-0-4")
    private WebElement abaEdicao;
    
    @FindBy(id = "md-tab-label-1-1")
    private WebElement abaMultiplo;
    
    @FindBy(css ="div[class='col l6 m7 s7 valign course-title']")
    List<WebElement> listCourses;
    
    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "password")
    private WebElement password;

    @FindBy(id = "signUpButton")
    private WebElement botao;

    @FindBy(id = "log-in-btn")
    WebElement botaoLogin;

    private WebDriver driver;
    private WebDriver driver2;
    private WebDriver driver3;
    
    public TesteCursosForumAux(WebDriver driver) {
        this.driver = driver;
    }

    public TesteCursosForumAux preencheDados(String nome, String sobrenome) {
        this.email.sendKeys(nome);
        this.password.sendKeys(sobrenome);
        PageFactory.initElements(driver, this);
        return this;
    }

    public void loga() {
        driver.findElement(By.linkText("Log in")).click();
    }

    public void acessaLoginModal() {
        botaoLogin.click();
    }

}

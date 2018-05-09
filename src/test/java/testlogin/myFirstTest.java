package testlogin;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static sun.net.www.http.HttpClient.New;
import static testlogin.PaginaTeste.driver;

public class myFirstTest {

    @FindBy(id = "email")
    private WebElement email;
   
    @FindBy(css ="div[class='col l6 m7 s7 valign course-title']")
    List<WebElement> listCourses;
    
    @FindBy(id = "password")
    private WebElement password;
     
    @FindBy(id = "confirmPassword")
    private WebElement confirmPassword;

    @FindBy(id = "signUpButton")
    private WebElement botao;

    @FindBy(id = "log-in-btn")
    WebElement botaoLogin;

    private WebDriver driver;

    public myFirstTest(WebDriver driver) {
        this.driver = driver;
    }

    public myFirstTest preencheDadosLogin(String nome, String sobrenome) {
        this.email.sendKeys(nome);
        this.password.sendKeys(sobrenome);
        PageFactory.initElements(driver, this);
        return this;
    }

    public void loga() {
        driver.findElement(By.linkText("Log in")).click();
    }
    
     public void newUser(String email, String pass, String passCofirm) {
        driver.findElement(By.linkText("SIGN UP")).click();
        this.email.sendKeys(email);
        this.password.sendKeys(pass);
        this.confirmPassword.sendKeys(passCofirm);
        PageFactory.initElements(driver, this);
    }

    public void acessaLoginModal() {
        botaoLogin.click();

    }
    public void myCoursesNode() {
        WebDriver driver2 = (WebDriver) new FirefoxDriver();
        driver2.close();
        listCourses.get(0).click();

    }
}

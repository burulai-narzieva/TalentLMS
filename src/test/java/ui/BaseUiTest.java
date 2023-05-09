package ui;


import com.digital.Listeners.ScreenshotListener;
import com.digital.ui.driver.Driver;
import com.digital.ui.driver.DriverActions;
import com.digital.ui.pages.LoginPage;
import com.digital.ui.pages.courses_page.AddCoursePage;
import com.digital.ui.pages.courses_page.CoursesHomePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

@Listeners(ScreenshotListener.class)
public abstract class BaseUiTest implements DriverActions {

    public WebDriver driver;
    public CoursesHomePage coursesHomePage;
    public AddCoursePage addCoursePage;
    public LoginPage loginPage;

    @BeforeClass
    public void setUp() {
        driver = Driver.getDriver();
        coursesHomePage = new CoursesHomePage();
        addCoursePage = new AddCoursePage();
        loginPage = new LoginPage();
        loginPage.openPage().authorization();
    }

    @AfterClass
    public void tearDown() {
        Driver.closeDriver();
    }
}
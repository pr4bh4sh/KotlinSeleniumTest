
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.testng.annotations.AfterClass
import org.testng.annotations.BeforeClass
import org.testng.annotations.Test

class GoogleSearchTest {

    var chrome: WebDriver? = null

    @BeforeClass fun setup(){
        chrome = ChromeDriver()
    }

    @AfterClass fun tearDown() {
        chrome!!.quit()
    }

    @Test
    fun testSearch(){
        var gs = GoogleSearch()
        gs.webDriver = chrome
        gs.open()
        gs.search("pr4bh4sh")
        gs.printLinks()
    }
}
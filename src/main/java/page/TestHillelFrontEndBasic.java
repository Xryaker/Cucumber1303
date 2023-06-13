package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class TestHillelFrontEndBasic {
    @FindBy(xpath = "//span[@class='course-descriptor_header-text' ] ")
    WebElement courseTitle;
    @FindBy(xpath = "//span[@class='course-rating_average']")
    WebElement courseRate;

    @FindBy(xpath = "//h2[@class=\"introduction-info_title\"]")
    WebElement courseDescription;

    @FindBy(className = "coach-card_name")
    List<WebElement> myListElements;

    public String getCourseTitle() {

        return courseTitle.getText();
    }

    public String getCourseRate() {
        return courseRate.getText();
    }

    public String getCourseDescription() {
        return courseDescription.getText();
    }

    public List<String> getListCoachesNames() {
        List<String> myList = new ArrayList<>();
        for (WebElement element : myListElements) {
            myList.add(element.getText());
        }
        return myList;
    }
}

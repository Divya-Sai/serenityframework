package starter.pages;

import net.serenitybdd.core.pages.PageObject;

public class nopCommerceDashBoardPage extends PageObject {

    public String getTitleofthePage() {
        String titleHomePage = getDriver().getTitle();
        System.out.println("The title of the Homepage is"+titleHomePage);
        return titleHomePage;
    }
}

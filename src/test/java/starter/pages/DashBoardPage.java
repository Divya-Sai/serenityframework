package starter.pages;

import net.thucydides.core.annotations.Step;


public class DashBoardPage {

    nopCommerceDashBoardPage nopCommDash;
    @Step
    public void verifyTitle(){
        nopCommDash.getTitleofthePage();

    }
}

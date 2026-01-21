package registration_page;

public class VerifyForm extends BaseTest {

    public static void main(String[] args) {

        VerifyForm test = new VerifyForm();
        test.launchApp();

        FormPage form = new FormPage(test.driver);

        form.handleIframe();
        form.fillForm();
        form.selectRadioCheckbox();
        form.selectDropdowns();
        form.fillTextarea();
        form.handleExtras();
        form.submitForm();

        test.closeApp();
    }
}

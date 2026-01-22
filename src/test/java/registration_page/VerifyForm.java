package registration_page;

import org.testng.annotations.Test;

public class VerifyForm extends BaseTest {

    @Test
    public void verifyRegistrationForm() {

        FormPage form = new FormPage(driver);

        form.handleIframe();
        form.fillForm();
        form.selectRadioCheckbox();
        form.selectDropdowns();
        form.fillTextarea();
        form.handleExtras();
        form.submitForm();
    }
}

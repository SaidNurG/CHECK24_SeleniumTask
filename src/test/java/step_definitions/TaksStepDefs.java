package step_definitions;


import io.cucumber.java.en.*;
import org.openqa.selenium.JavascriptExecutor;
import pages.TaskPage;
import utilities.Driver;

import java.util.Map;

public class TaksStepDefs {


    @Given("the user is on the check24 credit card result page")
    public static void waitFor(int seconds) {
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void the_user_is_on_the_check24_credit_card_result_page() {
        //((JavascriptExecutor) Driver.get()).executeScript("arguments[0].click();", taskPage.akzeptieren);
        new TaskPage().akzeptieren.click();
    }

    @When("the user should see the cookie {string} is set in response headers")
    public void the_user_should_see_the_cookie_is_set_in_response_headers(String string) {
        System.out.println("afkaşflas");
    }

    @When("the user clicks on the first of the listed products which has the number one on its panel")
    public void the_user_clicks_on_the_first_of_the_listed_products_which_has_the_number_one_on_its_panel() {
        new TaskPage().barclayCardVisa.click();
    }

    @When("the user fill in {string} as email")
    public void the_user_fill_in_as_email(String email) {
        new TaskPage().emailInput.sendKeys(email);
    }

    @When("the user clicks on weiter button")
    public void the_user_clicks_on_weiter_button() {
        new TaskPage().formWeiter.click();
    }

    @When("the user clicks on als Gast fortfahren radio-button")
    public void the_user_clicks_on_als_Gast_fortfahren_radio_button() {
        new TaskPage().gastFortfahren.click();
    }

    @Then("the user should see error messages for all empty fields")
    public void the_user_should_see_error_messages_for_all_empty_fields() {
        System.out.println("afkaşflas");
    }

    @Then("the user should click on weiter button")
    public void the_user_should_click_on_weiter_button() {
        System.out.println("afkaşflas");
    }

    @Then("the user should see the next form page without any error message")
    public void the_user_should_see_the_next_form_page_without_any_error_message() {
        System.out.println("afkaşflas");
    }

    @Then("the user should fill in all fields with valid values")
    public void the_user_should_fill_in_all_fields_with_valid_values(Map<String,String> userInfo) {
        System.out.println(userInfo);
    }
}

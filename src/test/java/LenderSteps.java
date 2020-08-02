import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.junit.Assert.*;

class IsItFriday {
    static String isItFriday(String today) {
        if (today.equals("Friday")) {
            return "Yes";
        }
        return "Nope";
    }
}

public class LenderSteps {
    private String today;
    private String actualAnswer;

    @Given("today is Sunday")
    public void today_is_Sunday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_Friday_yet() {
        actualAnswer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, actualAnswer);
    }

    @Given("I am a lender")
    public void i_am_a_lender() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("I check my available funds")
    public void i_check_my_available_funds() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("I should see the current balance")
    public void should_see_current_balance() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("a customer requests a loan")
    public void a_customer_requests_a_loan() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @When("the amount is larger than my available balance")
    public void the_amount_is_larger_than_my_available_balance() {
        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
    }
    @Then("they will be denied")
    public void they_will_be_denied() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("the loan {string}, {string}, and number of {string}")
    public void the_loan_and_number_of(String principal, String interest, String payments) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("a customer has {string} credit score, DTI of {string} and deposits {string} from savings")
    public void a_customer_has_credit_score_dti_of_and_deposits_from_savings(String creditScore, String dti, String deposit) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I have sufficient funds to make a loan")
    public void i_have_sufficient_funds_to_make_a_loan() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I sent a loan offer")
    public void i_sent_a_loan_offer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("an current balance of {string} in my account")
    public void an_current_balance_of_in_my_account(String startBalance) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("I have a good loan candidate")
    public void i_have_a_good_loan_candidate() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("a good candidate")
    public void a_good_candidate() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("a loan contract was sent to a customer")
    public void a_loan_contract_was_sent_to_a_customer() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

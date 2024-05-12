package steps;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is on the login page");
	}

	@When("user enters correct username and correct password")
	public void user_enters_correct_username_and_correct_password(DataTable dataTable) {
		// Write code here that turns the phrase above into concrete actions
		// For automatic transformation, change DataTable to one of
		// E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
		// Map<K, List<V>>. E,K,V must be a String, Integer, Float,
		// Double, Byte, Short, Long, BigInteger or BigDecimal.
		//
		// For other transformations you can register a DataTableType.
		List<List<String>> lists = dataTable.asLists();
		for (int i = 1; i < lists.size(); i++) {
			String username = lists.get(i).get(0);
			String password = lists.get(i).get(1);
			System.out.println("*** Username: " + username + " || Password: " + password);
		}
		System.out.println("user enters correct username and correct password");
	}

	@Then("user is redirected to landing page")
	public void user_is_redirected_to_landing_page() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user is redirected to landing page");
	}

	@And("user gets confirmation message")
	public void user_gets_confirmation_message() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user gets confirmation message");
	}

	@When("user does b")
	public void user_does_b() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user does b");
	}

	@Then("user does c")
	public void user_does_c() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user does c");
	}

	@When("user does e")
	public void user_does_e() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user does e");
	}

	@Then("user does f")
	public void user_does_f() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("user does f");
	}

}

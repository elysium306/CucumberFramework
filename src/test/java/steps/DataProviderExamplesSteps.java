package steps;

import java.util.List;

import base.TestBase;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataProviderExamplesSteps extends TestBase {

	@Given("user goto base url")
	public void user_goto_base_url() {
		System.out.println("user goto base url");
	}

	@When("user select option {int}")
	public void user_select_option(Integer qty) {
		System.out.println("user select option " + qty);
	}

	@When("user searches for <product>")
	public void user_searches_for_product(DataTable dataTable) {
		log.info("user searches for <product>");
		List<String> products = dataTable.column(0);
		for (String product : products) {
			System.out.println("--- Currently searching for: " + product);
		}
	}

	@Then("user should see {string} on the page")
	public void user_should_see_on_the_page(String confirmation) {
		log.info(confirmation);
	}

}

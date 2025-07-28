package utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.github.javafaker.Address;
import com.github.javafaker.Faker;
import com.github.javafaker.Number;
import com.github.javafaker.PhoneNumber;

public class FakerUtility {

	Faker faker = new Faker();

	public String generateName() {
		return faker.name().fullName();
	}

	public String generateNumber() {
		return faker.currency().toString();
	}

	public String generateFirstName() {
		return faker.name().firstName();
	}

	public String generateAddress() {
		return faker.address().toString();
	}

	public String generatePhoneNumber() {
		return faker.phoneNumber().toString();
	}

	public String generateGmail() {
		return faker.internet().emailAddress();
	}

}

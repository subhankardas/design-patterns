package behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

// Mediator: Central point of contact for command to activate bulk mail sending.
public class MailQueue {

	List<String> emails;

	public MailQueue() {
		// List of email
		emails = new ArrayList<>();
	}

	public void add(String email) {
		// Add new email to queue
		emails.add(email);
	}

	public void send() {
		// Logic for sending bulk email
		for (String email : emails) {
			System.out.println("Sending email  ->  " + email);
		}
	}

}

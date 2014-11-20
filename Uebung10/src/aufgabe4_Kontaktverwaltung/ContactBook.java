package aufgabe4_Kontaktverwaltung;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class ContactBook {
	private Map<String, Contact> contactBook = new HashMap<>();


@SuppressWarnings("unchecked")
public void load() {
    try (InputStream fis = new FileInputStream("src/aufgabe4_Kontaktverwaltung/Kontakte.txt")){
    	try (ObjectInputStream stream = new ObjectInputStream(fis)){
    		this.contactBook = ((Map<String, Contact>)stream.readObject());
    	} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} 
  }
  
  public void save(){
    try (OutputStream fos = new FileOutputStream ("src/aufgabe4_Kontaktverwaltung/Kontakte.txt")){
    	try (ObjectOutputStream stream = new ObjectOutputStream(fos)){
    		stream.writeObject(contactBook);
    	}
    } catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  }

	public void addContact(String name, String address) {
		if (contactBook.containsKey(name)) {
			throw new IllegalArgumentException("Name already exists");
		}
		contactBook.put(name, new Contact(name, address));
	}

	public void addNumber(String name, String number, String description) {
		if (!contactBook.containsKey(name)) {
			throw new IllegalArgumentException("Name does not exist");
		}
		Contact contact = contactBook.get(name);
		contact.addPhoneEntry(new PhoneEntry(number, description));
	}

	public Contact findContact(String name) {
		return contactBook.get(name);
	}
}
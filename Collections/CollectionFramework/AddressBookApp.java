import java.util.*;

class Contact {
    String name;
    String phone;
    String email;

    Contact(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone: " + phone + ", Email: " + email;
    }
}

public class AddressBookApp {
    private ArrayList<Contact> contactList = new ArrayList<>();
    private HashMap<String, Contact> nameIndex = new HashMap<>();
    private HashSet<String> phoneSet = new HashSet<>();

    public boolean addContact(String name, String phone, String email) {
        if (phoneSet.contains(phone)) {
            System.out.println("Error: Phone number " + phone + " already exists. Duplicate not allowed.");
            return false;
        }
        Contact contact = new Contact(name, phone, email);
        contactList.add(contact);
        nameIndex.put(name, contact);
        phoneSet.add(phone);
        System.out.println("Contact added: " + contact);
        return true;
    }

    public Contact searchByName(String name) {
        Contact contact = nameIndex.get(name);
        if (contact != null) {
            System.out.println("Found: " + contact);
        } else {
            System.out.println("Contact with name '" + name + "' not found.");
        }
        return contact;
    }

    public boolean deleteContact(String name) {
        Contact contact = nameIndex.get(name);
        if (contact == null) {
            System.out.println("Cannot delete. Contact '" + name + "' not found.");
            return false;
        }
        contactList.remove(contact);
        nameIndex.remove(name);
        phoneSet.remove(contact.phone);
        System.out.println("Contact deleted: " + contact);
        return true;
    }

    public void displaySortedByName() {
        ArrayList<Contact> sortedList = new ArrayList<>(contactList);
        Collections.sort(sortedList, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                return c1.name.compareToIgnoreCase(c2.name);
            }
        });
        System.out.println("\n--- Address Book (Sorted by Name) ---");
        if (sortedList.isEmpty()) {
            System.out.println("No contacts to display.");
        } else {
            for (Contact c : sortedList) {
                System.out.println(c);
            }
        }
        System.out.println("Total contacts: " + sortedList.size());
    }

    public static void main(String[] args) {
        AddressBookApp addressBook = new AddressBookApp();

        addressBook.addContact("Rahul Sharma", "9876543210", "rahul@example.com");
        addressBook.addContact("Anita Verma", "9123456780", "anita@example.com");
        addressBook.addContact("Karan Mehta", "9988776655", "karan@example.com");
        addressBook.addContact("Divya Rao", "9876543210", "divya@example.com"); // duplicate phone

        System.out.println();
        addressBook.searchByName("Anita Verma");
        addressBook.searchByName("Unknown Person");

        System.out.println();
        addressBook.deleteContact("Karan Mehta");
        addressBook.deleteContact("Someone Else");

        addressBook.displaySortedByName();
    }
}

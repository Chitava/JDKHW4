import java.util.*;

public class PhoneBook {
    ArrayList<Worker> phoneBook = new ArrayList();


    public ArrayList<Worker> getPhoneBook() {
        return phoneBook;
    }

    public void addPhoneBook(Worker worker) {
        phoneBook.add(worker);
    }

    public ArrayList findByNumber(int number) {
        ArrayList<Worker> result = new ArrayList<>();
        for (Worker worker : phoneBook) {
            if (worker.getTableNumber() == number) {
                result.add(worker);
            }
        }
        return result;
    }

    public ArrayList findByExpiriens(int number) {
        ArrayList<Worker> result = new ArrayList<>();
        for (Worker worker : phoneBook) {
            if (worker.getExpiriens() == number) {
                result.add(worker);
            }
        }
        return result;
    }

    public ArrayList findByName(String name) {
        ArrayList<Worker> result = new ArrayList<>();
        for (Worker worker : phoneBook) {
            if (worker.getName().contains(name)) {
                result.add(worker);
            }
        }
        return result;
    }
}

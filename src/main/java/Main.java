import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();
        Worker worker = new Worker("Семенов", 123, 698, 5);
        Worker worker1 = new Worker("Иванов", 234, 485, 3);
        Worker worker2 = new Worker("Петров", 345, 769, 5);
        Worker worker3 = new Worker("Сидоров", 123, 839, 9);
        book.addPhoneBook(worker1);
        book.addPhoneBook(worker2);
        book.addPhoneBook(worker3);
        book.addPhoneBook(worker);
//        System.out.println(book.findByNumber(123));
//        System.out.println(book.findByExpiriens(5));
//        System.out.println(book.findByName("нов"));

        }
    }

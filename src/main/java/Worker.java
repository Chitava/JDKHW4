public class Worker {
    private String name;
    private int tableNumber;
    private int phoneNumber;
    private int expiriens;


    public Worker(String name, int tableNumber, int phoneNumber, int expiriens) {
        this.name = name;
        this.tableNumber = tableNumber;
        this.phoneNumber = phoneNumber;
        this.expiriens = expiriens;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getTableNumber() {
        return tableNumber;
    }
    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
    public int getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public int getExpiriens() {
        return expiriens;
    }
    public void setExpiriens(int expiriens) {
        this.expiriens = expiriens;
    }


    @Override
    public String toString() {
        return String.format("Имя:\n%s\nТабельный номер\n%s\nТелефон\n%s\nСтаж\n%s лет", this.name, this.tableNumber,
                this.phoneNumber, this.expiriens);
    }
}

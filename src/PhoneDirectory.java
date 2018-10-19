public class PhoneDirectory {

    private BidirectionalMap<String, Long> phoneDirectory;

    public PhoneDirectory() {
        phoneDirectory = new BidirectionalMap<>();
    }

    public void add(String name, long number) {
        phoneDirectory.insert(name, number);
    }

    public String lookup(long number) {
        return phoneDirectory.rlookup(number);
    }

    public long lookup(String name) {
        return phoneDirectory.lookup(name);
    }

    public void print() {
        phoneDirectory.print();
    }
}

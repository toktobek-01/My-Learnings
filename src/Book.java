public record Book(String title, String author, int year) {}

class RecordExample {
    public static void main(String[] args) {
        Book b = new Book("1984", "George Orwell", 1949);
        System.out.println(b.title() + " by " + b.author());
    }
}

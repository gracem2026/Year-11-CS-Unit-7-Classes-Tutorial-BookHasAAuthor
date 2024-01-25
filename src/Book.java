public class Book {
    // properties
    private String name;
    private Author author;
    public double price;
    public int qty;

    // constructors
    public Book(String n, Author a, double p, int q) {
        name = n;
        author = a;
        price = p;
        qty = q;
    }
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double pr) {
        price = pr;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qt) {
        qty = qt;
    }
    public String toString() {
        return "'" + name + "' by " + author.toString();
    }
}

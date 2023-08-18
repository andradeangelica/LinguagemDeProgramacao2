package ex2;

public class Book {
	    private String name;
	    private Author[] authors;
	    private double price;
	    private int qty = 0;

	    public Book(String name, Author[] authors, double price) {
	        this.name = name;
	        this.authors = authors;
	        this.price = price;
	    }

	    public Book(String name, Author[] authors, double price, int qty) {
	        this.name = name;
	        this.authors = authors;
	        this.price = price;
	        this.qty = qty;
	    }

	    public String getName() {
	        return name;
	    }

	    public Author[] getAuthors() {
	        return authors;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public int getQty() {
	        return qty;
	    }

	    public void setQty(int qty) {
	        this.qty = qty;
	    }

	    @Override
	    public String toString() {
	        StringBuilder authorStr = new StringBuilder();
	        for (Author author : authors) {
	            authorStr.append("Author[name=").append(author.getName())
	                     .append(",email=").append(author.getEmail())
	                     .append(",gender=").append(author.getGender())
	                     .append("],");
	        }
	        authorStr.deleteCharAt(authorStr.length() - 1); // Remove a última vírgula

	        return "Book name=" + name + ",authors= " + authorStr.toString() + ",price = " + price + ",qty= " + qty ;
	    }

	    public String getAuthorNames() {
	        StringBuilder names = new StringBuilder();
	        for (Author author : authors) {
	            names.append(author.getName()).append(", ");
	        }
	        names.delete(names.length() - 2, names.length()); // Remove o último ", "
	        return names.toString();
	    }
	}

	



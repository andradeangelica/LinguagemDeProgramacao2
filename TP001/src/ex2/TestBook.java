package ex2;
	
public class TestBook {
    public static void main(String[] args) {
        Author[] authors = new Author[2];
        authors[0] = new Author("Willian Sheakespeare", "willian@author.com.br", 'm');
        authors[1] = new Author("Louise Meyer", "louise@author.com.br", 'm');

        Book testeBook = new Book("Welcome to the earth", authors, 19.99, 99);
        System.out.println(testeBook); 
        System.out.println("Author names: " + testeBook.getAuthorNames());
    }
}


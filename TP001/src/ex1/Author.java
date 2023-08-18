package ex1;

public class Author {
	    private String name;
	    private String email;
	    private char gender;

	    public Author(String name, String email, char gender) {
	        this.name = name;
	        this.email = email;
	        this.gender = gender;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getEmail() {
	        return email;
	    }

	    
	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public char getGender() {
	        return gender;
	    }

	    @Override
	    public String toString() {
	        return "Author[name=" + name + ",email=" + email + ",gender=" + gender + "]";
	    }

	    public static void main(String[] args) {
	      
	        Author author = new Author("Angélica Alves Andrade", "andrade.angelicaalves@gmail.com", 'm');

	       
	        System.out.println(author);

	       
	        author.setEmail("wellington@example.com");
	        System.out.println("Updated email: " + author.getEmail());

	      
	        System.out.println("Name: " + author.getName());
	        System.out.println("Gender: " + author.getGender());
	    }
	}


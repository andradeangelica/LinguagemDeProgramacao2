package ex3;

public class TestPerson {
    public static void main(String[] args) {
        Person pessoa = new Person("Angélica Alves", "São Paulo");

        Student estudante = new Student("Pamela Silva", "Santos", "Ajudando o time em processos", 2023, 25.99);

        Staff equipe = new Staff("Jaquelini Santos", "Santos", "IFSP", 8943);

        System.out.println(pessoa.toString());
        System.out.println("\n" + estudante.toString());
        System.out.println("\n" + equipe.toString());

        pessoa.setAddress("Guarujá");

        estudante.setAddress("Itanhaém");
        estudante.setFee(25.99);
        estudante.setProgram("Seja produtivo");
        estudante.setYear(2023);

        equipe.setAddress("Mogi das Cruzes");
        equipe.setPay(25678);
        equipe.setSchool("IFSP");

        System.out.println("\n" + pessoa.toString());
        System.out.println("\n" + estudante.toString());
        System.out.println("\n" + equipe.toString());

        System.out.println("\nDADOS STAFF:\n");
        System.out.println("Address: " + equipe.getAddress());
        System.out.println("Name: " + equipe.getName());
        System.out.println("Pay: " + equipe.getPay());
        System.out.println("School: " + equipe.getSchool());

        System.out.println("\nDADOS STUDENT:\n");
        System.out.println("Address: " + estudante.getAddress());
        System.out.println("Name: " + estudante.getName());
        System.out.println("Program: " + estudante.getProgram());
        System.out.println("Year: " + estudante.getYear());
        System.out.println("Fee: " + estudante.getFee());

        System.out.println("\nDADOS PERSON:\n");
        System.out.println("Address: " + pessoa.getAddress());
        System.out.println("Name: " + pessoa.getName());
    }
}

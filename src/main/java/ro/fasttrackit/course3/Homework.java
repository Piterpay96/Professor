package ro.fasttrackit.course3;

public class Homework {
    public static void main(String[] args) {

        ProfessorClass physicsProfessor = new ProfessorClass();
        ProfessorClass musicProfessor = new ProfessorClass();

        physicsProfessor.setFirstName("Jane");
        musicProfessor.setFirstName("Mary");

        System.out.println("Physics professor is: " + physicsProfessor.getFirstName());
        System.out.println("Music professor is: " + musicProfessor.getFirstName());
        System.out.println("Stop program");

    }
}

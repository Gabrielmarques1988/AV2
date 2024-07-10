package orm.actions;

import orm.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Scanner;

public class InserirAluno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aluno aluno = new Aluno();

        System.out.print("informe o nome do aluno: ");
        String nome = sc.nextLine();
        System.out.print("informe o email do aluno: ");
        String email = sc.nextLine();
        System.out.print("informe o cpf do aluno: ");
        String cpf = sc.nextLine();
        System.out.print("informe o data de nascimento do aluno: ");
        String dataNascimento = sc.nextLine();
        System.out.print("informe a naturalidade do aluno: ");
        String naturalidade = sc.nextLine();
        System.out.print("informe o endereço do aluno: ");
        String endereco = sc.nextLine();

        aluno.setNome(nome);
        aluno.setEmail(email);
        aluno.setCpf(cpf);
        aluno.setDataNascimento(dataNascimento);
        aluno.setNaturalidade(naturalidade);
        aluno.setEndereco(endereco);

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();
        manager.persist(aluno);

        manager.getTransaction().commit();

        System.out.println("Aluno inserido, id: "+ aluno.getId());

        manager.close();
        sc.close();
    }
}

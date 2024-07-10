package orm.actions;

import orm.model.Aluno;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class ListarAluno {
    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("alunos");
        EntityManager manager = factory.createEntityManager();

        String sql = "select a from Aluno a";
        Query query = manager.createQuery(sql);

        List<Aluno> listaDeAlunos = query.getResultList();

        for (Aluno aluno : listaDeAlunos){
            System.out.println(aluno.getNome());
            System.out.println(aluno.getEmail());
            System.out.println(aluno.getCpf());
            System.out.println(aluno.getDataNascimento());
            System.out.println(aluno.getNaturalidade());
            System.out.println(aluno.getEndereco());
            System.out.println();
        }
    }
}

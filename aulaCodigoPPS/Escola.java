import java.util.ArrayList;
import java.util.List;

public class Escola {


private String nomeFilial;
private String endereco;
private String telefone;
private List<Curso> cursos;

public Escola(String nomeFilial, String endereco, String telefone) {
    this.nomeFilial = nomeFilial;
    this.endereco = endereco;
    this.telefone = telefone;
    this.cursos = new ArrayList<>();
}

public void cadastrarEscola(String nomeFilial, String endereco, String telefone) {
    this.nomeFilial = nomeFilial;
    this.endereco = endereco;
    this.telefone = telefone;
}

public List<Aluno> listarTodosOsAlunos() {
    return alunos;
}

public void adicionarCurso(int codigo, String nome) {
    Curso curso = new Curso(codigo, nome);
    cursos.add(curso);
}

public List<Curso> listarTodosOsCursos() {
    return cursos;
}

public void removerCurso(int codigo) {
    cursos.removeIf(curso -> curso.getCodigo() == codigo);
}

}
    
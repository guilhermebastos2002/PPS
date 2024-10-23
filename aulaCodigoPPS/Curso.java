public class Curso {
    private codigo int;
    private nome String;
    private List<Aluno> alunos;
    private int contadorMatricula;

    public Curso(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        this.alunos = new ArrayList<>();
        this.contadorMatricula = 1;
    }

    public void cadastrarCurso(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public void adicionarAluno(String nome, Date dataNascimento, String endereco, String telefone, String matricula) {
        String matricula = gerarMatricula();
        Aluno aluno = new Aluno(nome, dataNascimento, endereco, telefone);
        alunos.add(aluno);
    }

    public void gerarMatricula() {
        return String.valueOf(contadorMatricula++);
    }

    public void listarTodosOsAlunos() {
        return alunos;
    }

    public void removerAluno(String matricula) {
        alunos.removeIf(aluno -> aluno.getMatricula() == matricula);
    }
}
class PessoaVisitorTest {

    @Test
    void deveExibirCliente() {
        Cliente Cliente = new Cliente(1, "Ana", new Senha("02165"));

        PessoaVisitor visitor = new PessoaVisitor();
        assertEquals("Aluno{senha=1, nome='Ana'}", visitor.exibir(Cliente));

}
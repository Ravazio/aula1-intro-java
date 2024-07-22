/**
 * Modelo de Estudante universitário
 */
public class Estudante{
    private String nome;
    private String ra;
    private double[] notas;

    /**
     * Construtor do Estudante
     * @param nome O nome completo do estudante.
     * @param ra O registro acadêmico no formato da UFABC.
     * @param notas A lista de notas obtidas pelo estudante
     */
    public Estudante(String nome, String ra, double[] notas){
        validaRA(ra);
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
    }

    /**
     * Valida o formato de RA conforme regras da UFABC
     * @param ra o resgistro acadêmico
     */
    private void validaRA(String ra){
        if(ra.matches("\\d(11)")){
            throw new IllegalArgumentException("RA deve ter 11 digitos");
        }
    }

    /**
     * Consulta o nome do estudante
     * @return O nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o nome do estudante
     * @param nome O novo nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Consulta o RA do estudante
     * @return o Registro Acadêmico
     */
    public String getRa() {
        return ra;
    }


    /**
     * Altera o RA do estudante
     * @param ra O novo RA
     */
    public void setRa(String ra) {
        this.ra = ra;
    }

    /**
     * Consulta as notas do estudante
     * @return a referência para o Array de notas
     */
    public double[] getNotas() {
        return notas;
    }

    /**
     * Altera o Array de notas do estudante
     * @param notas as novas notas
     */
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    /**
     * Faz um somatório com todas as notas do Array de notas do estudante
     * @return um double com o somatório das notas do estudante
     */
    private double somaNotas(){
        double sum = 0.0;

        for(var nota: notas){
            sum += nota;
        }
        return sum;
    }

    /**
     * Calcula a média das notas do estudante
     * @return um double com a média das notas dos estudante
     */
    public double getMedia(){
        if(notas.length == 0){
            return 0.0;
        }
        return somaNotas() / notas.length;
    }
}
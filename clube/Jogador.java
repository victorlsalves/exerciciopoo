public class Jogador {
    private String dataNascimento;
    private String nome;
    private String posCampo;
    private String time;
    private String emprestimo;
    private byte capacidadeFisica;

    public Jogador(String dataNascimento, String nome, String posCampo, String time){
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.posCampo = posCampo;
        this.time = time;
        this.capacidadeFisica = 100;
    }

    public byte getCapacidadeFisica(){
        return this.capacidadeFisica;
    }
    
}

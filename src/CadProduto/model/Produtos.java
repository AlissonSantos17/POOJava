package CadProduto.model;

/**
 *
 * @author Alisson
 */
public class Produtos {

    private String nome;
    private String peso;
    private String valor;
    private String estoqueMin;
    private String margemLuc;
    String msg;

    
    public String getNome() {
        return nome;
    }

    public void setNome(String name) {
        this.nome = nome;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(String estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public String getMargemLuc() {
        return margemLuc;
    }

    public void setMargemLuc(String margemLuc) {
        this.margemLuc = margemLuc;
    }    
    public String getMsg(){
        if(this.nome.length() == 0){
            msg = "Você não inseriu o nome do produto";
        } else if (this.peso.length() == 0){
            msg = "Você não inseriu o peso do produto";
        } else if(this.valor.length() == 0){
            msg = "Você não inseriu o valor do produto";
        } else if(this.estoqueMin.length() == 0){
            msg = "Você não inseriu o estoque do produto";
        } else if(this.margemLuc.length() == 0){
            msg = "Você não inseriu a margem de lucro do produto";
        } else{
            msg = "Produto inserido com sucesso!";
        }
        return msg;
}

}

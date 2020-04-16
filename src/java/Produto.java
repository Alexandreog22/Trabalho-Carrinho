import java.io.Serializable;
import javax.faces.bean.ViewScoped;
import javax.inject.Named;

@Named
@ViewScoped
public class Produto implements Serializable{
    
    private Integer id;
    private String nome;
    private String descricao;
    private Integer qtde;
    private Double valorUnit;
    
    public Produto(){
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public Double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(Double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public Produto(Integer id, String nome, String descricao, Integer qtde, Double valorUnit) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.qtde = qtde;
        this.valorUnit = valorUnit;
    }

    
    
}

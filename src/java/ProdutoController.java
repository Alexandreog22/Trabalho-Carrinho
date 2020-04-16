

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="produtoMB")
@SessionScoped
public class ProdutoController implements Serializable{
    
    
    private Produto produto = new Produto();
    private List<Produto> produtos = new ArrayList<>();
    private Double total = 0.0;
    
    public ProdutoController(){
        
    }
    
    public List<Produto> listar(){
        return produtos;
    }
    
    public String novo(){
        produto = new Produto();
        
        return "new.xhtml?faces-redirect=true";
    }
    
    public String cancelar(){
        return "index.xhtml?faces-redirect=true";
    }
    
    public String buscaDados(Produto produto){
        
        this.produto = produto;
        return "alter.xhtml?faces-redirect=true";
    }
    
    public String salvar(){
        
        produtos.add(produto);
        this.listar();
        return "index.xhtml?faces-redirect=true";
    }
    
    public String alterar(){
        
        this.listar();
        return "index.xhtml?faces-redirect=true";
    }
    
    public String excluir(Produto produto){
        produtos.remove(produto);
        this.listar();
        return "index.xhtml?faces-redirect=true";
        
    }
    
    public String calculaTotal(){
        for (int i = 0; i < (produtos.size()) ; i++) {
            total = total + (produtos.get(i).getQtde() * produtos.get(i).getValorUnit());
        }
        
        return "finaliza.xhtml?faces-redirect=true";
    }
    

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }  

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
    
}

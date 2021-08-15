import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Victor Calebe
 */
public class Cliente {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String cep;
    private String email;
    
    private List<Animal> animais;
    
    public Cliente(int id, String nome, String endereco, String telefone, String cep, String email){
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cep = cep;
        this.email = email;
        this.animais = new ArrayList<Animal>();
    }

    public int getId(){
        return id;
    }
    
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getCep() {
        return cep;
    }

    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email){
        if(!email.equals("")){
            this.email = email;
        }else{
            System.out.println("O campo email esta vazio!");
        }
    }
    
    public void setNome(String nome){
        if(!nome.equals("")){
            this.nome = nome;
        }else{
            System.out.println("O campo nome esta vazio!");
        }
    }
    
    public void setCep(String cep){
        if(!cep.equals("")){
            this.cep = cep;
        }else{
            System.out.println("O campo CEP esta vazio!");
        }
    }
    
    public void addAnimal(Animal animal){
        animais.add(animal);
    }
    
    public List<Animal> getAnimais(){
        return animais;
    }
    
    @Override
    public String toString() {
        String desc = "Cliente{" + "id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", telefone=" + telefone + ", cep=" + cep + ", email=" + email + '}';
        String strAnimais = animais.toString();
        return desc + "\n" + strAnimais;
        
    }
    
    
}
package fit.domain;

public class Table {
    private String cor;
    private String material;
    private String formato;
    
    

    public Table(String cor, String material, String formato) {
        this.cor = cor;
        this.material = material;
        this.formato = formato;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

}

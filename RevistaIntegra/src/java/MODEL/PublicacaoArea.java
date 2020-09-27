/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author crist
 */
public class PublicacaoArea {
    
    private int codigo;
    private String titulo;
    private String area;
    private String data;
    
    
    public PublicacaoArea(){
        
    }
    
    public PublicacaoArea(int cod, String titulo, String area, String data){
        this.codigo = cod;
        this.titulo = titulo;
        this.area = area;
        this.data = data;
        
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    
    
    
}

package mco.projetinfo4a;

public class Telephone implements ModelComponent {
    protected String id = "Telephone";
    
    private String modelNum;
    private boolean available;
    
    public Telephone(String modelNum, boolean available){
        this.modelNum = modelNum;
        this.available = available;
    }
    
    public String getId(){
        return id;
    }
    
    public void setId(String nId){
        id = nId;
    }
    public void setModelNum(String nModelNum){
        modelNum = nModelNum;
    }
    public void toggleAvailable(){
        available = !available;
    }
    @Override
    public Telephone order(){
        return this;
    }
    @Override
    public Boolean tryOrder(){
        return available;
    }
    public void showInfo(){
        // todo
    }
    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


public class Telephone implements ModelComponent{
    public String id = "Telephone";
    
    public String modelNum;
    private boolean available;
    
    @Override
    public String getModelNum(){
        return modelNum;
    }
    @Override
    public Object order(){
        return this;
    }
    @Override
    public Boolean tryOrder(){
        return available;
    }
}
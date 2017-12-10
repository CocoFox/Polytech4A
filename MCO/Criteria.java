public class Criteria extends ComponentDecorator {
    public String criteria;
    
    public Criteria(String criteria){
        this.criteria = criteria;
    }
    public void setCriteria(String criteria){
        this.criteria = criteria;
    }
    public String getCriteria(){
        return criteria;
    }

    public void operation(){
        // to specify / specialize
    }


}
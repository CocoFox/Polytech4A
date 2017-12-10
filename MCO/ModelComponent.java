
public /**
 * ModelDecorator
 */
public class ModelComponent extends AbstractModelComponent{

    String getId(){
        return id; 
    }
    String getSerial(){
        return serial; 
    }
    String getModelnum(){
        return modelNum; 
    }

    void toggleAvailable(){
        available = !available;
    }
    void setId(String nid){
        id = nid;
    }
    void setSerial(String nSerial){
        serial = nSerial;
    }
    void setModelnum(String nModelnum){
        modelNum = nModelnum;
    }


    Object tryOrder(Object o){
        attribute = o;
        if (!available){
            return "the item is currently unavailable for purchase at this time"
        }
        else
            order(this); // open order page
            return null;
    }
}
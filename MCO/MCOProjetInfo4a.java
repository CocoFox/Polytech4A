package mco.projetinfo4a;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author pacomebondetdelabernardie
 */
public class MCOProjetInfo4a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        // Abstract Factory to create Criterias? based on user needs
    */ /*
        Criteria ram = new Criteria("Ram","1GB");
        Criteria resolution = new Criteria("Resolution","1080p");
        Criteria weight = new Criteria("Resolution","1080p");
        Criteria oS = new Criteria("OS","XXNOYENNA 1.10.3");
        Criteria color1 = new Criteria("Color","blue");
        Criteria color2 = new Criteria("Color","red");
        Criteria color3 = new Criteria("Color","gold");
        Criteria company1 = new Criteria("Company","NoYeena");
        Criteria company2 = new Criteria("Company","NoRabbit");
        */
        ArrayList<Telephone> telList = new ArrayList<>();
        
        telList.add(new Telephone("Toneburst",true));   
        telList.add(new Telephone("EqualizeBeyer",true));
        telList.add(new Telephone("ZodiacY",true));
        telList.add(new Telephone("YogaBomb",false));
        telList.add(new Telephone("singular",true));
        telList.add(new Telephone("XFactory",false));
        telList.add(new Telephone("Rico",true));
        telList.add(new Telephone("EyFruit",true));
        telList.add(new Telephone("XX20",true));
        telList.add(new Telephone("Blueberry",false));
        telList.add(new Telephone("Sansong",true));
        telList.add(new Telephone("xxRabbit",true));
        //Create List of Criterias index0 is Company (Can be modified to be the most important criteria)
        CriteriaList c1 = new CriteriaList("Company: XX");
        c1.addCriteria("Color: blue");
        c1.addCriteria("Ram: 2GB");
        CriteriaList c2 = new CriteriaList("Company: NoYenna");
        c1.addCriteria("Color: blue");
        c1.addCriteria("Ram: 2GB");
        CriteriaList c3 = new CriteriaList("Company: NoRabbit");
        c1.addCriteria("Color: red");
        c1.addCriteria("Ram: 4GB");
        CriteriaList c4 = new CriteriaList("Company: StayFarFromTimmy");
        c1.addCriteria("Color: black");
        c1.addCriteria("Ram: 2GB");
        CriteriaList c5 = new CriteriaList("Company: DESTROOYYY");
        c1.addCriteria("Color: orange");
        c1.addCriteria("Ram: 8GB");
        
        ComponentDecorator criterias1 = new ComponentDecorator(telList.get(0),c1);
        ComponentDecorator criterias2 = new ComponentDecorator(telList.get(5),c2);
        ComponentDecorator criterias3 = new ComponentDecorator(telList.get(7),c3);
        ComponentDecorator criterias4 = new ComponentDecorator(telList.get(6),c4);
        
        // IMPORTANT: THE DECORATORS SERVE AS (sort of) MAPS TO EASILY ITERATE THRU 
        // AND FIND CORRECT COMPONENTS BASED ON USER NEEDS
        
    
    }
    
    
}


package factorDesignPatternPackage;

public class FactoryPattern {
    
    public OS getInfo(String str){
    
        if (str.equals("Android")){
        
        return new Android();
        }
        
       else if (str.equals("Apple")){
        
        
        return new IOS();
         }
        
       else{
       
       return new Windows();
       }
    
    
    }
    
    
}

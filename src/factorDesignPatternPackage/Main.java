
package factorDesignPatternPackage;

public class Main {
    
    public static void main(String[] args) {
        
        FactoryPattern factoryPattern=new FactoryPattern();
        
        OS os=factoryPattern.getInfo("Android");
        
        os.getInfo();
        
    }
    
}

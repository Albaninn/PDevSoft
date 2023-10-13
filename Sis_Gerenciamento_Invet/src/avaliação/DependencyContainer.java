package avaliação;

public class DependencyContainer {
    public static ProductFactory getProductFactory(String type) {
    	
    	//System.out.println("Tipo solicitado: " + type);  
    	
    	if ("electronics".equalsIgnoreCase(type)) {
    		
            //System.out.println("Retornando ElectronicsFactory");
            
            return new ElectronicsFactory();
        } else if ("clothing".equalsIgnoreCase(type)) {
        	
            //System.out.println("Retornando ClothingFactory");
            
            return new ClothingFactory();
        }
    	
        //System.out.println("Tipo de fábrica não suportado");
        
        throw new IllegalArgumentException("Tipo de fábrica não suportado");
    }
}

package javaBasic.Task10;

 class BlackTea extends Tea  {
    
    @Override
    public void prepareTea(){
        System.out.println("Preparing Black Tea. ");
        
        System.out.println("Boiling water. ");
        
        System.out.println("Black tea leaves for 5mns. ");
        
        System.out.println("Black Tea is Ready.");
    }
}
   class GreenTea extends Tea {

    @Override
    public void prepareTea(){
        System.out.println("Preparing Green Tea. ");
        
        System.out.println("Boiling water. ");
        
        System.out.println("Green tea leaves for 3mns. ");
        
        System.out.println("Green Tea is Ready.");

    }

}
    class HerbalTea extends Tea {
        @Override
        public void prepareTea(){
            System.out.println("Preparing Herbal Tea. ");
            
            System.out.println("Boiling water. ");
            
            System.out.println("Herbal tea leaves for 7mns. ");
            
            System.out.println("Herbal Tea is Ready.");
    }   
    
    public static void main(String[] args) {
        
        //data-type [] array_name = new data-type[size];

        Tea [] teas = new Tea[4];
        teas[0] = new Tea();
        teas[1] = new BlackTea();
        teas[2] = new GreenTea();
        teas[3] = new HerbalTea();

        for (Tea tea : teas){
           tea.prepareTea();
           System.out.println();
        }

   } 
}
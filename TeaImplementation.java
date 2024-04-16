package javaBasic.Task10;

public class TeaImplementation extends BlackTea {
    
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

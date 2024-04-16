package javaBasic.Task10;

public class Tea {

    private boolean prepared;
    private boolean milkAdded;
    private boolean sugarAdded;
    
    public Tea(){

        prepared = false;
        milkAdded = false;
        sugarAdded = false;
    }
    public void prepareTea(){
        if (!prepared){
            System.out.println("Preparing Basic tea with hot water and Tealeaves.");
            prepared = true;
        } else {
            System.out.println("Already Tea prepared.");
        }
    }    
    public void addMilk(){
        if (prepared){
            if(!milkAdded){
                System.out.println("Adding milk to Tea.");
                milkAdded = true;
            }else {
                System.out.println("Already milk added");
            }
        }else{
            System.out.println("Please prepare the tea first.");
        }
    }    
    public void addSugar(){
        if (prepared){
            if(!sugarAdded){
                System.out.println("Adding sugar to tea.");
                sugarAdded = true;
            }else{
                System.out.println("ALready sugar added.");
            }
        }else {
            System.out.println("Please prepare the Tea First.");
        }
    }    

        public void serveTea(){
            if (prepared) {
                System.out.println("Enjoy the Tea!");
                prepared = false;
                milkAdded = false;
                milkAdded = false;
                sugarAdded = false;
            }else {
                System.out.println("please prepare the tea first.");
            }
        }
    }


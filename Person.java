package javaBasic.Task10;

public class Person {

    String name;
    int age;


    public void setValues(String str, int num){
        this.name = str;
       this.age = num;
    
    }
    public String getName(){
        return name;
    }
    public int getAge(){    
        return age;   
   }        
}
class main1{
    
    public static void main(String[] args) {
        
        Person student = new Person();
        student.setValues("Dhoni", 7);
        System.out.println("Student Name is:" + student.getName());
        System.out.println("Student Age is:" + student.getAge());    
}

}

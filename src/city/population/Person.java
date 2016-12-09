/*
 Creating a Person here. When each person will be created, they will store certain values
, eg. Name, age, sex, etc. 
 */
package city.population;


public class Person {
    
    //atributes of the Person
    
    private String firstName;
    private String lastName;
    private String gender;
    private int age;
    
//getters/setters
public void setFirstName(String name){
    this.firstName = name;
}public String getFirstName(){
    return firstName;
}

public void setLastName(String name){
    this.lastName = name;
}public String getLastName(){
    return lastName;
}

public void setGender(String gender){
    this.gender = gender;
}public String getGender(){
    return gender;
}

public void setAge(int age){
    this.age = age;
}public int getAge(){
    return age;
}

public String toString(){
    return "First name: "+firstName+
            "\nLast name: "+lastName+
            "\nAge: "+age+
            "\nGender: "+gender;
}




}//Person class ends



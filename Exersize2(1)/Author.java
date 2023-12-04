package author;
public class Author {
    private String name;
    private String email;
    private char gender;

public Author(){}
public Author(String name, String email, char gender){
    this.name = name;
    this.email = email;
    setGender(gender);
}
public void setGender(char gender) {
    if (gender == 'M' || gender == 'F' || gender == 'U') {
        this.gender = gender;
        }
    else {
        this.gender = 'U';
        }
}
public String getEmail(){
    return email;
}
public String getName(){
    return name;
}

public void setEmail(String Email){
    this.email = email;
}
public char getGender(){
    return gender;
}
public String toString(){
    return name + " (" + gender + ") at " + email;
}
}
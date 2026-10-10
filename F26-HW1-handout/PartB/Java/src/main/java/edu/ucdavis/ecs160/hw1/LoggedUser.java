package edu.ucdavis.ecs160.hw1;

public class LoggedUser implements User {
    private final User decorated;

    public LoggedUser(User decorated) {
        this.decorated = decorated;
    }

    @Override 
    public String getName() {
        System.out.println("[LOG] AdminUser.getName()");
        return decorated.getName();
    }

    @Override 
    public String getEmail() {
        System.out.println("[LOG] AdminUser.getEmail()");
        return decorated.getEmail();
    }

    @Override 
    public void setEmail(String email) {
        System.out.println("[LOG] AdminUser.setEmail(" + email + ")");
        decorated.setEmail(email);
    }

}

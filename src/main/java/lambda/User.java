package lambda;

public class User
{
    String role;
    String admin;

    public User(String role, String admin) {
        this.role = role;
        this.admin = admin;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAdmin() {
        return admin;
    }

    public void setAdmin(String admin) {
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" +
                "role='" + role + '\'' +
                ", admin='" + admin + '\'' +
                '}';
    }

}

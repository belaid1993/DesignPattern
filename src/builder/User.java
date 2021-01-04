package builder;



public class User {

    private String nom;
    private String prenom;
    private int age;



    public static class Builder {
        private String nom;
        private String prenom;
        private int age;

        public Builder setNom(String nom) {
            this.nom = nom;
            return this;
        }

        public Builder setPrenom(String prenom) {
            this.prenom = prenom;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public User(Builder builder) {
        this.nom = builder.nom;
        this.prenom = builder.prenom;
        this.age = builder.age;
    }

    @Override
    public String toString() {
        return "User{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", age=" + age +
                '}';
    }
}

package com.david.museio;

public class User {
    private final String username;
    private final String firstName;
    private final String lastName;
    private final String hash;
    private final String jwt_key;
    private final String aes_key;

    public User(UserBuilder builder) {
        this.username = builder.username;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.hash = builder.hash;
        this.jwt_key = builder.jwt_key;
        this.aes_key = builder.aes_key;
    }

    public String getUsername() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getHash() {
        return hash;
    }

    public String getJwt_key() {
        return jwt_key;
    }

    public String getAes_key() {
        return aes_key;
    }

    public static class UserBuilder {
        private String username;
        private String firstName;
        private String lastName;
        private String hash;
        private String jwt_key;
        private String aes_key;

        public UserBuilder username(String username) {
            this.username = username;
            return this;
        }

        public UserBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder hash(String hash) {
            this.hash = hash;
            return this;
        }

        public UserBuilder jwt_key(String jwt_key) {
            this.jwt_key = jwt_key;
            return this;
        }

        public UserBuilder aes_key(String aes_key) {
            this.aes_key = aes_key;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}

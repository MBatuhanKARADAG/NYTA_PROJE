public class User {

    private final String isim;
    private final String soyisim;
    private final int yas;
    private final String telno;
    private final String parola;

    public User(UserBuilder userBuilder) {
        this.isim = userBuilder.isim;
        this.soyisim = userBuilder.soyisim;
        this.yas = userBuilder.yas;
        this.telno = userBuilder.telno;
        this.parola = userBuilder.parola;
    }

    public String getisim() {
        return isim;
    }

    public String getsoyisim() {
        return soyisim;
    }

    public int getyas() {
        return yas;
    }

    public String gettelno() {
        return telno;
    }

    public String getparola() {
        return parola;
    }

    @Override
    public String toString() {
        return "User: " + this.isim + ", " + this.soyisim + ", " + this.yas + ", " + this.telno + ", " + this.parola;
    }

    public static class UserBuilder {

        private final String isim;
        private final String soyisim;
        private int yas;
        private String telno;
        private String parola;

        public UserBuilder(String isim, String soyisim) {
            this.isim = isim;
            this.soyisim = soyisim;
        }

        public UserBuilder yas(int yas) {
            this.yas = yas;
            return this;
        }

        public UserBuilder telno(String telno) {
            this.telno = telno;
            return this;
        }

        public UserBuilder parola(String parola) {
            this.parola = parola;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
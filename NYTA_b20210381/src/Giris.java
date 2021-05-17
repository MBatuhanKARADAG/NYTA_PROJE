

public class Giris {

    public boolean login(String userId, String password,User yetkili1,User yetkili2)
    {
        if((userId.equals(yetkili1.getisim()) && password.equals(yetkili1.getparola())))
        {
        	System.out.println("Giris Basarili");
            return true;
        }
        else if((userId.equals(yetkili2.getisim()) && password.equals(yetkili2.getparola())) )
        {
        	System.out.println("Giris Basarili");
            return true;
        }
        else
        {
        	System.out.println("Kullanici Dogrulanamadi");
            return false;
        }
    }
}

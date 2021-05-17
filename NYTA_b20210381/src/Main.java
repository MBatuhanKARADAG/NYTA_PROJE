
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
    	Giris yetki=new Giris();
    	SicaklikOlc sicdegeri=new SicaklikOlc();
    	UyariObserver uyari=new UyariObserver();
    	double sicaklik;
        int secim;
        
        User yetkili1 = new User.UserBuilder("admin","admin")
               // .yas(26)
             //   .telno("+905554443322")
                .parola("1234")
                .build();
        
        User yetkili2 = new User.UserBuilder("bthn", "krdg")
              //  .yas(26)
               // .telno("+905443332211")
                .parola("b201210381")
                .build();
        
        System.out.println("Akilli Cihaz Menusu");
        System.out.println("Giris Bilgilerinizi Giriniz.");
        Scanner scan=new Scanner(System.in);
        String user,passwd;

        do {
            System.out.println("Kullanici Adi : ");
            user=scan.nextLine();
            System.out.println("Sifre : ");
            passwd=scan.nextLine();
        }while(!yetki.login(user,passwd,yetkili1,yetkili2));
        
        do {

            System.out.println("Yapmak istediginiz islemi seciniz");
            System.out.println("1. Sogutucu Ac");
            System.out.println("2. Sogutucu Kapat");
            System.out.println("3. Sicaklik goster");
            System.out.println("4. Cikis");
            secim=scan.nextInt();
            
	        switch (secim) {
	        case 1:
	        	//islem yapilacak
	            System.out.println("Soðutucu Baþarýyla Açýldý!");
	            break;
	        case 2:
	        	//islem yapilcak
	            System.out.println("Soðutucu Baþarýyla Kapatýldý!");
	            break;
	        case 3:
	        	sicaklik=sicdegeri.SicaklikGoruntule();
	            System.out.printf("Ortam sýcaklýðý: " +sicaklik  + "°C\n");
	            uyari.UyariVer(sicaklik);
	            break;
	        case 4:
	        	System.out.println("Cikis Yapiliyor");
	            System.exit(0);
	        default:
	            break;
	        }
        }while(secim!=4); 
    }
}

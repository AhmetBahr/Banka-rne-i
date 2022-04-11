
public class Banka_Ornegi {

	public static void main(String args []) {
		musteri m1 = new musteri();
		m1.hesapekle(3710, 1000.50, "Selin");
		m1.goster();
		m1.paracek(500);
		m1.parayatır(500);
		m1.kontol();
		m1.paracek(3000);
		m1.kontol();
	}	
}
class musteri{
	static String ad;
	static int numara;
	static double para;
	
	void hesapekle(int numara,double para,String ad) {
		this.numara=numara;
		this.para=para;
		this.ad=ad;
	}
	public void paracek(double tutar) {
		
		if(tutar > para) {
			System.out.println("Hesabınızda yeterli bakiye yoktur");
		}
		else {
			para = para -tutar;
			System.out.println(tutar + " tutar hesabınıza yatırıldı");
			System.out.println("Yeni bakiyeniz " + para);
		}
	}
	public void parayatır(double tutar) {
		
		para = para+tutar;
		System.out.println(tutar + " tutar hesabınıza yatırıldı");
		System.out.println("Yeni bakiyeniz " + para);
	}
	void kontol() {
		System.out.println("Bakiyeniz: " + para);
	}
	void goster() {
		System.out.println("Hesap adı: " + ad);
		System.out.println("Hesap numaranız: " + numara);
		System.out.println("Hesapta bakiyeniz: " + para);
	}	
}
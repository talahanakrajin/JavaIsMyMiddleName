class akunBank {
    int noRek = 352732778;
    String pemegangRek = "Budi";
    int saldo = 1000000;

    public void deposit(int uang) {
        saldo += uang;
        System.out.println("Saldo anda sekarang: " + saldo);
    }

    public void tarikTunai(int uang) {
        saldo -= uang;
        System.out.println("Saldo anda sekarang: " + saldo);
    }

    public void cekSaldo() {
        System.out.println("Saldo anda sekarang: " + saldo);
    }
}

class tabunganBank extends akunBank {
    int bunga = 2;

    public void tambahBunga() {
        saldo += saldo * bunga / 100;
        System.out.println("Saldo anda sekarang: " + saldo);
    }

}

public class RekeningBank {
    public static void main(String[] args){
        tabunganBank tabungan = new tabunganBank();
        tabungan.deposit(2000000);
        tabungan.tarikTunai(1000000);
        tabungan.cekSaldo();
        tabungan.tambahBunga();

    }
}
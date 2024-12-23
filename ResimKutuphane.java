package veriProject;

import java.util.Scanner;



public class ResimKutuphane {
    public ResimNode resimRoot;

    public class ResimNode {
        public Resim resim; 
        public ResimNode left; 
        public ResimNode right; 

        public ResimNode(Resim resim) {
            this.resim = resim;
            this.left = null;
            this.right = null;
        }
    }


    public void resimKutuphaneMenu(Scanner scanner) {
        String komut;

        do {
            System.out.print("Resim kütüphanesi komutları (ekle, listele, geri): ");
            komut = scanner.nextLine().toLowerCase();

            switch (komut) {
                case "ekle":
                    System.out.print("Resim adı: ");
                    String resimAd = scanner.nextLine();
                    System.out.print("Ressam adı: ");
                    String ressamAd = scanner.nextLine();
                    System.out.print("Tür: ");
                    String tur = scanner.nextLine();
                    System.out.print("Dönem: ");
                    String donem = scanner.nextLine();
                    Resim yeniResim = new Resim(resimAd, ressamAd, tur, donem);
                    resimEkle(yeniResim);
                    System.out.println("Resim eklendi!");
                    break;

                case "listele":
                    resimleriListele();
                    break;

                case "geri":
                    System.out.println("Ana menüye dönülüyor...");
                    break;

                default:
                    System.out.println("Geçersiz komut, tekrar deneyin.");
            }
        } while (!komut.equals("geri"));
    }

    public void resimEkle(Resim yeniResim) {
        resimRoot = resimEkleRecursive(resimRoot, yeniResim);
    }

    private ResimNode resimEkleRecursive(ResimNode node, Resim yeniResim) {
        if (node == null) {
            return new ResimNode(yeniResim);
        }
        if (yeniResim.ad.compareToIgnoreCase(node.resim.ad) < 0) {
            node.left = resimEkleRecursive(node.left, yeniResim);
        } else if (yeniResim.ad.compareToIgnoreCase(node.resim.ad) > 0) {
            node.right = resimEkleRecursive(node.right, yeniResim);
        }
        return node;
    }



    public void resimleriListele() {
        System.out.println("Tüm resimler:");
        resimInOrder(resimRoot);
    }

    private void resimInOrder(ResimNode node) {
        if (node != null) {
            resimInOrder(node.left);
            System.out.println("  - " + node.resim);
            resimInOrder(node.right);
        }
    }

}

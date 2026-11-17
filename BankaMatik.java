package com.mycompany.bankamatik;

import java.util.Scanner;

public class BankaMatik {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = true; //while döngüsü için bir bayrak oluşturduk
        int bakiye = 10000;  //Başlangıç bakiyesini girdik
        int islem = 0;  //işlem sayısı için etkisiz eleman atadık
        
        while (flag) { //bayrak true ken 
            System.out.println("1. Bakiye goruntuleme \n" + "2. Para yatirma \n" + "3. Para cekme \n" + "4. cikis \n"); //çıktıyı çıkar
            int secim = sc.nextInt(); //hangi seçimi yaptığını al
            switch (secim) { 

                case 1: //1 se

                    System.out.println("Kartinizdaki bakiye" + bakiye); //bakiyeyi göster
                    islem=islem+1; //isleme bir ekle
                    break;

                case 2: //2 se
                    System.out.println("lutfen kartiniza yatirmak istediginiz miktari giriniz"); //mevlayı istedik
                    int n2 = sc.nextInt();

                    if (n2 < 0) { //sıfırdan küçükse 
                        System.out.println("bu islem icin yanlis secimi yaptiniz"); //bu işlemin para yatırma olduğunu para çakma işlemininin olmadığını söyledik
                        break;
                    } else if (n2 == 0) { // eşitse para yatıtrılmadığını söyledik
                        System.out.println("Girmek istediginiz miktari dogru girdiginize dikkat edin!");
                        break;
                    } else { //hiçbiri değilse parayı yatır
                        bakiye = bakiye + n2;
                        System.out.println("Para yatirma islemi basariyla gerceklismistir. Yeni bakiyeniz " + bakiye);
                        islem=islem+1; //işleme bi ekle
                    }
                    break;

                case 3: //3 se
                    System.out.println("lutfen kartinizdan cekmek istediginiz miktari giriniz(basina eksi koymayin)");
                    int n3 = sc.nextInt();

                    if (n3 > bakiye) { // bakiyeden küçük olmalı dedik
                        System.out.println("Kartinizdan cekmek istediginiz miktari dogru girdiginizi kontrol ediniz");
                        break;
                    } else if (n3 == 0) { // eşitse para çekilmediğini söyledik
                        System.out.println("Kartinizdan cekmek istediginiz miktari dogru girdiginizi kontrol ediniz");
                        break;
                    } else {
                        bakiye = bakiye - n3; //bakiyeden düştük
                        System.out.println("Para yatirma islemi basariyla gerceklismistir. Yeni bakiyeniz " + bakiye);
                    islem=islem+1;
                    }
                    break;

                case 4: //4 se emin olup olmadıgını sorduk
                    System.out.println("Cikis yapmak istediginizden emin misiniz? Evetse (1), Hayirsa(2) tiklayiniz ");
                    int secim2 = sc.nextInt();
                    
                    if (secim2 == 1) {  //eminse kapat
                        islem=islem+1;
                        System.out.println("Cikis yapiliyor, Kartinizi alabilirsiniz \nToplam bakiyeniz " + bakiye + "\nIslem sayiniz" + islem);
                        flag = false;
                        
                        break;
                    } else if (secim2 == 0) { //değilse devam
                        System.out.println("Cikis iptal edilmistir");
                        break;
                    } else { //hiçbiri değilse yanlış tuşlandıgını söyle
                        System.out.println("Yanlis bir secim yapildigindan cikis iptal edilmistir \n eger cikis yapmak istiyosaniz menuden 4 burdançda 1 basarak \n cikis islemini gerceklestirebilirsiniz \n");
                        break;
                    }

                default: //hiçbiri degilse çıktıyı çıkar
                    System.out.println("Seciminizde hata var lutfen bir daha deneyiniz.");
            }

        }

    }

}

# Rapor

**Ad Soyad:** Kaan Enes KAYA
**Numara:** 62

## 1. Algoritma Açıklaması
Algoritma basit bir Bankamatiğin yaptıklarını yapıyo yani bakiyeyi görme para çekme oara yatırma.Kapatırkende başarılı işlem sayısını ve en son bakiye miktarını ekrana yansıtır


## 2. Girdi - İşlem - Çıktı

**Girdiler:**

1=işlem seçeneği
2=2 seçenekte yatırılmak istenen para
3=3. seçenekte çekilmek istenen para
4=4. seçenekte onay sorusu

**İşlemler:**

1<-bakiyeyi göster
2-bakiyeye 5000 tl ekle
3-bakiyeden 700 çıkar
4-çalışmayı durdur
5-yanlış tuşlama
6-devam et
7-eksiye düşme
8-yanlış tuşlama

**Çıktılar:**

1-"bakiyeniz" + bakiye
2-"para yatırıldı yeni bakiyeniz" + (bakiye+ yatırılan)
3-"para çekildi yeni bakiyeniz" + (bakiye-çekilen)
4-"kartınızı alabilirsiniz"
5-"böyle bir işlem seçeneğimiz yoktur"
6-"oturum sonlandırılma işlemi iptal edilmiştir"
7-"Kredi kartınızda bu mevlada bir para bulunamamaktadır"
8-"böyle bir işlem seçeneğimiz yoktur"

## 3. Sözde Kod (Pseudocode)

```
1.while
2.Switch case
3.if
4.else if
5.else
```

## 4. Akış Şeması

Program başladığında  10.000 TL başlangıç bakiyesi tanımla işlemi 0 dan başlat ve bayrağı true yap while le kullanıcı çıkış yapmak isteyip onay verene kadar çalışmaya devam eder  her adımda ekrana işlem menüsünü getirerek kullanıcıdan bir seçim yapmasını bekler Kullanıcının yaptığı seçime göre switch  devreye girereğer kullanıcı 1'i seçerse güncel bakiyesi ekrana yazdırılır ve işlem sayacı bir artırılır Kullanıcı 2 yi seçerek para yatırmak istediğinde girilen miktarın negatif veya sıfır olup olmadığı kontrol edilir miktar geçerliy ise bakiyeye eklenip işlem sayacı güncellenir yoksa kullanıcıya uyarı mesajı gösterilir
Benzer şekilde kullanıcı 3ü seçerek para çekmek istediğinde çekilmek istenen tutarın mevcut bakiyeden büyük olup olmadığı geçersiz bir değer girilip girilmediği kontrol edilir koşullar doğruysa bakiye düşülerek işleme 1 eklenir. Kullanıcı çıkış anlamına gelen 4'ü tuşladığında ise program doğrudan bitmez bunun yerine kullanıcıya çıkıştan emin onayı istenir Bu aşamada kullanıcı 1 tuşlayarak çıkışı onaylarsa döngü bayrağı false yapılır toplam bakiye ile toplam işlem sayısı ekrana yazdırılır ve program güvenli bir şekilde sonlandırılır 0 veya 1 den farklıysa menüye geri döndürülür.

## 5. Test Senaryoları (en az 8)

| No | Yapılan işlem / girdi | Beklenen sonuç | Programın sonucu | Doğru mu? |
|---|---|---|---|---|
| 1 | 1 | 10000 | 10000 | Doğru |
| 2 | 2,5000 | 150000 | 15000 | Doğru |
| 3 | 2,0 | 10000 | "hesabınıza para yüklenilmedi" | Doğru |
| 4 | 2,-700 | hata | "miktarı yanlış girdiniz" | Doğru |
| 5 | 3 ,2000| 8000 | 8000 | Doğru |
| 6 | 3,11000 | hata | "hesapta bu kadar para yok" | Doğru |
| 7 | 5 | hata | "yanlış tuşlama" | Doğru |
| 8 | 4,1 | "kapatılıyor" | "kartınızı alabilirsiniz" | Doğru |

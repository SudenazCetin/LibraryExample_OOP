# Sanat Tavsiye Platformu

Sanat Tavsiye Platformu, kullanıcıların müzik ve resim koleksiyonlarını yönetebilecekleri Java tabanlı bir kütüphane sistemidir. Program, ikili ağaç (binary tree) veri yapısını kullanarak verileri düzenli bir şekilde saklar ve yönetir.

## 🌟 Özellikler

### Müzik Kütüphanesi
- Sanatçı ve şarkı bilgilerini hiyerarşik olarak saklama
- Sanatçıları alfabetik sırada listeleme
- Şarkıları sanatçılara göre gruplandırarak görüntüleme
- Yeni şarkı ve sanatçı ekleme imkanı
- Her şarkı için albüm bilgisi saklama

### Resim Kütüphanesi
- Resim eserlerini sistematik olarak kaydetme
- Ressamlar ve eserlerini düzenli bir şekilde saklama
- Sanat eserleri için detaylı bilgi (tür, dönem) tutma
- Resimleri alfabetik sırada listeleme

## 🔧 Teknik Detaylar

### Veri Yapıları
- İkili Arama Ağacı (Binary Search Tree) implementasyonu
- Müzik kütüphanesi için iç içe ağaç yapısı (Sanatçı -> Şarkılar)
- Resim kütüphanesi için tekli ağaç yapısı

### Sınıf Yapısı
- `Main`: Ana program döngüsü ve menü yönetimi
- `MuzikKutuphane`: Müzik verilerinin yönetimi
- `ResimKutuphane`: Resim verilerinin yönetimi
- `Resim`: Resim veri modeli
- `Sarki`: Şarkı veri modeli

## 💻 Kullanım

### Ana Menü Komutları
```
müzik  : Müzik kütüphanesine erişim
resim  : Resim kütüphanesine erişim
çıkış  : Programdan çıkış
```

### Müzik Kütüphanesi Komutları
```
ekle      : Yeni şarkı ekleme
sanatçılar: Tüm sanatçıları listeleme
listele   : Tüm şarkıları listeleme
geri      : Ana menüye dönüş
```

### Resim Kütüphanesi Komutları
```
ekle    : Yeni resim ekleme
listele : Tüm resimleri listeleme
geri    : Ana menüye dönüş
```

## 🚀 Kurulum

1. Projeyi klonlayın:
```bash
git clone [repository-url]
```

2. Java IDE'nizde projeyi açın

3. Main.java dosyasını çalıştırın

## 📋 Gereksinimler

- Java JDK 8 veya üzeri
- Herhangi bir Java IDE (Eclipse, IntelliJ IDEA, vb.)

## 🤝 Katkıda Bulunma

1. Bu repository'yi fork edin
2. Yeni bir branch oluşturun (`git checkout -b feature/yeniOzellik`)
3. Değişikliklerinizi commit edin (`git commit -am 'Yeni özellik eklendi'`)
4. Branch'inizi push edin (`git push origin feature/yeniOzellik`)
5. Pull Request oluşturun

## 📝 Lisans

Bu proje MIT lisansı altında lisanslanmıştır. Daha fazla bilgi için `LICENSE` dosyasına bakınız.

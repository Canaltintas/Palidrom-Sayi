# Patika.dev
Patika.dev Profil : https://app.patika.dev/cans06

# Ödev - Palindrom Sayılar
Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

### Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....

## Programın Çalışması
Kullanıcıdan alınan bir int değeri ilgili kurala göre karşılaştırıp true/false değeri döndüren bir program.
- Main Fonksiyonu içerisinde bir int değişkeni tanımlanır.
- Kullanıcıdan int değişkeni için değer alınır.
- println içerisinde isPalindrom() değeri çağrılır ve parametre olarak kullanıcıdan alınan int değişkeni atanır.
- Bir boolean türünden isPalindrom isimli bir method oluşturulur. Parametre olarak int değişkeni atanır.
- Method içerisinde parametrenin tutulacağı ,sayının basamak değerlerini tutan ve bir palindrom sayısı tutacak int türünde üç değişken atanır.
  (temp,digits,palidromNumber ve parametre olarak x)
- x parametre değeri temp değişkenine atanır.
- bir while döngüsü oluşturulur ve koşul olarak (temp !=0 ) koşulu atanır.
 Burada ki amaç temp değerini basamaklara ayırmak için basamak sayısı kadar 10'a bölünecek olmasıdır.temp değeri 0 değerini aldığında artık 10'a bölmenin bir anlamı kalmacağından ötürü döngünün durmasını sağlamaktır.
-While içerisinde temp değerinin 10'a bölümünden kalanı digit değerine atanır.(Bir sayının 10'a bölümünden kalan sayının son basamağıdır)
- temp değeri 10'a bölünür ve bölüm temp değerine atanır.
- palidromNumber 10'la çarpılır ve digits sayısı eklenir.sonuç tekrar palidromNumber değişkenine atanır.(Burada ki amaç her seferinde bir basamak sola kaydırmaktır.)
- While'dan çıkılır ve palidromNumber değişkeni ,x parametresi ile karşılaştırılır.Değişkenler eşitse method true,değilse false değerini döndürür.

####### Örnek :
Kullanıcının 241 sayını girdiği varsayılsın.
* x=241
* temp = 241,digit=0,palidromNumber=0.
* digit = temp % 10 . (241'ın 10'a bölümünden kalan 1 dır.)
* temp /=10.(241 sayısı 10'a bölünür, sonuç 24.1'dır ancak değişken int türünden olduğu için virgülden sonra ki kısmı dahil etmez ve temp değeri 24 olur )
* palidromNumber = (palidromNumber * 10)+digit (palidromNumber = 0*10 +1)
* 2.Döngü :
* digit = temp % 10 . (24'ün 10'a bölümünden kalan 4 dır.)
* temp /=10.(24 sayısı 10'a bölünür, sonuç 2.4'dır ancak değişken int türünden olduğu için virgülden sonra ki kısmı dahil etmez ve temp değeri 4 olur )
* palidromNumber = (palidromNumber * 10)+digit (palidromNumber = 1*10 +4 = 14)
* 3.Döngü :
* digit = temp % 10 . (2'ün 10'a bölümünden kalan 2 dır.)
* temp /=10.(24 sayısı 10'a bölünür, sonuç 0.2'dır ancak değişken int türünden olduğu için virgülden sonra ki kısmı dahil etmez ve temp değeri 2 olur )
* palidromNumber = (palidromNumber * 10)+digit (palidromNumber = 14*10 +2 = 142)
* temp değeri 0'a ulaştığı için while döngüsünden çıkılır.
* x ile palidromNumber değeri karşılaştırılır (241 == 142 )
* koşul sağlanmadığından false değeri döndürülür.
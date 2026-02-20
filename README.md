# Softmax Load Balancer

Bu proje, klasik Round-Robin veya Random algoritmaları yerine **Softmax Action Selection** yöntemini kullanarak istemci taraflı yük dengeleme yapmayı amaçlar.

## 🎯 Amaç
- Toplam bekleme süresini (latency) minimize etmek
- Sunucu seçiminde adaptif ve olasılıksal bir yaklaşım geliştirmek

## 📂 Proje Yapısı
src/lb/
├── Main.java
├── Server.java
└── SoftmaxLoadBalancer.java

## ⚙️ Çalıştırma
- IntelliJ IDEA ile projeyi aç.
- `Main.java` dosyasını çalıştır.
- Konsolda sunucu seçimleri ve latency değerleri görüntülenir.

## 📊 Analiz
- Tau düşük olduğunda algoritma tek sunucuya kilitlenir.
- Tau yüksek olduğunda seçimler daha dengeli dağılır.

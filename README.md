## 請用外部連結導入 H2 DB

* 導入可參考[這篇文章](https://stackoverflow.com/questions/43256295/how-to-access-in-memory-h2-database-of-one-spring-boot-application-from-another/43276769#43276769)

1. 
![](https://i.imgur.com/AaCNN9U.png)

2. 設定 URL 為: 
```
jdbc:h2:tcp://localhost:9092/mem:training

帳號：sa
密碼：123
```
![](https://i.imgur.com/Nl187WD.png)


3. 如果要跳過設定，將 ZIP 拉到桌面，直接解壓縮 ZIP 檔，拉進 IntelliJ IDEA，這樣啟動專案 H2 DB 不用重新連線！

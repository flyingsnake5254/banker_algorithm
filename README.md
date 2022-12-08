410977007 軟體三 盧姵君
專案說明：
本專案包含三個 class：Main.java , Banker.java , Process.java，請執行 Main.java。

類別說明：
1. Main.java :
   為主程式，包含 Process 資料設置、Banker物件建立、arraylist 加減 function。

2. Process.java :
   紀錄每個 Process 資料的類別，包含 allocation , max , need , name , finish state。

3. Banker.java :
   為執行演算法的類別。並且設置 available。

   			function 說明：
   					output : 輸出資訊到終端
   					needLessThanAvailable : 判斷 Process 的 need 是否小於 available
   					finish : 判斷是否所有的 Process 狀態皆為 true
   					alg : 銀行家演算法
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

執行過程與結果：
'''
      Allocation    Max          Need        Finish    Available
       A  B  C      A  B  C      A  B  C                A  B  C
P1    [0, 1, 0]    [7, 5, 3]    [7, 4, 3]    false     [3, 3, 2]
P2    [2, 0, 0]    [3, 2, 2]    [1, 2, 2]    false     
P3    [3, 0, 2]    [9, 0, 2]    [6, 0, 0]    false     
P4    [2, 1, 1]    [2, 2, 2]    [0, 1, 1]    false     
P5    [0, 0, 2]    [4, 3, 3]    [4, 3, 1]    false

      Allocation    Max          Need        Finish    Available
       A  B  C      A  B  C      A  B  C                A  B  C
P1    [0, 1, 0]    [7, 5, 3]    [7, 4, 3]    false     [5, 3, 2]
P2    [0, 0, 0]    [3, 2, 2]    [0, 0, 0]    true     
P3    [3, 0, 2]    [9, 0, 2]    [6, 0, 0]    false     
P4    [2, 1, 1]    [2, 2, 2]    [0, 1, 1]    false     
P5    [0, 0, 2]    [4, 3, 3]    [4, 3, 1]    false

      Allocation    Max          Need        Finish    Available
       A  B  C      A  B  C      A  B  C                A  B  C
P1    [0, 1, 0]    [7, 5, 3]    [7, 4, 3]    false     [7, 4, 3]
P2    [0, 0, 0]    [3, 2, 2]    [0, 0, 0]    true     
P3    [3, 0, 2]    [9, 0, 2]    [6, 0, 0]    false     
P4    [0, 0, 0]    [2, 2, 2]    [0, 0, 0]    true     
P5    [0, 0, 2]    [4, 3, 3]    [4, 3, 1]    false

      Allocation    Max          Need        Finish    Available
       A  B  C      A  B  C      A  B  C                A  B  C
P1    [0, 1, 0]    [7, 5, 3]    [7, 4, 3]    false     [7, 4, 5]
P2    [0, 0, 0]    [3, 2, 2]    [0, 0, 0]    true     
P3    [3, 0, 2]    [9, 0, 2]    [6, 0, 0]    false     
P4    [0, 0, 0]    [2, 2, 2]    [0, 0, 0]    true     
P5    [0, 0, 0]    [4, 3, 3]    [0, 0, 0]    true

      Allocation    Max          Need        Finish    Available
       A  B  C      A  B  C      A  B  C                A  B  C
P1    [0, 0, 0]    [7, 5, 3]    [0, 0, 0]    true     [7, 5, 5]
P2    [0, 0, 0]    [3, 2, 2]    [0, 0, 0]    true     
P3    [3, 0, 2]    [9, 0, 2]    [6, 0, 0]    false     
P4    [0, 0, 0]    [2, 2, 2]    [0, 0, 0]    true     
P5    [0, 0, 0]    [4, 3, 3]    [0, 0, 0]    true

      Allocation    Max          Need        Finish    Available
       A  B  C      A  B  C      A  B  C                A  B  C
P1    [0, 0, 0]    [7, 5, 3]    [0, 0, 0]    true     [7, 5, 5]
P2    [0, 0, 0]    [3, 2, 2]    [0, 0, 0]    true     
P3    [3, 0, 2]    [9, 0, 2]    [6, 0, 0]    false     
P4    [0, 0, 0]    [2, 2, 2]    [0, 0, 0]    true     
P5    [0, 0, 0]    [4, 3, 3]    [0, 0, 0]    true

      Allocation    Max          Need        Finish    Available
       A  B  C      A  B  C      A  B  C                A  B  C
P1    [0, 0, 0]    [7, 5, 3]    [0, 0, 0]    true     [10, 5, 7]
P2    [0, 0, 0]    [3, 2, 2]    [0, 0, 0]    true     
P3    [0, 0, 0]    [9, 0, 2]    [0, 0, 0]    true     
P4    [0, 0, 0]    [2, 2, 2]    [0, 0, 0]    true     
P5    [0, 0, 0]    [4, 3, 3]    [0, 0, 0]    true     

'''



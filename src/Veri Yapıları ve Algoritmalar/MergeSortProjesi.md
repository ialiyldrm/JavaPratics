# Merge Sort

`[16,21,11,8,12,22]`

Yukarıdaki dizinin sort türüne göre aşamalarını yazınız.

- 1)Dizi ikiye bölünür; [16,21,11] - [8,12,22]
- 2)Dizi tekrar ikiye bölünür; [16,21]-[11]-[8,12]-[22]
- 3)Her parça kendi içerisinde sıralanır; [16,21]-[11]-[8,12]-[22]
- 4)İlk aşamadaki hallerine göre birleştir; [16,11,21]-[8,12,22]
- 5)Sıralı iki alt diziyi tek bir sıralı dizi olacak şekilde birleştirir; [8,11,12,16,21,22]

Big-O gösterimini yazınız.

- O(n log n) - n tane öğeyi ayrılır ve yeniden birleştirilir.

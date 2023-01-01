import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) {
        // 0'dan 10000'e kadar olan sayıları bir listeye ekle
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            numbers.add(i);
        }

        // Listeyi 4 eşit parçaya böl
        int chunkSize = numbers.size() / 4;
        List<List<Integer>> numberChunks = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i += chunkSize) {
            numberChunks.add(numbers.subList(i, i + chunkSize));
        }

        // Yeni listeleri tek ve çift sayılar olarak iki farklı listeye aktar
        List<Integer> evenNumbers = new ArrayList<>();
        List<Integer> oddNumbers = new ArrayList<>();

        // Java thread kullanarak bu işlemleri gerçekleştir
        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Callable<Void>> tasks = new ArrayList<>();
        for (List<Integer> chunk : numberChunks) {
            Callable<Void> task = () -> {
                for (int number : chunk) {
                    if (number % 2 == 0) {
                        synchronized (evenNumbers) {
                            evenNumbers.add(number);
                        }
                    } else {
                        synchronized (oddNumbers) {
                            oddNumbers.add(number);
                        }
                    }
                }
                return null;
            };
            tasks.add(task);
        }

        try {
            List<Future<Void>> futures = executor.invokeAll(tasks);
            for (Future<Void> future : futures) {
                future.get();
            }
        } catch (Exception e) {
            // Hata işleme
        }

        // Threadleri kapat
        executor.shutdown();

        // Sonuçları ekrana yazdır
        System.out.println("Çift sayılar: " + evenNumbers);
        System.out.println();
        System.out.println("Tek sayılar: " + oddNumbers);
    }
}

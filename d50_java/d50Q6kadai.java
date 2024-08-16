// 1: d50Q6kadai - 指定範囲内の素数を出力し、その数を表示するプログラム
public class d50Q6kadai {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]);

        // 2: 入力の順序を調整 (min が max より大きい場合、入れ替え)
        if (min > max) {
            int tmp = max;
            max = min;
            min = tmp;
        }

        // 3: PrimeNumbers クラスを使って素数を初期化
        PrimeNumbers primeNumbers = new PrimeNumbers();
        primeNumbers.initializePrimeNumbers(max);

        // 4: 指定範囲内の素数を取得し、出力
        int[] part = primeNumbers.getPart(min, max);
        for (int i = 0; i < part.length; i++) {
            System.out.printf("%d", part[i]);
            if (i < part.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        // 5: 素数の個数を表示
        System.out.printf("%dから%dまでの素数の数は%d個です%n", min, max, part.length);
    }
}

class PrimeNumbers {
    private boolean[] isPrimeNumbers;

    // 6: max までの素数を初期化する
    void initializePrimeNumbers(int max) {
        isPrimeNumbers = new boolean[max + 1];
        for (int i = 2; i <= max; i++) {
            isPrimeNumbers[i] = true;
        }
        for (int p = 2; p <= Math.sqrt(max); p++) {
            if (isPrimeNumbers[p]) {
                for (int m = p * p; m <= max; m += p) {
                    isPrimeNumbers[m] = false;
                }
            }
        }
    }

    // 7: 指定範囲の素数を取得する
    int[] getPart(int min, int max) {
        int count = 0;
        for (int n = min; n <= max; n++) {
            if (isPrimeNumbers[n]) {
                count++;
            }
        }

        int[] part = new int[count];
        int index = 0;
        for (int n = min; n <= max; n++) {
            if (isPrimeNumbers[n]) {
                part[index++] = n;
            }
        }
        return part;
    }
}

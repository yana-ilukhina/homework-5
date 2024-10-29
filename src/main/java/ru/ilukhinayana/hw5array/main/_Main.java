package ru.ilukhinayana.hw5array.main;

import java.util.Arrays;
import java.util.Random;

public class _Main {
    public static void main(String[] args) {
        int length = 10; // длина массива
        int[] arr1 = new int[length];
        Random random = new Random(); // псевдо-рандом
        for (int i = 0; i < length; i++) {
            arr1[i] = random.nextInt(-100, 101); // граница не включительно
        }
        System.out.println(Arrays.toString(arr1) + " -- рандомный массив");
        isEvenEx1(arr1);
        isNotEvenEx2(arr1);
        isPrimeEx3(arr1);
        sumEx4(arr1);
        differOfSumEx5(arr1);
        isZeroEx6(arr1);
    }

    static void isEvenEx1(int[] arr1) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println("1. Количество четных чисел в массиве: " + count);
    }

    static void isNotEvenEx2(int[] arr1) { // отдельным методом
        int count = 0;
        for (int j : arr1) if (j % 2 != 0) count++;
        System.out.println("2. Количество нечетных чисел в массиве: " + count);
    }

    static void isPrimeEx3(int[] arr1) {
        int primeCount = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (isPrime(arr1[i])) {
                primeCount++; // Увеличиваем счетчик простых чисел
            }
        }
        System.out.println("3. Количество простых чисел в массиве: " + primeCount);
    }

    static boolean isPrime(int number) { // доп метод
        if (number <= 1) {
            return false; // Числа меньше или равные 1 не являются простыми
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Найден делитель, значит число не простое
            }
        }
        System.out.println(number + " это простое число");
        return true; // Число простое
    }

    static void sumEx4(int[] arr1) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            count += arr1[i];
        }
        System.out.println("4. Сумма всех чисел в массиве: " + count);
    }

    static void differOfSumEx5(int[] arr1) { // будем считать что 0 это четный индекс. Но если надо будет, можем его выкинуть
        int sunEvenIndexElements = 0;
        int sunUnevenIndexElements = 0;
        int differenceOfSum = 0;
        for (int i = 0; i < arr1.length; i += 2) {
            sunEvenIndexElements += arr1[i];
            sunUnevenIndexElements += arr1[i + 1];
        }
        differenceOfSum = sunEvenIndexElements - sunUnevenIndexElements;
        System.out.println("5. Разность между суммой чисел имеющих четный индекс и суммой чисел имеющих нечетный индекс в массиве: " + differenceOfSum);
    }

    static void isZeroEx6(int[] arr1) {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) count++;
        }
        System.out.print("6. Количество чисел 0 в массиве: " + count);
    }
}
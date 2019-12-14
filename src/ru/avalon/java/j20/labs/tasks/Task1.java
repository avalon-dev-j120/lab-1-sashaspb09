package ru.avalon.java.j20.labs.tasks;

import java.util.Arrays;
import ru.avalon.java.j20.labs.Task;
import ru.avalon.java.j20.labs.core.RandomArrayFactory;
import ru.avalon.java.j20.labs.models.Numbers;

/**
 * Задание №1.
 *
 * <p>Тема: "Создание обобщённых методов".
 *
 * <p>В рамках задания требуется описать и выполнить
 * несколько методов, обобщённых с указанной точностью.
 */
public class Task1 implements Task {
    

    /**
     * Фабрика, создающая массивы случайных чисел.
     */
    private final RandomArrayFactory arrayFactory = new RandomArrayFactory();

    /**
     * {@inheritDoc}
     */
    @Override
    public void run() {
        System.out.println("In progress: 1 Task ");
        
        Integer[] arrayi = arrayFactory.getInstance(20);
        Double[] arrayd = new Double[arrayi.length];
        
         System.out.println("Начальный массив int: " + Arrays.toString(arrayi));
  
        System.out.print("Массив double: ");
        for (int i = 0; i < arrayi.length; i++){
            arrayd[i]=(double)arrayi[i];
            System.out.print(arrayd[i] + " ");
            
        }      
       System.out.println();
        System.out.println("(int) min = " + Numbers.min(arrayi));
        System.out.println("(double) min = " + (double)Numbers.min(arrayd));    
        System.out.println("(int) max = " + Numbers.max(arrayi));
        System.out.println("(double) max = " + (double)Numbers.max(arrayd));       
        System.out.println("Среднее арифметическое чисел массива = " + Numbers.avg(arrayi) );
        System.out.println();
        /*
         * TODO(Студент): Выполните задание №1
         *
         * 1. Обобщить метод поиск среднего арифметического
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск среднего арифметического
         *    в массивах любых чисел: целых и вещественных.
         *
         *    Возвращать необходимо значение типа double.
         *
         * 2. Обобщить метод поиск максимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск максимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 3. Обобщить метод поиск минимального значения
         *
         *    Выполните обобщение метода с использованием шаблона так,
         *    чтобы метод мог выполнять поиск минимального значения
         *    в массивах любых чисел: целых и вещественных.
         *
         * 4. С использованием отладчика проверьте корректность
         *    выполнения задания.
         */
    }
}

package de.telran.d211125.concatenation.censor;

import java.util.Arrays;

/*
   1. написать класс censor, который олицетворяет сервис, оценивающий текст на приличность. каждый объект класса имеет
   полем словарь плохих слов, который получает через конструктор. Также, в классе цензор есть метод (не статический),
   который проверяет текст на вхождение в него какого-либо слова из словаря плохих слов.
   Метод verify принимает строку и возвращает true, если плохих слов не обнаружено, и false в противном случае.
   */
public class HomeWorkCensor {

    private final String[] vocabulary;

    public HomeWorkCensor(String[] vocabulary) {

        this.vocabulary = Arrays.copyOf(vocabulary, vocabulary.length);

        // this.vocabulary = vocabulary; // так плохо, т.к. vocabulary доступен для других
    }

    public boolean verify(String text) {
        for (int i = 0; i < vocabulary.length; i++) {
            if (text.contains(vocabulary[i]))
                return false;
        }
        return true;
    }
}
/*
stack               heap - массив
badWords            abc xyz ffkk            <- vocabulary (теперь показывает единственный массив)
                    cba zyx kkff
 */

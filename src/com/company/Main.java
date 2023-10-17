package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        String history []={"Кто после Абылая унаследовал ханский трон в Среднем Жузе?",
                "В каком году Казахская ССР была преобразована в Республику Казахстан?",
                "В каком кюе Курмангазы слышатся мотивы несгибаемой воли народа к свободе, родной земле, безграничной степи?",
                "В каком произведении казахской советской литературы писателя Сабита Муканова нашло свое отражение восстание 1916 года?",
                "Какие роды участвовали в восстании на Мангыстау в 1870 г.?"
        };
        String HistoryAnswer [] ={"Уали","1991","Сарыарка","Ботагоз","Адай"};
        String geography[]={"Сколько океанов в мире ?",
                "Какое место Казахстан занимает по площади ?",
                "Сколько в мире материков?",
                "Страна у которой нет армии?",
                "Где находится самый большой вулкан на Земле?"
        };
        String GeographyAnswer [] = {"4","9","6","Коста-Рика","Гавайи"};
        String programming[]={"Конечный набор шагов, которые при следовании им решают какую-то задачу",
                "... – это бинарная форма представления кода определенного языка программирования.",
                "... – это набор смежных областей памяти, которые хранят данные определенного типа.",
                "Символьный тип данных объявляется служебным словом:" ,
                "Логический тип данных объявляется служебным словом:"
        };
        String ProgrammingAnswer [] = {"Алгоритм","Двоичный код","Массив","char","boolean"};
        String math[]={"Число, у которого нет собственного числа?",
                "53 разделить на четыре сколько будет?",
                "Сколько секунд в одном дне?",
                "Кто является отцом математики?",
                "Значение cos 360°?"
        };
        String MathAnswer [] = {"0","13","86400","Архимед","1"};
        System.out.println("Ваше имя ? " );
        String name = in.nextLine();
        System.out.println(name + " выберите любое число от 1 до 4 ");
        int number = in.nextInt();
        in.nextLine();
        switch (number){
            case 1:
                String [] answer =new String[5];
                System.out.println("Вам будут заданы вопросы из истории Казахстана");
                for (int i = 0; i < history.length; i++) {
                    System.out.println(history[i]);
                    int j=1;
                    while (j<6){
                        Thread.sleep(1000);
                        System.out.println(j+" секунд");
                        j++;
                    }
                   answer[i] = in.nextLine();
                }
                int count=0;
                for (int i = 0; i < 5; i++) {
                    if(HistoryAnswer[i].equals(answer[i])){
                        count++;
                    }
                }
                for (String qAnswer:answer) {
                    System.out.println(qAnswer);
                }
                if(count>3){
                    System.out.println("Победа!Вы набрали "+count+" очки");
                }else {
                    System.out.println("Проигрыш,вы набрали "+count+" очки");
                }
                break;
            case 2:
                String [] answer1 =new String[5];
                System.out.println("Вам будут заданы вопросы по географии");
                for (int i = 0; i < geography.length; i++) {
                    System.out.println(geography[i]);
                    int j=1;
                    while (j<6){
                        Thread.sleep(1000);
                        System.out.println(j+" секунд");
                        j++;
                    }
                    answer1[i] = in.nextLine();
                }
                int count1 =0;
                for (int i = 0; i < 5; i++) {
                    if(GeographyAnswer[i].equals(answer1[i])){
                        count1++;
                    }
                }
                for (String qAnswer:answer1) {
                    System.out.println(qAnswer);
                }
                if(count1 >3){
                    System.out.println("Победа!Вы набрали "+ count1 +" очки");
                }else {
                    System.out.println("Проигрыш,вы набрали "+ count1 +" очки");
                }break;
            case 3:
                System.out.println("Вам будут заданы вопросы по программированию");
                String [] answer2 =new String[5];
                for (int i = 0; i < programming.length; i++) {
                    System.out.println(programming[i]);
                    int j=1;
                    while (j<6){
                        Thread.sleep(1000);
                        System.out.println(j+" секунд");
                        j++;
                    }
                    answer2[i] = in.nextLine();
                }
                int count2 =0;
                for (int i = 0; i < 5; i++) {
                    if(ProgrammingAnswer[i].equals(answer2[i])){
                        count2++;
                    }
                }
                for (String qAnswer: answer2) {
                    System.out.println(qAnswer);
                }
                if(count2 >3){
                    System.out.println("Победа!Вы набрали "+ count2 +" очки");
                }else {
                    System.out.println("Проигрыш,вы набрали "+ count2 +" очки");
                }break;
            case 4:
                System.out.println("Вам будут задавать вопросы по математике");
                String [] answer3 =new String[5];
                for (int i = 0; i < math.length; i++) {
                    System.out.println(math[i]);
                    int j=1;
                    while (j<6){
                        Thread.sleep(1000);
                        System.out.println(j+" секунд");
                        j++;
                    }
                    answer3[i] = in.nextLine();
                }
                int count3 =0;
                for (int i = 0; i < 5; i++) {
                    if(MathAnswer[i].equals(answer3[i])){
                        count3++;
                    }
                }
                for (String qAnswer: answer3) {
                    System.out.println(qAnswer);
                }
                if(count3 >3){
                    System.out.println("Победа!Вы набрали "+ count3 +" очки");
                }else {
                    System.out.println("Проигрыш,вы набрали "+ count3 +" очки");
                }break;
        }

    }
}

package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Main m = new Main();

        m.vratDel7(sc);
        m.vratPrvocisla();
        m.AoC1();

        sc.close();
    }

    public void vratDel7(Scanner sc) {
        String cislo;
        Double cisloInt;

        System.out.println("Napiš číslo");
        cislo = sc.nextLine();
        cisloInt = Double.parseDouble(cislo);

        if (cisloInt % 7 == 0) {
            System.out.println("Číslo je dělitelné sedmi");
        } else {
            System.out.println("Číslo není dělitelné sedmi");

        }
    }

    public void vratPrvocisla() {
        String prvoCislo = "";

        System.out.println("Prvočísla do 100:");

        for (int cislo = 1; cislo <= 100; cislo++) {
            int i = 0;

            for (int delitel = cislo; delitel >= 1; delitel--) {
                if (cislo % delitel == 0) {
                    i++;

                }
            }

            if (i == 2) {
                System.out.println(cislo);

            }
        }
    }

    public void AoC1() {
        String input = "126360,61158,149929,88405,87526,51688,75356,116265,134986,111581,135675,69679,74035,144951,86157,68946,76761,114768,70694,84768,147379,78755,109688,118595,54608,77033,54654,61473,69644,81744,97148,106473,61541,98898,70394,117635,128388,140622,108691,126962,137756,125904,75675,127051,126388,85591,51583,101392,62959,135077,90916,127119,112427,79703,54739,50092,92505,53719,60887,62642,76382,85763,125799,67285,147992,80713,133619,131433,141765,109553,122534,88734,115622,82195,130771,121649,89355,121364,71664,130412,88936,63234,80274,108251,136663,139149,85052,67973,116461,75070,144261,106539,79712,116112,55755,121428,79362,103489,103157,64403";
        double output;

        output = Arrays.stream(input.split(",")).mapToDouble((i) -> Math.floor(Double.parseDouble(i) / 3) - 2).sum();

        System.out.println(output);
    }
}

//WCR
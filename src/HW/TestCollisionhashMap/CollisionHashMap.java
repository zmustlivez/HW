package HW.TestCollisionhashMap;

import HW.TestCollisionhashMap.AuxiliaryClasses.AuxClass;
import HW.TestCollisionhashMap.AuxiliaryClasses.AuxClass2;

import java.util.HashMap;
import java.util.Map;

public class CollisionHashMap {
    public static void main(String[] args) throws InterruptedException {


        Map<AuxClass, String> hashMap3 = new HashMap<>();
//        System.out.println("64 бакета заполняются нодами");
        AuxClass o;

/*        for (int i = 2; i <= 64; i++) {
//            Thread.sleep(100);
            o = new AuxClass(i);
            System.out.printf("Бакет %d заполняется \"new AuxClass (%d)\", \"%s\" %n",i, i, (char) (i+62));
            hashMap3.put(o, Character.toString((char) i));
        }*/
        System.out.printf("%nБакет 1 заполняется 9-ю коллизиями и превращается из связанного списка в дерево %n");
        for (int i = 0; i <= 11; i++) {
//            Thread.sleep(100);
            System.out.printf("Бакет 1 заполняется коллизией \"new AuxClass (%d)\", \"%s\" %n", i, ((char) (i + 49)));
            o = new AuxClass2(i);
            hashMap3.put(o, Character.toString(i + 49));
        }
        hashMap3.forEach((k, v) -> {
            // Проверка на управляющие символы (код символа от 0 до 31)
            if (v.charAt(0) < 32) {
                // Если это управляющий символ, выводим его как числовое значение
                System.out.println(k + ": " + (int) v.charAt(0));
            } else {
                // Если это печатаемый символ, выводим его как строку
                System.out.println(k + ": " + v);
            }
        });
        System.out.print("\n Мапа после удаления \n");
        for (int i = 0; i <= 6; i++) {
//            Thread.sleep(100);
            System.out.printf("Удаление \"new AuxClass (%d)\", \"%s\" %n", i, ((char) (i + 49)));
            o = new AuxClass2(i);
            hashMap3.remove(o, Character.toString(i + 49));
        }
        for (int i = 0; i <= 10; i++) {
//            Thread.sleep(100);
            System.out.printf("Удаление \"new AuxClass (%d)\", \"%s\" %n", i, ((char) (i + 49)));
            o = new AuxClass2(i);
            hashMap3.remove(o, Character.toString(i + 49));
        }
        hashMap3.put(new AuxClass2(1), Character.toString((char) 50));
        hashMap3.forEach((k, v) -> {
            // Проверка на управляющие символы (код символа от 0 до 31)
            if (v.charAt(0) < 32) {
                // Если это управляющий символ, выводим его как числовое значение
                System.out.println(k + ": " + (int) v.charAt(0));
            } else {
                // Если это печатаемый символ, выводим его как строку
                System.out.println(k + ": " + v);
            }
        });
    }
}

public class Main {
    public static void main(String[] args) {
        Arr arr = new Arr("Yura", 26);
        arr.arrRandom(10);
        arr.arrDouble(10);
        arr.arrNotDouble(10);
        System.out.println(arr);
        arr.chengeName(arr, "Oleg");
    }
}


//        -створити метод який отримує пустий масив , і зповнює його рандомними числами. Метод нічтого не повертає!
//        -створити метод який отримує пустий масив , і зповнює його парними числами. Метод нічтого не повертає!
//        -створити метод який отримує пустий масив , і зповнює його непарними числами. Метод нічтого не повертає!
//
//        -стоврити метод, який приймає об'єкт користувача та змінює йому їм'я на те, яке ви визначите.Метод нічого не повертає!
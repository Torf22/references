import java.util.Arrays;

public class Arr {
    private String name;
    private int age;

    public Arr(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Arr{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void arrRandom(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * n);
        }
        System.out.println(Arrays.toString(arr));
    }

    public void arrDouble(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int numRundom = (int) (Math.random() * n);
                if (numRundom % 2 == 0 && numRundom != 0) {
                    arr[i] = numRundom;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void arrNotDouble(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                int numRundom = (int) (Math.random() * n);
                if (numRundom % 2 != 0 && numRundom != 0) {
                    arr[i] = numRundom;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void chengeName(Arr arr, String newName) {
        arr.setName(newName);
        System.out.println(arr);
    }

}
//        -створити метод який отримує пустий масив , і зповнює його рандомними числами. Метод нічтого не повертає!
//        -створити метод який отримує пустий масив , і зповнює його парними числами. Метод нічтого не повертає!
//        -створити метод який отримує пустий масив , і зповнює його непарними числами. Метод нічтого не повертає!
//
//        -стоврити метод, який приймає об'єкт користувача та змінює йому їм'я на те, яке ви визначите.Метод нічого не повертає!
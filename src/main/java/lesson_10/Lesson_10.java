package lesson_10;

//1. Создайте 4 класса в которых есть поля (fields) и методы (methods)
//2. В классе App создайте функцию main() и создайте в ней по 2 объекта каждого класса - покажите как они работают

public class Lesson_10 {
    public static void main(String[] args) {
        Person anna = new Person();

        Person peter = new Person();
        peter.name="Peter";
        peter.lastName="Petroff";
        peter.year=1998;
//        anna=peter;
//        anna.printMe();


        Person jack = new Person();
        jack.year=1989;
        jack.lastName="Daniels";
        jack.name="Jack";
        jack.hello(" Jonny Walker");

        Car mazda6 = new Car();
        mazda6.brand = "Mazda";
        mazda6.model="6";
        mazda6.color="Silver";
        mazda6.year=2015;

        mazda6.carStarted();
        mazda6.honk();
        mazda6.brakes();

        Car toyotaSienna = new Car();
        toyotaSienna.year=2015;
        toyotaSienna.color="Grey";
        toyotaSienna.model="Sienna EXL- Turbo";
        toyotaSienna.brand="Toyota";



        toyotaSienna.carStarted();
        toyotaSienna.brakes();


    }

}

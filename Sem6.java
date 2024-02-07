import java.util.Date;
import java.util.Objects;

public class Cat {
    //1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения,
// которое является
//
//    а) информационной системой ветеринарной клиники
//
//    б) архивом выставки котов
//
//    в) информационной системой Театра кошек Ю. Д. Куклачёва
    private String name;
    private String owner;
    private String breed;

    private int age;

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                '}';
    }

    public Cat(String name, String owner, String breed, int age) {
        this.name = name;
        this.owner = owner;
        this.breed = breed;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && name.equals(cat.name) && Objects.equals(owner, cat.owner) && Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        //return Objects.hash(name, owner, breed, age);
        return 8 * age + 6 * name.hashCode() + 4 * owner.hashCode() + 11 * breed.hashCode();
    }
}

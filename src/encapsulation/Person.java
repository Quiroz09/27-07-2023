package encapsulation;
/*si es privada la unica manera de hacerlo publico es con metodos Get y Set

    hay tres modificadores de accesos private, public y protected

    a una propiedad publica tambien se puede acceder con get y set

     get y set tiene que ser metodos *publicos

     el set captura los datos y el get los trae*/
public class Person {
    public String name;
    private int age;

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
}



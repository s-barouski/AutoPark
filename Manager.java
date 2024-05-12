public class Manager extends People {

    public Manager (String fio, int age, String position){
        setFio(fio);
        setAge(age);
        setPosition(position);
    }
    void Manag (){
        System.out.println("ФИО: "+getFio()+", "+"Возраст: "+getAge()+", "+"Должность: "+getPosition());
    }
}

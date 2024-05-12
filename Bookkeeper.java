public class Bookkeeper extends People{

  public Bookkeeper (String fio, int age, String position){
      setFio(fio);
      setAge(age);
      setPosition(position);
  }
  void Bookkeep (){
      System.out.println("ФИО: "+getFio()+", "+"Возраст: "+getAge()+", "+"Должность: "+getPosition());
  }

}

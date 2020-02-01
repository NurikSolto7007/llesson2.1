public class Main {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.setAge(2);
        d1.setColor(Color.BLACK);
        d1.setShelter(new Shelter("Lovely Pets", "Советская 134"));
        d1.setName("Белка");
        d1.setBreed("Пудель");
        d1.setCommands(new String[]{"Сидеть", "Лежать"});

        Shelter shelter = new Shelter("Питомник", "Мира 67");

        Dog d2 = new Dog("Рекс", "Хаски", Color.WHITE, shelter);

        Dog d3 = new Dog("Бим", "Овчарка", Color.BROWN, shelter, new String[]{"След", "Фас", "Голос"});

        System.out.println(d1.getInfo());
        d1.makeVoice();
        System.out.println(d2.getInfo());
        d2.makeVoice(4);
        System.out.println(d3.getInfo());
        d3.makeVoice("ТЯВ",7);
    }
}

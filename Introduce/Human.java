class Human {
int age;
String name;
    public static void main(String[] args) {

	Human h = new Human();
	h.age = 20;
	h.name = "山田太郎";

	//h.addOneAge(h.age);
	h.addOneAge(h);
	//h.clearName(h.name);

	System.out.println(h.age + h.name);
    }
    void addOneAge(int age) {
	age++;
    }
    void addOneAge(Human human) {
	human.age++;
    }
    void clearName(String name) {
	name = "";
    }
}

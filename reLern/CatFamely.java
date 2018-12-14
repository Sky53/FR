package reLern;

public class CatFamely {
    public static void main(String[] args) {
        Cat catgfa = new Cat("Дедушка");
        Cat catgpa = new Cat("Бабушка");


    }

    static class Cat {
        private String name;
        private Cat mather;
        private Cat father;

        public Cat(String name) {
            this.name = name;
        }

        public Cat(String name, Cat mather, Cat father) {
            this.name = name;
            this.mather = mather;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mather == null && father == null) {
                return "The cat's name is " + name + ", no mother, no father";
            } else if (mather == null) {
                return "The cat's name is " + name + ", no mother, father is " + father.name;
            } else if (father == null) {
                return "The cat's name is " + name + ", mother is " + mather.name + ", no father";
            } else {
                return "The cat's name is " + name + ", mother is " + mather.name + ", father is " + father.name;
            }
        }
    }
}

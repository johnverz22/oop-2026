public abstract class Animal {
    private String name;
    private String breed;

    public Animal(){}
    
    public Animal(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public abstract void makeSound();
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getBreed() {
        return breed;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }
    
    @Override
    public boolean equals(Object o){
        if(o instanceof Animal){
            // Animal o2 = (Animal) o;
            // if(o2.getName() == this.name)
            //     return true;
            return name == ((Animal) o).getName();
        }

        return false;
    }
}

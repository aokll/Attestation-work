package PetRegistyPackage;

public class Pet {
    private String animal;
    private ClassAnimal classAnimal;
    private int ID;

    public Pet(String animal, ClassAnimal classAnimal, int ID) {
        this.animal = animal;
        this.classAnimal = classAnimal;
        this.ID = ID;
    }

    public String getAnimal() {
        return animal;
    }

    public ClassAnimal getClassAnimal() {
        return classAnimal;
    }

    public int getID() {
        return ID;
    }
}

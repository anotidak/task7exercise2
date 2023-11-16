public class Main {
    public static void main(String[] args) {
        Animal animal [] = new Animal[6];
     //animal[0] = new Aniaml();
        animal[0] = new Mammal(Name:"Little brown", age:2,weight:2,order:"Bat");
        animal[1] = new Dog(Name:"Butkus", age:5,weight:15,rzad:"Carnivore", breed"Mastiff");
        animal[2] = new Bird(Name:"Platypus", age:2,weight:1,featherColor:"White");
        animal[3] = new Pigeon(Name:"Pablo", age:10,weight:1,featherColor:"Grey", species:"spain");
        animal[4] = new Fish(Name:"Nemo", age:1,weight:3,scaleColor:"Mixed");
        animal[5] = new Blowfish(Name:"Blowfish", age:5,weight:5,scaleColor:"gray", diameter.10);

        animal[1].getVoice();
        animal[3].getVoice();
    }

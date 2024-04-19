package day09.poly.quiz;

class Processor extends ComputerPart {

    public Processor(String partName, double partPrice) {
        super(partName, partPrice);
    }

    @Override
    public void describePart() {
        System.out.println("Processor: " + partName + ", Price: " + partPrice);
    }
}

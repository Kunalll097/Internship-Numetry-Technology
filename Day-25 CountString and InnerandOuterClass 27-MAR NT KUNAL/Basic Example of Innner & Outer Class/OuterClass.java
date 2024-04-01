public class OuterClass {
    private int outerData;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    // Inner class inside OuterClass
    class InnerClass {
        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        public void display() {
            System.out.println("Outer Data: " + outerData);
            System.out.println("Inner Data: " + innerData);
        }
    }

    // Method to use the InnerClass
    public void useInner() {
        InnerClass inner = new InnerClass(20);
        inner.display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);
        outer.useInner();
    }
}

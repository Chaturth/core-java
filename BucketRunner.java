class BucketRunner {

    public static void main(String[] args)
    {

        Bucket bucket1 = new Bucket(10, 150, "Blue", "Plastic", 20);
        Bucket bucket2 = new Bucket(15, 200, "Red", "Steel", 25);

        System.out.println("Bucket1 capacity: " + bucket1.capacity);
        System.out.println("Bucket1 price: " + bucket1.price);
        System.out.println("Bucket1 color: " + bucket1.color);
        System.out.println("Bucket1 material: " + bucket1.material);
        System.out.println("Bucket1 height: " + bucket1.height);

        System.out.println("Bucket2 capacity: " + bucket2.capacity);
        System.out.println("Bucket2 price: " + bucket2.price);
        System.out.println("Bucket2 color: " + bucket2.color);
        System.out.println("Bucket2 material: " + bucket2.material);
        System.out.println("Bucket2 height: " + bucket2.height);
    }
}
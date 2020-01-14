public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("testimage.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
        System.out.println("Image is not loaded from the disk");
    }

}

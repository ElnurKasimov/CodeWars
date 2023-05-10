package Kju_7;

//Write a class Block that creates a block (Duh..)
//Requirements
//The constructor should take an array as an argument, this will contain 3 integers of the form [width, length, height] from which the Block should be created.
//Define these methods:
//`getWidth()` return the width of the `Block`
//`getLength()` return the length of the `Block`
//`getHeight()` return the height of the `Block`
//`getVolume()` return the volume of the `Block`
//getSurfaceArea()` return the surface area of the `Block`
//xamples
//lock b = new Block(new int[]{2,4,6}) -> creates a `Block` object with a width of `2` a length of `4` and a height of `6`
//b.getWidth() // -> 2
//b.getLength() // -> 4
//b.getHeight() // -> 6
//b.getVolume() // -> 48
//b.getSurfaceArea() // -> 88

// kata name is 'Building blocks'

public class Block{
    private int width;
    private int length;
    private int height;

    public Block (int[] data) {
        this.width = data[0];
        this.length = data[1];
        this.height = data[2];
    }

    public int getWidth() {
        return width;
    }

    public  int getLength() {
        return length;
    }

    public int getHeight() {
        return height;
    }

    public long getVolume() {
        return (long) width * length * height;
    }

    public long getSurfaceArea() {
        return 2 * ((long) (width * length + width * height + length * height) );
    }


    public static void main(String[] args) {
        Block block = new Block(new int[]{2,4,6});
        System.out.println("width = " + block.getWidth());
        System.out.println("length = " + block.getLength());
        System.out.println("hight = " + block.getHeight());
        System.out.println("volume = " + block.getVolume());
        System.out.println("surface area = " + block.getSurfaceArea());
    }

}

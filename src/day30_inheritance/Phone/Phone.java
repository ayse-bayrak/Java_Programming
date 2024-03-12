package day30_inheritance.Phone;

import java.util.Arrays;

public class Phone {
    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;
// even though Constructor will not be inherited to the child class,
// child class MUST CALL the parent class Constructor
    public  Phone(String model, String size, String color, double price) {
        setBrand(getClass().getSimpleName());
        //setBrand(brand);
        setModel(model);// make sure valid data, we need the conditions
        setSize(size);
        setPrice(price);
        setColor(color);
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {

        if (brand.isEmpty()|| brand.isBlank()||brand.equals(null)) {
            System.err.println("Invalid brand: " + brand + ", brand can not be null/empty/blank");
            System.exit(1);
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isEmpty()|| model.isBlank()||model.equals(null)) {
            System.err.println("Invalid model: " + model + ", model can not be null/empty/blank");
            System.exit(1);
        }
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 1) {
            System.err.println("Invalid price: " + price + ", price can not be zero or negative");
            System.exit(1);
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        String[] colors = {"Black", "White", "Silver", "Gold", "Pink", "Red", "Blue", "Gray"};
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        }else {
            System.err.println("Invalid color: "+ color + "\ncolor of the phone only be " + Arrays.toString(colors));
            System.exit(1);
        }
    }





    public void call(long phoneNumber) {
        System.out.println(getBrand() + " " + getModel() + " is calling to " + phoneNumber );
    }

   public void text(long phoneNumber) {
       System.out.println(getBrand() + " " + getModel() + " is texting to " + phoneNumber);
   }

    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*

Warmup tasks:
	1. Create a named Phone:
				Variables:
					brand, model, size, price, color

				Encapsulate all the fields
					Conditions:
						1. price can not be zero or negative
						2. color can only be set to:
								{"Black", "White", "Silver", "Gold", "Pink"}

				Add a constructor that can set all the fields

				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()

	2. Create the following sub classes of Phone:

			2.1 Iphone:
					Extra methods:
						faceTime(phoneNumber)
						faceTile(email)

			2.2 Samsung:
					Extra methods:
						freeze()

			2.3 Nokia:
					Extra methods:
						selfDefense()
 */
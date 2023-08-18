class Discount{
public static void main(String args[]){
double total=0,price=1000.0,quantity=5.0;
total=price*quantity;
double b=(total>=5000)?total-(total*0.01):total-(total*0.05);
System.out.println("The total price: "+b);
}
}
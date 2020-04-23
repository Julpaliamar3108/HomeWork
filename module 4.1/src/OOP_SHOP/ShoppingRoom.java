package OOP_SHOP;


import OOP_SHOP.Customer.Customer;
import OOP_SHOP.Customer.CustomerWithDiscount;
import OOP_SHOP.Departments.AbstractDepartment;
import OOP_SHOP.Products.AbstractProduct;


import java.text.DecimalFormat;
import java.util.Scanner;

public class ShoppingRoom{

    AbstractDepartment[] departments;
    AbstractProduct[] products;
    Banker[] bankers;
    Cashier[] cashiers;
    Security security;
    Customer customer;
    CustomerWithDiscount customerWithDiscount;

    public ShoppingRoom(AbstractProduct[] products, AbstractDepartment[] departments, Banker[] bankers, Security security, Cashier[] cashiers, Customer customer, CustomerWithDiscount customerWithDiscount) {
        this.products = products;
        this.departments = departments;
        this.bankers = bankers;
        this.security = security;
        this.cashiers = cashiers;
        this.customer = customer;
        this.customerWithDiscount = customerWithDiscount;
    }

    public void BuyProduct(){
            System.out.println("Что Вы выбрали? ");
            Scanner scan = new Scanner(System.in);
            String product = scan.nextLine();
            for (int i = 0; i < products.length; i++) {
                if (product.equals(products[i].getProductName())) {
                    System.out.println("Отличный выбор! К оплате " + products[i].getPrice() + "грн. У вас есть дисконтная карта?");
                    String answer = scan.nextLine();
                    if (answer.toLowerCase().contains("нет")){
                        customer.giveMoney();
                        double money = scan.nextDouble();
                        if (money > products[i].getPrice()) {
                            System.out.println("Ваша сдача " + (money - products[i].getPrice()) + "грн.");
                        }
                        if (money < products[i].getPrice()){
                            System.out.println("Обратитесь к банкирам они вам помогут");
                            break;
                        }
                    }
                    else {
                        customerWithDiscount.giveCard();
                        int card = scan.nextInt();
                        if (card <= 500){
                            System.out.println(customerWithDiscount.getName() + ", скидка по вашей карте составляет 5%. Сумма оплаты с учетом скидки " + (products[i].getPrice() * 0.95) + " грн.");
                            customer.giveMoney();
                            double money = scan.nextDouble();
                            if (money > (products[i].getPrice() * 0.95)) {
                                System.out.println("Ваша сдача " + (money - (products[i].getPrice() * 0.95)) + "грн.");
                            }
                            if (money < (products[i].getPrice() * 0.95)){
                                System.out.println("Обратитесь к банкирам они вам помогут");
                                break;
                            }
                        }
                        if (card >500){
                            System.out.println(customerWithDiscount.getName() + ", скидка по вашей карте составляет 10%. Сумма оплаты с учетом скидки " + (products[i].getPrice() * 0.9) + " грн.");
                            customer.giveMoney();
                            double money = scan.nextDouble();
                            if (money > (products[i].getPrice() * 0.9)) {
                                System.out.println("Ваша сдача " + (money - (products[i].getPrice() * 0.9)) + "грн.");
                            }
                            if (money < (products[i].getPrice() * 0.9)){
                                System.out.println("Обратитесь к банкирам они вам помогут");
                                break;
                            }
                        }
                    }
                    cashiers[0].TakeMoney();
                    security.Check();
                }
            }
        }

        public void TalkWithBankers(){
            System.out.println(bankers[0].toString());
            System.out.println(bankers[1].toString());
            bankers[0].BankChoice();
            Scanner scan = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("##.##");
            String bankName = scan.nextLine();
            if (bankName.toLowerCase().contains("прив")){
                System.out.println("На какую сумму вы планирует совершить покупку?");
                double price = scan.nextDouble();
                System.out.println("Ежемесячная выплата составит: " + (df.format(price/12)) + " грн.");
            }
            if (bankName.toLowerCase().contains("баб")){
                System.out.println("На какую сумму вы планирует совершить покупку?");
                double price = scan.nextDouble();
                System.out.println("Ежемесячная выплата составит: " + (df.format(price/6)) + " грн.");
            }
            else {
                System.out.println("Всего доброго , до свидания!");
            }

        }

    }


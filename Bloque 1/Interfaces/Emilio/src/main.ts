import { Product, EmailNotificationService, SMSNotificastionService, ShoppingCart } from ".";

const mouse = new Product(1, 'Mouse', 500)
const laptop = new Product(2, 'Laptop', 15000)
const monitor = new Product(3, 'Monitor', 3500)

const cart = new ShoppingCart(new EmailNotificationService)
const cart2 = new ShoppingCart(new SMSNotificastionService('9211234567'))

cart.addProduct(mouse, laptop, monitor)
cart.checkout()
monitor.applyDiscount(10)
cart2.addProduct(mouse, monitor)
cart2.checkout()
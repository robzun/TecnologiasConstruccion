"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.ShoppingCart = exports.SMSNotificastionService = exports.EmailNotificationService = exports.Product = void 0;
class Product {
    constructor(id, name, price) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discount = 0;
    }
    getId() {
        return this.id;
    }
    getName() {
        return this.name;
    }
    getPrice() {
        return this.price;
    }
    getDiscount() {
        return this.discount;
    }
    getPriceWithDiscount() {
        return this.price * (1 - this.discount / 100);
    }
    applyDiscount(discount) {
        this.discount = discount;
        return this.getPriceWithDiscount();
    }
}
exports.Product = Product;
class EmailNotificationService {
    sendNotification(message) {
        console.log(message);
    }
}
exports.EmailNotificationService = EmailNotificationService;
class SMSNotificastionService {
    constructor(phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    sendNotification(message) {
        console.log(`${message}, mensaje envíado a ${this.phoneNumber}`);
    }
}
exports.SMSNotificastionService = SMSNotificastionService;
class ShoppingCart {
    constructor(notificationService) {
        this.notificationService = notificationService;
        this.products = [];
    }
    addProduct(...newProducts) {
        newProducts.forEach(product => this.products.push(product));
    }
    showProducts() {
        console.log("Compraste: ");
        this.products.forEach((product, index) => {
            if (product.getDiscount() > 0) {
                console.log(`${index + 1}. ${product.getName()}, Precio original: $${product.getPrice()}MXN, Precio con descuento: $${product.getPriceWithDiscount()}MXN`);
            }
            else {
                console.log(`${index + 1}. ${product.getName()}, por: ${product.getPrice}`);
            }
        });
    }
    checkout() {
        this.notificationService.sendNotification('Hola');
        this.showProducts();
    }
}
exports.ShoppingCart = ShoppingCart;

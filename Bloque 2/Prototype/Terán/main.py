from pricelist import PriceList
from product import Product

def main():
    # Creamos la primera lista de precios
    price_list = PriceList("Lista normal")
    product_list = [
        Product("Computadora", 5000),
        Product("Mouse", 300),
        Product("Teclado", 500),
        Product("Pantalla", 5000),
        Product("Audifonos", 800)
    ]

    # Asignamos la lista de productos a la lista de precios
    price_list.set_product_list(product_list)

    print(price_list)

    # Creamos una segunda lista clonada
    price_list2 = price_list.clone()
    price_list2.set_name("Lista preferencial")

    # Aplicamos un descuento en la lista clonada
    for product in price_list2.get_product_list():
        product.set_price(product.get_price() * 0.8)

    print(price_list2)

if __name__ == "__main__":
    main()

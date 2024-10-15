from prototype import IPrototype

class PriceList(IPrototype):
    def __init__(self, name):
        self.name = name
        self.product_list = []

    def clone(self):
        clone = PriceList(self.name)
        clone.set_product_list(self.product_list)
        return clone

    def get_name(self):
        return self.name

    def set_name(self, name):
        self.name = name

    def get_product_list(self):
        return self.product_list

    def set_product_list(self, product_list):
        self.product_list = product_list

    def __str__(self):
        # Representación amigable de PriceList con los productos
        product_list_str = ', '.join([str(product) for product in self.product_list])
        return f'{id(self)} - PriceList{{name="{self.name}", product_list=[{product_list_str}]}}'

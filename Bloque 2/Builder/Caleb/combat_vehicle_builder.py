from combat_vehicle import CombatVehicle

class CombatVehicleBuilder:
    def __init__(self):
        self.vehicle = CombatVehicle()

    def build_type(self, type):
        self.type = type
        return self

    def build_engine(self, engine):
        self.engine = engine
        return self
    
    def build_weapons(self, weapons):
        self.weapons = weapons
        return self
    
    def build_armor(self, armor):
        self.armor = armor
        return self
    
    def build(self):
        return self.vehicle
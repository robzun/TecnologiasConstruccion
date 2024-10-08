from assembler import *
from combat_vehicle_builder import *

if __name__ == "__main__":
    builder = CombatVehicleBuilder()
    assembler = Assembler(builder)

    tank = assembler.create_vehicle()
    print(tank)
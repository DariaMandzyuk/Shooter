package shooter;


import shooter.weapons.*;

public class Player {
        private Weapon[] weaponSlots;

        public Player() {
            weaponSlots = new Weapon[] {
                new Slingshot(),
                new Rpg(),
                new WaterGun(),
                new AutoGun(),
                new Gun()
            };
        }

        public int getSlotsCount() {
            return weaponSlots.length;
        }

        public void shotWithWeapon(int slot) {
            if ((slot < 0) || (slot >= weaponSlots.length)) {
                System.out.println("Невалидный слот");
                return;
            }
            Weapon weapon = weaponSlots[slot];
            weapon.shot();
        }
    }


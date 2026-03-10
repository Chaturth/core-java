class Tower {

    String[] towerNames;
    TowerSection[] towers;

    Tower(String[] towerNames, TowerSection[] towers) {
        this.towerNames = towerNames;
        this.towers = towers;
    }

    void display() {
        System.out.println("Number of tower names: " + towerNames.length);
        for (String name : towerNames) {
            System.out.println("Tower Name: " + name);
        }

        System.out.println("Number of towers: " + towers.length);
        for (TowerSection t : towers) {
            System.out.println("Tower Section: " + t.name);
        }
    }
}
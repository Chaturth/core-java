class ProductStore {

    Product[] products;
    int currentIndex = 0;

    ProductStore(Product[] products) {
        this.products = products;
    }

    void save(Product product) {
        int index = products.length;

        if (product != null) {
            if (currentIndex < index) {
                products[currentIndex] = product;
                currentIndex++;
            }
        }
    }

    void save(Product[] multipleProducts) {
        if (multipleProducts != null && multipleProducts.length <= 10) {
            for (Product product : multipleProducts) {
                if (product != null && currentIndex < products.length) {
                    products[currentIndex] = product;
                    currentIndex++;
                }
            }
        } else {
            System.out.println("Maximum only 10 products can store ,not more than that");
        }
    }

    void searchByUniqueId(String id) {
        boolean found = false;

        for (Product product : products) {
            if (product != null) {
                if (id != null && id.equals(product.uniqueId)) {
                    System.out.println("ID found:" + product.name);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("Not found");
        }
    }

    void searchByUniqueIdAndName(String id, String newName) {
        boolean found = false;

        for (Product product : products) {
            if (product != null) {
                if (id != null && id.equals(product.uniqueId) && newName != null && newName.equals(product.name)) {
                    System.out.println("Found:" + product.uniqueId + " " + product.name);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("name or id not found");
        }
    }

    void searchByUniqueIdAndNameAndOriginCountry(String id, String Newname, String country) {
        boolean found = false;

        for (Product product : products) {
            if (product != null) {
                if (id != null && id.equals(product.uniqueId) && Newname != null && Newname.equals(product.name) && country != null && country.equals(product.originCountry)) {
                    System.out.println("Found:" + product.uniqueId + " " + product.name + " " + product.originCountry);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("name or id or country not found");
        }
    }

    void getAllOriginCountry() {
        for (Product product : products) {
            if (product != null) {
                System.out.println("countries:" + product.originCountry);
            }
        }
    }

    void warraentyExpiredByUniqueId(String id) {
        boolean found = false;

        for (Product product : products) {
            if (product != null) {
                if (id != null && id.equals(product.uniqueId)) {
                    System.out.println("Checking warraentyExpiredByUniqueId :" + product.warrantyExpired);
                    found = true;
                    break;
                }
            }
        }

        if (!found) {
            System.out.println("product not found");
        }
    }

    void displayAllProducts() {
        for (Product p : products) {
            if (p != null) {
                System.out.println("ID: " + p.uniqueId);
                System.out.println("Name: " + p.name);
                System.out.println("Type: " + p.type);
                System.out.println("Cost: " + p.cost);
                System.out.println("Country: " + p.originCountry);
            }
        }
    }

    void getAllByType(ProductType type) {
        for (Product product : products) {
            if (product != null) {
                if (type == product.type) {
                    System.out.println("name of the produt:" + product.name);
                }
            }
        }
    }

    void getAllByWarrantyYears(WarrantyYears years) {
        for (Product product : products) {
            if (product != null && product.warrantyYears == years) {
                System.out.println(product.name);
            }
        }
    }
}

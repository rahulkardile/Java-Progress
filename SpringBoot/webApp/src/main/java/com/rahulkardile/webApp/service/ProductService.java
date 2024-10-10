package com.rahulkardile.webApp.service;

import com.rahulkardile.webApp.model.Product;
import com.rahulkardile.webApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    List<Product> product = new ArrayList<>(Arrays.asList(
            new Product(101, "Iphone 6s", 50000),
            new Product(102, "Lenovo Think Pad 6", 65000),
            new Product(103, "Redmi Note 7 Pro", 61000)
    ));

    public List<Product> getProduct() {
        return repo.findAll();
    }

    public Product getProductById(int id){
        return repo.findById(id).orElse(new Product());
    }

    public void addProduct(Product product){
        repo.save(product);
    }

    public int addMultipleProduct(){
        int totalProductAdded = 0;
        String[] productTypes = {
                "iPhone", "Samsung Galaxy", "MacBook", "Surface Pro", "PlayStation", "Xbox",
                "Fitbit", "Oculus Quest", "Echo Dot", "Google Nest", "Sony Alpha", "Canon EOS",
                "Logitech G", "Corsair K", "HP Pavilion", "Dell XPS", "Lenovo ThinkPad", "Asus ROG",
                "Razer Blade", "Alienware", "Dyson V", "Philips Hue", "GoPro Hero", "Bose QuietComfort",
                "JBL Charge", "Anker PowerCore", "HyperX Cloud", "SteelSeries Arctis", "Ring Video Doorbell",
                "Nest Thermostat", "Apple Watch", "Garmin Fenix", "Nintendo Switch", "DJI Mavic", "Segway Ninebot",
                "Beats Studio", "Marshall Kilburn", "Sonos One", "Tile Mate", "Sennheiser Momentum", "Nespresso Vertuo",
                "KitchenAid Mixer", "Instant Pot", "Breville Smart Oven", "Samsung QLED", "LG OLED", "Panasonic Lumix",
                "Acer Predator", "MSI GeForce", "Xiaomi Mi", "Huawei Mate", "OnePlus Nord", "Redmi Note", "Realme Narzo",
                "Vivo V", "Oppo Reno", "Moto G", "Google Pixel", "Asus Zenfone", "Nikon D", "Casio G-Shock", "Fossil Gen",
                "Tissot PR", "Seiko 5", "Citizen Eco-Drive", "Timex Ironman", "Samsung Gear", "Microsoft Surface", "Sony Bravia",
                "TCL Roku TV", "Vizio V-Series", "Sharp Aquos", "Hisense H8G", "Roku Streaming Stick", "Fire TV Cube",
                "Apple AirPods", "Samsung Galaxy Buds", "Sony WH", "Audio-Technica ATH", "Shure SE", "Ultimate Ears Boom",
                "Bang & Olufsen Beoplay", "Dyson Pure", "Levoit Air Purifier", "Honeywell QuietSet", "iRobot Roomba",
                "Shark Navigator", "Eufy RoboVac", "DeWalt Cordless Drill", "Makita Impact Driver", "Bosch Power Tools",
                "Ryobi Brushless", "Black+Decker Matrix", "Craftsman V20", "Milwaukee M18", "Hoover WindTunnel", "Bissell CrossWave",
                "Electrolux Ergorapido", "Keurig K-Elite", "Cuisinart Coffee Maker", "Hamilton Beach FlexBrew", "Mr. Coffee",
                "Zojirushi Rice Cooker"
        };

        Random random = new Random();

        for (int i = 2; i < 500; i++) {
            try {
                repo.save(new Product(i, productTypes[random.nextInt(99)], random.nextInt(50000)));
                totalProductAdded += 1;
            }catch (Exception e){
                System.out.println(e);
            }
        }
        return totalProductAdded;
    }

    public void updateProduct(Product product){
        repo.save(product);
    }

    public void deleteProduct(int id) {
       repo.deleteById(id);
    }
}

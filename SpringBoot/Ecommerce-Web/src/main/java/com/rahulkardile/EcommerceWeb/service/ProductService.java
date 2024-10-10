package com.rahulkardile.EcommerceWeb.service;

import com.rahulkardile.EcommerceWeb.model.Product;
import com.rahulkardile.EcommerceWeb.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Random;

@Service
public class ProductService {

    @Autowired
    private ProductRepo repo;

    public List<Product> GetAllProducts() {
      return repo.findAll();
    };

    public void InsertMultipleProducts(){

        String[] productNames = {
                "Smartphone X", "Laptop Pro", "Wireless Earbuds", "4K TV", "Gaming Console",
                "Running Shoes", "Smartwatch", "Blender Pro", "Coffee Maker", "Electric Scooter",
                "Yoga Mat", "Water Bottle", "Backpack", "LED Desk Lamp", "Wireless Charger",
                "Office Chair", "Electric Toothbrush", "Hair Dryer", "Electric Kettle", "Smart Thermostat",
                "Bluetooth Speaker", "Camera Drone", "Electric Grill", "Dishwasher", "Smart Light Bulb",
                "Vacuum Cleaner", "Portable Air Purifier", "Fitness Tracker", "Tablet Pro", "Gaming Headset"
        };

        String[] descriptions = {
                "Latest model with high-res camera", "High-performance laptop for professionals",
                "Noise-cancelling with long battery life", "Ultra HD 65-inch display with smart features",
                "Next-gen gaming with 8K support", "Lightweight with superior cushioning",
                "Fitness tracking and notifications", "High-power blending with multiple speeds",
                "Brews coffee in under 5 minutes", "Eco-friendly and compact for city commutes",
                "Non-slip and eco-friendly material", "Insulated stainless steel, keeps drinks cold",
                "Water-resistant with multiple compartments", "Adjustable brightness with USB charging",
                "Fast wireless charging for smartphones", "Ergonomic design for long working hours",
                "Deep clean with multiple brushing modes", "Quick drying with heat control technology",
                "Boils water in 90 seconds with auto shut-off", "Energy-efficient temperature control",
                "Portable with rich sound and long battery life", "4K camera with GPS and auto-follow features",
                "Smokeless indoor grilling with adjustable temperature", "Energy-efficient and quiet operation",
                "Wi-Fi connected with voice control", "Cordless and lightweight with powerful suction",
                "Removes 99% of airborne particles", "Monitors heart rate and tracks activity",
                "High-resolution display with pen support", "Surround sound with noise-cancelling mic"
        };

        // Array for product categories
        String[] categories = {
                "Electronics", "Computers", "Audio", "Electronics", "Gaming",
                "Footwear", "Wearables", "Home Appliances", "Kitchen Appliances", "Transportation",
                "Fitness", "Outdoor", "Travel", "Home Office", "Electronics",
                "Furniture", "Personal Care", "Beauty", "Kitchen Appliances", "Home Automation",
                "Audio", "Drones", "Kitchen Appliances", "Kitchen Appliances", "Home Automation",
                "Home Appliances", "Health", "Wearables", "Computers", "Gaming"
        };

        String[] brands = {
                "TechBrand", "CompTech", "SoundMax", "VisionPlus", "GameStar",
                "FitStep", "WristTech", "KitchenMaster", "BrewIt", "E-Ride",
                "FlexFit", "HydroGo", "PackIt", "BrightLite", "ChargeMax",
                "ComfortSeat", "SmileTech", "StylePro", "QuickBoil", "EcoHome",
                "SoundWave", "SkyView", "GrillMaster", "CleanWare", "BrightHome",
                "DustBuster", "FreshAir", "FitTrack", "TabTech", "GameSound"
        };

        Random random = new Random();

        for(int i = 0; i< 500; i++){
            int r = random.nextInt(30);
            repo.save(new Product(i, productNames[r], descriptions[r], brands[r], categories[r], new Timestamp(System.currentTimeMillis()), random.nextBoolean(), random.nextInt(400), random.nextInt(2100000)));
        }

    }

    public Product getProductById(int id) {
        return repo.findById(id).orElse(null);
    }

    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        return repo.save(product);
    }

}

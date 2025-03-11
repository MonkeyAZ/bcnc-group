package bcnc.group.infrastructure.price.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import bcnc.group.domain.price.ports.repository.ProductPriceRepository;
import bcnc.group.domain.price.service.ProductPriceService;

@Configuration
public class ProductPriceConfig {
    
    @Bean
    public ProductPriceService productPriceService(ProductPriceRepository productPriceRepository) {
        return new ProductPriceService(productPriceRepository);
    }
}

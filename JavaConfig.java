package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean(name = "id1")
    public ProductBean getProductBean()
    {
       ProductBean productBean = new ProductBean();
       productBean.setId(101);
       productBean.setName("dell laptop");
       productBean.setPrice(45000.00);
       return productBean;
    }
}

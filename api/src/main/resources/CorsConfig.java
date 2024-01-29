import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Permitir solicitações de qualquer origem
        config.addAllowedOrigin("*");

        // Permitir solicitações de qualquer método (GET, POST, PUT, DELETE, etc.)
        config.addAllowedMethod("*");

        // Permitir solicitações com quaisquer cabeçalhos
        config.addAllowedHeader("*");

        // Permitir credenciais (por exemplo, cookies) durante as solicitações CORS
        config.setAllowCredentials(true);

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}

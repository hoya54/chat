//package mpti.common.config;
//
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.socket.WebSocketHandler;
//import org.springframework.web.socket.config.annotation.EnableWebSocket;
//import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
//import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
//import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
//
//@Configuration
//@EnableWebSocket
//public class WebSocketConfig2 implements WebSocketConfigurer {
//
//    @Bean
//    public WebSocketHandler myHandler() {
//        return new MyHandler();
//    }
//
//    @Override
//    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
//        registry.addHandler(myHandler(), "/api/chat").setAllowedOrigins("*").withSockJS();
//    }
//
////    @Override
////    public void registerStompEndpoints(StompEndpointRegistry registry) {
////        // WebSocketMessageBrokerConfigurer.super.registerStompEndpoints(registry);
////        registry.addEndpoint("/api/chat").setAllowedOrigins("*").withSockJS();
////    }
//}
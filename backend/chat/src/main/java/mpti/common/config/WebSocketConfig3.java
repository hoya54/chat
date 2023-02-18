//package mpti.common.config;
////
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.simp.config.MessageBrokerRegistry;
//import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
//import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
//import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
//
//@Slf4j
//@Configuration
//@EnableWebSocketMessageBroker
//public class WebSocketConfig3 extends AbstractWebSocketMessageBrokerConfigurer {
//
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry config) {
//        config.enableSimpleBroker("/api/chat", "/groupChat");
//        config.setApplicationDestinationPrefixes("/api/chat");
//        config.setUserDestinationPrefix("http://localhost:8005/api/chat");
//    }
//
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry registry) {
//        log.info("gs-websocket socket");
//        registry.addEndpoint("http://localhost:8005/api/chat").withSockJS();
//    }
//
//}
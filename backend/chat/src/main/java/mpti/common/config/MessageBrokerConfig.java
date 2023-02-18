//package mpti.common.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.messaging.simp.config.MessageBrokerRegistry;
//import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
//import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
//import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
//import org.springframework.web.socket.server.standard.ServletServerContainerFactoryBean;
//
//@Configuration
//@EnableWebSocketMessageBroker
//public class MessageBrokerConfig extends AbstractWebSocketMessageBrokerConfigurer {
//
//    @Bean
//    public ServletServerContainerFactoryBean createWebSocketContainer() {
//        ServletServerContainerFactoryBean container = new ServletServerContainerFactoryBean();
//        container.setMaxTextMessageBufferSize(8192);
//        container.setMaxBinaryMessageBufferSize(8192);
//        return container;
//    }
//
//    @Override
//    public void configureMessageBroker(MessageBrokerRegistry config) {
//        //config.enableStompBrokerRelay("/queue", "/topic");
//        config.enableSimpleBroker("/queue", "/topic","/user");
//        config.setApplicationDestinationPrefixes("/BoatBattleGame");
//    }
//
//    @Override
//    public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
//        stompEndpointRegistry.addEndpoint("/api/chat").withSockJS();
//    }
//}
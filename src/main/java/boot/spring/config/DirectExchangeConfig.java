package boot.spring.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//direct直连模式的交换机配置,包括一个direct交换机，两个队列，三根网线binding
@Configuration
public class DirectExchangeConfig {
    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange("direct");
    }

    @Bean
    public Queue directQueue1() {
        return new Queue("directqueue1");
    }

    @Bean
    public Queue directQueue2() {
        return new Queue("directqueue2");
    }

    //3个binding将交换机和相应队列连起来
    @Bean
    public Binding bindingorange() {
        return BindingBuilder.bind(directQueue1()).to(directExchange()).with("orange");
    }

    @Bean
    public Binding bindingblack() {
        return BindingBuilder.bind(directQueue2()).to(directExchange()).with("black");
    }

    @Bean
    public Binding bindinggreen() {
        return BindingBuilder.bind(directQueue2()).to(directExchange()).with("green");
    }


}

package hello.advanced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceVO {

    private final OrderRepositoryVO orderRepository;

    public void orderItem(String itemId) {
        orderRepository.save(itemId);
    }
}
